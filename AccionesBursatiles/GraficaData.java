package AccionesBursatiles;



public class GraficaData implements XMLtoJSON {
	private String xml;
	
	public GraficaData(String xml) {		
		this.xml = xml;
	}

	 

	@Override
	public String convierteXmlToJson() {
		 System.out.println("Convirtiendo datos XML to JSON ");
		 
		 /*try {  
			 JSONObject json = XML.toJSONObject(xml);   
			         String jsonString = json.toString(4);  
			         System.out.println(jsonString);  
			   
			 }catch (JSONException e) {  
			 // TODO: handle exception  
			 System.out.println(e.toString());  
			 }*/  
		 
		 
		return "{\r\n"
				+ "    \"test\": {\r\n"
				+ "        \"-attrib\": \"moretest\",\r\n"
				+ "        \"#text\": \"Turn this to JSON\"\r\n"
				+ "    }\r\n"
				+ "}";
	}

	public String getXml() {
		return xml;
	}

	public void setXml(String xml) {
		this.xml = xml;
	}

}
