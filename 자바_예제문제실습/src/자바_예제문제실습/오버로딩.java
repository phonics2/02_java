package 자바_예제문제실습;

public class 오버로딩 {

	
	public void test(String str ,String str2) {}
	
	public void test(int i, int x) {}
	
	public void test(String s) {}
	
	private void test(int a) {}
	
	public void test(char a, char s) {}
	
	void test(char ch) {}
	
	public void test(boolean a) {}
	public void test(boolean b,int a) {}
	public void test(short b, int a) {}
	public void test(short c) {}
	
	public void test(int a, String b,int r) {}
	public void test(int a, String b) {}
	
	public void test(String c, int b, int r) {}
	public void test(String c, int b) {}
	
	public void test(boolean a, boolean b, int r) {}
	public void test(boolean a, boolean b) {}
	
	
	public String test(long a) {
		return "";
	}
	public int test(short i, short a) {
		return 0;
	}
	public double test(String a, short n) {
		return 0.1;
	}
	
	
	
}
