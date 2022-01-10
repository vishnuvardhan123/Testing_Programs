
public class Countofevenodd {

	public static void main(String[] args) {
		
		int a [] = {1,2,3,4,5,6};
		int even =0; int odd = 0; int b =0;	int c=0;
		for(int i = 0; i<a.length; i++)
			if (a[i]%2 ==0)
			{
				even++;
				b = a[i]+b;
			}
			else {
				odd++;
				c = a[i]+c;
	}
		System.out.println(even);
		System.out.println(odd);
		System.out.println(b);
		System.out.println(c);
	

	}

}
