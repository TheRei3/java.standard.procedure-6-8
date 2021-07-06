package ex6no8;

public class ex6no8 {  //  263p
	public static void main(String[] args) {
		System.out.println("main(String[] args)이 시작되었습니다.");
		firstMethod();
		System.out.println("main(String[] args)이 종료되었습니다.");
	}
	
	static void firstMethod() {
		System.out.println("firstMethod()이 시작되었습니다.");
		secondMethod();
		System.out.println("firstMethod()이 종료되었습니다.");
	}
	
	static void secondMethod() {
		System.out.println("secondMethod()이 시작되었습니다.");
		System.out.println("secondMethod()이 시작되었습니다.");
	}
}
