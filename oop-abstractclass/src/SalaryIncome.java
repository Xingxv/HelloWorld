
public class SalaryIncome extends Income {

	// TODO
	public SalaryIncome (double income) {
		super(income);
	}
	
	public double getTax() {
		
		if (income<5000) {
			return 0;
		}
		return (income-5000)*0.1;
	}

}
