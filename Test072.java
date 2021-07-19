/*===================================
++++++++++Ŭ������ �ν��Ͻ�++++++++++
-Ŭ���� ���� ���� �� Ŭ���� ���� �ǽ�
=====================================
�� Test072.java
===================================*/

// ����ڷκ��� ������ ������ �Է¹޾�
// 1���� �Է¹��� �������� ���� �����Ͽ�
// ����� ����ϴ� ���α׷��� �����Ѵ�.

// ��, Ŭ������ �ν��Ͻ��� ������ Ȱ���Ͽ� ó���� �� �ֵ��� �Ѵ�.
// ����, �Է� ó�� �������� BufferedReader�� readLine()�� ����ϸ�,
// �Է¹��� �����Ͱ� 1���� �۰ų� 1000���� ū ���
// �ٽ� �Է¹��� �� �ִ� ó���� �����Ͽ� ���α׷��� ������ �� �ֵ��� �Ѵ�.

// ���� ����
// ������ ���� �Է�(1~100): 1002
// ������ ���� �Է�(1~100): -20
// ������ ���� �Է�(1~100): 100
// >> 1 ~ 100 ������ ��: 5050
// ����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .


import java.util.Scanner;

class Sum
{
	int input()
	{
		int n = 0;
		Scanner sc = new Scanner(System.in);

		do
		{
			System.out.print("������ ���� �Է�(1~100): ");
			n = sc.nextInt();
		}
		while (n < 1 || n > 100);

		return n;
	}

	int calSum(int n)
	{
		int s = 0;
		
		for (int i=0; i<=n; i++)
			s += i;

		return s;
	}

	void print(int n, int s)
	{
		System.out.printf(">> 1 ~ %d ������ ��: %d\n", n, s);
	}
}


public class Test072
{
	public static void main(String[] args)
	{
		Sum sum = new Sum();
		int n = sum.input();
		int s = sum.calSum(n);
		sum.print(n, s);
	}
}

/*
[����� Ǯ��]
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class Hap
{
	// �� �ֿ� ������ ����(������� �Է°��� ��Ƶ� ����)
	int su;

	// �� �Է� �޼ҵ� ����
	void input() throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		do
		{
			System.out.print("������ ���� �Է�(1~100): ");
			su = Integer.parseInt(br.readLine());
		}
		while (su<1 || su>100);
	}

	// �� ���� �޼ҵ� ����
	int calculate()
	{
		int result = 0;

		for (int i=1; i<=su; i++)
			result += i;

		return result;
	}

	// �� ��� ��� �޼ҵ� ����
	void print(int sum)
	{
		System.out.printf(">> 1 ~ %d ������ ��: %d\n", su, sum);
	}
}

// main() �޼ҵ带 �����ϰ� �ִ� �ܺ��� �ٸ� Ŭ����
public class Test072
{
	public static void main(String[] args) throws IOException
	{
		// Hap Ŭ���� �ν��Ͻ� ����
		Hap ob = new Hap();

		// ������ �ν��Ͻ�(ob)�� ���� �Է� �޼ҵ� ȣ�� �� throws IOException
		ob.input();
		
		// ������ �ν��Ͻ��� ���� ���� �޼ҵ� ȣ�� �� int�� ����� ��ȯ �� �޾Ƴ� �� �ִ� ó���� ����Ǿ�� ��
		int s = ob.calculate();

		// ������ �ν��Ͻ��� ���� ��� �޼ҵ� ȣ�� �� �Ű����� ����
		ob.print(s);
	}
}
*/


/*
[���� ���]
������ ���� �Է�(1~100): 1002
������ ���� �Է�(1~100): -20
������ ���� �Է�(1~100): 100
>> 1 ~ 100 ������ ��: 5050
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/