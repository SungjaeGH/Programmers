/* [가운데 글자 가져오기]
 * - 단어의 길이가 짝수라면 가운데 두글자 반환
 * - ex1. "abcde" -> "c"
 * - ex2. "qwer" -> "we"
 */

package Level1;

import java.util.Scanner;

public class centerChar {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		String answer = new String();
		
		if(s.length() % 2 == 0) {
			answer = s.substring((s.length() / 2 - 1), (s.length() / 2 + 1));
		} else {
			answer = s.substring((s.length() / 2), (s.length() / 2 + 1));
		}

		System.out.println(answer);
	}

}
