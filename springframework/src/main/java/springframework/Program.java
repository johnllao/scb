package springframework;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Program {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		final ApplicationContext context =
			    new FileSystemXmlApplicationContext("dependencies.xml");
		final MessagePrinter printer = context.getBean("messagePrinter", MessagePrinter.class);
		printer.printMessage();

	}

}
