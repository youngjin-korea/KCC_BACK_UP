package kosa.api;

import java.util.Scanner;

public class RegularExam {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("입력: ");
		String str = sc.nextLine();
		
		// abc 문자를 포함 여부 체크
//		if (str.matches(".*abc.*")) {
//			System.out.println("매칭");
//		}else {
//			System.out.println("비매칭");
//		}
		
		// 숫자만 3자리 유무 판단 ==> \\d
//		if (str.matches("\\d{3}")) {
//			System.out.println("매칭");
//		}else {
//			System.out.println("비매칭");
//		}
		
		// 알파벳 숫자만 5자리 이상
		// [\\w]{5,}
//		if (str.matches("\\w{5}.*")) {
//			System.out.println("매칭");
//		}else {
//			System.out.println("비매칭");
//		}
		
		// 한글 3자리~4자리
//		if (str.matches("[가-힣]{3,5}")) {
//			System.out.println("매칭");
//		}else {
//			System.out.println("비매칭");
//		}
		
		// 이메일 검증
		// tmddn3410@naver.com
		// 123abc@naver.com =>X
		// 123abcnaver.com =>X
		// 123abc@naver.naver =>X
		// 영문자로만시작 @ 영문자 . 이후는 3자리
		// ^[\\D]\\w+@\\w+\\.\\w{2,3}
//		if (str.matches("[a-z]+\\w+@.[a-z]{1,4}[.][a-z]{3}")) {
//			System.out.println("매칭");
//		}else {
//			System.out.println("비매칭");
//		}
		
		sc.close();
	}

}
