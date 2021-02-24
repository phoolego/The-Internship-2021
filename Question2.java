import java.util.Scanner;

public class Question2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double n = 0;
		do {
			boolean prime = false;
			n = sc.nextDouble();
			if(n==0) {
				break;
			}
			for(int i=1 ; i<=3 ; i++) {
				int check = (int) (n*Math.pow(10, i));
				for(int j=2 ; j<=check ; j++) {
					if(j==check)
						prime = true;
					else if(check%j==0)
						break;
				}
				if(prime) {
					System.out.println("TRUE");
					break;
				}if(i==3 && !prime)
					System.out.println("FALSE");
			}
		}while(n!=0);
	}
}
