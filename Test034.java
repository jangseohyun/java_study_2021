/*==================================
+++++���� �帧�� ��Ʈ��(���)+++++
- if~else�� �ǽ�
====================================
�� Test034.java
==================================*/

// ����ڷκ��� ������ �� ������ �����ڸ� �Է¹޾�
// �ش� �����ڿ� �ش��ϴ� ������ ó�� ����� ����ϴ� ���α׷��� �����Ѵ�.
// ��, ���ǹ��� Ȱ���Ͽ� ó���� �� �ֵ��� �ϸ�,
// ������ ����� ���ǻ� ���� ���·� ó���� �� �ֵ��� �Ѵ�.

// ���� ����
// ù ��° ���� �Է�: 10
// �� ��° ���� �Է�: 24
// ������ �Է�(+, -, *, /): +
// >> 10 + 24 = 34
// ����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


public class Test034
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("ù ��° ���� �Է�: ");
		int a = Integer.parseInt(br.readLine());
		System.out.print("�� ��° ���� �Է�: ");
		int b = Integer.parseInt(br.readLine());
		System.out.print("������ �Է�(+, -, *, /): ");
		String c = br.readLine();
		int result;

		if (c.equals("+"))
		{
			result = a + b;
			System.out.printf("%d + %d = %d\n", a, b, result);
		}
		else if (c.equals("-"))
		{
			result = a - b;
			System.out.printf("%d - %d = %d\n", a, b, result);
		}
		else if (c.equals("*"))
		{
			result = a * b;
			System.out.printf("%d * %d = %d\n", a, b, result);
		}
		else if (c.equals("/"))
		{
			result = a / b;
			System.out.printf("%d / %d = %d\n", a, b, result);
		}
		else
		{
			System.out.println("�߸� �Է���");
		}
	}
}

/*
[����� Ǯ��]

// ��� ��-�� char ��
int a, b;
char op;

System.out.println("ù ��° ���� �Է�: ");
a = Integer.parseInt(br.readLine());

System.out.println("�� ��° ���� �Է�: ");
b = Integer.parseInt(br.readLine());

System.out.println("������ �Է�(+, -, *, /): ");
op = (char)System.in.read();

if (op == '+')
{
	System.out.printf("\n>> %d + %d = %d\n", a, b, (a+b));
}
else if (op == '-')
{
	System.out.printf("\n>> %d - %d = %d\n", a, b, (a-b));
}
else if (op == '*')
{
	System.out.printf("\n>> %d * %d = %d\n", a, b, (a*b));
}
else if (op == '/')
{
	System.out.printf("\n>> %d / %d = %d\n", a, b, (a/b));
}
else
{
	System.out.println("�Է� ������ ������ �����մϴ�.");
}

//-------------------------

// ��� ��-�� char��
int a, b, result=0;
char op;

System.out.println("������ �Է�(+, -, *, /): ");
op = (char)System.in.read();

if (op == '+')
	result = a + b;
else if (op == '-')
	result = a - b;
else if (op == '*')
	result = a * b;
else if (op == '/')
	result = a / b;

System.out.printf("\n>> %d %c %d = %d\n", a, op, b, result);

//-------------------------

// ��� �� �ƽ�Ű �ڵ�
int a, b, op;

System.out.print("������ �Է�(+, -, *, /): ");
op = System.in.read();
// �Է¹��� ���ڿ� ���� �ƽ�Ű�ڵ� ���� ������
// + 43, - 45, * 42, / 47

if (op == 43)	//--'+'
{
	System.out.printf("\n>> %d + %d = %d\n", a, b, (a+b));
}
else if (op == 45)	//--'-'
{
	System.out.printf("\n>> %d - %d = %d\n", a, b, (a-b));
}
else if (op == 42)	//--'*'
{
	System.out.printf("\n>> %d * %d = %d\n", a, b, (a*b));
}
else if (op == 47)	//--'/'
{
	System.out.printf("\n>> %d / %d = %d\n", a, b, (a/b));
}
else
{
	System.out.println("�Է� ������ ������ �����մϴ�.");
}
*/


/*
[���� ���]
ù ��° ���� �Է�: 10
�� ��° ���� �Է�: 24
������ �Է�(+, -, *, /): +
10 + 24 = 34
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/