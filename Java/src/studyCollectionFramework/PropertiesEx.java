package studyCollectionFramework;

import java.io.FileReader;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.Properties;

public class PropertiesEx {
	public static void main(String[] args) {
		
		Properties properties = new Properties();
		String path = PropertiesEx.class.getResource("database.properties").getPath();
		try {
			path = URLDecoder.decode(path, "UTF-8");
		} catch (UnsupportedEncodingException e) {
			System.out.println("URLDecoder 오류");
			e.printStackTrace();
		}
		try {
			properties.load(new FileReader(path));
		} catch (IOException e) {
			System.out.println("properties.load 오류");
			e.printStackTrace();
		}
		
		String driver = properties.getProperty("driver");
		String url = properties.getProperty("url");
		String userName = properties.getProperty("username");
		String password = properties.getProperty("password");
		
		System.out.println(driver);
		System.out.println(url);
		System.out.println(userName);
		System.out.println(password);

	}//end of main
}//end of class
