package basics;
import java.util.Scanner;

public class FirstBuildCode {

	public static void main(String args[]) {
		System.out.print("Enter the two numbers - num,times :");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int times = sc.nextInt();
		int dup=num;
		for(int i=1;i<times;i++) {
			num = (dup+num);
		}
		
		System.out.print("Final ans is "+num);
	}
}
