package Lisvok;

public class WritableDocument extends Document {
	public WritableDocument(String fileName) {
		super(fileName);
	}
	public void save() {
		System.out.println(this.getData()+"was save in ");
	}

}
