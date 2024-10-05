package databases;

import java.lang.reflect.Method;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class DBDriver {
    public static void main(String[] args) throws Exception {
        DB dbObj = new DB();
        try {
            Connection conn = dbObj.connect("ashdb");
            Statement stmt = dbObj.prepareStmt(conn);
            String query = "select * from ".concat("`user`");
            ResultSet res = dbObj.getResult(stmt,query);
            String[] arr = {"username","email","password","create_time"};
            System.out.println(String.join("   |   ",arr));
            while (res.next()) {
                String username = res.getString("username");
                String email = res.getString("email");
                String password = res.getString("password");
                String timestamp = res.getString("create_time");
                System.out.printf("%s | %s | %s | %s %n",username,email,password,timestamp);
            }

        }
        catch (Exception e){
            e.printStackTrace();
        }
        finally {
            dbObj.closeStatement();
            dbObj.closeConnection();
        }
    }
}
