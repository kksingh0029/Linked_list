
import java.util.ArrayList;
import java.util.Scanner;
class inputvalue
{
	public int N=0;
	public int k=0;
	public int m=0;
	public ArrayList<String>   input = new ArrayList<String> ();
}

public class Sortingliststring {

	public static void main(String[] args) {
		System.out.println("Input the test case" );
		Scanner Sc =new Scanner(System.in);
		int test =Sc.nextInt();
		inputvalue [] iv=new inputvalue[test];
		for(int p=0;p<test;p++)
		{
			
		//ArrayList<String>   input = new ArrayList<String> ();
		 iv[p]=new inputvalue();
		
		System.out.println("enter the total number of string");
		iv[p].N=Sc.nextInt();
	   System.out.println("enter the index  of string");
		iv[p].k=Sc.nextInt();
		System.out.println("number of character used for sorting");
		iv[p].m=Sc.nextInt();
		for(int i=0;i<iv[p].N;i++)
			iv[p].input.add(Sc.next());
		//Sc.close();
		}
		
	
		for(int p=0;p<test;p++)
		{
		for(int sort=0;sort<iv[p].N-1;sort++)
		{
			for(int i=0;i<iv[p].N-1-sort;i++)
			{
			    if(compare(iv[p].input.get(i),iv[p].input.get(i+1),iv[p].m))
			    {
			    	String temp=iv[p].input.get(i+1);
			    	iv[p].input.set(i+1,(String)iv[p].input.get(i));
			    	iv[p].input.set(i,temp);
			    }
				
			}
		}
		
		
		
		System.out.println(iv[p].input.get(iv[p].k-1));
		System.out.println(iv[p].input.get(iv[p].k));
		System.out.println(iv[p].input.get(iv[p].k+1));
		
		
		}
		
		

	Sc.close();
	}

	public static boolean compare(String S,String P,int m)
	{
	for (int i=0;i<m;i++)
	{
	   if(S.charAt(i)>P.charAt(i))	
		   return true;
	}
		return false;
	}
	

}
