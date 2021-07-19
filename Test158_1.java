/*==============================
+++++++�÷���(Collection)+++++++
================================
�� Test158_1.java
==============================*/

// �� �ǽ� ����
//    ���� �ۼ� ���� Test158 Ŭ������ �ϼ��Ͽ�
//    ���� ����� ���� ���α׷��� �����Ѵ�.


import java.util.Scanner;
import java.util.Vector;


class VendingMachine
{
	Scanner sc = new Scanner(System.in);
	Vector<String> names = new Vector<String>();

	private static String nameInput;
	private static String searchStr, changeStr;
	int menu;

	public void showMenu()
	{
		do
		{
			System.out.println("\n[�޴� ����]");
			System.out.println("1. ��� �߰�");
			System.out.println("2. ��� ���");
			System.out.println("3. ��� �˻�");
			System.out.println("4. ��� ����");
			System.out.println("5. ��� ����");
			System.out.println("6. ����");

			System.out.print("\n>> �޴� ����(1~6): ");
			menu = sc.nextInt();
		}
		while (menu<1 || menu>6);
		
		System.out.println();
		menuChoose();
	}

	public void menuChoose()
	{
		switch (menu)
		{
		case 1: addMenu(); showMenu();
		case 2: printMenu(); showMenu();
		case 3: searchMenu(); showMenu();
		case 4: deleteMenu(); showMenu();
		case 5: changeMenu(); showMenu();
		case 6: endMenu(); return;
		}
	}

	public void addMenu()		//--1
	{
		char yn;

		do
		{
			System.out.printf("\n%d��° ��� �Է�: ",names.size()+1);
			nameInput = sc.next();
			System.out.printf("[%d��° ��� �Է� ����]",names.size()+1);
			names.add(nameInput);
			System.out.print("\n��� �Է� ���(Y/N): ");
			yn = sc.next().charAt(0);
		}
		while (yn == 'Y' || yn == 'y');
		
		backtoMenu();
	}

	public void printMenu()		//--2
	{
		System.out.println("\n[���� ��ü ���]");
		if (names.isEmpty())
			System.out.println("\t�׸��� �������� �ʽ��ϴ�.");
		else
		{
			for (String str : names)
				System.out.print("\t"+str);
		}
		System.out.println("\n[���� ��ü ��� �Ϸ�]\n");

		backtoMenu();
	}

	public void searchMenu()	//--3
	{
		System.out.print("�˻��� ��� �Է�: ");
		searchStr = sc.next();
		if (names.contains(searchStr))
			System.out.println("�˻� �׸��� �����մϴ�.");
		else
			System.out.println("�˻� �׸��� �������� �ʽ��ϴ�.");

		backtoMenu();
	}

	public void deleteMenu()	//--4
	{
		System.out.print("������ ��� �Է�: ");
		searchStr = sc.next();
		if (names.contains(searchStr))
		{
			names.remove(searchStr);
			System.out.println("�ش� �׸��� �����Ǿ����ϴ�.");	
		}
		else
			System.out.println("������ �׸��� �������� �ʽ��ϴ�.");

		backtoMenu();
	}

	public void changeMenu()	//--5
	{
		System.out.print("������ ��� �Է�: ");
		searchStr = sc.next();
		
		if (names.contains(searchStr))
		{
			System.out.print("������ ���� �Է�: ");
			changeStr = sc.next();
			names.set(names.indexOf(searchStr), changeStr);
			System.out.println("�ش� �׸��� ����Ǿ����ϴ�.");
		}
		else
			System.out.println("������ �׸��� �������� �ʽ��ϴ�.");
	}

	public void endMenu()	//--6
	{
		System.out.print("\n���α׷��� ����˴ϴ� .");
		sleepMenu();
		System.out.print(" .");
		sleepMenu();
		System.out.print(" .");
		sleepMenu();
		System.out.println("\n\n");

		System.exit(-1);	//--���μ��� ���� ����
	}

	public void backtoMenu()
	{
		System.out.print("\n�޴� �������� ���ư��ϴ� .");
		sleepMenu();
		System.out.print(" .");
		sleepMenu();
		System.out.print(" .");
		sleepMenu();
		System.out.println("\n");
	}

	public void sleepMenu()	//--�׳� �غ� ��
	{
		try
		{
			Thread.sleep(400); //--0.3�� ���
		}
		catch (InterruptedException e)
		{
			e.printStackTrace();
		}
	}
}

public class Test158_1
{
	public static void main(String[] args)
	{
		VendingMachine vm = new VendingMachine();
		vm.showMenu();
	}
}