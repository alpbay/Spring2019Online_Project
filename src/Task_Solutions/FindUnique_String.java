package Task_Solutions;

public class FindUnique_String {
	
	public static void main(String[] args) {
		String str ="AAABBBCDDDEFF";    // expected result ==> CE
		String unique = "";
		String arr[] = str.split("");
		
	for(int z=0; z<str.length(); z++) {	
		int num=0;
		for(int i=0;i<str.length(); i++) {
			if(arr[i].equals(""+str.charAt(z))) {
				num++;
			}	
		}
		if(num==1) unique += str.charAt(z);
	}
	
	System.out.println(unique);
		
		
	}
}