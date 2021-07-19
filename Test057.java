/*==================================
+++++���� �帧�� ��Ʈ��(���)+++++
- �ݺ��� (for��) �ǽ�
====================================
�� Test057.java
==================================*/

// 1���� 100������ ���� �߿���
// 4�� ����� ����ϴ� ���α׷��� �����Ѵ�.
// ��, for �ݺ����� Ȱ���� �� �ֵ��� �ϸ�,
// �� ���ο� 5���� ����� �� �ֵ��� �Ѵ�.

// ���� ����
//  4  8 12 16 20
// 24 28 32 36 40
//       |
// 84 88 92 96 100
// ����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .


public class Test057
{
	public static void main(String[] args)
	{
		int j = 0;

		for (int i=4; i<=100; i+=4)
		{
			System.out.printf("%3d ", i);
			j++;

			if (j % 5 ==0)
				System.out.println();
		}
	}
}

/*
[����� Ǯ��]
for (int n=4; n<=100; n+=4)
{
	System.out.printf("%4d ", n);

	if(n % (4*5)) == 0)		//--n�� (4*5)�� ����� �� ����
		System.out.println();
}
*/


/*
[���� ���]
  4   8  12  16  20
 24  28  32  36  40
 44  48  52  56  60
 64  68  72  76  80
 84  88  92  96 100
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/