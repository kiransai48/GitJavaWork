package CodeCamp;

import java.util.List;
import java.util.ArrayList;
public class Program3 {
	public static void main(String args[]) {
		int key;
		List<Integer> a1=new ArrayList<Integer>();
		a1.add(23);
		a1.add(35);
		a1.add(123);
		a1.add(273);
		a1.add(1223);
		key=273;
		a1.contains(key);
		if(a1.contains(key)==true) {
			System.out.println(key+" found in array list");
		}
		else
			System.out.println(key+" Not found in array list");
		
	}
	boolean contains(int key) {
		return true;
	}
}	

		   



