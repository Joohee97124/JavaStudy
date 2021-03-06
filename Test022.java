/*===============================
■■■ 연산자 (Operator) ■■■
- 비트 단위 연산자
===============================*/

public class Test022
{
	public static void main(String[] args)
	{
		int a =10, b=-10;

		System.out.printf("-a : %d\n", -a);
		System.out.printf("-b : %d\n", -b);
		// 비트열반전

	}
}
/*
					비트열반전
a =10 → 00001010 →→→→→→→ 11110101 (결과) ==> -11
									↓
									↓2의 보수 = (1의 보수) + 1
									↓
							    00001010 + 1 -> 00001011 (=11)
								
			
	                 비트열반전
b = -10 → 00001010 →→→→→→→ 11110101 (결과) ==> -11
								  +       1
								  -------------
								   11110110 (=-10) : -10의 비트열 만들어주려고 이렇게 함!
				비트열반전
     11110110 →→→→→→→ 00001001 (결과) ==> 9

*/


/*
[실행 결과]
-a : -10
-b : 10
계속하려면 아무 키나 누르십시오 . . .
*/