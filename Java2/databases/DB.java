package databases;
import java.sql.*;

public class DB {
    private String URI = "jdbc:mysql://localhost:3306/";
    private final String USERNAME = "root";
    private final String PASSWORD = "root";
    private Connection conn = null;
    private Statement stmt = null;

    public Connection connect(String tableName) throws Exception{
        this.conn = DriverManager.getConnection(this.URI+=tableName,this.USERNAME,this.PASSWORD);
        return this.conn;
    }

    public Statement prepareStmt(Connection conn) throws Exception{
        this.stmt = conn.createStatement();
        return this.stmt;
    }

    public ResultSet getResult(Statement stmt, String query) throws Exception{
        return stmt.executeQuery(query);
    }

    public void closeConnection() throws Exception{
        this.conn.close();
    }

    public void closeStatement() throws Exception {
        this.stmt.close();
    }


}
