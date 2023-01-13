package de.dhbw.course7.db;

import org.dbunit.dataset.IDataSet;
import org.dbunit.dataset.xml.FlatXmlDataSetBuilder;
import org.dbunit.operation.DatabaseOperation;
import org.h2.jdbcx.JdbcDataSource;

import javax.sql.DataSource;
import java.io.File;
import java.sql.Connection;

public class DatabaseTestConfig {
    private Connection connection;

    public DataSource getDataSource() {
        JdbcDataSource dataSource = new JdbcDataSource();
        dataSource.setURL(
                "jdbc:h2:mem:test;" +
                        "MODE=LEGACY;" +
                        "DB_CLOSE_DELAY=-1;" +
                        "INIT=runscript from '~/Projects/Lehre/SS23/Programmierung-II-W3WI-109/course-7/dbunit/schema.sql'");
        dataSource.setUser("sa");
        dataSource.setPassword("sa");
        return dataSource;
    }

    public IDataSet getDataSet() throws Exception {
        return new FlatXmlDataSetBuilder().build(new File("dbunit/data.xml"));
    }

    public DatabaseOperation getSetUpOperation() {
        return DatabaseOperation.REFRESH;
    }

    public DatabaseOperation getTearDownOperation() {
        return DatabaseOperation.DELETE_ALL;
    }

}
