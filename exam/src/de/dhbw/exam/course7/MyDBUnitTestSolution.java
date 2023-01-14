package de.dhbw.exam.course7;

/*
import de.dhbw.course7.DatabaseTestConfig;
import org.dbunit.DataSourceBasedDBTestCase;
import org.dbunit.dataset.IDataSet;
import org.dbunit.dataset.ITable;
import org.dbunit.operation.DatabaseOperation;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import javax.sql.DataSource;
import java.sql.Connection;

@RunWith(JUnit4.class)
*/
public class MyDBUnitTestSolution /* extends DataSourceBasedDBTestCase */ {

/*
    private Connection connection;

    // helper class
    DatabaseTestConfig setup = new DatabaseTestConfig();

    @Override
    protected DataSource getDataSource() { return setup.getDataSource(); }
    @Override
    protected IDataSet getDataSet() throws Exception { return setup.getDataSet(); }
    @Override
    protected DatabaseOperation getSetUpOperation() {
        return setup.getSetUpOperation();
    }
    @Override
    protected DatabaseOperation getTearDownOperation() {
        return setup.getTearDownOperation();
    }

    @Before
    public void setUp() throws Exception {
        super.setUp();
        connection = getConnection().getConnection();
    }

    @After
    public void tearDown() throws Exception {
        super.tearDown();
    }

    @DisplayName(
        """
        Erzeuge eine neue Tabelle 'ORDERS' in der Datenbank.
        Die Tabelle soll die Spalten bekommen:
        - 'id' als Ganzzahl
        - 'orderNumber' als String
        """
    )
    @Test
    public void exercise1() throws Exception {
        // given

        // when
        int i = connection.createStatement().executeUpdate(
                """
                create table ORDERS (
                  id INTEGER AUTO_INCREMENT NOT NULL,
                  orderNumber varchar(20) NOT NULL,
                  PRIMARY KEY (`id`)
                );
                """
        );
        ITable table = getTable("ORDERS");

        // then
        assertEquals("ORDERS", table.getTableMetaData().getTableName());
    }

    @DisplayName(
        """
        Erzeuge in der Tabelle 'ORDERS' einen neuen Datensatz mit beliebigen Daten an
        """
    )
    @Test
    public void exercise2() throws Exception {
        // given
        // exercise1(); // NEVER DO THIS (Anti-Pattern) !!!

        connection.createStatement().executeUpdate(
                """
                create table ORDERS (
                  id INTEGER AUTO_INCREMENT NOT NULL,
                  orderNumber varchar(20) NOT NULL,
                  PRIMARY KEY (`id`)
                );
                """
        );

        int updateCount = connection.createStatement().executeUpdate(
                "INSERT INTO ORDERS (orderNumber) VALUES ('2023-01-14-0001')");

        // when
        ITable table = getTable("ORDERS");

        // then
        assertEquals(1, updateCount);
        assertEquals(1, table.getRowCount());
    }

    // --------------------------------------------- private utilities

    private IDataSet getDatabase() throws Exception {
        return getConnection().createDataSet();
    }

    private ITable getTable(String name) throws Exception{
        IDataSet databaseDataSet = getDatabase();
        return databaseDataSet.getTable(name);
    }

*/
}