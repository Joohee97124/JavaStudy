/*======================================
���� �ڹ��� �ֿ�(�߿�) Ŭ���� ����
- Wrapper Ŭ����
======================================*/

import java.math.BigDecimal;
// Ŀ�ٶ� �Ǽ����� ����
import java.math.MathContext;

public class Test128
{
	public static void main(String[] args)
	{

		BigDecimal a = new BigDecimal("123456789.123456789");
		
		// movePointLeft(n) : �Ҽ����� �������� n�� �̵�
		BigDecimal b = a.movePointLeft(3);
		System.out.println("��� Ȯ�� : " + b);
		//--==>> ��� Ȯ�� : 123456.789123456789


		BigDecimal t1 = new BigDecimal("400.0"); 
		BigDecimal t2 = new BigDecimal("6.0");

		BigDecimal t3 = t1.divide(t2, 3);	//�Ҽ��� ù��°������ �⺻
		BigDecimal t4 = t1.divide(t2, 2);	
		System.out.println("t3 : " + t3);
		System.out.println("t4 : " + t4);
		//--==>> t3 : 66.6
		//       t4 : 66.7


		// ������ (��ü �Ӽ� Ȯ��, �ݿø� ���� �ʴ´� �� ����)
		BigDecimal c = a.divide(b, BigDecimal.ROUND_DOWN);
		// �� BigDecimal c = a.divide(b,1)�� ������ ����

		System.out.println("c : " + c);
		//--==>> c : 1000.000000000


		System.out.println(BigDecimal.ROUND_DOWN);
		//--==>> 1


		BigDecimal d = a.divide(b, 5);
		System.out.println("d : " + d);
		//--==>> d : 1000.000000000
		
		// ��ȿ �ڸ� : �Ҽ��� ���� 5��° �ڸ�(�� ��° ���� �� 5 ���⼭ �����ض�)
		BigDecimal e = a.divide(b, 5, BigDecimal.ROUND_DOWN);	//�ݿø�
		// BigDecimal e = a.divide(b, 5, 1);
		System.out.println("e : " + e);
		//--==>> e : 1000.00000


		System.out.println(BigDecimal.ROUND_CEILING);	//�ø�
		System.out.println(BigDecimal.ROUND_FLOOR);		//����
		//--==>> 2
		//		 3

		// BigDecimal�� �ٸ� �޼ҵ�� Ȯ���ϱ�



		// �߰� ����~!!!

		// BigDecimal result = t1.divide(t2);
		// System.out.print("result : " + result);
		//--==>> ���� �߻� (��Ÿ�� ����)
		// ������ ��(=��) �� ������ �Ҽ��� ����

		 System.out.println(MathContext.DECIMAL32);
		//--==>> precision=7 roundingMode=HALF_EVEN
		//       ------------  -------------------
		//   ��ȿ�� ��ü �ڸ� ��   ����,�ݿø�,�ø����� Ȯ��

		System.out.println(MathContext.DECIMAL64);
		//--==>> precision=16 roundingMode=HALF_EVEN

		System.out.println(MathContext.DECIMAL128);
		//--==>> precision=34 roundingMode=HALF_EVEN
		
		
		// t1.divide(t2);				// t1�� t2�� ���� �� �� ������ 
										// ��, ���� �������� ���� ��� ���� �߻�
		// t1.divide(t2, b);			// t1�� t2�� ���� �� �� ������ 
										// ��, b ���(���)�� ó���ض�
										// �ø� / ����(����) / �ݿø�
		// t1.divide(t2, �ø�);
		// t1.divide(t2, ����);
		// t1.divide(t2, �ݿø�);	

		System.out.println("BigDecimal.ROUND_UP : " + BigDecimal.ROUND_UP);
		System.out.println("BigDecimal.ROUND_DOWN : " + BigDecimal.ROUND_DOWN);
		System.out.println("BigDecimal.ROUND_CEILING : " + BigDecimal.ROUND_CEILING);
		System.out.println("BigDecimal.ROUND_FLOOR : " + BigDecimal.ROUND_FLOOR);
		System.out.println("BigDecimal.ROUND_HALF_UP : " + BigDecimal.ROUND_HALF_UP);
		System.out.println("BigDecimal.ROUND_HALF_DOWN : " + BigDecimal.ROUND_HALF_DOWN);
		System.out.println("BigDecimal.ROUND_HALF_EVEN : " + BigDecimal.ROUND_HALF_EVEN);
		System.out.println("BigDecimal.ROUND_UNNECESSARY : " + BigDecimal.ROUND_UNNECESSARY);
		//--==>> 
		/*
		BigDecimal.ROUND_UP : 0 �ø�
		BigDecimal.ROUND_DOWN : 1 ����
		BigDecimal.ROUND_CEILING : 2 �ø�
		BigDecimal.ROUND_FLOOR : 3 ����
		BigDecimal.ROUND_HALF_UP : 4 �ݿø�
		BigDecimal.ROUND_HALF_DOWN : 5 �ݿø�
		BigDecimal.ROUND_HALF_EVEN : 6 �ݿø�
		BigDecimal.ROUND_UNNECESSARY : 7 �ø����� �ƹ��͵� ����
		*/



		
		
		// t1.divide(t2, a, b);
		//				----��ȿ�� �ڸ���
										

	}
}