/*==================================
+++++���� �帧�� ��Ʈ��(���)+++++
- �ݺ��� (while��) �ǽ�
====================================
�� Test047.java
==================================*/

// 1���� 100������ ������ ���� ���ϵ�
// 10�� ����� �� ������ ����� ����ϴ� ���α׷��� �����Ѵ�.

// ���� ����
// 1~10������ ��: xx
// 1~20������ ��: xx
// 1~30������ ��: xx
//  |
// 1~100������ ��: xx
// ����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .


public class Test047
{
	public static void main(String[] args)
	{
		int n = 1, sum = 0;

		while (n <= 100)
		{
			sum += n;
			
			if (n % 10 == 0)
				System.out.printf("1~%d ���� ������ ��: %d\n", n, sum);

			n++;
		}
	}
}

/*
[����� Ǯ��]
int n=1, sum=0;
while (n <= 100)
{
	sum += n;
	if (n%10==0)
		System.out.printf("1~%d������ ��: %d\n", n, sum);
	n++;
}
*/


/*
[���� ���]
1~10������ ��: 55
1~20������ ��: 210
1~30������ ��: 465
1~40������ ��: 820
1~50������ ��: 1275
1~60������ ��: 1830
1~70������ ��: 2485
1~80������ ��: 3240
1~90������ ��: 4095
1~100������ ��: 5050
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/