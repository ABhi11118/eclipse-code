package datadriventesting;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadDataFromPropertyFile {
	public static void main(String[] args) throws Throwable {
		//Create the FileInputStream Obj with the file address as an input
		//the argument name is nothing but the relative path of the file
		FileInputStream fis = new FileInputStream("./src/test/resources/actitimedata.properties");
		//Create an Properties Object of Java
		Properties probj = new Properties();
		//load all the input stream obj to the probj obj
		probj.load(fis);
		//call the getProperty() from the Properties Class Object reference
		String value = probj.getProperty("browser"); //creating browser as a property object
		String value1 = probj.getProperty("url");    //creating url as a property object
		String value2 = probj.getProperty("username"); //creating username as a property object
		String value3 = probj.getProperty("password"); //creating password as a property object
		System.out.println(value);	//To get the data of related value
		System.out.println(value1);
		System.out.println(value2);
		System.out.println(value3);
	}
}
