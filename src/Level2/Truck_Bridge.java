/* [다리를 지나는 트럭]
 * - 트럭 여러 대가 강을 가로지르는 일 차선 다리를 정해진 순으로 건너려 합니다.
 *   모든 트럭이 다리를 건너려면 최소 몇 초가 걸리는지 알아내야 합니다.
 *   트럭은 1초에 1만큼 움직이며, 다리 길이는 bridge_length이고 다리는 무게 weight까지 견딥니다.
 *  ※ 트럭이 다리에 완전히 오르지 않은 경우, 이 트럭의 무게는 고려하지 않습니다.
 *  
 * - ex) [bridge_length]	[weight]		  [truck_weights]				[return]
				2				10				 [7,4,5,6]						8
				100				100					[10]						101
				100				100		[10,10,10,10,10,10,10,10,10,10]			110
 *       
 */

package Level2;

import java.util.Stack;

class Solution_4 {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
    	Stack<Integer> stack = new Stack<Integer>();
    	
    	for(int i = truck_weights.length - 1; i >= 0; i--) {
    		stack.add(truck_weights[i]);
    	}
    	// 스택 top부터 7 4 5 6
    	
    	int answer = 1; // 모든 트럭이 다리를 지나는데 걸리는 시간
    	int top = 0;
    	
    	
    	while(!stack.isEmpty()) {
    		top = stack.pop();
    		
    		Loop :
    		for(int i = 0; i < bridge_length; i++) {
    			answer++;
    			
    			if(stack.isEmpty()) {
    				answer++;
    				break Loop;
    			}
    			else if(top + stack.peek() < 10) {
    				top = stack.pop();
    				answer++;
    			}
    		}
 
    	}
    	
    	
        System.out.println(answer);
        return answer;
    }
}

public class Truck_Bridge {

	public static void main(String[] args) {
		int bridge_length = 2;
		int weight = 10;
		int[] truck_weights = {7, 4, 5, 6};
		
		
		Solution_4 so = new Solution_4();
		so.solution(bridge_length, weight, truck_weights);
		

	}

}
