/*===========================
+++++���������� ��������+++++
-���������� �ʱ�ȭ �׽�Ʈ
=============================
�� Test069.java
===========================*/

// Test068.java�� ��

// �� ���������� ����ϴ� �������� �ʱ�ȭ�� �������� �ʾ��� ���
//    �ڹٿ��� �ڵ����� 0���� �ʱ�ȭ


public class Test069
{
	// �������� ����
	int a;
	boolean b;
	char c;
	double d;

	public static void main(String[] args)
	{
		// �������� ���� �� �ν��Ͻ� ����
		Test069 ob = new Test069();

		System.out.println("ob.a: "+ob.a);	//--0
		System.out.println("ob.b: "+ob.b);	//--false
		System.out.println("ob.c: "+ob.c);	//--
		System.out.println("ob.d: "+ob.d);	//--0.0
	}
}