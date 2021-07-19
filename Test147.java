/*==============================
++++++����(Exception) ó��++++++
- ��Ƴ� ���� �ٽ� ������
================================
�� Test147.java
==============================*/


public class Test147
{
	public static void main(String[] args)
	{
		Test147 ob = new Test147();
		
		try
		{
			int a = ob.getValue(-3);
			System.out.println("a: "+a);
		}
		catch (Exception e)
		{
			System.out.println("printStackTrace...(main)");
			e.printStackTrace();
		}
		
	}

	public int getData(int data) throws Exception
	{
		if (data < 0)
			throw new Exception("data�� 0���� �۽��ϴ�.");		//--�� ���� �߻� 

		return data + 10;
	}

	public int getValue(int value) throws Exception
	{
		int a = 0;
		
		try
		{
			a = getData(-2);	//--�� ���� �߻�
		}
		catch (Exception e)		//--�� ���� ��Ƴ���
		{
			// �� ��Ƴ� ���ܿ� ���� ó��
			System.out.println("printStackTrace...");
			e.printStackTrace();

			// �� ��Ƴ� ���ܸ� �ٽ� ������
			throw e;
			// 3���� ��Ƴ� ���ܸ� �ٽ� �� �޼ҵ带 ȣ���� �������� ������ ����
			// ��throw e�� ������ �ּ� ó�� ��
			// ��, ��Ƴ� ���ܸ� �ٽ� ������ ���� ���
			// main() �޼ҵ��� try~catch�� ������� �ʰ� �ȴ�.
		}

		return a;
	}
}

/*
[���� ���]
printStackTrace...
java.lang.Exception: data�� 0���� �۽��ϴ�.
        at Test147.getData(Test147.java:31)
        at Test147.getValue(Test147.java:42)
        at Test147.main(Test147.java:17)
printStackTrace...(main)
java.lang.Exception: data�� 0���� �۽��ϴ�.
        at Test147.getData(Test147.java:31)
        at Test147.getValue(Test147.java:42)
        at Test147.main(Test147.java:17)
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/