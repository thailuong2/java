/**
 * 
 */
package demo;

import java.util.Scanner;

/**
 * @author Thai Dep Trai
 *
 */
public class sad {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner reader = new Scanner(System.in);
		int i =0;
		System.out.print("nhap i");
		i = reader.nextInt();
		if (i>0){
			if (i==1){
				System.out.print("mot");
			}if(i==2){
				System.out.print("hai");
			}
		}else {
			System.out.print("sdad");
		}
	}

}
