/*======================================
���� ���� �帧�� ��Ʈ�� (���) ����
- �ݺ��� (for��) �ǽ�
- ����� ����
=======================================*/

// �� ����
// ������ ���� ������ ��µ� �� �ֵ���
// �ݺ����� ��ø ������ �ۼ��Ͽ� ���α׷��� �����Ѵ�.

/*

	*
   **
  ***
 ****
*****

*/


public class Test060
{
	public static void main(String[] args)
	{
		int i,j,k;
		
		for (i=1; i<=5 ; i++)					// ��
		{
			for (j=5; j>i ; j--)				// ��ĭ ��� (4��3��2��1)
			{
				System.out.print(" ");
			}
			for (k=1;k<=i ; k++)				// * ��� (1��2��3��4��5)
			{
				System.out.print("*");
			}
			System.out.println();				// �� ���� ������ ����	
		}

	}
}