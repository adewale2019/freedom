package oxford.ng.dave;

public class User {
    private String fullName;
    private String location;
    private int age;
    private double accountBalance;
    private UserStatus userStatus = UserStatus.ACTIVE;
    private UserType userType = UserType.DEFAULT_USER;

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public UserStatus getUserStatus() {
        return userStatus;
    }

    public void setUserStatus(UserStatus userStatus) {
        this.userStatus = userStatus;
    }

    public UserType getUserType() {
        return userType;
    }

    public void setUserType(UserType userType) {
        this.userType = userType;
    }

    @Override
    public String toString() {
        return "User{" +
                "fullName='" + fullName + '\'' +
                ", location='" + location + '\'' +
                ", age=" + age +
                ", accountBalance=" + accountBalance +
                ", userStatus=" + userStatus +
                ", userType=" + userType +
                '}';
    }

    public static void main(String[] args) {
        User byron= new User();
        byron.setFullName("macdonald");
        byron.setLocation("georgia");
        byron.setAge(17);
        byron.setAccountBalance(2300);
        //byron.setUserStatus(UserStatus.SUSPENDED);
        //byron.setUserType(UserType.NORMAL_USER);

        System.out.println(byron);
        }


    }


