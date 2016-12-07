package lessons;

public class Program {

	public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
		System.out.println("Java Lessons");
		final App app = (App) Class.forName("lessons.CheckAndUncheckedExceptionsApp").newInstance();
		app.run(args);
	}
	
}
