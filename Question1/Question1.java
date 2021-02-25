import java.util.Scanner;

public class Question1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();
		String[] shortName = new String[n];
		for(int i=0 ; i<n ; i++) {
			String fullName = sc.nextLine();
			String[] sepName = fullName.split(" ");
			shortName[i] = "";
			for(String s : sepName) {
				if((int)s.charAt(0) == (int)s.toUpperCase().charAt(0)) {
					shortName[i] += s.charAt(0);
				}
			}
			for(int j=i ; j>0 ; j--) {
				if(shortName[j].length()>shortName[j-1].length()) {
					String swap = shortName[j];
					shortName[j] = shortName[j-1];
					shortName[j-1] = swap;
				}
				else if(shortName[j].length()==shortName[j-1].length() && shortName[j].compareTo(shortName[j-1])<0) {
					String swap = shortName[j];
					shortName[j] = shortName[j-1];
					shortName[j-1] = swap;
				}
			}
		}
		for(String s : shortName) {
			System.out.println(s);
		}
	}
}
