/*==================================
+++++���� �帧�� ��Ʈ��(���)+++++
- �ݺ��� (for��) �ǽ�
- ����� �ǽ�
====================================
�� Test063.java
==================================*/

// �� ����
// ������ ���� ������ ��µ� �� �ֵ���
// �ݺ����� ��ø ������ �ۼ��Ͽ� ���α׷��� �����Ѵ�.

/*
    *
   ***
  *****
 *******
*********
 *******
  *****
   ***
    *
*/

/*
public class Test063
{
	public static void main(String[] args)
	{
		for (int i=1; i<=4; i++)				//--������ �� �� ����
		{
			for (int j=5; j>0; j--)	
			{
				if (j>i)						
					System.out.print(" ");	  
				else if (j==i)
					System.out.print("*");		
				else							
					for (int k=1; k>=0; k--)	
						System.out.print("*");	
			}
			System.out.println();
		}
		for (int i=1; i<=5; i++)	
		{
			for (int j=1; j<=5; j++)	
			{
				if (j<i)						
					System.out.print(" ");	  				
				else if (j==i)
					System.out.print("*");						
				else							
					for (int k=1; k>=0; k--)	
						System.out.print("*");	
			}
			System.out.println();
		}
	}
}
*/

public class Test063
{
	public static void main(String[] args)
	{
		for (int i=1; i<=4; i++)				//--������ �� �� ����	
		{
			for (int j=0; j<(5-i); j++)	
				System.out.print(" ");
			for (int k=0; k<(2*i-1); k++)
				System.out.print("*");
			System.out.println();
		}

		for (int i=5; i>0; i--)	
		{
			for (int j=0; j<(5-i); j++)			
				System.out.print(" ");
			for (int k=0; k<(2*i-1); k++)
				System.out.print("*");
			System.out.println();
		}
	}
}

/*
[���� ���]
    *
   ***
  *****
 *******
*********
 *******
  *****
   ***
    *
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/