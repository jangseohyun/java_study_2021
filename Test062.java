/*==================================
+++++���� �帧�� ��Ʈ��(���)+++++
- �ݺ��� (for��) �ǽ�
- ����� �ǽ�
====================================
�� Test062.java
==================================*/

// �� ����
// ������ ���� ������ ��µ� �� �ֵ���
// �ݺ����� ��ø ������ �ۼ��Ͽ� ���α׷��� �����Ѵ�.

/*

*********
 *******
  *****
   ***
    *
*/


public class Test062
{
	public static void main(String[] args)
	{
		for (int i=1; i<=5; i++)	
		{
			// ���� ���ʿ� ���� " "�� �����ϴ� �����̹Ƿ� j++
			for (int j=1; j<=5; j++)			
			{									
				// j++�� �ٲ���� ������ if���� j<i�� �ٲ���
				if (j<i)						//--��) 3��° ��: i=3, j=1
					System.out.print(" ");	    //--��) 3��° ��: j=1��2��					
				else if (j==i)
					System.out.print("*");		//--��) 3��° ��: j=3��						
				else							//--��) 3��° ��: j=4��5
					for (int k=1; k>=0; k--)	//--��) 3��° ��: k=1(j�� �ݺ��Ǵ� ��ŭ ���)
						System.out.print("*");	//--��) 3��° ��: k=1(2�� ���)��0(2�� ���)
			}
			System.out.println();
		}
	}
}

/*
public class Test062
{
	public static void main(String[] args)
	{
		for (int i=5; i>0; i--)	
		{
			for (int j=0; j<(5-i); j++)		//--" "�� (5-i)���� ������ŭ �ݺ�			
				System.out.print(" ");		//--��) 3��° ��: j<2, j=0��1
			for (int k=0; k<(2*i-1); k++)	//--"*"�� (2*i-1)���� ������ŭ �ݺ�
				System.out.print("*");		//--��) 3��° ��: k<5, k=0��1��2��3��4
			System.out.println();
		}
	}
}
*/

/*
[���� ���]
*********
 *******
  *****
   ***
    *
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/