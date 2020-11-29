/* [기능 개발]
 * - 프로그래머스 팀에서는 기능 개선 작업을 수행 중입니다.
 *   각 기능은 진도가 100%일 때 서비스에 반영할 수 있습니다.
 *   또, 각 기능의 개발속도는 모두 다르기 때문에 뒤에 있는 기능이 앞에 있는 기능보다 먼저 개발될 수 있고,
 *   이때 뒤에 있는 기능은 앞에 있는 기능이 배포될 때 함께 배포됩니다. 
 *   먼저 배포되어야 하는 순서대로 작업의 진도가 적힌 정수 배열 progresses와
 *   각 작업의 개발 속도가 적힌 정수 배열 speeds가 주어질 때 각 배포마다
 *   몇 개의 기능이 배포되는지를 return 하도록 solution 함수를 완성하세요.
 * 
 * - ex)
 * 	progresses : [93, 30, 55]
 *  speeds : [1. 30, 5]
 *  return : [2, 1]
 *  
 *  - 입출력 설명
 *  첫 번째 기능은 93% 완료되어 있고 하루에 1%씩 작업이 가능하므로 7일간 작업 후 배포가 가능합니다.
 *  두 번째 기능은 30%가 완료되어 있고 하루에 30%씩 작업이 가능하므로 3일간 작업 후 배포가 가능합니다. 
 *    하지만 이전 첫 번째 기능이 아직 완성된 상태가 아니기 때문에 첫 번째 기능이 배포되는 7일째 배포됩니다.
 *  세 번째 기능은 55%가 완료되어 있고 하루에 5%씩 작업이 가능하므로 9일간 작업 후 배포가 가능합니다.
 *  따라서 7일째에 2개의 기능, 9일째에 1개의 기능이 배포됩니다.
 */
package Level2;

import java.util.ArrayList;
import java.util.Stack;

class Solution_3 {
    public int[] solution(int[] progresses, int[] speeds) {
        Stack<Integer> stack = new Stack<>();
    	int[] answer = new int[progresses.length];
        
        for(int i = progresses.length - 1; i >= 0; i--) {
        	stack.add((int)Math.ceil((100 - progresses[i])/(double)speeds[i]));
        }
        
        ArrayList<Integer> list = new ArrayList<Integer>();
        
        while(!stack.isEmpty()) {
        	int count = 1;
        	int top = stack.pop();
        	
        	while(!stack.isEmpty() && stack.peek() <= top) {
        		count++;
        		stack.pop();
        	}
        	
        	list.add(count);
        	
        }
        
        for(int List : list) {
            System.out.println(List);
        }
        
        return answer;
    }
}

public class FunctionDevelopment {

	public static void main(String[] args) {
		int[] progresses = {93, 30, 55};
		int[] speeds = {1, 30, 5};
		
		Solution_3 so = new Solution_3();
		so.solution(progresses, speeds);

	}

}
