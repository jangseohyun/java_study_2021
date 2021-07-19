/*==============================
+++++++�÷���(Collection)+++++++
================================
�� Test162.java
==============================*/


// Set �� HashSet, TreeSet
// - ����(�ǹ�) ����
// - �ߺ��� ������� �ʴ� ����(�⺻)

/*
�� HashSet<E> Ŭ����

   -java.util.HashSet<E> Ŭ������
    Set �������̽��� �����ϴ� Ŭ������
	������ ������ �ƴ϶� ������ �������� �����ؾ� �ϴ� �ڷᱸ���̴�.
   -�̷� ���� �������� �ߺ��� ������� �ʴ´�.
   -����, ����ȭ�� �������� �ʴ´�.
*/


import java.util.Set;
import java.util.HashSet;


public class Test162
{
	public static void main(String[] args)
	{
		//Set<String> dogs = new Set<String>();	//--X
		Set<String> dogs = new HashSet<String>();	//--�� ĳ����

		// dogs ��� HashSet �ڷᱸ���� ��� �߰�
		dogs.add("Ǫ��");
		dogs.add("�ùٰ�");
		dogs.add("��Ʈ����");
		dogs.add("ġ�Ϳ�");
		
		System.out.print("���� ������ Set: ");
		for (String str : dogs)
			System.out.print(str+" ");	//--���� ������ Set: ��Ʈ���� Ǫ�� �ùٰ� ġ�Ϳ�
		System.out.println();
		// ������ �ǹ� ���� �ڷᱸ���̱� ������
		// ������ �Է� ����(�ڷᱸ���� ��� �ݳ� ����)��
		// ������� �����Ǿ� �ִ� ���� Ȯ��

		// ������(���) �߰�
		dogs.add("��Ƽ��");
		dogs.add("��𿹵�");
		dogs.add("��𿹵�");
		dogs.add("��𿹵�");
		dogs.add("��𿹵�");
		dogs.add("��Ƽ��");
		dogs.add("��Ƽ��");
		dogs.add("��Ʈ����");
		dogs.add("��Ƽ��");
		dogs.add("��Ʈ����");
		dogs.add("��Ʈ����");
		dogs.add("��Ʈ����");
		dogs.add("��Ʈ����");
		dogs.add("��Ʈ����");
		dogs.add("��Ʈ����");
		dogs.add("��Ʈ����");
		dogs.add("������");
		dogs.add("ǳ�갳");
		dogs.add("ǳ�갳");
		dogs.add("ǳ�갳");

		System.out.print("���� ������ Set: ");
		for (String str : dogs)
			System.out.print(str+" ");	//--���� ������ Set: ��Ʈ���� ������ Ǫ�� �ùٰ� ġ�Ϳ� ��𿹵� ��Ƽ�� ǳ�갳
		System.out.println();
		// �� �ߺ� �����͸� �߰��Ѵٰ� �ؼ�
		//    ������ ���� �������� ������ �߻��ϴ� ���� �ƴ�

		// �� ������ �߰��Ǵ� ������ ������� ����� �����Ǿ� ������
		//    ���� ������ ������ �ݺ��Ǿ� �߰��� ���(�ߺ� ������)
		//    �ϳ��� ��ȿ�� �����ͷ� �����Ǿ� �ִ� ���� Ȯ���� �� �ִ�.
		//    (�ƹ��� �߰��ص� �� ���� ��µ�.
	}
}