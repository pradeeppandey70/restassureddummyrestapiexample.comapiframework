package base;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
	private static final Properties prop = new Properties();
	private static final String configpath = System.getProperty("user.dir") + "/src/test/resources/configs/config.properties";
	static {
		try {
			FileInputStream fis = new FileInputStream(configpath);
			prop.load(fis);
		}catch(IOException e) {
			System.out.println("config File not found");
		}
	}
	
	public static String getConfig(String key){
		return prop.getProperty(key);
	}

}
