
public class Pyramid_Pattren {

	public static void main(String[] args) {
		
		//i for rows and j for columns      
		//row denotes the number of rows you want to print  
		int i, j, row = 6;       
		
		for (i=0; i<row; i++)
		{
			
		for (j=row-i; j>1; j--)   
		{  
		//prints space between two stars  
		System.out.print(" ");   
		}   
		
		for (j=0; j<=i; j++) 
		{
			
		System.out.println("* ");
		}
		
		System.out.println();
		}
			
		}

        }
