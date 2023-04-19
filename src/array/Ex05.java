package array;

import java.util.Scanner;

public class Ex05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[] = {10,54,13,17,25,30};
		System.out.print("짝수, 홀수 입력 : ");
		String str = sc.next();
		for (int i=0; i<arr.length; i++) {
			if (str.equals("짝수") && arr[i]%2==0) {
				System.out.println("짝수 : "+arr[i]);
			} else if (str.equals("홀수") && arr[i]%2!=0) {
				System.out.println("홀수 : "+arr[i]);
			}
		}
	}
}
