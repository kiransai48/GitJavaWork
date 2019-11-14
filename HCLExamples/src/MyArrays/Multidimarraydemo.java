package MyArrays;
import static java.lang.System.out;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
public class Multidimarraydemo {
	
	public static void main(String[] args)throws IOException{
	
		String studentName[]= {"Sai","Kiran"};
		String subjectName[]= {"Maths","Physics","Chemistry"};
		int marks[][][]=new int[2][2][3];
		int year=1;
		
		
		//create input stream reader object to accept data from keyboard
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		for(int i=0;i<2;i++)
		{
			out.println("enter"+year+"year Marks:");
			for(int j=0;j<studentName.length;j++)
			{
				out.println("enter"+studentName[j]+" Marks:");
				for(int k=0;k<subjectName.length;k++)
				{
					out.println("Marks for"+subjectName[k]);
					marks[i][j][k]=Integer.parseInt(br.readLine());
				}
			}
			year++;
		}
		
}
	
	

}
