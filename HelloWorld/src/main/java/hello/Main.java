package hello;

public class Main {

	public static void main(String[] args) {
		Main m = new Main();
		System.out.println("result: " + m.doSomething(4));
	}

	public int doSomething(int a){
		return a*3;
	}
}
