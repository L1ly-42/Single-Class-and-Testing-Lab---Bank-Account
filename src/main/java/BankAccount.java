public class BankAccount {

// Instance variables
    private String firstName ;
    private String lastName;
    private String dateOfBirth;
    private int accountNumber;
    private int balance;
    private String accountType;


// Constructor
    public BankAccount (String inputFirstName, String inputLastName, String inputDateOfBirth, int inputAccountNumber){
    this.firstName = inputFirstName;
    this.lastName = inputLastName;
    this.dateOfBirth = inputDateOfBirth;
    this.accountNumber = inputAccountNumber;
    this.balance = 0;
    this.accountType = "";
    }

// Getters and Setters
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    // deposit method

    public void deposit(int money) {
        this.balance += money;
    }
  // withdrawal method
    public void withdrawal(int money) {
        this.balance -= money;
    }

  // interest method
    public void interest(double rate){
        rate += 1;
        balance *= rate;}

  // modified interest method

    public void interestByAccountType(){
        if (this.accountType.equals("current")){
            double rate = 1.2;
            this.balance *= rate;
        }
        if (this.accountType.equals("savings")) {
            double rate = 1.5;
            this.balance *= rate;
        }

    }
}
