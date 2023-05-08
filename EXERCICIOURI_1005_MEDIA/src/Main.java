import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		double A;
		double B;
		double MEDIA;
		
		A = sc.nextDouble();
		B = sc.nextDouble();
		
		MEDIA = ((A * 0.35) + (B * 0.75)) / 1.1;
		
		System.out.printf("MEDIA = %.5f\n", MEDIA);
		
		
		sc.close();

	}

}
