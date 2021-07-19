/*===========================
+++++Ŭ������ �ν��Ͻ�+++++
=============================
�� Test070.java
===========================*/

// ���簢�� Ŭ���� ���� �� Rect

/*
�� ����(����Ͻ�����, ��������): ���簢���� ���̿� �ѷ��� ���, Ŭ������ ǥ��
�� Ŭ������ ��ü��: ���簢��
�� Ŭ������ �Ӽ�: ����, ���� (+ ����, �ѷ�, ����, ����, ����, ...)
�� Ŭ������ ���: ���� ���, �ѷ� ���, ����/���� �Է�, ��� ���
   �Է� ����) ���� �Է�:     \n ���� �Է�:      
   ��� ����) ����: xxx \n ����: xxx \n ����: xxxx \n �ѷ�: xxxx
*/

/*
�� ��ü ����  : ������(�Ӽ�, ����) + ���(����, ����)
      |                  |                  | 
	  | (���赵 �ۼ�)    |                  |
	  |                  |                  |
   Ŭ���� ����:        ����        +      �޼ҵ� 
*/


import java.util.Scanner;


public class Test070
{
	public static void main(String[] args)
	{
		class Rectangle
		{
			public int width, height, area, around;

			void input()
			{
				Scanner sc = new Scanner(System.in);
				System.out.print("���� �Է�: ");
				width = sc.nextInt();
				System.out.print("���� �Է�: ");
				height = sc.nextInt();
			}

			void calArea()
			{
				area = width * height;
			}

			void calAround()
			{
				around = width*2 + height*2;
			}

			void result()
			{
				System.out.println();
				System.out.println("����: "+width);
				System.out.println("����: "+height);
				System.out.println("����: "+area);
				System.out.println("�ѷ�: "+around);
			}
		}

		Rectangle rect = new Rectangle();
		rect.input();
		rect.calArea();
		rect.calAround();
		rect.result();
	}
}


/*
[����� Ǯ��]
import java.util.Scanner;

class Rect	//--���簢�� Ŭ���� ����(������Ģ ����)
{
	// �� ���� ����
	// ���� ����: Ŭ���� ���� �ȿ��� �۷ι� Ȱ���� ������ ����
	// ��� ����: Ŭ������ �ҼӵǾ� �ִ� ��ҷμ��� �ǹ�
	// �� �ν��Ͻ� ����: �� �ν��Ͻ��� �����Ǿ��� �� ��μ� �޸� �Ҵ��� �̷������ ����
	//                   �� ������ �ν��Ͻ��� ���� ���� ������ ����
	int w, h;

	// �� �޼ҵ� ����(����/���� �Է�)
	//    -�޼ҵ� �̸� ����(���� ��Ģ ����)
	//    -�Ű����� ����
	//    -��ȯ �ڷ��� ����
	//    -�޼ҵ� ���� ����

	// �� ��void���� �޼ҵ� ���� �� �޼ҵ带 ȣ���� ����
	//    ����� ������ �ʿ䰡 ���� �� �����Ͽ� ����ϰ� �Ǵµ�
	//    �ƹ��͵� ��������(��ȯ����) �ʴ´ٰ� �ؼ�
	//    ��ȯ �ڷ����� �������� �ʰ� �Ǹ� �������� ������ �߻��ϰ� �ȴ�.

	void input()
	{
		// �ʿ��� �޼ҵ� �ȿ��� ó���ϴ� ���� �ٶ�����(���ʿ��� �޸� ���X)
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �Է�: ");
		w = sc.nextInt();
		System.out.print("���� �Է�: ");
		h = sc.nextInt();
	}

	// �� �޼ҵ� ����(�ѷ� ���)
	//    �޼ҵ��� ���� �� ����� ������ ��츦 �����ϱ� ����
	//    ���� �ڷ���(��ȯ �ڷ���)�� ��int������ ����ϰ� �ȴ�.
	//    �簢���� �ѷ��� ���ϴ� �������� �ʿ��� ������
	//    ��(���� + ����) * 2���̸�, �̵��� ��� �����̱� �����̴�.
	//    ����, ���̳� �ѷ��� ���� ������ Ŭ���� ���ο� ������ ������ ���� �ƴϱ� ������
	//    ���� ����� �޼ҵ带 ȣ���� ���� ��ȯ�ϴ� ���·� ó���Ǿ�� �Ѵ�.
	int calLength()
	{
		// �ѷ� = (���� + ����) * 2
		return (w+h)*2;
		// �� �޼ҵ�� ��return������ ���ؼ��� ����� �����ְ�(��ȯ�ϰ�) �ȴ�.
	}

	// �� �޼ҵ� ����(���� ���)
	int calArea()
	{
		int result;
		result = w*h;
		return result;
	}

	// �� �޼ҵ� ����(��� ���)
	//    �Ű������� ���� �����͸� �Ѱܹ��� �� �ֵ��� ����(���� ���� ���� ������)
	//    �޼ҵ��� �Ű������� �޼ҵ� �������� Ȱ�� ����(���̴� ����)
	//    �Ű����� ���� �� ������ �������� �ڷ����� ���� �����ؾ� �Ѵ�
	void print(int a, int l)		//--�Ű�����: ����, �ѷ�
	{
		System.out.println("����: "+w);
		System.out.println("����: "+h);
		System.out.println("����: "+a);
		System.out.println("�ѷ�: "+l);
	}
}

// �� �ϳ��� �ڹ� ����(.java)�� ���� ���� Ŭ����(class)�� ���� �� �ִ�.
//    ������ ��public class���� �ϳ��� �� �� �ִ�.
//    ������ ������ ���� �̸��� ��public class���� �̸����� �����ؾ� �ϸ�,
//    ������ ��� Ŭ������ ��public class���� �ƴ� ���
//    �̵� �� ������ ��ǥ�� �� �ִ� Ŭ������ �����Ͽ�
//    �ش� Ŭ������ �̸����� �����ؾ� �Ѵ�.
//    ����, ���� ���� Ŭ������ ����� �ϳ��� ������ �������ϰ� �Ǹ�
//    ���ο� ����� Ŭ������ ����ŭ Ŭ���� ����(.class)�� �Ļ��ȴ�.

// main() �޼ҵ带 �����ϰ� �ִ� �ܺ��� �ٸ� Ŭ����
public class TestingAlone
{
	public static void main(String[] args)
	{
		// Rect Ŭ���� ����� �ν��Ͻ� ����
		// ----------------
		//     ���赵��
		Rect ob = new Rect();
		
		ob.input();
		int a = ob.calLength();
		int b = ob.calArea();

		ob.print(b, a);
	}
}
*/

/*
[���� ���]
���� �Է�: 10
���� �Է�: 20

����: 10
����: 20
����: 200
�ѷ�: 60
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/