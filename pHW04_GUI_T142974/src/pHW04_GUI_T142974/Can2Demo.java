package pHW04_GUI_T142974;

import java.util.Scanner;

/**
 * 
 */

/**
 * @author 
 *
 */
public class Can2Demo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		double a =1.0;
		Scanner reader = new Scanner(System.in);
		System.out.print("nhap so can tinh : ");
		double sq = reader.nextDouble();
		for(int i=1;i>0;i++){
			if(a*a==sq){
				System.out.print(i);
				i=-1;
			}else{
				a=(1/2)*(a+(sq/a));
				
		}}

	}

}
