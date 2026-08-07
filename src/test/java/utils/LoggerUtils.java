package utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LoggerUtils {
	private LoggerUtils() {
		
	}
	public static Logger getlogger(Class<?>clazz) {
		return LoggerFactory.getLogger(clazz);
	}

}
