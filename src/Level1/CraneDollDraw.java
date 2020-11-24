/* [크레인 인형뽑기 게임]
 * - 매개변수
 * => board[][] : 인형뽑기 기구 크기, moves[] : 움직일 인형 라인 선택
 * - 크레인을 모두 작동시킨 후 터트려져 사라진 인형의 개수를 return
 * - input : [[0,0,0,0,0],[0,0,1,0,3],[0,2,5,0,1],[4,2,4,4,2],[3,5,1,3,1]]
 * - moves : [1,5,3,5,1,2,1,4]
 * - output : 4
 */
package Level1;

import java.util.Stack;

class Solution {
    public int solution(int[][] board, int[] moves) {
    	int answer = 0;
    	
    	Stack<Integer> stack = new Stack<>();
    	stack.push(0); // stack의 맨 위 값과 비교해야하는데 아무것도 없으면 오류남
    	
    	for(int move : moves) {
    		for(int j = 0; j < board.length; j++) {
    			if(board[j][move - 1] != 0) {
    				if(stack.peek() == board[j][move - 1]) {
    					stack.pop();
    					answer += 2;
    				}
    				else {
    					stack.push(board[j][move - 1]);
    				}
    				board[j][move - 1] = 0;
    				break;
    			}
    		}
    	}
    	return answer;
    } 
    
}

public class CraneDollDraw {

	public static void main(String[] args) {
		int[][] a = {{0,0,0,0,0}, {0,0,1,0,3}, {0,2,5,0,1}, {4,2,4,4,2}, {3,5,1,3,1}};
		int[] b = {1,5,3,5,1,2,1,4};
		Solution so = new Solution();
		so.solution(a, b);
	
	}

}
