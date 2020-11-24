/* [완주하지 못한 선수]
 * - participant = 마라톤에 참여한 선수들의 이름이 담긴 배열
 * - completion = 완주한 선수들의 이름이 담긴 배열
 * - answer = 완주하지 못한 선수의 이름
 * 
 */
package Level1;

import java.util.Arrays;

class Solution_1 {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        
        Arrays.sort(participant);
        Arrays.sort(completion);
        
        for(String e : participant) {
        	System.out.println(e);
        }
        
        for(String e : completion) {
        	System.out.println(e);
        }
        
        
       return answer;
    }

    
}



public class Marathon {
	public static void main(String[] args) {
		Solution_1 so = new Solution_1();
		String[] a = {"mislav", "stanko", "mislav", "ana"};
		String[] b = {"stanko", "ana", "mislav"};
		so.solution(a, b);
	}

}
