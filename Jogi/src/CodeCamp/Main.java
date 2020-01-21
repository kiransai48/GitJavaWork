package CodeCamp;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {

    public static void main(String[] args) {

		TreeMap<String,String> t= new TreeMap<String,String>();
		Scanner scan= new Scanner(System.in);
		
		System.out.println("Enter the number of clients");
		int x= Integer.parseInt(scan.nextLine());
		
		for(int i=0;i<x;i++)
		{
			System.out.println("Enter the details of the client "+(i+1));
			String clientId=scan.nextLine();
			String clientName= scan.nextLine();
			String email=scan.nextLine();
			String passportNumber= scan.nextLine();
			Client c= new Client(clientId, clientName, email, passportNumber);
			t.put(clientId, clientName+"--"+email+"--"+passportNumber);
		}
		
		System.out.println("Client Details");
		for(Entry<String, String> m:t.entrySet()){    
		       System.out.println(m.getKey()+"--"+m.getValue());    
		      }    
		System.out.println("Enter the id of the client to be searched");
		String search= scan.nextLine();
		System.out.println("Client Details");
		if(t.containsKey(search))
		{
			System.out.println(t.get(search));
		}
		else
		{
			System.out.println("Client not found");
		}

	}

}