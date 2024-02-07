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



}