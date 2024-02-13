package java8;

import java.util.ArrayList;
import java.util.Base64;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Streams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			String na=encode("kapil");
			System.out.println(na);
			String n=decode(na);
			System.out.println(n);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}
	
	public static String encode(String name) {
		
		
		String s=Base64.getEncoder().encodeToString(name.getBytes());
		return s;
	}
	
	public static String decode(String dec) {
		byte [] g=Base64.getDecoder().decode(dec);
		
		String f=new String(g);
		
		return f;
		
	}
	

}
