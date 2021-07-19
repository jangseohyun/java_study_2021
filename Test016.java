/*=====================================
++++++++++�ڹ� �⺻ ���α׷���++++++++++
-�ڹ��� �⺻ �����: printf()
=======================================
�� Test016.java
=====================================*/


public class Test016
{
	public static void main(String[] args)
	{
		System.out.print("AAA");
		System.out.print("BBB");
		System.out.print("CCC\n");

		// ���� ��� �޼ҵ�
		System.out.printf("12345678901234567890");
		System.out.printf("12345678901234567890\n");	//--����
		System.out.printf("12345678901234567890%n");	//--����
		System.out.printf("%d+%d=%d\n", 10, 20, 30);

		System.out.printf("%d\n", 123);
		System.out.printf("%7d\n", 123);
		System.out.printf("%10d\n", 123);		//--10ĭ�� ���� Ȯ��, ���ڴϱ� ���� ����, 7ĭ�� ���� ����
		System.out.printf("%010d\n", 123);

		System.out.printf("%d\n", 365);
		System.out.printf("%+d\n", 365);
		System.out.printf("+%d\n", 365);

		System.out.printf("%d\n", +365);
		System.out.printf("%d\n", -365);
		//System.out.printf("%-d\n", 365);		//--���� �߻�(��Ÿ�� ����)
		System.out.printf("-%d\n", 365);

		System.out.printf("%(d\n", -365);
		System.out.printf("%(d\n", 365);

		//System.out.printf("%d\n", 'A');		//--���� �߻�(��Ÿ�� ����)
		System.out.printf("%c\n", 'A');
		//System.out.printf("%c\n", "ABCD");	//--���� �߻�(��Ÿ�� ����)

		System.out.printf("%s\n", "ABCD");

		System.out.println();		//--����

		System.out.printf("%h\n", 365);			//--16����
		System.out.printf("%o\n", 24);			//--8����
		
		System.out.println();		//--����

		System.out.printf("%s\n", "true");		//--������ true
		System.out.printf("%b\n", true);		//--boolean�� true
		System.out.printf("%s\n", true);		//--�ڵ����� �� ��ȯ �ż� ������ true�� ����� ������ �������� ���� �ʱ� ������ ����
		
		System.out.println();		//--����

		System.out.printf("%f\n", 123.23);
		System.out.printf("%.2f\n", 123.23);
		System.out.printf("%.2f\n", 123.236);
		System.out.printf("%.2f\n", 123.231);
		System.out.printf("%8.2f\n", 123.236);
		System.out.printf("%2.2f\n",123.1234);	//--ǥ���ؾ� �ϴ� �ͺ��� ���� ������ Ȯ���Ǹ� ǥ���ؾ� �ϴ� �� ���� ǥ����
	}
}


/*
[���� ���]
10+20=30
123
    123
       123
0000000123
365
+365
+365
365
-365
-365
(365)
365
A
ABCD

16d
30

true
true
true

123.230000
123.23
123.24
123.23
  123.24
123.12
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/