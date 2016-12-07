package lessons;

public class CheckAndUncheckedExceptionsApp implements App {

	@Override
	public void run(String[] args) {
		System.out.println("Checked vs Unchecked Exceptions");

		int n1 = 5;
		int n2 = 0;
		
		try {
			System.out.printf("%s / %s = %s\n", n1, n2, n1 / n2);
		}
		catch (ArithmeticException e) {
			System.out.printf("%s divide by %s = 'Error: %s'\n", n1, n2, e.getMessage());
			System.exit(1);
		}
		finally {
			System.out.println("Done");
		}
	}

}
