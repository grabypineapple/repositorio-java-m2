package ValidaApp;


public interface Assistant {
	 void setNext(Assistant assistant);
	 void handle(ValidationRequest ValidationRequest);
}
