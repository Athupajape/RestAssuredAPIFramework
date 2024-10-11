package org.testing.utilities;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

//input -> filepath
//purpose-> to load the properties file
//outpur ->

public class PropertiesHandle {

	public static Properties readPropertiesFile(String filepath) throws IOException {
		
		File f=new File(filepath);
		FileReader fr=new FileReader(f);

		Properties pr=new Properties();
		pr.load(fr);
		
		return pr;
	}
	
}
