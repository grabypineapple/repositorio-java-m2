package interfaceSegregation;

public interface CloudStorageProvider {
	 void storeFile(String name);
	 String getFile(String name);
}
