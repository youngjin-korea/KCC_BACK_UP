package kosa.mission;

import java.util.Scanner;

public class Mission04 {

	public static void main(String[] args) {
		// ���ڿ� ��
//		String a = "abc";
//		String b = "abc";
//		
//		if( a.equals(b) ) {
//			System.out.println("����");
//		}else {
//			System.out.println("Ʋ����");
//		}

		// �� ������ ������ ���ڿ��� �Է¹޾�
		// ��Ģ���� ����� ����Ͻÿ�.
		// ex> ���� 1: 10
		// ex> ���� 2: 20
		// ex> ������: 30
		Scanner sc = new Scanner(System.in);
		int userint1, userint2;
		String usercal;
		System.out.println("�� ������ �Է��� ������ ���ڿ� + - * / �� �Է�");
		System.out.print("���� 1: ");
		userint1 = Integer.parseInt(sc.nextLine());
		System.out.print("���� 2: ");
		userint2 = Integer.parseInt(sc.nextLine());
		System.out.print("������: ");
		usercal = sc.nextLine();
		if (usercal.equals("+")) {
			System.out.println("���: " + (userint1 + userint2));
		} else if (usercal.equals("-")) {
			System.out.println("���: " + (userint1 - userint2));

		} else if (usercal.equals("*")) {
			System.out.println("���: " + (userint1 * userint2));

		} else if (usercal.equals("/")) {
			System.out.println("���: " + (userint1 / userint2));

		}
		sc.close();

	}

}