import java.util.*;
public class AngramOfString {
	private static int checkAnagram(String str1, String str2) {
		// converting string into char array
		char s1[] = str1.toCharArray();
		char s2[] = str2.toCharArray();
		
		// getting length of a string
		int len1 = str1.length();
		int len2 = str1.length();

		if(len1 != len2)
			return 0;
		// Sorting character array
		Arrays.sort(s1);
		Arrays.sort(s2);
		
		// Comparing two character array
		for (int i = 0; i < s1.length; i++) {
			if(s1[i]!=s2[i])
				return 0;
		}
		return 1;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Strings: ");
		String str1=sc.next();
		String str2 = sc.next();
		System.out.println(checkAnagram(str1,str2));
		sc.close();
	}
}