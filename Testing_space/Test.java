import java.io.FileNotFoundException;
import java.util.Scanner;
import javax.swing.JFrame;

public class Test {
	
	private static Scanner vstup = new Scanner(System.in);
	
	
	public static void main(String[] args) throws FileNotFoundException {
		Gui okno = new Gui();
        okno.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        okno.setVisible(true);
        okno.setSize(640, 480);
        okno.setLocationRelativeTo(null);
		
		int i,j,x;
		String[][] pole;
		
		pole = new String[20][20];
		java.io.PrintStream ps = new java.io.PrintStream( "out.txt" );
		
		System.out.println("Zadejte rozmery matice:");
		String input = vstup.nextLine();
		x = Integer.parseInt(input);
		
		for (i = 0; i < x; i++) {
			for (j = 0; j < x; j++) {
				
				if (j > i) {
					pole[i][j] = "@";	
				}
				else if (i == j) {
					pole[i][j] = "\\";
				} else {
					pole[i][j] = "0";
			}
		}
		}
			
			for (i = 0; i < x; i++) {
				for (j = 0; j < x; j++) {
					System.out.print(pole[i][j]);
					ps.print(pole[i][j]);
			}
				System.out.println("");
				ps.println("");
	}
			System.out.println("Zadali jste: " + vstup);
			ps.flush();
			ps.close();

}
}
