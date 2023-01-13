package de.dhbw.course7.db;

import org.dbunit.DataSourceBasedDBTestCase;
import org.dbunit.dataset.IDataSet;
import org.dbunit.dataset.ITable;
import org.dbunit.dataset.xml.FlatXmlDataSetBuilder;
import org.dbunit.operation.DatabaseOperation;
import org.h2.jdbcx.JdbcDataSource;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import javax.sql.DataSource;
import java.io.File;
import java.sql.Connection;
import java.sql.ResultSet;

/**
 * Tuo use the H2 shell from CLI, type:
 * (path-to-jar: /Users/thorsteneckstein/.m2/repository/com/h2database/h2/2.1.214/h2-2.1.214.jar)
 *   java -cp <path-to-jar> org.h2.tools.Shell
 * followed by some inputs:
 *   [Enter]   jdbc:h2:~/test
 *   URL       jdbc:h2:mem:default
 *   [Enter]   org.h2.Driver
 *   Driver
 *   [Enter]
 *   User      sa
 *   Password
 *   Type the same password again to confirm database creation.
 *   Password
 * Connected
 */

@RunWith(JUnit4.class)
public class DataSourceDBUnitTest extends DataSourceBasedDBTestCase {

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

    @Test
    public void canSetupDatabaseCorrectlyUsingSchema() throws Exception {
        // given
        IDataSet expectedDataSet = getDataSet();
        ITable expectedTable = expectedDataSet.getTable("CLIENTS");

        // when
        IDataSet databaseDataSet = getConnection().createDataSet();
        ITable actualTable = databaseDataSet.getTable("CLIENTS");

        // then
        assertEquals(
                expectedTable.getTableMetaData().getTableName(),
                actualTable.getTableMetaData().getTableName());

        //ResultSet rs = connection.createStatement().executeQuery("select * from ITEMS");
        //while(rs.next()) {
        //    System.out.println(rs.getString(1));
        //}

    }

    /*

    @Test
    public void givenDataSet_whenSelect_thenFirstTitleIsGreyTShirt() throws SQLException {
        ResultSet rs = connection.createStatement().executeQuery("select * from ITEMS where id = 1");

        assertThat(rs.next()).isTrue();
        assertThat(rs.getString("title")).isEqualTo("Grey T-Shirt");
    }

    @Test
    public void givenDataSet_whenInsert_thenTableHasNewClient() throws Exception {
        try (InputStream is = getClass().getClassLoader().getResourceAsStream("dbunit/expected-user.xml")) {
            // given
            IDataSet expectedDataSet = new FlatXmlDataSetBuilder().build(is);
            ITable expectedTable = expectedDataSet.getTable("CLIENTS");
            Connection conn = getDataSource().getConnection();

            // when
            conn.createStatement()
                .executeUpdate("INSERT INTO CLIENTS (first_name, last_name) VALUES ('John', 'Jansen')");
            ITable actualData = getConnection()
                .createQueryTable("result_name", "SELECT * FROM CLIENTS WHERE last_name='Jansen'");

            // then
            assertEqualsIgnoreCols(expectedTable, actualData, new String[] { "id" });
        }
    }

    @Test
    public void givenDataSet_whenDelete_thenItemIsDeleted() throws Exception {
        try (InputStream is = DataSourceDBUnitTest.class.getClassLoader()
            .getResourceAsStream("dbunit/items_exp_delete.xml")) {
            // given
            ITable expectedTable = (new FlatXmlDataSetBuilder().build(is)).getTable("ITEMS");

            // when
            connection.createStatement().executeUpdate("delete from ITEMS where id = 2");

            // then
            IDataSet databaseDataSet = getConnection().createDataSet();
            ITable actualTable = databaseDataSet.getTable("ITEMS");
            Assertion.assertEquals(expectedTable, actualTable);
        }
    }

    @Test
    public void givenDataSet_whenUpdate_thenItemHasNewName() throws Exception {
        try (InputStream is = DataSourceDBUnitTest.class.getClassLoader()
            .getResourceAsStream("dbunit/items_exp_rename.xml")) {
            // given
            ITable expectedTable = (new FlatXmlDataSetBuilder().build(is)).getTable("ITEMS");

            connection.createStatement().executeUpdate("update ITEMS set title='new name' where id = 1");

            IDataSet databaseDataSet = getConnection().createDataSet();
            ITable actualTable = databaseDataSet.getTable("ITEMS");

            Assertion.assertEquals(expectedTable, actualTable);
        }
    }

    @Test
    public void givenDataSet_whenInsertUnexpectedData_thenFail() throws Exception {
        try (InputStream is = getClass().getClassLoader()
            .getResourceAsStream("dbunit/expected-multiple-failures.xml")) {

            // given
            IDataSet expectedDataSet = new FlatXmlDataSetBuilder().build(is);
            ITable expectedTable = expectedDataSet.getTable("ITEMS");
            Connection conn = getDataSource().getConnection();
            DiffCollectingFailureHandler collectingHandler = new DiffCollectingFailureHandler();

            // when
            conn.createStatement().executeUpdate("INSERT INTO ITEMS (title, price) VALUES ('Battery', '1000000')");
            ITable actualData = getConnection().createDataSet().getTable("ITEMS");

            // then
            Assertion.assertEquals(expectedTable, actualData, collectingHandler);
            if (!collectingHandler.getDiffList().isEmpty()) {
                String message = (String) collectingHandler.getDiffList().stream()
                    .map(d -> formatDifference((Difference) d)).collect(joining("\n"));
                logger.error(() -> message);
            }
        }
    }

    private static String formatDifference(Difference diff) {
        return "expected value in " + diff.getExpectedTable().getTableMetaData().getTableName() + "." + diff
            .getColumnName() + " row " + diff.getRowIndex() + ":" + diff.getExpectedValue() + ", but was: " + diff
            .getActualValue();
    }

     */
}