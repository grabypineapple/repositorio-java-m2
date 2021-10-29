package Lisvok;

public class TestDocument {
	public static void main(String[] args) {
        Project project = new Project();
        Document actaProyecto = new Document("actaProyecto");
        Document especificacionRequerimientos = new Document("especificacionRequerimientos");
        Document especificacionArquitectonica = new Document("especificacionArquitectonica");

        project.addDocument(actaProyecto);
        project.addDocument(especificacionArquitectonica);
        project.addDocument(especificacionRequerimientos);
        project.openAll();
        project.saveAll();
    }
}
