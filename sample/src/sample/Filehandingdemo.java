package sample;

import java.io.FileInputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
public class Filehandingdemo {
	public static void main(String[] args) {
		
	}
	static void fileinputstreamdemo() {
		int i;
		File myfile = new File("/Users/rkm/myfile");
		try {
			FileInputStream fis = new FileInputStream(myfile);
			
			System.out.println("File opened");
			System.out.println("------------");
			while((i = fis.read())!=-1) {
				System.out.println((char)i);
			}
			fis.close();
		}catch (FileNotFoundException e) {
			e.printStackTrace();
			
		}catch (IOException e) {
			e.printStackTrace();
		}
	}

}
