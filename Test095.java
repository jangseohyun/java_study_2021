/*=============================
+++++++Ŭ������ �ν��Ͻ�+++++++
-Ŭ������ �ν��Ͻ� Ȱ��
===============================
�� Test095.java
=============================*/


// �� �ǽ� ����
// 1~3 ������ ���� ������ ������ �߻�����
// ����, ����, �� ���� ���α׷��� �����Ѵ�
// ��, Ŭ������ ������ Ȱ���Ͽ� ó���� �� �ֵ��� �Ѵ�.
// ����, �迭�� Ȱ���Ͽ� ó���� �� �ֵ��� �Ѵ�.

// ���� ������ �� 1: ����, 2: ����, 3: ��

// ���� ����
// 1: ����, 2: ����, 3: �� �� �Է�(1~3): 4
// 1: ����, 2: ����, 3: �� �� �Է�(1~3): -10
// 1: ����, 2: ����, 3: �� �� �Է�(1~3): 2
// -����  : ����
// -��ǻ��: ��
// >> �º� ���� ���: ��ǻ�� ��
// ����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .



import java.util.Scanner;
import java.util.Random;


class RpsGame
{
	Scanner sc = new Scanner(System.in);
	Random rd = new Random();

	String[] rsp = {"����", "����", "��"};
	String[] result = {"���º�", "��ǻ�� ��", "���� ��"};

	int user;
	String userS = "";

	int com;
	String comS = "";

	String gameresult = "���º�";

	void input()
	{
		do
		{
			System.out.print("1: ����, 2: ����, 3: �� �� �Է�(1~3): ");
			user = sc.nextInt();
		}
		while (user < 1 || user > 3);

		com = rd.nextInt(3)+1;
		
		userS = rsp[user-1];
		comS = rsp[com-1];
	}
	
	// ���� 1(����): 1(���º�)  2(�� ��)   3(���� ��)
	//      2(����): 1(���� ��) 2(���º�)  3(�� ��)
	//      3(��)  : 1(�� ��)   2(���� ��) 3(���º�)
	String cal()
	{
		if ((user == 1 && com == 3) || (user == 2 && com == 1) || (user == 3 && com == 2))
			gameresult = result[2];
		else if ((user == 1 && com == 2) || (user == 2 && com == 3) || (user == 3 && com == 1))
			gameresult = result[1];

		return gameresult;
	}

	void print(String gameresult)
	{
		System.out.printf("-����  : %s\n", userS);
		System.out.printf("-��ǻ��: %s\n", comS);
		System.out.printf(">> �º� ���� ���: %s\n", gameresult);
	}
}

public class Test095
{
	public static void main(String[] args)
	{
		RpsGame ob = new RpsGame();

		ob.input();
		String gameresult = ob.cal();
		ob.print(gameresult);
	}
}

/*
[����� Ǯ��]

import java.util.Random;
import java.util.Scanner;

class RpsGame
{
	int user;
	int com;
	
	// ��ǻ�� ��
	private void runCom()
	{
		Random rd = new Random();
		com = rd.nextInt(3)+1;
	}

	// ���� ��
	public void input()
	{
		Scanner sc = new Scanner(System.in);
		do
		{
			System.out.print("1: ����, 2: ����, 3: �� �� �Է�(1~3): ");
			user = sc.nextInt();
		}
		while (user < 1 || user > 3);
	}

	public void middleCalc()
	{
		String[] str = {"����", "����", "��"};

		System.out.println("-����: "+str[user-1]);
		System.out.println("-��ǻ��: "+str[com-1]);
	}

	public String resultCalc()
	{
		String result = "���º�";

		if ((user == 1 && com == 3) || (user == 2 && com == 1) || (user == 3 && com == 2))
			result = "���� ��";
		else if ((user == 1 && com == 2) || (user == 2 && com == 3) || (user == 3 && com == 1))
			result = "��ǻ�� ��";

		return result;
	}

	public void print(String result)
	{
		System.out.println(">> �º� ���� ���: "+result);
	}
}

public class Test095
{
	public static void main(String[] args)
	{
		RpsGame ob = new RpsGame();

		ob.input();
		ob.middleCalc();
		String result = ob.resultCalc();
		ob.print(result);
	}
}
*/


/*
[���� ���]
1: ����, 2: ����, 3: �� �� �Է�(1~3): 4
1: ����, 2: ����, 3: �� �� �Է�(1~3): -1
1: ����, 2: ����, 3: �� �� �Է�(1~3): 2
-����  : ����
-��ǻ��: ����
>> �º� ���� ���: ���� ��
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/