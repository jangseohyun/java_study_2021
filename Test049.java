/*==================================
+++++���� �帧�� ��Ʈ��(���)+++++
- �ݺ��� (while��) �ǽ�
====================================
�� Test049.java
==================================*/

// 1 * 2 * 3 * 4 * ... * 10

// ���� ����
// ���� ���: xxx
// ����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .


public class Test049
{
	public static void main(String[] args)
	{
		int a = 1, b = 1;

		while (a <= 10)
		{
			b *= a;
			a++;
		}

		System.out.println("���� ���: "+b);
	}
}

/*
[����� Ǯ��]
int n = 0, result = 1;	//--�������� ���� ������ 1�� �ʱ�ȭ

while (n < 10)
{
	n++;
	result *= n;		//--������ ����
}
*/


/*
[���� ���]
���� ���: 3628800
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/