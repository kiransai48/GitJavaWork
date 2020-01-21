import java.util.*;  
import java.sql.*;  
  
public class EmpDao {  
  
    public static Connection getConnection(){  
        Connection con=null;  
        try{  
            Class.forName("oracle.jdbc.driver.OracleDriver");  
            con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","saikiran","kiran");  
        }catch(Exception e){System.out.println(e);}  
        return con;  
    }  
    public static int save(Empp e){  
        int status=0;  
        try{  
            Connection con=EmpDao.getConnection();  
           PreparedStatement ps=con.prepareStatement("insert into user905(id,name,password,email,country) values (?,?,?,?,?)");  
           ps.setInt(1, e.getId());
           ps.setString(2,e.getName());  
            ps.setString(3,e.getPassword());  
            ps.setString(4,e.getEmail());  
            ps.setString(5,e.getCountry());  
              
            status=ps.executeUpdate();  
              
            con.close();  
        }catch(Exception ex){ex.printStackTrace();}  
          
        return status;  
    }  
    public static int update(Empp e){  
        int status=0;  
        try{  
            Connection con=EmpDao.getConnection();  
            PreparedStatement ps=con.prepareStatement(  
                         "update user905 set id=?,name=?,password=?,email=?,country=? where id=?");  
            ps.setInt(1,e.getId());
            ps.setString(2, e.getName());  
            ps.setString(3, e.getPassword());  
            ps.setString(4, e.getEmail());  
            ps.setString(5, e.getCountry());  
        
              
            status=ps.executeUpdate();  
              
            con.close();  
        }catch(Exception ex){ex.printStackTrace();}  
          
        return status;  
    }  
    public static int delete(int id){  
        int status=0;  
        try{  
            Connection con=EmpDao.getConnection();  
            PreparedStatement ps=con.prepareStatement("delete from user905 where id=?");  
            ps.setInt(1,id);  
            status=ps.executeUpdate();  
              
            con.close();  
        }catch(Exception e){e.printStackTrace();}  
          
        return status;  
    }  
    public static Empp getEmployeeById(int id){  
        Empp e =new Empp();  
          
        try{  
            Connection con=EmpDao.getConnection();  
            PreparedStatement ps=con.prepareStatement("select * from user905 where id=?");  
            ps.setInt(1,id);  
            ResultSet rs=ps.executeQuery();  
            if(rs.next()){  
                e.setId(rs.getInt(1));  
                e.setName(rs.getString(2));  
                e.setPassword(rs.getString(3));  
                e.setEmail(rs.getString(4));  
                e.setCountry(rs.getString(5));  
            }  
            con.close();  
        }catch(Exception ex){ex.printStackTrace();}  
          
        return e;  
    }  
    public static List<Empp> getAllEmployees(){  
        List<Empp> list=new ArrayList<Empp>();  
          
        try{  
            Connection con=EmpDao.getConnection();  
            PreparedStatement ps=con.prepareStatement("select * from user905");  
            ResultSet rs=ps.executeQuery();  
            while(rs.next()){  
                Empp e=new Empp();  
                e.setId(rs.getInt(1));  
                e.setName(rs.getString(2));  
                e.setPassword(rs.getString(3));  
                e.setEmail(rs.getString(4));  
                e.setCountry(rs.getString(5));  
                list.add(e);  
            }  
            con.close();  
        }catch(Exception e){e.printStackTrace();}  
          
        return list;  
    }  
}  