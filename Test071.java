/*===========================
+++++Ŭ������ �ν��Ͻ�+++++
=============================
�� Test071.java
===========================*/

// �� �ǽ� ����
//    ���� ���̿� �ѷ� ���ϱ�

// ���� ���̿� �ѷ��� ���� �� �ִ� Ŭ������ ����������(������) �����Ѵ�.
// Ŭ������: CircleTest �� CircleTest.java

// ���� ���� = ������ * ������ * 3.141592
// ���� �ѷ� = ������ * 2 * 3.141592

// ���� ����
// ������ �Է�: xx
// >> �������� xx�� ����
// >> ����: xx.xx
// >> �ѷ�: xx.xx
// >> ����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .

// ���� ��� ���� �ֱ� ������ ���� CircleTest�� import ���� �ʾƵ� ��
// ex. import ��⵵.����.CircleTest;


public class Test071
{
	public static void main(String[] args)
	{
		CircleTest ct = new CircleTest();

		ct.input();
		double area = ct.calArea();
		double len = ct.calLength();
		ct.print(area, len);
	}
}

/*
[����� Ǯ��]
import java.io.IOException;

public class Test071
{
	public static void main(String[] args) throws IOException
	{
		CircleTest ob = new CircleTest();
		ob.input();		//--br.readLine()���� �����Ǵ� IOException�� throw���� ���� ���� �߻�
		double area = ob.calArea();
		double length = ob.calLength();
		ob.print(area,length);
	}
}
*/


/*
[���� ���]
������ �Է�: 1

>> �������� 1�� ����
>> ����: 3.14
>> �ѷ�: 6.28
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/