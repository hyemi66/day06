package array;

public class Ex03 {
	public static void main(String[] args) {
		String[] str = {"aaa","bbb","ccc"};
		for(int i=0; i<str.length; i++) {
			System.out.println(str[i]);
		}
		System.out.println("=====");
		for(String n : str) {
			System.out.println(n);
		}
		// 문제
		int arr[] = {10,54,13,17,25,30};
		for (int i=0; i<arr.length; i++) {
			if(arr[i]%2==0) {
				System.out.println("짝수 : "+arr[i]);
			} else {
				System.out.println("홀수 : "+arr[i]);
			}
		}
		for (int i=0; i<arr.length; i++) {
			if(arr[i]%2==0) {
				System.out.println("짝수 : "+arr[i]);
				continue;
			}
			System.out.println("홀수 : "+arr[i]);
		}
	}
}
