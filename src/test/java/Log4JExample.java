import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;

public class Log4JExample {

	static Logger logger = Logger.getLogger(Log4JExample.class);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DOMConfigurator.configure("log4j.xml");
        //Log in console in and log file
		logger.debug("Log4j appender configuration is successful !!");
	}

}
