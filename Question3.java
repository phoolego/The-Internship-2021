import java.util.Scanner;

public class Question3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] num = new int[12];
		int[] wrongNum = new int[5];
		int wrongNumIndex = 0;
		int score = 0;
		boolean[] numFound = new boolean[12];
		for(int i=0 ; i<num.length ; i++) {
			num[i] = sc.nextInt();
		}
		for(int i=0 ; i<num.length ; i++) {
			System.out.print("_ ");
		}
		for(int i=0 ; i<5 ; i++) {
			int n = sc.nextInt();
			boolean isFound = false;
			for(int j=0 ; j<num.length ; j++) {
				if(n == num[j]) {
					numFound[j] = true;
					isFound = true;
					score++;
				}
			}
			if(!isFound) {
				wrongNum[wrongNumIndex++] = n;
			}
			for(int j=0 ; j<num.length ; j++) {
				if(numFound[j]) {
					System.out.print(num[j]+" ");
				}else {
					System.out.print("_ ");
				}
			}
			for(int j=0 ; j<wrongNumIndex ; j++) {
				System.out.print(wrongNum[j]+" ");
			}
			System.out.println("");
		}
		System.out.println(score);
	}
}
