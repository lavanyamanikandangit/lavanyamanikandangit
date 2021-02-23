package com.qspiders.student;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;


public class ParserClass {//parser class written using JACKSON

	
	
	public static void jsonSerialization(Object obj,File dstfile) throws JsonGenerationException, JsonMappingException, IOException {
		ObjectMapper objmapper=new ObjectMapper();
		objmapper.writerWithDefaultPrettyPrinter().writeValue(dstfile,obj);
	}
	
	public static Object jsonDeSerialization(File srcfile,Class cls) throws JsonParseException, JsonMappingException, IOException {
		ObjectMapper objmapper=new ObjectMapper();
		return objmapper.readValue(srcfile,cls);
	}

}
