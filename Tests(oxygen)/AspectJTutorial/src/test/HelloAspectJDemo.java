package test;

public class HelloAspectJDemo {

	public static int sayHello() {
		System.out.println("Hello");
		return 3;
	}

	public static void greeting() {
		String name = new String("John");
		sayHello();
		System.out.print(name);
	}

	public static void main(String[] args) {
		sayHello();
		System.out.println("--------");
		sayHello();
		System.out.println("--------");
		greeting();
	}

}
