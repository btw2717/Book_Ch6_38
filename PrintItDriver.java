

public class PrintItDriver {
	public static void main(String[] args) {
		for(int i=0; i <= 9; i++) {
			for(int j=0; j <= 9; j++) {
				if(j < 9)
				System.out.print(PrintIt.getRandomUpperCaseLetter() + " ");
				else
					System.out.println(PrintIt.getRandomUpperCaseLetter());
			}
		}
		for(int i=0; i <= 9; i++) {
			for(int j=0; j <= 9; j++) {
				if(j < 9)
				System.out.print(PrintIt.getRandomDigitCharacter() + " ");
				else
					System.out.println(PrintIt.getRandomDigitCharacter());
			}
		}
	}
}
