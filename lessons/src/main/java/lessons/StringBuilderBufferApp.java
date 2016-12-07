package lessons;

public class StringBuilderBufferApp implements App {

	@Override
	public void run(String[] args) {
		System.out.println("StringBuilder vs StringBuffer");

		final StringBuilder s1 = new StringBuilder("Elon Musk");
		final StringBuilder s2 = new StringBuilder("Elon Musk");
		s1.append("Elon Musk");
		
		System.out.println(s1 == s2 ? "same" : "not same");
		System.out.println(s1.equals(s2) ? "same" : "not same");
		
		final StringBuffer s3 = new StringBuffer("Elon Musk");
		final StringBuffer s4 = new StringBuffer("Elon Musk");
		
		System.out.println(s3 == s4 ? "same" : "not same");
		System.out.println(s3.equals(s4) ? "same" : "not same");
		
	}

}
