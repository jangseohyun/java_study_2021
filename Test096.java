/*===============================================
+++++++�޼ҵ� �ߺ�����(Method Overloading)+++++++
-�޼ҵ� �����ε��� ������ ���¿� �Ұ����� ����
=================================================
�� Test096.java
===============================================*/


public class Test096
{
	public static void main(String[] args)
	{
		print();
		print(10);

		// double result = print(10.0);	//--���Կ����ڰ� ������ ���׺��� Ȯ����
		// print(10.0);					//--���� print()�޼ҵ�� ������ �Ұ����ϱ� ������ java:29, java:30 ��� �Ұ�
	}

	public static void print(){}
	public static void print(int i){}
	// public static void print(int j){}		//--(X)
	public static void print(char c){}			//--(O) ��, �ڵ� �� ��ȯ ��Ģ Ȯ���ؼ� ���
	public static void print(int i, int j){}
	public static void print(int i, double d){}	//--(O) ��, �ڵ� �� ��ȯ ��Ģ Ȯ���ؼ� ���
	public static void print(double d, int k){} //--(O) ��, �ڵ� �� ��ȯ ��Ģ Ȯ���ؼ� ���
	public static double print(double d){return 3.14;}	//--(O) ��, �ڵ� �� ��ȯ ��Ģ Ȯ���ؼ� ���
	
	// public static void print(double d){}		//--(X)
	// public static String print(double d){}	//--(X)
}