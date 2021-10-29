package ValidaApp;

public class BaseAssistant implements Assistant {

	private Assistant next;
	@Override
	public void setNext(Assistant assistant) {
		// TODO Auto-generated method stub
		next  = assistant;
	}

	@Override
	public void handle(ValidationRequest validationRequest) {
		// TODO Auto-generated method stub
		
		if (this.next != null) {
            next.handle(validationRequest);
        }
	}

}

