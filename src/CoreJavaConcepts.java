import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CoreJavaConcepts {
	
	public static void main (String args[]) {
	
		int n=5;
		String str="Hello how r u ?";
		char ch='r';
		double dec=5.990;
		boolean card= true;	
		System.out.println("Number: "+n+"\n"+str+"\n"+ch+"\n"+dec+"\n"+card);
		
		//Arrays - collection of multiple values
		int[] arr= new int[10];
		arr[0]=1;
		arr[1]=2;
		arr[2]=4;
		arr[3]=12;
		arr[4]=12;
		arr[5]=13;
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]+1);
		}
		String[] stris= {"Sd","sadas","sdfs","asadfsa"};
		for(int i=0;i<stris.length;i++)
		{
			System.out.println(stris[i]);
		}
		for (String s: stris) 
		{
			System.out.println(s);
		}
		String[] arrstring= {"bjdsa","asda","sdad"};
		
		//in the case of array we need to use length and in arraylist we need to use size
		ArrayList<String> a=new ArrayList<String>();
		a.add("tsthe");
		a.add("teshd");
		a.add("tegh");
		a.add("tesdvh");
		System.out.println("********************************************************************************");
		for (int i=0;i<a.size();i++)
		{
			System.out.println(a.get(i));
		}
		
		//Arrays are fixed-size collections of elements, while ArrayLists are dynamic and resizable collections of elements.
		List<String> ae = Arrays.asList(arrstring);
		
 	}	
}

