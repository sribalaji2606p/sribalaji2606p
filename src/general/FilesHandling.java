package general;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class FilesHandling {
	
	
	public static void main(String[] args) throws IOException {
		
	File obj = new File("E:\\Java\\AdactinCucumber\\Adactin.xlsx");
	System.out.println("JVM Can Read File -> " + obj.canRead());
	
	String absolutePath = obj.getAbsolutePath();
	System.out.println(absolutePath);
	
	FileWriter obj1 = new FileWriter("E:\\Java\\AdactinCucumber\\Adactin.xlsx");
	obj1.write("Hello");
	obj1.close();
	
	Scanner sc = new Scanner(obj);
	System.out.println(sc.nextLine());
	
	System.out.println(obj.list());
	
	
	

}
}