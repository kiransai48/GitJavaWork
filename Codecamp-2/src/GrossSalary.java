import java.text.DecimalFormat;
	import java.util.Scanner;
	public class GrossSalary {

			public static void main(String args[]) {
			Scanner sc =new Scanner(System.in);	
			float basicSal=0.00f;
			float HRA=0.0f,DA=0.0f,GrossSal=0.0f;
			System.out.println("enter employee basic salary");
			basicSal=sc.nextFloat();
			if(basicSal<1500) {
				HRA= 0.1f*basicSal;
				DA=0.05f*basicSal;
				GrossSal= HRA+DA+basicSal;
				System.out.println("Gross Salary:"+GrossSal);
			}
			else if(basicSal>=1500) {
				HRA= 500;
				DA=0.98f*basicSal;
				GrossSal= HRA+DA+basicSal;
				System.out.println("Gross Salary:"+GrossSal);
			}
			}
			}



