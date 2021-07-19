/*==============================
+++++++�÷���(Collection)+++++++
================================
�� Test151.java
==============================*/

/*
�� ť (Queue)
  
   ť(Queue)�� FIFO(First Input First Output) ������
   ���� �Էµ� �ڷḦ ���� ����ϸ�
   Queue �������̽��� ������ Ŭ������ ť�� ���õ� �پ��� ����� �����Ѵ�.

�� ť(Queue) �������̽� �ν��Ͻ��� �����ϱ� ���ؼ���
   new �����ڸ� �̿��Ͽ� Queue �������̽��� ������ (implements)
   Ŭ������ �����ڸ� ȣ���Ѵ�.

   ex) Queue ob = new LinkedList();

�� �ֿ� �޼ҵ�

   - E element()
     ť�� head ��Ҹ� ��ȯ�ϸ� �������� �ʴ´�.
   - boolean offer(E o)
     ������ ��Ҹ� ť�� �����Ѵ�
   - E peek()
     ť�� head ��Ҹ� ��ȯ�ϰ� �������� ������
	 ť �ڷᱸ���� empty�� ��� null�� ��ȯ�Ѵ�.
  - E poll()
     ť�� head ��Ҹ� ��ȯ�ϰ� �����ϸ�
	 ť �ڷᱸ���� empty�� ��� null�� ��ȯ�Ѵ�.
  - E remove()
     ť�� head ��Ҹ� ��ȯ�ϰ� �����Ѵ�.
*/


import java.util.Queue;
import java.util.LinkedList;

public class Test151
{
	public static void main(String[] args)
	{
		Queue<Object> myQue = new LinkedList<Object>();

		String str1 = "�弭��";
		String str2 = "�ڹ���";
		String str3 = "������";
		String str4 = "���ϸ�";

		// myQue ��� Queue �ڷᱸ���� ������ �߰�
		myQue.offer(str1);
		myQue.offer(str2);
		myQue.offer(str3);
		myQue.offer(str4);

		// ��elememt()��: ť �ڷᱸ������ ��Ҹ� �������� �ʰ� head ��� ��ȯ
		System.out.println("��1: "+myQue.element());	//--��1: �弭��
		System.out.println("��2: "+myQue.element());	//--��1: �弭��
		System.out.println();

		String val = "";

		while (!myQue.isEmpty())
			val += myQue.poll()+" ";

		System.out.println(val);
	}
}

/*
[����� Ǯ��]
// ��
// ��peek()��: ť�� head ��� ��ȯ, ���� �� ��
//             ť�� empty�� ��� null ��ȯ
while (myQue.peek() != null)
{
	// ��poll()�� : ť�� head ��� ��ȯ, ������
	//              ť�� empty�� ��� null�� ��ȯ
	val = (String)myQue.poll();
	System.out.println("���: "+val);
}

// ���� poll()-poll()�� ���
while (myQue.poll() != null)
{
	val = (String)myQue.poll();
	System.out.println("���: "+val);
}

// [���� ���]
// ���: �ڹ���
// ���: ���ϸ�

//-----------------------------------------

// ��
while (true)		//--���� ����
{
	val = (String)myQue.poll();

	if (val == null)
		break;
	else
		System.out.println("���: "+val);
}

//-----------------------------------------

// ��
while (!myQue.isEmpty())
{
	val = (String)myQue.poll();
	System.out.println("���: "+val);
}

// [���� ���]
// ���: �弭��
// ���: �ڹ���
// ���: ������
// ���: ���ϸ�
*/


/*
[���� ���]
�弭�� �ڹ��� ������ ���ϸ�
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/