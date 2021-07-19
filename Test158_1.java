/*==============================
+++++++컬렉션(Collection)+++++++
================================
◎ Test158_1.java
==============================*/

// ○ 실습 문제
//    현재 작성 중인 Test158 클래스를 완성하여
//    다음 기능을 가진 프로그램을 구현한다.


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
			System.out.println("\n[메뉴 선택]");
			System.out.println("1. 요소 추가");
			System.out.println("2. 요소 출력");
			System.out.println("3. 요소 검색");
			System.out.println("4. 요소 삭제");
			System.out.println("5. 요소 변경");
			System.out.println("6. 종료");

			System.out.print("\n>> 메뉴 선택(1~6): ");
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
			System.out.printf("\n%d번째 요소 입력: ",names.size()+1);
			nameInput = sc.next();
			System.out.printf("[%d번째 요소 입력 성공]",names.size()+1);
			names.add(nameInput);
			System.out.print("\n요소 입력 계속(Y/N): ");
			yn = sc.next().charAt(0);
		}
		while (yn == 'Y' || yn == 'y');
		
		backtoMenu();
	}

	public void printMenu()		//--2
	{
		System.out.println("\n[벡터 전체 출력]");
		if (names.isEmpty())
			System.out.println("\t항목이 존재하지 않습니다.");
		else
		{
			for (String str : names)
				System.out.print("\t"+str);
		}
		System.out.println("\n[벡터 전체 출력 완료]\n");

		backtoMenu();
	}

	public void searchMenu()	//--3
	{
		System.out.print("검색할 요소 입력: ");
		searchStr = sc.next();
		if (names.contains(searchStr))
			System.out.println("검색 항목이 존재합니다.");
		else
			System.out.println("검색 항목이 존재하지 않습니다.");

		backtoMenu();
	}

	public void deleteMenu()	//--4
	{
		System.out.print("삭제할 요소 입력: ");
		searchStr = sc.next();
		if (names.contains(searchStr))
		{
			names.remove(searchStr);
			System.out.println("해당 항목이 삭제되었습니다.");	
		}
		else
			System.out.println("삭제할 항목이 존재하지 않습니다.");

		backtoMenu();
	}

	public void changeMenu()	//--5
	{
		System.out.print("변경할 요소 입력: ");
		searchStr = sc.next();
		
		if (names.contains(searchStr))
		{
			System.out.print("변경할 내용 입력: ");
			changeStr = sc.next();
			names.set(names.indexOf(searchStr), changeStr);
			System.out.println("해당 항목이 변경되었습니다.");
		}
		else
			System.out.println("변경할 항목이 존재하지 않습니다.");
	}

	public void endMenu()	//--6
	{
		System.out.print("\n프로그램이 종료됩니다 .");
		sleepMenu();
		System.out.print(" .");
		sleepMenu();
		System.out.print(" .");
		sleepMenu();
		System.out.println("\n\n");

		System.exit(-1);	//--프로세스 강제 종료
	}

	public void backtoMenu()
	{
		System.out.print("\n메뉴 선택으로 돌아갑니다 .");
		sleepMenu();
		System.out.print(" .");
		sleepMenu();
		System.out.print(" .");
		sleepMenu();
		System.out.println("\n");
	}

	public void sleepMenu()	//--그냥 해본 것
	{
		try
		{
			Thread.sleep(400); //--0.3초 대기
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