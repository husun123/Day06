public class JavaTypes {
	
	public static void main(String[] args) {
		
		
		// 분류			자료형			상수
		// 정수형		byte			(-128 ~ 127)
		// 정수형		short			(-32,768 ~ 32,767)
		// 정수형		int(기본형)		10진수, 8진수, 16진수 (-2,147,483,648 ~ 2,147,483,647)
		// 정수형		long			32000L (숫자 뒤에 L을 붙임) (-2^63 ~ 2^63 -1)
		// 실수형		float			(+,-)1.4E^-45 ~ 3.4028235E^38 (숫자 뒤에 F를 붙임)
		// 실수형		double(기본형)	(+,-)4.9E^-324 ~ 1.7976931348623157E^308
		// 문자열		String			큰 따옴표로 표기 
		// 문자			char			작은 따옴표로 한글자만 표기
		// 부울			boolean			true, false
		
		// 정수형
		int intValue = 0;
		int num01 = 10; 
		int num02 = 010;			//8진수 8을 표기
		int num03 = 0x10;			//16진수 16을 표기
		byte bNum01 = -128;
		short sNum01 = -32768;
		long lNum01 = -2147483648L;
		System.out.println(intValue);
		System.out.println(num01);
		System.out.println(num02);
		System.out.println(num03);
		System.out.println(bNum01);
		System.out.println(sNum01);
		System.out.println(lNum01);
		
		//실수형
		float floatVal = 3.14F;
		double doubleVal = 256.12;
		System.out.println(floatVal);
		System.out.println(doubleVal);
		
		//문자형
		String StringValue = "안녕하세요.";
		String bye = "안녕히 계세요.";
		System.out.println(StringValue);
		System.out.println(bye);		
		
		// 문자
		char character = 'A';
		System.out.println(character);
		
		// 부울
		boolean trueVal = true;
		boolean falseVal = false;
		System.out.println("" + trueVal + 10);		// "" <- 이게 앞에 오면 전부 String타입으로 바뀐다.
		System.out.println(falseVal);
		
		boolean result = 1 == 2;			// ! = not
		boolean result1 = 1 != 2;
		System.out.println(result);
		System.out.println(result1);
		
		boolean isEqualNumber = 10 == 11;
		boolean isEqualType = "삽살개" == "삽살개";
		boolean isEqualName = "해피" == "누렁이";
		if(isEqualNumber && isEqualType && isEqualName) {
			
		}
		
		// 	&& 논리곱. 하나만 거짓이면 거짓		false && true && false  => false
		//  || 논리합. 둘다 거짓일 경우 거짓	false || true || false	=> true
		
		// 형변환
		byte byteRes = (byte)128;		//int -> byte 형변환
		System.out.println(byteRes);
		
		Short shortRes = (short)32768;	//int -> short 형변환
		System.out.println(shortRes);
		
		float floatVal01 = 12.34F;
		int intValue01 =(int)floatVal01;	//float -> int 형변환
		System.out.println(intValue01);
	
		int charNum = 'A';		// char -> int 형변환
		System.out.println(charNum);
	}
}