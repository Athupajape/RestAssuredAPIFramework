package org.testing.utilities;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

import org.json.JSONObject;
import org.json.JSONTokener;

//input -> file path of json file
//purpose -> to read contents of json file
//output -> json data in string format


public class JsonHandling {

	public static String readJsonData(String filepath) throws FileNotFoundException {
		
		File f=new File(filepath);
		FileReader fr=new FileReader(f);
		JSONTokener jk=new JSONTokener(fr);
		JSONObject j=new JSONObject(jk); 
		return j.toString();
	}
	
}
