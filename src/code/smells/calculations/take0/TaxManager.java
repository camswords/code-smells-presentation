package code.smells.calculations.take0;

public class TaxManager {

	
	public Money calculateAmountToPay(TaxReturn taxReturn) {
		Money taxPaid = taxReturn.taxPaid;
		Money amountEarned = taxReturn.amountEarned;
		Percentage taxableRate = taxReturn.taxRate;
		
		return taxableRate.of(amountEarned).minus(taxPaid);
	}
}
