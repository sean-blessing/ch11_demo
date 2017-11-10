import java.util.Arrays;

public class ArrayTesterApp {

	public static void main(String[] args) {
		System.out.println("Let's test arrays");
		doBallArray();
		System.out.println("bye");
	}

	public static void doBallArray() {
		Ball[] ballArray = new Ball[5];
		ballArray[0] = new Ball("Blue");
		ballArray[1] = new Ball("Green");
		ballArray[2] = new Ball("Blue");
		ballArray[3] = new Ball("Black");
		ballArray[4] = new Ball("Green");
		
//		System.out.println();
//		// for loop classic
//		for (int i=0;i<ballArray.length;i++) {
//			System.out.println(ballArray[i]);
//		}
//		
//		System.out.println();
//		// for loop instantiating a ref type
//		for (int i=0;i<ballArray.length;i++) {
//			Ball b = ballArray[i];
//			System.out.println(b);
//		}
//
		System.out.println();
		// enhanced for loop
		for (Ball b : ballArray) {
			System.out.println(b);
		}
		
		Arrays.sort(ballArray);
		
		System.out.println();
		// enhanced for loop
		for (Ball b : ballArray) {
			System.out.println(b);
		}
		
	}
	
	public static void doStringArray() {
		String[] stringArray = {"Purple", "Orange", "Cyan", "Fuscia", "Pink"};
//		String[] stringArray = new String[5];
//		stringArray[0] = "Blue Ball";
//		stringArray[1] = "Green Ball";
//		stringArray[2] = "Blue Ball";
//		stringArray[3] = "Black Ball";
//		stringArray[4] = "Green Ball";
		System.out.println("Length of array = "+stringArray.length);
		
		for (int i=0;i<stringArray.length;i++) {
			System.out.println(stringArray[i]);
		}
		String [] array2 = Arrays.copyOf(stringArray, stringArray.length);
		Arrays.sort(stringArray);

		System.out.println("stringArray sorted...");
		for (int i=0;i<stringArray.length;i++) {
			System.out.println(stringArray[i]);
		}

		System.out.println();
		System.out.println("array2 [clone of original array...");
		for (int i=0;i<array2.length;i++) {
			System.out.println(array2[i]);
		}
	}
	
	public static void doIntArray() {
		int[] intArray = new int[50];
		for (int i=0;i<intArray.length;i++) {
			intArray[i]=(int)(Math.random()*100)+1;
		}
		int sum = 0;
		for (int i=0;i<intArray.length;i++) {
			int b = intArray[i];
			sum+=b;
			System.out.println("element["+i+"] = "+b+", sum = "+sum+".");
		}
		
	}
}
