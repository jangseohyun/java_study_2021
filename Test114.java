/*=========================
++++++++Ŭ���� ���++++++++
- �������̽�(Interface)
===========================
�� Test114.java
=========================*/


// �������̽�
interface Demo
{
	public void write();
	public void print();
}


// Ŭ����
// class DemoImpl
//		��
// �������̽��� �����ϴ� �߻� Ŭ����
abstract class DemoImpl implements Demo
{
	@Override
	public void write()
	{
		System.out.println("write() �޼ҵ� ������ . . .");
	}

	// public void print();
}


// Ŭ����
// class DemoImplSub
//		��
// �߻� Ŭ������ ��ӹ��� �߻� Ŭ����
// abstract class DemoImplSub extends DemoImpl
//		��
// �߻� Ŭ������ ��ӹ��� Ŭ����
class DemoImplSub extends DemoImpl
{
	@Override
	public void print()
	{
		System.out.println("print() �޼ҵ� ������ . . .");
	}
}


// Ŭ����
public class Test114
{
	public static void main(String[] args)
	{
		//Demo ob = new Demo();				//--�������̽� �ν��Ͻ� ���� �Ұ�
		//DemoImpl ob2 = new DemoImpl();	//--�߻�Ŭ���� �ν��Ͻ� ���� �Ұ�
		DemoImplSub ob3 = new DemoImplSub();

		ob3.write();	//--write() �޼ҵ� ������ . . .
		ob3.print();	//--print() �޼ҵ� ������ . . .
	}
}