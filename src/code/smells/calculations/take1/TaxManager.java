package code.smells.calculations.take1;

public class TaxManager {

	
	public Money calculateAmountToPay(TaxReturn taxReturn) {
		Money taxPaid = taxReturn.getTaxPaid();
		Money amountEarned = taxReturn.getAmountEarned();
		Percentage taxableRate = taxReturn.getTaxRate();
		
		return taxableRate.of(amountEarned).minus(taxPaid);
	}
}
