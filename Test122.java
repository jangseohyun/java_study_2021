/*==================================
++++++�ڹ��� �ֿ�(�߿�) Ŭ����++++++
====================================
�� Test122.java
==================================*/

// �� Test121.java�� ��


// import java.lang.*;


public class Test122	// extends Object
{
	/*
	
	Object Ŭ�����κ��� ��ӹ��� �����

	*/

	@Override
	public String toString()
	{
		// return Ŭ������@�ؽ��ڵ�;
		//        ----------------- String

		return "�������� toString() . . .";
	}

	public static void main(String[] args)
	{
		Test122 ob = new Test122();

		System.out.println("ob.toString: "+ob.toString());
		System.out.println("ob         : "+ob);
	}
}

/*
[���� ���]
ob.toString: Test122@15db9742
ob         : Test122@15db9742
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .

�� �������̵� ��

ob.toString: �������� toString() . . .
ob         : �������� toString() . . .
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/