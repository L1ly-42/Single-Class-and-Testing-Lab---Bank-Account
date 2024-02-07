import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class BankAccountTest{
    BankAccount bankAccount;

    // This method will be used to stramline the 'arrange' step in the testing methods
    // now means that you won't have to keep setting up a new object each time

    @BeforeEach
    public void setUp(){
        bankAccount = new BankAccount("Leila","Peltier","23/07/1999",12967);
    }

 // GETTERS TESTING
    @Test
    public void canGetFirstName(){
        String result = bankAccount.getFirstName();
        assertThat(result).isEqualTo("Leila");
    }

    @Test
    public void canGetLastName(){
        String result = bankAccount.getLastName();
        assertThat(result).isEqualTo("Peltier");
    }

    @Test

    public void canGetDateOfBirth(){
        String result = bankAccount.getDateOfBirth();
        assertThat(result).isEqualTo("23/07/1999");
    }

    @Test

    public void canGetAccountNumber(){
        int result = bankAccount.getAccountNumber();
        assertThat(result).isEqualTo(12967);
    }

    @Test

    public void canGetBalance(){
        int result = bankAccount.getBalance();
        assertThat(result).isEqualTo(0);
    }
// SETTERS TESTING
    @Test

    public void canSetFirstName(){
        bankAccount.setFirstName("Lily");
        String result = bankAccount.getFirstName();
        assertThat(result).isEqualTo("Lily");
    }

    @Test
    public void canSetLastName(){
        bankAccount.setLastName("Granger");
        String result = bankAccount.getLastName();
        assertThat(result).isEqualTo("Granger");
    }

    @Test

    public void canSetDateOfBirth(){
        bankAccount.setDateOfBirth("01/01/2000");
        String result = bankAccount.getDateOfBirth();
        assertThat(result).isEqualTo("01/01/2000");
    }

    @Test
    public void canSetAccountNumber(){
        bankAccount.setAccountNumber(123456);
        int result = bankAccount.getAccountNumber();
        assertThat(result).isEqualTo(123456);
    }

    @Test

    public void canSetBalance(){
        bankAccount.setBalance(100);
        int result = bankAccount.getBalance();
        assertThat(result).isEqualTo(100);
    }
// Deposit method test

    @Test
    public void canDepositMoney(){
        bankAccount.deposit(200);
        int result = bankAccount.getBalance();
        assertThat(result).isEqualTo(200);
    }

// Withdrawal method test
     @Test
    public void canWithdrawMoney(){
    bankAccount.withdrawal(200);
    int result = bankAccount.getBalance();
    assertThat(result).isEqualTo(-200);
}





}