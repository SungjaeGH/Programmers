/* ���� �迭 numbers�� ����
 * numbers���� ���� �ٸ� �ε����� �ִ� �� ���� ���� �̾� ���ؼ�
 * ���� �� �ִ� ��� ���� �迭�� ������������ ��� return
 * ex) 1. [2,1,3,4,1] => [2,3,4,5,6,7]
 * 	   2. [5,0,2,7] => [2,5,7,9,12]
 */
package Level1;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class SelectAdd {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] numbers = new int[5];
		int result = 0;
		
		for(int i = 0; i < numbers.length; i++) {
			numbers[i] = sc.nextInt();
		}
		sc.close();
		
		Set<Integer> result_set = new HashSet<Integer>();
		
		for(int i = 0; i < numbers.length; i++) {
			for(int j = 0; j < numbers.length; j++) {
				
				if(i == j) {
					continue;
				}
				else {
					result = numbers[i] + numbers[j];
					result_set.add(result);					
				}
			}
		}
		
		for(int e : result_set) {
			System.out.print(e + " ");
		}
		
	}

}
