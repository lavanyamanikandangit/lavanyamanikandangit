import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class TestLog {

	
	public static Logger log=Logger.getLogger(TestLog.class.getName())
	public static void main(String[] args) {
		PropertyConfigurator.configure("./src/test/resources/propertiesFile/Log4j.Properties);
		log.info("This is the information log");
		log.error("Here th error logs will be printed");
	
}
}
