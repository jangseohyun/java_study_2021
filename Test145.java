/*==============================
++++++����(Exception) ó��++++++
================================
�� Test145.java
==============================*/

// Tes146.java�� ��


class Demo1
{
	// �ֿ� �Ӽ� ����
	private int value;

	// setter
	public void setValue(int value)
	{
		if (value <= 0)
			return;		//--����(�޼ҵ� ����)

		this.value = value;
	}

	// getter
	public int getValue()
	{
		return value;
	}
}

public class Test145
{
	public static void main(String[] args)
	{
		Demo1 ob = new Demo1();
		ob.setValue(-10);
		int result = ob.getValue();
		System.out.println(result);
	}
}