package springframework;

public class HelloMessageService implements MessageService {

	@Override
	public String getMessage() {
		return "Welcome!";
	}

}
