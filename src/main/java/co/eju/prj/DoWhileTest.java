package co.eju.prj;

import java.util.Scanner;

//�޴��� ó���ϴ� ��Ű���� �� ��
public class DoWhileTest {
	private Scanner sc = new Scanner(System.in);
	// 1.���� ��ĳ�� ��ü �����

	private void mainMenu() {
		System.out.println("===================");
		System.out.println("== 1.�Է� �ϱ� ==="); // 1�Է� 2���� 3��ȸ 4����
		System.out.println("== 2.���� �ϱ� ===");
		System.out.println("== 3.��ȸ �ϱ� ===");
		System.out.println("== 4.���� �ϱ� ===");
		System.out.println("====================");
		System.out.println("���ϴ� �۾���ȣ�� �Է��ϼ���?");

	}

	private void firstMenu() { // 1 �� ������ ��
		System.out.println("===============================");
		System.out.println("== ����� �Է��ϴ� ȭ���Դϴ�. ===");
		System.out.println("== ���θ޴��� �ƹ�Ű�� ��������. ==");
		System.out.println("===============================");
		String back = sc.nextLine(); // �ƹ� Ű�� ������ ���� �ٷ� �Ѿ�ٴ� ��
	}

	private void secondMenu() {
		System.out.println("===============================");
		System.out.println("== ����� �����ϴ� ȭ���Դϴ�. ===");
		System.out.println("== ���θ޴��� �ƹ�Ű�� ��������. ==");
		System.out.println("===============================");
		String back = sc.nextLine();
	}

	private void thirdMenu() {
		System.out.println("===============================");
		System.out.println("== ����� ��ȸ�ϴ� ȭ���Դϴ�. ===");
		System.out.println("== ���θ޴��� �ƹ�Ű�� ��������. ==");
		System.out.println("===============================");
		String back = sc.nextLine();

	}

	private void fourthMenu() {
		System.out.println("===============================");
		System.out.println("== ����� �����ϴ� ȭ���Դϴ�. ===");
		System.out.println("== ���θ޴��� �ƹ�Ű�� ��������. ==");
		System.out.println("===============================");
		String back = sc.nextLine();
	}
	
	private void endMenu() {
		System.out.println("=== Good Bye ===");
	}
	
	private void doWhileMenu() {
		boolean b = true; //������ ���� true; //*1������ false;�� �����ؾ���
		do {
			mainMenu();
			int key = sc.nextInt(); //�Է¹�����
			sc.nextLine(); //���͸� Ŭ�����Ű�� �����ϰ����� ���� Ŭ������ ������ ��
			
			//4���� �Ǵϱ� switch���̽��� �����
			switch(key) {
			case 1 : 
				firstMenu();
				break;	 //1���� �����ϸ� �̷��� ������ 
			case 2 : 
				secondMenu();
				break;
			case 3 : 
				thirdMenu();
				break;
			case 4 : 
				fourthMenu();
				break;
			case 5 : 
				endMenu();
				b = false; // *3�׷��� ��������� true;���Ǿ����
				break;
			}
			
		} while(b);  //*2false�� �����ϰ� !b�� ����
	}
	
	public void run() {
		doWhileMenu();  //doWhileMenu�޼ҵ带 ���۽�Ų�ٵ�¶�
		sc.close(); //���ɳʸ� Ŭ�����ش޶�¶�
	}
}
