import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

class StudentManagementSystem {
    public static void main(String[] args) throws IOException {
       // BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Scanner br = new Scanner(System.in);
        System.out.println("WELCOME TO STUDENT MANAGEMENT APP");
        while(true){
            System.out.println("PRESS 1 TO ADD STUDENT : ");
            System.out.println("PRESS 2 TO DELETE STUDENT : ");
            System.out.println("PRESS 3 TO DISPLAY STUDENT : ");
            System.out.println("PRESS 4 TO EXIT APP : ");
           // int c = Integer.parseInt(br.readLine());
            int c = br.nextInt();
            if(c==1){
                // add student
                System.out.println("Enter the id : ");
                int id = br.nextInt();
                br.nextLine();
                System.out.println("Enter the name : ");
                String sname=br.nextLine();
                System.out.println("Enter the mobile number : ");
                String mobileNumebr = br.nextLine();

                // object of student
                Student ss = new Student(id,sname,mobileNumebr);
                 boolean answer = StudentInsert.insertSt(ss);
                 if(answer){
                     System.out.println("Successfully student data added...");
                 }
                 else{
                     System.out.println("Something went wrong....");
                 }
            }
            else if(c==2) {
                //delete student
                System.out.println("Enter the id : ");
                int a = br.nextInt();
                boolean answer = StudentInsert.deleteSt(a);
                if(answer){
                    System.out.println(a + " id successfully deleted...");
                }
                else{
                    System.out.println("Something went wrong...");
                }
            }
            else if(c==3){
                // to display student
                StudentInsert.display();
            }
            else if(c==4){
                // exit
                break;
            }
            else {
                System.out.println("Invalid Input !!!");
            }
        }

        System.out.println("Thank you for using my application...");
        System.out.println("Have a nice day...");
    }
}