package ncs.test1;

public class ArrayTest {
	public static void main(String[] args) {
		int [][] array = {{12, 41, 36, 56, 21}, 
						{82, 10, 12, 61, 45}, 
						{14, 16, 18, 78, 65}, 
						{45, 26, 72, 23, 34}};
		
		
		double 합 = 0;
		int count = 0;
		
		//for - each 이중으로 작성해서 계산
		for(int[] 배열을한줄씩꺼내기 : array) {
			for(int num : 배열을한줄씩꺼내기) {
				합 +=num;
				count++;  // 숫자를 세는 이유는 나중에 숫자 평균 구하기
			}
		}
		double 평균 = 합/count;
		System.out.println("합계 : "+합);
		System.out.println("평균 : "+(평균));
	}
}
