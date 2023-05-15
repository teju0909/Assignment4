import java.util.Scanner;

public class StringBul {
	public static void main(String...e) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String :: ");
		String s = sc.next();
		char arry[] = s.toCharArray();
		String re="";
		
		for(int i=0;i<arry.length;i++) {
			for(int j=i+1;j<arry.length;j++)
			{
				if(arry[i]==arry[j]) 
				{
					re = re+" " + arry[i]; 
				}	
			}
		}
		
		System.out.print("Duplicate characters in String is : "+re);
	
		
	}
}
