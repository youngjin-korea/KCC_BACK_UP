package kosa.mission;

import java.util.Scanner;

public class Mission02 {

	public static void main(String[] args) {
		// �������� ����
		// ����, ����, ���� ������ Ű����� ���� �Է� �ް�
		// ������ ����� ����ϼ���. ����� �Ǽ���

		Scanner sc = new Scanner(System.in);
//		System.out.print("���� ������ �Է����ּ��� : ");
//		int kor = Integer.parseInt(sc.nextLine());
//		System.out.print("���� ������ �Է����ּ��� : ");
//		int eng = Integer.parseInt(sc.nextLine());
//		System.out.print("���� ������ �Է����ּ��� : ");
//		int math = Integer.parseInt(sc.nextLine());
//		double result = ((double)(kor+eng+math)/3);
//		System.out.printf("���� ���� : %d, ��� ���� : %.2f" , (kor+eng+math),(double)result);

//		int kor,eng,mat,total,aver;
//		
//		System.out.print("����: ");
//		kor = sc.nextInt();
//		System.out.print("����: ");
//		eng = sc.nextInt();
//		System.out.print("����: ");
//		mat = sc.nextInt();
//		
//		total = kor+eng+mat;
//		aver = (int)(total/3.0);
//		System.out.println("����: " + total);
//		System.out.println("���: " + aver);

		// 90=>A 80�̻�B 70�̻�C 60�̻�D 60����F
		// ABCDF  90 80 70 60
		System.out.println("������ �Է����ּ���");
		int score = Integer.parseInt(sc.nextLine());
//		if (score >= 90) {
//			System.out.println("A����");
//		} else if (score >= 80) {
//			System.out.println("B����");
//		} else if (score >= 70) {
//			System.out.println("C����");
//		} else if (score >= 60) {
//			System.out.println("D����");
//		} else {
//			System.out.println("F����");
//		}
		// 100/10  60/10 6
//		String grade = "FFFFFFDCBA".charAt(score/10)+"";
//		System.out.println(grade);
		
		String grade = "FFFFFFDCBA".charAt(score/10)+"";
		switch (grade) {
		case "A":	
			System.out.println("A����");
			break;
		case "B":	
			System.out.println("B����");
			break;
		case "C":	
			System.out.println("C����");
			break;
		case "D":	
			System.out.println("D����");
			break;
		default:
			System.out.println("F����");
			break;
		}
		sc.close();
	}

}