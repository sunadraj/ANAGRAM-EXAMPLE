package string;
//Anagram means all letters in one string should be present in the second string !!
public class Anagram {
	public static boolean anagram(String s1,String s2) {
		while(s1.length()>0 || s2.length()>0) {
			s1=s1.toLowerCase();
			s2=s2.toLowerCase();
			if(s1.length()!=s2.length()) 
			{ 
				return false; 
			}
			char c=s1.charAt(0);
			s1=s1.replace(c+"","");
			s2=s2.replace(c+"","");
			
		}
		return true;                                  
	}
	public static void main(String[] args) {
		
		boolean s=anagram("sunad","danus");
		System.out.println(s);
	}

}
