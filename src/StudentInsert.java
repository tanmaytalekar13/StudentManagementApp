import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class StudentInsert {
    public static boolean insertSt(Student s){
        boolean flag = false;
        try{
            Connection con = ConnectionProvider.CreateConnection();
            String q = "insert into student (id,sname,mobileNo) values (?,?,?)";

            //prepared statement
            PreparedStatement pstmt = con.prepareStatement(q);

            //set the value of parameter
            pstmt.setInt(1,s.getId());
            pstmt.setString(2, s.getSname());
            pstmt.setString(3,s.getMobileNumber());



            // to execute the pstmt
            pstmt.executeUpdate();
            flag=true;
        }
        catch (Exception e){
            e.printStackTrace();
        }

        return flag;
    }

    public static void display(){
        try{
            Connection con = ConnectionProvider.CreateConnection();
           // String q = "insert into students (sname) values (?)";
            String q = "select * from student;";
            Statement st = con.createStatement();
            ResultSet set = st.executeQuery(q);
            System.out.println("-".repeat(30));
            while (set.next()){
                int id = set.getInt(1);
                String name = set.getString(2);
                String mobileNumber = set.getString(3);
                System.out.println(id+". "+name+" "+mobileNumber);
                System.out.println("-".repeat(30));
            }

        }
        catch (Exception e){
            e.printStackTrace();
        }

    }

    // method for delete the student data

    public static boolean deleteSt(int a){
        boolean flag = false;
        try{
            Connection con = ConnectionProvider.CreateConnection();

            String q = "DELETE FROM student WHERE id=?;";

            PreparedStatement pstmt = con.prepareStatement(q);
           pstmt.setInt(1,a);
            pstmt.executeUpdate();

            flag=true;
        }
        catch (Exception e){
            e.printStackTrace();
        }

        return flag;
    }
}
