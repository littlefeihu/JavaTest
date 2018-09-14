import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class SqlHelper {

    public static   void Conn()
    {
        try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");

            String URL = "jdbc:sqlserver://localhost:1433;DatabaseName=YHT0815";

            Connection conn = DriverManager.getConnection(URL, "sa", "1111");//userName是你数据库的用户名如sa,
           // conn.println("连接数据库成功");
     System.out.print("连接数据库成功");

            String sql1 = "select account,pwd from [user]";
            Statement stmt=conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql1);
            String result="";
            while(rs.next()){
                result+= "账号："+rs.getString(1)+",密码："+rs.getString(2)+"\r\n";

            }
            System.out.print(result);



            conn.close();

        }catch (Exception e){
            System.out.print("发生错误："+e.toString());
            //out.println("数据库连接失败");

        }
    }
}
