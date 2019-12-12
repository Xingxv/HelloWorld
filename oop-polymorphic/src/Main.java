
/**
 * 多态
 */
public class Main {

	public static void main(String[] args) {
		// TODO: 给一个有工资收入和稿费收入的小伙伴算税:
		Income[] incomes = new Income[] { new SalaryIncome(7500), new RoyaltyIncome(12000) };
		double total = 0;
		// TODO:
		for (Income income : incomes) {
			System.out.println(income.getTax());
			total = total + income.getTax();
		}
		System.out.println(total);
	}

}
