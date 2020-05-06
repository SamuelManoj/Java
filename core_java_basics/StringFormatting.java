package core_java_basics;

public class StringFormatting {

	public static void main(String[] args) {
		System.out.println("This is text\t This is text2 \nand new line");
		
		System.out.printf("The id is %d and name is %s and value is %f",1,"sam",100.00);
		
		for(int i =0;i<10;i++) {
			System.out.printf("%10d: and some text",i);
			System.out.println();
		}
		
		System.out.printf("%.2f\n",1.235450);
		System.out.printf("%6.1f\n",8.233666);
	}
}
