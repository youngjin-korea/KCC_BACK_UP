package kosa.phoneList;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class PhoneListMain {
	
	public static void main(String[] args) {
		//Scanner sc = new Scanner(System.in);

		PhoneManager tm = new PhoneManager(); 
		
		while(true) {
			System.out.println("전화번호부 : 이름. 전화번호, 생년월일, 한명의 전화 내역을 출력");
			System.out.println(">1.추가 2.전체출력 3.검색 4.수정 5.삭제 6.정렬  7.데이터 저장 8.데이터불러오기 9.종료");
			System.out.println(">메뉴 입력: ");
			String menu = DataInput.sc.nextLine();
			switch (menu) {
			case "1":
				tm.addPhoneInfo();
				break;
			case "2":
				tm.listPhoneInfo();
				break;
			case "3":
				tm.searchPhoneInfo();
				break;
			case "4":
				tm.updatePhoneInfo();
				break;
			case "5":
				tm.deletePhoneInfo();
				break;
			case "6":
				tm.sortedPhoneInfo();
				break;
			case "7":
				tm.saveObject();
				break;
			case "8":
				tm.loadObject();
				break;
			case "9":
				System.out.println("프로그램 종료");
				return;
				

			default:
				System.out.println("잘못입력하면 대머리");
				break;
			}
			
		}
		
	}
}
