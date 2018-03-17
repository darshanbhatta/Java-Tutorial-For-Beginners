import java.util.Arrays;

public class string {

	public static void main(String[] args) {
		char[] j = {'r','a','d','i','o'};
		String w = new String(j);
		System.out.println(w);
		
		String x = "radio";
		String y = "RADIO";
		System.out.println(x.charAt(2));
		System.out.println(x.length());
		System.out.println(x.equals(y));
		System.out.println(x.equalsIgnoreCase(y));
		System.out.println(x.replace('r','w'));
		
		String sub = "0123456789";
		System.out.println(sub.substring(4,7));
		System.out.println(sub.substring(4));
		
		System.out.println(x.toUpperCase());
		System.out.println(y.toLowerCase());
		
		String h = "Hello                               ";
		System.out.println(h + "x");
		System.out.println(h.trim() + "x");
		
		String hh = "Hello";
		System.out.println(hh.concat(" darshan"));
		System.out.println(hh + " darshan" + " you are cool");
		
		char[] newChar = hh.toCharArray();
		System.out.println(Arrays.toString(newChar));
		
		String str = "Animals,Lion,Tiger,Dogs,Cats";
		String[] newStrArray = str.split(", ");
		System.out.println(Arrays.toString(newStrArray));
		
		String sent = "The quick brown fox";
		System.out.println(sent.contains("fox"));
		System.out.println(sent.contains("Fox"));
		
		
		
	}

}
