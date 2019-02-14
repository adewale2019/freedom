package oxford;

public class Staff {

    public String fullName;
    public String gender;
    public String status;

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Staff{" +
                "fullName='" + fullName + '\'' +
                ", gender='" + gender + '\'' +
                ", status='" + status + '\'' +
                '}';
    }


    public static void main(String[] args) {
        Staff fusion= new Staff();
        fusion.setFullName("patrick udole");
        fusion.setStatus("ALIVE");
        fusion.setGender("female");

        System.out.println(fusion);
    }

}
