package kosa.phoneList;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class TeacherMain2 {
	
	public static void main(String[] args) {
		//Scanner sc = new Scanner(System.in);

		TeacherManager tm = new TeacherManager(); 
		
		while(true) {
			System.out.println("��ȭ��ȣ�� : �̸�. ��ȭ��ȣ, �������, �Ѹ��� ��ȭ ������ ���");
			System.out.println(">1.�߰� 2.��ü��� 3.�˻� 4.���� 5.���� 6.����  7.����");
			System.out.println(">�޴� �Է�: ");
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
				System.out.println("���α׷� ����");
				return;
				

			default:
				System.out.println("�߸��Է��ϸ� ��Ӹ�");
				break;
			}
			
		}
		
	}
}