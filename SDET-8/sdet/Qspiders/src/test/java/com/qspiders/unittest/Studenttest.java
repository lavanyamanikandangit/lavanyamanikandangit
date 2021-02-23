package com.qspiders.unittest;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.testng.annotations.Test;

import com.qspiders.student.ParserClass;
import com.qspiders.student.StudentClass;

public class Studenttest {
	
	
	@Test
	public void unittest() throws JsonGenerationException, JsonMappingException, IOException {
		StudentClass stuObj=new StudentClass("Ram",10,"2014",98989898,"Chennai");
		ObjectMapper objmapper=new ObjectMapper();
		objmapper.writerWithDefaultPrettyPrinter().writeValue(new File("./getallstudentinfo.json"),stuObj); //parsing
		
		ParserClass.jsonSerialization(stuObj, new File("./getstu.json"));
		
//		Student obj=(Student)ParserClass.jsonDeSerialization(new File("./getstudent.json"), Student.class);//deserilisation//test
//		System.out.println(obj.getaName());
//		System.out.println(obj.getrollNum());
		
		
		
	}
}
