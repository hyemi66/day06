package array;

import java.util.Scanner;

public class Ex07 {
	public static void main(String[] args) {
		// 문제풀이
		Scanner sc =new Scanner(System.in);
		String[] id = new String[5];
		String[] pwd = new String[5];
		String inputId = null, inputPwd=null;
		int num,index=0, count=0;
		while(true) {
			System.out.println("1. 로그인");
			System.out.println("2. 회원가입");
			System.out.println("3. 특정회원보기");
			System.out.println("4. 특정회원 비밀번호 수정");
			System.out.println("5. 특정회원 삭제");
			System.out.println("6. 모든 회원보기");
			System.out.println("7. 나가기");
			System.out.print(">>> ");
			num = sc.nextInt();
			switch(num) {
			case 1 : 
				System.out.print("아이디 : ");
				inputId = sc.next();
				System.out.print("비밀번호 : ");
				inputPwd = sc.next();
				for(index=0; index<id.length; index++) {
					if(inputId.equals(id[index])) {
						if(inputPwd.equals(pwd[index])) {
							System.out.println("인증통과");
						} else {
							System.out.println("비밀번호 틀림");
						} break;
					}
				}
				if(index == id.length) {
					System.out.println("존재하지않는 아이디입니다");
					System.out.println("회원가입 먼저 하세요");
				}
				System.out.println("로그인"); break;
			case 2 : 
				System.out.print("아이디 : ");
				inputId = sc.next();
				System.out.print("비밀번호 : ");
				inputPwd = sc.next();
				if(count < id.length) {
					for(index=0; index<count; index++) {
						if(inputId.equals(id[index])) {
							System.out.println("중복된 아이디");
							break;
						}
					}
					if(index == count) {
						id[count] = inputId;
						pwd[count] = inputPwd;
						count++;
					}
				} else {
					System.out.println("저장공간 부족");
				}
				System.out.println("회원가입"); break;
			case 3 : 
				System.out.print("아이디 : ");
				inputId = sc.next();
				for(index=0; index<id.length; index++) {
					if(inputId.equals(id[index])) {
						System.out.println("아이디 : " + id[index]);
						System.out.println("비밀번호 : " + pwd[index]);
						break;
					}
				}
				System.out.println("특정회원보기"); break;
			case 4 : 
				System.out.print("아이디 : ");
				inputId = sc.next();
				for(index=0; index<id.length; index++) {
					if(inputId.equals(id[index])) {
						System.out.print("바꿀 비밀번호 : ");
						inputPwd = sc.next();
						pwd[index] = inputPwd;
						break;
					}
				}
				System.out.println("특정회원 비밀번호 수정"); break;
			case 5 : 
				System.out.print("아이디 : ");
				inputId = sc.next();
				for(index=0; index<id.length; index++) {
					if(inputId.equals(id[index])) {
						id[index] = null;
						pwd[index] = null;
						break;
					}
				}
				System.out.println("특정회원 삭제"); break;
			case 6 : 
				for(index=0; index<id.length; index++) {
				System.out.println(id[index]+pwd[index]);
				}
				System.out.println("모든 회원보기"); break;
			case 7 : 
				System.out.println("프로그램 종료");
				System.exit(1);
			}
		}
	}
}
