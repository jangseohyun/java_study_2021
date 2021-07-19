/*==============================
+++++++�÷���(Collection)+++++++
================================
�� Test150.java
==============================*/

import java.util.Stack;

public class Test150
{
	// ���� ���ڿ� �迭 ���� �� �ʱ�ȭ
	private static final String[] colors = {"����", "���", "�ʷ�", "�Ķ�", "����", "����"};
	
	// ������
	public Test150()
	{
		// st��� Stack �ڷᱸ�� ����
		// ���׸��� Ȱ���Ͽ� �ڷᱸ���� ���� ������ ǥ�� (String)
		Stack<String> st = new Stack<String>();

		// st��� Stack �ڷᱸ���� ������ ���
		// colors��� ���ڿ� �迭 ��Ҹ� ��� ��Ƴ���
		for (String color : colors)
			st.push(color);
		
		// ������ �߰�
		st.push("����");

		// ������ �߰�
		st.push("�ϴ�");

		// ������ �߰�
		//st.push(0.0);		//--���� �߻�(������ ����)
		// ���׸� ǥ������ ���� �����ϰ� �ִ�
		// String�� �ƴ� �ٸ� �ڷ���(double)�� ���ÿ� push()�Ϸ��� �߱� ����

		// ��� �޼ҵ� ȣ��
		popStack(st);
	}

	// ��� �޼ҵ�
	public void popStack(Stack<String> st)
	{
		System.out.print("pop: ");

		while (!st.empty())
			System.out.print(st.pop() + " ");
		
		System.out.println();
	}	

	public static void main(String[] args)
	{
		new Test150();
	}
}

/*
[���� ���]
pop: �ϴ� ���� ���� ���� �Ķ� �ʷ� ��� ����
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/