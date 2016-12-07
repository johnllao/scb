package lessons;

public class ImmutableStringApp implements App {

	@Override
	public void run(String[] args) {
		System.out.println("Immutable String");
		
		final String s1 = "Bill Gates";
		final String s2 = "Bill Gates";
		
		System.out.println(s1 == s2 ? "same" : "not same");
		
		final String s3 = new String("Bill Gates");
		final String s4 = new String("Bill Gates");
		
		System.out.println(s3 == s4 ? "same" : "not same");
		
		System.out.println(s1 == s3 ? "same" : "not same");
		
		System.out.println(s1.equals(s3) ? "same" : "not same");
	}

}
