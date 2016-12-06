package phonebook;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.Banner.Mode;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import phonebook.Program;

@SpringBootApplication 
public class Program {

	public static void main(String[] args) {
		final SpringApplication app = new SpringApplication(Program.class);
		app.setBannerMode(Mode.OFF);
		app.setLogStartupInfo(false);
		app.run(args);
	}

}
