package Precious.ChapterThree;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ModifiedAccountTest {

    ModifiedAccount account;
    @BeforeEach
    void accountSetUp() {
        account = new ModifiedAccount("Ruth", 1000);
    }

    @Test
    void youCanCreateAccountTest(){
    account.setName("Adeyemi");
    assertEquals("Adeyemi", account.getName());
    account.setBalance(2000);
    assertEquals(2000,account.getBalance());

}

@Test
    void youCanDepositToAccountTest(){
//    account.getBalance();
    account.deposit(10000);
    assertEquals(11000,account.getBalance());

}
@Test
    void  youCanWithdrawFromAccount(){
        account.withdrawal(500);
        assertEquals(500, account.getBalance());
}
@Test
    void youCannotWithdrawMoreThanAccountBalanceTest(){
      assertThrows(RuntimeException.class,()->account.withdrawal(12000));
}

}