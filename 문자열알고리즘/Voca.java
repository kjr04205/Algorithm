package Algorithm;

import java.util.Scanner;

/*
 * 첫째 줄에 알파벳 대소문자로 이루어진 단어가 주어진다. 주어지는 단어의 길이는 1,000,000을 넘지 않는다.
 * 첫째 줄에 이 단어에서 가장 많이 사용된 알파벳을 대문자로 출력한다. 단, 가장 많이 사용된 알파벳이 여러 개 존재하는 경우에는 ?를 출력한다. 
 * 예제1 : Mississipi => ?
 * 예제2 : zZa => Z 
 */  
public class Voca {
	public static int[] getAlphabetCount(String str) {
		int[] count = new int[26];
		for(int i=0; i<str.length(); i++) {
			char ch = str.charAt(i);
			if('A' <= ch && ch <= 'Z') {
				count[ch-'A']++;
				//System.out.println(count[ch-'A']);
			}else if('a' <= ch && ch <= 'z') {
				count[ch-'a']++;
			}
		}
		return count;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		int[] count = getAlphabetCount(str);
		for(int i=0; i<26; i++) {
			if(count[i] > 0)
				System.out.println((char)('A' + i) + ":" + count[i]);
		}
		int maxCount = -1;
		char maxAlphabet = '?';
		for(int i=0; i<26; i++) {
			if(count[i] > maxCount) {
				maxCount = count[i];
				maxAlphabet = ((char)('A' + i));
			}else if(count[i] == maxCount) {
				maxAlphabet = '?';
			}
		}
		System.out.println(maxAlphabet);
	}

}
