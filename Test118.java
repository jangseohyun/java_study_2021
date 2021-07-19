/*=========================
++++++++Ŭ���� ���++++++++
- ��ø Ŭ����
===========================
�� Test118.java
=========================*/


// �ܺ� Ŭ����
class Test
{
	static int a = 10;		//--��������, �������, static����(Ŭ��������)
	int b = 20;				//--��������, �������, instance����(�ν��Ͻ�����)

	// �� ù ��° write() �޼ҵ�
	void write()
	{
		System.out.println("write() . . . 1");

		final int c = 30;	//--��������, ���ȭ�� ����(���� ������ �ʴ� ����)
		int d = 40;			//--��������, ���� ���÷� ���� �� �ִ� ����
		
		// ���� Ŭ����
		// �޼ҵ� �ȿ� �����ϴ� �Ǵٸ� Ŭ����(local class)
		class LocalTest
		{
			// �� �� ��° write() �޼ҵ�
			void write()
			{
				System.out.println("write() . . . 2");
				System.out.println("a: "+a);
				System.out.println("b: "+b);
				System.out.println("c: "+c);
				//System.out.println("d: "+d);	//--Line 39�� ���� ���� Ȯ������ �ʱ� ������ ���� �Ұ���
			}
		}

		//c = 20;
		d = 30;

		// ù ��° write() �޼ҵ忡�� ������ ���� Ŭ������ �ν��Ͻ�
		LocalTest ob1 = new LocalTest();

		// �� ��° write() �޼ҵ� ȣ��
		ob1.write();
	}
}


// main() �޼ҵ带 �����ϰ� �ִ� �ܺ��� �ٸ� Ŭ����
public class Test118
{
	public static void main(String[] args)
	{
		// �ܺ� Ŭ������ ���� �ν��Ͻ� ����
		Test ob2 = new Test();

		// ù ��° write() �޼ҵ� ȣ��
		ob2.write();
	}
}


/*
[���� ���]
write() . . . 1
write() . . . 2
a: 10
b: 20
c: 30
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/