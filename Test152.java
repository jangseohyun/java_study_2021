/*==============================
+++++++�÷���(Collection)+++++++
================================
�� Test152.java
==============================*/

import java.util.Queue;
import java.util.LinkedList;

public class Test152
{
	// ���� ���ڿ� �迭 ���� �� �ʱ�ȭ
	private static final String[] colors = {"����", "���", "�ʷ�", "�Ķ�", "����", "����"};
		
	public static void main(String[] args)
	{
		// Queue �ڷᱸ�� ����
		Queue<Object> myQue = new LinkedList<Object>();

		// �ش� �ڷᱸ���� colors�� ������ �Է�
		for (int i=0; i<colors.length; i++)
			myQue.offer(colors[i]);

		// �ش� �ڷᱸ���� ��� ������ ���
		while (myQue.peek() != null)
			System.out.print((String)myQue.poll()+" ");

		System.out.println();
	}
}

/*
[����� Ǯ��]
// Queue �ڷᱸ�� ����
// Queue �������̽� ����� �ν��Ͻ��� �����ϱ� ���ؼ���
// new �����ڸ� �̿��Ͽ� Queue �������̽��� implements��
// ���� Ŭ������ �����ڸ� ȣ���ؾ� �Ѵ�.
Queue<String> qu = new LinkedList<String>();

// qu��� �ش� �ڷᱸ��(Queue)�� colors ������ �Է� �� offer()
for (String color : colors)
   qu.offer(color);

// qu��� �ش� �ڷᱸ��(Queue)�� ��� ������ ���
while (qu.peek() != null)
	System.out.print(qu.poll()+" ");
System.out.println();
*/


/*
[���� ���]
���� ��� �ʷ� �Ķ� ���� ����
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/