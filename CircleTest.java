// �� �ǽ� ����
//    ���� ���̿� �ѷ� ���ϱ�

// ���� ���̿� �ѷ��� ���� �� �ִ� Ŭ������ ����������(������) �����Ѵ�.
// Ŭ������: CircleTest �� CircleTest.java

// ���� ���� = ������ * ������ * 3.141592
// ���� �ѷ� = ������ * 2 * 3.141592

// ���� ����
// ������ �Է�: xx
// >> �������� xx�� ����
// >> ����: xx.xx
// >> �ѷ�: xx.xx
// >> ����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .


import java.util.Scanner;

class CircleTest
{
	int i;
	double pi = 3.141592;
	
	void input()
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("������ �Է�: ");
		i = sc.nextInt();
	}

	double calArea()
	{
		return i * i * pi;
	}

	double calLength()
	{
		return i * 2 * pi;
	}

	void print(double area, double len)
	{
		System.out.printf("\n>> �������� %d�� ����", i);
		System.out.printf("\n>> ����: %.2f", area);
		System.out.printf("\n>> �ѷ�: %.2f\n", len);
	}
}

/*
[����� Ǯ��]
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class CircleTest
{
	int r;						//--������
	final double PI = 3.141592	//--������ (final: ������ ���ȭ)

	void input() throws IOException	//--�� �޼ҵ� ������ throw
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("������ �Է�: ");
		r = Integer.parseInt(br.readLine());
	}

	double calArea()
	{
		double result;
		result = r * r * PI;
		return result;
	}

	double calLength()
	{
		double result;
		result = r * 2 *PI;
		return result;
	}

	void print(double a, double l)
	{
		System.out.printf("\n>> �������� %d�� ����\n", r);
		System.out.printf(">> ����: %.2f\n", a);
		System.out.printf(">> �ѷ�: %.2f\n", l);
	}
}
*/