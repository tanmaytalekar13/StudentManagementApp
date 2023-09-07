public class Student {

    private  int id;
    private String sname;
    private String mobileNumber;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }


    public String getSname() {
        return sname;
    }

    public void setMobileNumber(String mobileNumber){
        this.mobileNumber = mobileNumber;
    }

    public String getMobileNumber(){
        return mobileNumber;
    }


    public Student(int id, String sname,String mobileNumber){
        this.id=id;
        this.sname=sname;
        this.mobileNumber=mobileNumber;

    }

    // default method
    public Student(){
        super();
    }

}
