/* [가장 큰 수]
 * - 0 또는 양의 정수가 주어졌을 때,
 * 	 정수를 이어 붙여 만들 수 있는 가장 큰 수를 알아내 주세요.
 * 
 * - ex) [6, 10, 2] => [6102, 6210, 1062, 1026, 2610, 2106]
 * 					=> result : 6210
 * 
*/
package Level2;
import java.util.Arrays;
import java.util.Comparator;

class Solution_5 {
    public String solution(int[] numbers) {
    	
    	// 숫자를 문자열로 변환
    	String[] result = new String[numbers.length];
    	for(int i = 0; i < numbers.length; i++) {
    		result[i] = String.valueOf(numbers[i]);
    	}
    	
    	// 정렬
    	Arrays.sort(result, new Comparator<String>() {
	
    		public int compare(String o1, String o2) {
    			return ((o2 + o1).compareTo(o1 + 02));
    		}
    	});
    	
    	
		// 0만 여러개 있는 배열의 경우 하나의 0만 리턴
		if(result[0].equals("0")) {
			return "0";
		}
		
		String answer = "";
		// 정렬된 문자 하나로 합치기
		for (String a : result) {
			answer += a;
		}
		
		return answer;
    }
}


public class MaxNumber {
	
	public static void main(String[] args) {
		int[] numbers = {6, 10, 2};
		
		Solution_5 so = new Solution_5();
		so.solution(numbers);
		
	}
}
