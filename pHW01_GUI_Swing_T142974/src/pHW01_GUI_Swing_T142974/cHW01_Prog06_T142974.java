/**
 * 
 */
package pHW01_GUI_Swing_T142974;

import java.util.Scanner;

/**
 *  luong quoc thai T142974
 *
 */
public class cHW01_Prog06_T142974 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);
		System.out.print("nhap n : ");
		int n = reader.nextInt();
		if (n <= 00) {
			System.out.print("Invalid Input");
		} else {
			cHW01_Prog06B_T142974.printToConsole(n);
		}
	}

}
