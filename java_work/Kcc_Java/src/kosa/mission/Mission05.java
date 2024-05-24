package kosa.mission;

import java.util.Scanner;

public class Mission05 {

	public static void main(String[] args) {

		String strValue = "Hello Java Programming";
		char[] charArray = new char[4];

		strValue.getChars(6, 10, charArray, 0);

		System.out.println(charArray);
		System.out.println(strValue.indexOf("Java"));
		System.out.println(strValue.indexOf("Java")+"Java".length());
		
	
		 Scanner sc = new Scanner(System.in);
	        String flag, userinput = null, totalMenu = "";
	        while (true) {
	            System.out.println("1.추가 2.출력 3.검색 4.종료");
	            System.out.print("선택해주세요 : ");
	            flag = sc.nextLine();
	            if (flag.equals("1")) {
	                System.out.print("추가메뉴 입력: ");
	                userinput = sc.nextLine();
	                totalMenu += userinput + " ";
	                System.out.println();
	            } else if (flag.equals("2")) {
	                System.out.print("총 메뉴출력: ");
	                System.out.println(totalMenu);
	                System.out.println();
	            } else if (flag.equals("3")) {
	                System.out.print("검색할메뉴입력: ");
	                userinput = sc.nextLine();
	                int index = totalMenu.indexOf(userinput);
	                if (index != -1) {
	                    System.out.println("위치확인: " + index);
	                    System.out.println("검색된 메뉴: " + userinput);
	                } else {
	                    System.out.println("찾으시는 메뉴가 없습니다");
	                }
	                System.out.println();
	            } else if (flag.equals("4")) {
	                System.out.println("빠이빠이");
	                break;
	            }
	        }
	        sc.close();
	    }

	

}
