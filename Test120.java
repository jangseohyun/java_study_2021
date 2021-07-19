/*=========================
++++++++Ŭ���� ���++++++++
- ��ø Ŭ����
===========================
�� Test120.java
=========================*/

/*
�� Anonymous Ŭ���� (�͸� Ŭ����, ���� Ŭ����)

   - AWT�� �ȵ���̵� �̺�Ʈ ó������ �Ϲ������� ���
   - ���� Ŭ���� �޼ҵ带 �ϳ� ���� �������� �ʿ伺�� ���� �� ���
   - Ŭ������ ��ü�� �ʿ��ϸ� �Ǵٽ� Ŭ������ �����ؾ� �ϴ�
     ���ŷο� ������ �͸��� Ŭ������ �����Ͽ� ó���Ѵ�.

�� ���� �� ����

   new ����Ŭ�����ǻ�����()
   {
	   �������������� �ڷ��� �޼ҵ�()
	   {
		   // ...;
	   }
   };	//--�ݵ�� �����ݷ� ��� ��
*/

// Q: �ڹٴ� ���� ��Ӹ� ����Ѵٸ鼭��?

// ��� Ŭ������ Object�� ��ӹ���
// Object�� java.lang�� ����־ import ���� �ʿ� ����

// import java.lang.*; (����)

// �ܺ� Ŭ����
class Test	// extends Object (Object ��� ����)
{
	// super ...;	//--��� ����(super �� Object)

	public Object getString()
	{
		/*
		Object result = new Object();
		...
		return result;	//--return new Object(){...};
		*/

		// �͸��� Ŭ����
		return new Object()	//--������ Object�� ������
		{
			@Override
			public String toString()
			{
				return "�͸��� Ŭ���� . . .";
			}
		};	//--�����ݷ� �ʼ�
	}
}


// main() �޼ҵ带 �����ϴ� �ܺ��� �ٸ� Ŭ����
public class Test120
{
	public static void main(String[] args)
	{
		Test ob1 = new Test();
		Test ob2 = new Test();

		System.out.println(ob1.toString());
		System.out.println(ob1.getString());
	}
}

/*
[���� ���]
Test@15db9742
�͸��� Ŭ���� . . .
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/