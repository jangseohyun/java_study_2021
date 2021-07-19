/*=========================
++++++++Ŭ���� ���++++++++
- ���(Inheritance)
===========================
�� Test107.java
=========================*/

// �� �ǽ� ����
//    ������ ���� ���α׷��� �����Ѵ�.
//    ��, ����� ������ �����Ͽ� �ۼ��� �� �ֵ��� �Ѵ�.

// ���� ����
// ������ �� ���� �Է�(���� ����): 20 15
// ������ �Է�(+ - * /): -
// >> 20 - 15 = 5
// ����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .

/*
import java.util.Scanner;
import java.io.IOException;


class AClass
{
	protected int a, b, c, r;
	protected char ch;

	public void print()
	{
		System.out.printf(">> %d %c %d = %d\n", a, ch, b, r);
	}
}

class BClass extends AClass 
{
	public void input() throws IOException
	{
		Scanner sc = new Scanner(System.in);

		System.out.print("������ �� ���� �Է�(���� ����): ");
		a = sc.nextInt();
		b = sc.nextInt();
		
		System.out.print("������ �Է�(+ - * /): ");
		c = System.in.read();
		ch = (char)c;
	}

	public void cal()
	{
		if (ch == '+') r = a + b;
		else if (ch == '-') r = a - b; break;
		else if (ch == '*')	r = a * b; break;
		else if (ch == '/')	r = a / b; break;
		print();
	}
}

public class Test108 
{
	public static void main(String[] args) throws IOException
	{
		BClass ob = new BClass();
		ob.input();
		ob.cal();
	}
}


[����� Ǯ��]
*/
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

// super class
class AClass
{
	protected int x, y;
	protected char op;

	AClass()
	{
	}

	void write(double result)
	{
		System.out.printf(">> %d %c %d = %.2f\n", x, op, y, result);
	}
}

// sub class
class BClass extends AClass
{
	boolean input() throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("������ �� ���� �Է�(���� ����): ");
		String temp = br.readLine();
		String[] str = temp.split("\\s");

		// �� ���ڿ�.split("������");
		//    ��) "��� ����".split(����); �� ��ȯ �� �迭 �� {"���", "����"}

		if (str.length != 2)
			return false;	//--���� ��ȯ �� false �� �޼ҵ� ����
		// �� �� ���ǹ��� ������ ��� �Ʒ��� �ڵ尡 �����ִ� ��Ȳ�̴���
		//    ���̻� �������� �ʰ� ������� ��ȯ�ϸ� �޼ҵ�� ����ȴ�. 
		x = Integer.parseInt(str[0]);
		y = Integer.parseInt(str[1]);

		System.out.print("������ �Է�(+ - * /): ");
		op = (char)System.in.read();

		if (op!='+' && op!='-' && op!='*' && op!='/')
			return false;
		
		if (op!='+' && op!='-' && op!='*' && op!='/')
			return true;

		return true;	//--�̺κ� �ٽ� ����... false�� �̸� �صθ� ���߿� �� ��������??
	}

	double calc()
	{
		double result = 0;

		switch (op)
		{
			case '+': result=x+y; break;
			case '-': result=x-y; break;
			case '*': result=x*y; break;
			case '/': result=(double)x/y; break;
		}

		return result;
	}
}


public class Test108 
{
	public static void main(String[] args) throws IOException
	{
		BClass ob = new BClass();

		if (!ob.input())
		{
			System.out.println("Error . . .");
			return;
		}

		double result = ob.calc();
		ob.write(result);
	}
}



/*
[���� ���]
������ �� ���� �Է�(���� ����): 1 2
������ �Է�(+ - * /): +
>> 1 + 2 = 3
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/