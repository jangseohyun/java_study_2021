/*===================================
++++++++++Ŭ������ �ν��Ͻ�++++++++++
-������(Constructor)
=====================================
�� Test078.java
===================================*/


public class Test078
{
	int val1;
	double val2;

	Test078()
	{
		val1 = 0;
		val2 = 0;
		System.out.println("�Ű����� ���� ������ ȣ��");
	}

	Test078(int val1)
	{
		this.val1 = val1;
		val2 = 0;
		System.out.println("int�� �Ű������� �Ѱܹ޴� ������ ȣ��");
	}

	Test078(double val2)
	{
		val1 = 0;
		this.val2 = val2;
		System.out.println("double�� �Ű������� �Ѱܹ޴� ������ ȣ��");
	}

	Test078(int val1, double val2)
	{
		this.val1 = val1;
		this.val2 = val2;
		System.out.println("int���� double�� �Ű������� �Ѱܹ޴� ������ ȣ��");
	}

	public static void main(String[] args)
	{
		Test078 ob1 = new Test078();
		Test078 ob2 = new Test078(9);
		Test078 ob3 = new Test078(9.0);
		Test078 ob4 = new Test078(9,9.0);

		System.out.println(ob1.val1+", "+ob1.val2);
		System.out.println(ob2.val1+", "+ob2.val2);
		System.out.println(ob3.val1+", "+ob3.val2);
		System.out.println(ob4.val1+", "+ob4.val2);
	}
}


/*
[���� ���]
�Ű����� ���� ������ ȣ��
int�� �Ű������� �Ѱܹ޴� ������ ȣ��
double�� �Ű������� �Ѱܹ޴� ������ ȣ��
int���� double�� �Ű������� �Ѱܹ޴� ������ ȣ��
0, 0.0
9, 0.0
0, 9.0
9, 9.0
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/