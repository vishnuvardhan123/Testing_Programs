
public class Printing_Stars {

	public static void main(String[] args) {
		
		int  row=6;   
		//outer loop for rows  
		for(int i=0; i<row; i++)   
		{   
		//inner loop for columns  
		for(int j=0; j<=i; j++)   
		{   
		//prints stars   
		System.out.print("* ");   
		}   
		//throws the cursor in a new line after printing each line  
		System.out.println();   
			
		}
		

	}

}
