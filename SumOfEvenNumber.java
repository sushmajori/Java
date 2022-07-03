import java.util.Scanner;
class SumOfEvenNumber {
	public static void main(String[] args) {
		// taking input from user
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Number: ");
		int num=sc.nextInt();
		int sum=0, lastDigit;

		while(num!=0){
			lastDigit = num % 10;
			if(lastDigit %2 == 0){
				sum = sum + lastDigit;
			}
			num=num/10;
		}
		System.out.println("Sum of even digits is: " +sum);
		sc.close();
	}

}
