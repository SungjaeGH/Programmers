/* [k번째 수]
 * - 배열 array의 i번째 숫자부터 j번째 숫자까지 자르고 정렬했을 때,
 *   k번째에 있는 수를 구하려 합니다.
 * - 예를 들어 array가 [1, 5, 2, 6, 3, 7, 4], i = 2, j = 5, k = 3이라면
	 array의 2번째부터 5번째까지 자르면 [5, 2, 6, 3]입니다.
	 1에서 나온 배열을 정렬하면 [2, 3, 5, 6]입니다.
	 2에서 나온 배열의 3번째 숫자는 5입니다.
 * - 입출력 예
		array						commands				 return
[1, 5, 2, 6, 3, 7, 4]	[[2, 5, 3], [4, 4, 1], [1, 7, 3]]	[5, 6, 3]
 */

package Level1;

import java.util.Collections;
import java.util.ArrayList;

class Solution_5 {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        
        for(int i = 0; i < commands.length; i++) {
        	ArrayList<Integer> list = new ArrayList<Integer>();
        	for(int j = commands[i][0] - 1; j < commands[i][1]; j++) {
        		list.add(array[j]);
        	}
        	Collections.sort(list);
        	answer[i] = list.get(commands[i][2] - 1);
        }
       
        for(int Answer : answer) {
        	System.out.println(Answer);
        }
        
        return answer;
    }
}

/*class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        
        for(int i=0;i<commands.length;i++){
            int[] temp = Arrays.copyOfRange(array, commands[i][0]-1, commands[i][1]);
            Arrays.sort(temp);
            answer[i] = temp[commands[i][2]-1];
            
        }
        
        return answer;
    }
  }  
*/

public class KthNumber {
	public static void main(String[] args) {
		int[] array = {1, 5, 2, 6, 3, 7, 4};
		int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
		
		Solution_5 so = new Solution_5();
		so.solution(array, commands);
	}

}
