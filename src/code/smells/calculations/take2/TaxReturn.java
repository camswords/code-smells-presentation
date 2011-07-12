package code.smells.calculations.take2;

public class TaxReturn {

	private final Percentage taxRate;
	private final Money amountEarned;
	private final Money taxPaid;
	
	public TaxReturn(Percentage taxRate, Money amountEarned, Money taxPaid) {
		this.taxRate = taxRate;
		this.amountEarned = amountEarned;
		this.taxPaid = taxPaid;
	}

	public Money getAmountToPay(TaxReturn taxReturn) {
		return taxRate.of(amountEarned).minus(taxPaid);
	}
}
