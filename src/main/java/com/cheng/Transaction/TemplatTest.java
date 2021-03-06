package com.cheng.Transaction;

import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.TransactionDefinition;
import org.springframework.transaction.TransactionException;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.TransactionCallback;
import org.springframework.transaction.support.TransactionTemplate;

import java.sql.*;

/**
 * @Author :cheng
 * @Description:
 * @Date: created in 18:55 2018/5/18
 * @Reference:
 */
public class TemplatTest {
    public static void main(String[] args) {

        TransactionTemplate template = new TransactionTemplate();
        template.setTransactionManager(new PlatformTransactionManager() {
            @Override
            public TransactionStatus getTransaction(TransactionDefinition definition) throws TransactionException {
                System.out.println("ok");
                return null;
            }

            @Override
            public void commit(TransactionStatus status) throws TransactionException {
                System.out.println("ti jiao");
            }

            @Override
            public void rollback(TransactionStatus status) throws TransactionException {
                System.out.println("roll back");
            }
        });

        String s = template.execute(new TransactionCallback<String>() {
            @Override
            public String doInTransaction(TransactionStatus status) {
                //声明Connection对象
                Connection con;
                //驱动程序名
                String driver = "com.mysql.cj.jdbc.Driver";
                //URL指向要访问的数据库名mydata
                String url = "jdbc:mysql://localhost:3306/test?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
                //MySQL配置时的用户名
                String user = "root";
                //MySQL配置时的密码
                String password = "neng";
                //遍历查询结果集
                try {
                    //加载驱动程序
                    Class.forName(driver);
                    //1.getConnection()方法，连接MySQL数据库！！
                    con = DriverManager.getConnection(url, user, password);
                    if(!con.isClosed())
                        System.out.println("Succeeded connecting to the Database!");
                    //2.创建statement类对象，用来执行SQL语句！！
                    Statement statement = con.createStatement();
                    //要执行的SQL语句
                    String sql = "select * from users";
                    //3.ResultSet类，用来存放获取的结果集！！
                    ResultSet rs = statement.executeQuery(sql);
                    System.out.println("-----------------");
                    System.out.println("执行结果如下所示:");
                    System.out.println("-----------------");
                    System.out.println("姓名" + "\t" + "职称");
                    System.out.println("-----------------");

                    String job = null;
                    String id = null;
                    while(rs.next()){
                        //获取stuname这列数据
                        job = rs.getString("Role");
                        //获取stuid这列数据
                        id = rs.getString("Users_Id");

                        //输出结果
                        System.out.println(id + "\t" + job);
                    }
                    rs.close();
                    con.close();
                } catch(ClassNotFoundException e) {
                    //数据库驱动类异常处理
                    System.out.println("Sorry,can`t find the Driver!");
                    e.printStackTrace();
                } catch(SQLException e) {
                    //数据库连接失败异常处理
                    e.printStackTrace();
                }catch (Exception e) {
                    // TODO: handle exception
                    e.printStackTrace();
                }finally{
                    System.out.println("数据库数据成功获取！！");
                }
                //throw new RuntimeException();
                return "suceess";
                //throw new Error();
            }
        });

        System.out.println(s);
    }
}
