/*==============================
++++++����(Exception) ó��++++++
- �ٸ� ���� �ٽ� ������
================================
�� Test148.java
==============================*/


public class Test148
{
	public int getValue(int value) throws Exception	//--���� ������(b ����)
	{
		int a;
		
		try
		{
			a = getData(-4);	//--������ ����(a ����)
		}
		catch (Exception e)		//--���� ��Ƴ���(a ����)
		{
			// ���� ó��(a ����)
			System.out.println("printStackTrace...");
			e.printStackTrace();

			// ���� �߻�(b ����)
			throw new Exception("value�� �����Դϴ�.");
		}
		

		return a;
	}

	public int getData(int data) throws Exception	//--���� ������(a ����)
	{
		if (data < 0)
			throw new Exception("data�� 0���� �۽��ϴ�.");	//--���� �߻� (a ����)

		return data + 10;
	}

	public static void main(String[] args)
	{
		Test148 ob = new Test148();

		try
		{
			int a = ob.getValue(-4);	//--������ ����(b ����)
			System.out.println(a);
		}
		catch (Exception e)		//--���� ��Ƴ���(b ����)
		{
			// ���� ó��(b ����)
			System.out.println("printStackTrace...(main)");
			e.printStackTrace();
		}
		
	}
}