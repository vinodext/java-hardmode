public class variablespractice {
	public static void main (String[]args) {
		int activeusers=40;
		int subscriptionprice=199;
		int totalmonthlyincome = activeusers * subscriptionprice;
		System.out.println("---income overview---");
		System.out.println("total active users: " + activeusers);
        System.out.println("monthly income: INR" + totalmonthlyincome);
	}
}
