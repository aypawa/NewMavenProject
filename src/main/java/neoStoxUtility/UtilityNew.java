package neoStoxUtility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class UtilityNew {

	public static String getDataFromPropertyFile(String key) throws IOException
	{
		Properties prop=new Properties();
		
		FileInputStream myFile=new FileInputStream("C:\\Users\\ajink\\eclipse-workspace\\MavenProject\\myProperties.properties");
		
		prop.load(myFile);
		
		String value=prop.getProperty(key);
		return value;
	}
}
