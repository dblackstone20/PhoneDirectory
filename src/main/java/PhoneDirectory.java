package main.java;

import java.util.*;
import java.io.*;

public class PhoneDirectory{
	static Properties properties = new Properties();

	public PhoneDirectory(){
		try (InputStream in = new FileInputStream("src/main/resources/phone.properties")) {
			Properties prop = new Properties();
			prop.load(in);
			for (String property : prop.stringPropertyNames()) {
				String value = prop.getProperty(property);
				addEntry(property, value);
			}
		} catch (IOException e) {
			// TODO Auto-generated block
			e.printStackTrace();
		}
	}
	
	public void addEntry(String name, String number){
		try{
			OutputStream out = new FileOutputStream("src/main/resources/phone.properties");
		properties.setProperty(name, number);
		properties.store(out, "Phone Directory");
		}catch(IOException e){
			e.printStackTrace();
		}
	}
	
	public void deleteEntry(String name){
		try{
			OutputStream out = new FileOutputStream("src/main/resources/phone.properties");
		   properties.remove(name);
		   properties.store(out, "Phone Directory");
		}catch(IOException e){
			e.printStackTrace();
		}
	}

	public String getNumber(String name){
		return properties.getProperty(name);
	}

	public void changeEntry(String name, String number){
		addEntry(name,number);	
	 }
	
	public void print(){
		System.out.printf("%-15s%-15s","Name","Number");
		System.out.println();
		for (String property : properties.stringPropertyNames()) {
			String value = properties.getProperty(property);
			System.out.printf("%-15s%-15s",property, value);
			System.out.println();
		}
	}
}
