package hrMiniTest.io;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public interface Console {
	// 단순히 콘솔창에 받기위한거 다 모아노음
	
	Scanner sc = new Scanner(System.in);
	
	/*
	 	info(Object obj): 객체 정보를 콘솔에 출력합니다.
		err(String msg): 오류 메시지를 콘솔에 출력합니다.
		inStr(String msg, int len): 문자열 입력을 받아서 검증 후 반환합니다.
		inNum(String msg): 숫자 입력을 받아서 검증 후 반환합니다.
		inDate(String msg): 날짜 입력을 받아서 검증 후 반환합니다. 
	  
	 */
	
	static void info(Object obj) {
		System.out.println(obj);
	}
	
	static void err(String msg) {
		System.out.println("ERROR] " + msg);
	}
	
	private static void inMsg(String msg) {
		System.out.print(msg + "\n> ");
	}
	
	static String inStr(String msg, int len) {
		String input = "";
		boolean isGood = false;
		do {
			Console.inMsg(msg);
			input = sc.nextLine();
			isGood = input.matches("[a-zA-z가-힣0-0]{1," + len+"}");
			if(!isGood) Console.err(len+"자 이하의 문자가 아닙니다.");
		} while (!isGood);
		return input;
	}
	
	static int inNum(String msg) {
		String input = "";
		boolean isGood = false;
		do {
			Console.inMsg(msg);
			input = sc.nextLine();
			isGood = input.matches("[0-9]+");
			if(!isGood) Console.err("0 이상의 정수가 아닙니다.");
		} while (!isGood);
		return Integer.parseInt(input);
	}
	
	static LocalDate inDate(String msg) {
		String input = "";
		LocalDate date = null;
		do {
			Console.inMsg(msg);
			input = sc.nextLine().trim();
			if (input.length()>0) {
				try {
					date = LocalDate.parse(input, DateTimeFormatter.ISO_DATE);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			if(date == null) Console.err("YYYY-MM-DD 형식의 실제 날짜가 아닙니다.");
		} while (date == null);
		return date;
	}
}
