import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Map.Entry;


public class Findingmax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner Sc =new Scanner(System.in);
	        int n=Sc.nextInt();
			int k=Sc.nextInt();
			int cost[][]=new int[n][k];
		String S = Sc.nextLine();
		System.out.println(S);
		Map<Character,Integer> mapp = new HashMap<Character,Integer>();
	      for(int i=0;i<S.length();i++)
	      {
	    	 if(!(mapp.containsKey(S.charAt(i))))
	    	 {
	    		mapp.put(S.charAt(i),1);
	    	 }
	    	 else
	    	 {	
	    	 mapp.put(S.charAt(i),mapp.get(S.charAt(i))+1);
	    	 }
	      }
	      
	      
	      int max=1;
	      char p = 0;
	      for (Entry<Character, Integer> entry : mapp.entrySet())
	        { System.out.println("Key : " + entry.getKey() + " Value : "+ entry.getValue());
	    	  if(entry.getValue()>max)
	    	  {   max = entry.getValue();
	    	      p = entry.getKey();
	    	      	  
	    	  }
	    	  if(entry.getValue()==max)
	    	  {if(entry.getKey()<p)  
	   	      p = entry.getKey();
	           }
	        }
	      System.out.println(p+" "+max);
	}
	
	      
	}


