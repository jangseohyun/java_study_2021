/*===================================
++++++++++Ŭ������ �ν��Ͻ�++++++++++
-Ŭ���� ���� ���� �� Ŭ���� ���� �ǽ�
=====================================
�� Test073.java
===================================*/

// ����ڷκ��� ������ �� ������ �����ڸ� �Է¹޾�
// ��Ģ ������ �����ϴ� ���α׷��� �����Ѵ�.
// ��, Ŭ������ �ν��Ͻ��� ������ �����Ͽ� �ۼ��� �� �ֵ��� �Ѵ�.
// ���ǻ� ���� ������� ó���Ѵ�.

// ���� ����
// ������ �� ���� �Է�(���� ����): 30 15
// ������ ������ �Է�(+, -, *, /): +
// >> 30 + 15 = 45
// ����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .


import java.util.Scanner;
import java.io.IOException;

class Calculate
{
	// �� �ֿ� �Ӽ� ����
	int su1, su2;
	char op;

	void inputSu()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("������ �� ���� �Է�(���� ����): ");
		su1 = sc.nextInt();
		su2 = sc.nextInt();
	}

	void inputOp() throws IOException
	{
		System.out.print("������ ������ �Է�(+, -, *, /): ");
		op = (char)System.in.read();
	}

	int cal()
	{
		int sum = 0;

		if (op == '+')
			sum = su1 + su2;
		else if (op == '-')
			sum = su1 - su2;
		else if (op == '*')
			sum = su1 * su2;
		else if (op == '/')
			sum = su1 / su2;
		else
			System.out.println("�߸� �Է�");

		return sum;
	}

	void print(int sum)
	{
		System.out.printf(">> %d %c %d = %d\n", su1, op, su2, sum);
	}
}

public class Test073
{
	public static void main(String[] args) throws IOException
	{
		Calculate c = new Calculate();
		c.inputSu();
		c.inputOp();
		int sum = c.cal();
		c.print(sum);
	}
}

/*
[����� Ǯ��]
import java.util.Scanner;
import java.io.IOException;

class Calculate
{
	// �� �ֿ� �Ӽ� ����
	int su1, su2;
	char op;

	// �� �Է� �޼ҵ� ����
	void input() throws IOException
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("������ �� ���� �Է�(���� ����): ");
		su1 = sc.nextInt();
		su2 = sc.nextInt();

		System.out.print("������ ������ �Է�(+, -, *, /): ");
		op = (char)System.in.read();
	}

	// �� ���� �޼ҵ� ����
	int cal()
	{
		int result = 0;

		switch (op)
		{
			case '+': result = su1 + su2; break;
			case '-': result = su1 - su2; break;
			case '*': result = su1 * su2; break;
			case '/': result = su1 / su2; break;
		}
		return result;
	}

	// �� ��� �޼ҵ� ����
	void print(int r)
	{
		System.out.printf(">> %d %c %d = %d\n", su1, op, su2, r);
	}
}

// main() �޼ҵ带 �����ϰ� �ִ� �ܺ��� �ٸ� Ŭ����
public class Test073
{
	public static void main(String[] args) throws IOException
	{
		// Calculate Ŭ���� ����� �ν��Ͻ� ����
		Calculate ob = new Calculate();

		// ������ �ν��Ͻ��� ���� �Է� �޼ҵ� ȣ��
		ob.input();

		// ������ �ν��Ͻ��� ���� ���� �޼ҵ� ȣ��
		int result = ob.cal();

		// ������ �ν��Ͻ��� ���� ��� �޼ҵ� ȣ��
		ob.print(result);
	}
}
*/


/*
[���� ���]
������ �� ���� �Է�(���� ����): 30 15
������ ������ �Է�(+, -, *, /): +
>> 30 + 15 = 45
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/