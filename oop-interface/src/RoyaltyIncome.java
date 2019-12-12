
/**
 * 稿费收入税率是20%
 */
public class RoyaltyIncome implements Income {
	
	double income;
	public RoyaltyIncome(double income) {
		// TODO Auto-generated constructor stub
		this.income = income;
	}
	@Override
	public double getTax() {
		// TODO Auto-generated method stub
		return income*0.2;
	}
}
