
public class StringJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s= "djsknfls basjsa adsed";
		String s1=new String("sajhdabkds");
		//System.out.println(s+s1);
		String[] adsa=s.split(" ");
		System.out.println(adsa[0]);
		for (int i=0;i<s.length();i++) {
			System.out.println(s.charAt(i));
		}
		for (int i=s.length()-1;i>=0;i--) {
			System.out.println(s.charAt(i));
		}
	}

}

//What is string ? >> String is object which consist sequence of characters
//how to represent string >> in two ways 1) Literal : String s="djsknfls"
//										 2) new : String s1=new String("Djas k");
// how to reverse the string