package Example;
import java.util.Scanner;
public class loops_Task {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number & which iteration you want");
		long a = sc.nextLong(), e = sc.nextLong(), i;
		for (i = a; i <= e; i++,a *= 2);
			System.out.println(a);
		sc.close();}}