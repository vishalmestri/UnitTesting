package junit5withoutmockito.dummy;

public class DummyEmailService implements EmailService{

	@Override
	public void sendEmail(String msg) {
		// TODO Auto-generated method stub
		throw new AssertionError("Method not implemented..");
	}

}
