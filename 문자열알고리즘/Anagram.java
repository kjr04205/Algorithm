package Algorithm;

import java.util.Scanner;

public class Anagram {
	public static int[] getAlphabetCount(String str) {
		int[] count = new int[26];
		for(int i=0; i<str.length(); i++) {
			count[str.charAt(i) - 'a']++;
		}
		return count;
	}
	public static void main(String[] args) {
		// 애너그램
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		String b = sc.next();
		
		int[] countA = getAlphabetCount(a); // dared; [1,0,0,2,1]
		int[] countB = getAlphabetCount(b);
		
		int answer = 0;
		for(int i=0; i<26; i++) {
			answer += Math.abs(countA[i] - countB[i]);
		}
		System.out.println(answer);
	}
}
