package string;

public class Split {

	public static void main(String[] args) {
		String s="java is a programming langugae";
		
		String[] a=s.split(" ");
		for(int i=0;i<s.length();i++)
			System.out.println(a[i]);
	}

}
