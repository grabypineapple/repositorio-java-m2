package AccionesBursatiles;

import Figura.Circulo;
import Figura.Eclipse;
import Figura.Figura;

public class Aplicacion {

	public static void main(String[] args) {
		
		 		
		
		String xmlTest ="<?xml version=\"1.0\" ?><test attrib=\"moretest\">Turn this to JSON</test>";
		System.out.println(" XML  "+ xmlTest);
		 	XMLtoJSON docXML = new Biblioteca(xmlTest);
		 	

			System.out.println("Convierte documento  "+ docXML.convierteXmlToJson());

	}

	public static void adapter(Biblioteca biblioteca) {
		String xmlTest ="<?xml version=\"1.0\" ?><test attrib=\"moretest\">Turn this to JSON</test>";
		biblioteca.setXml(xmlTest);			
		
		System.out.println(" "+ biblioteca.getXml());
		
		System.out.println(" Adapter "+ biblioteca.convierteXmlToJson());
		
	}

}


