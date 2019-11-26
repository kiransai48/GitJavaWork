package Polymorphism;

import java.io.*;
public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter name:");
		String name=br.readLine();
		System.out.println("Enter age:");
		int age=Integer.parseInt(br.readLine());
		System.out.println("Enter country:");
		String country=br.readLine();
		Player p=new Player(name,age,country);
		System.out.println(p.toString());
	}
}
