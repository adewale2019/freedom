package industry;

public class Unionbank {

    private String date;
    private String userName;
    private AccountType accountType= AccountType.SAVING;

    public static String goodbyeMessage(String userName, String date, AccountType DOMICILIARY){
    return "bye," + userName +  "thanks for using union bank"  + "your account type is "+ "DOMICILIARY";

    }

    public static void main(String[] args) {
        System.out.println(goodbyeMessage("dave", "21/2014" ,AccountType.DOMICILIARY));
    }}
