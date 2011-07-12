package code.smells.testing.take1;

import java.math.BigDecimal;
import static org.hamcrest.CoreMatchers.*;
import org.junit.Test;
import static org.junit.Assert.*;

public class BankAccountTest {
	
	@Test
	public void shouldHandleMoney() {
		BigDecimal bigDecimal10 = new BigDecimal("10.00");
		BigDecimal bigDecimal50 = new BigDecimal("50.00");
		BigDecimal bigDecimal60 = new BigDecimal("60.00");
		BigDecimal bigDecimal100 = new BigDecimal("100.00");
		
		BankAccount account = new BankAccount(202626, 12345678, bigDecimal100);

		account.withdraw(bigDecimal50);
		assertThat(account.getBalance(), equalTo(bigDecimal50));

		account.deposit(bigDecimal10);
		assertThat(account.getBalance(), equalTo(bigDecimal60));
	}
}
