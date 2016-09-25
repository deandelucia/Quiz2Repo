import java.util.Scanner;
public class Tuition {
		public static void main(String[] args) {
			Scanner input = new Scanner(System.in);
			System.out.println("Please enter the tuition cost:");
			double Price = input.nextDouble();
			System.out.println("Please enter the percentage increase");
			double Percent = input.nextDouble();
			double total = Price;
			double new_base = Price;
			int count = 0;
			while (count <3){
				new_base = ((new_base)*(1+Percent));
				total = total + new_base;
				count++;
			}
			System.out.printf("The tuition for 4 years is %.2f ", total);
			input.close();
		}
	}

