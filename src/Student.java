
public class Student {

    private Long studentId;
    private String name;
    private String major;
    private Long phoneNumber;

    public Student(Long studentId, String name, String major, Long phoneNumber) {
        this.studentId = studentId;
        this.name = name;
        this.major = major;
        this.phoneNumber = phoneNumber;
    }

    public Long getStudentId() {return studentId;}
    public String getName() {return name;}
    public String getMajor() {return major;}
    public String getPhoneNumber() {
        String result = "0"+phoneNumber.toString();
        result = result.substring(0,3)+"-"+result.substring(3,7)+"-"+result.substring(7,11);
        return result;
    }
    public void setStudentId(Long studentId) {this.studentId = studentId;}
    public void setName(String name) {this.name = name;}
    public void setMajor(String major) {this.major = major;}
    public void setPhoneNumber(Long phoneNumber) {this.phoneNumber = phoneNumber;}
}
