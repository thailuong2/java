import java.text.DecimalFormat;

/**
 * 
 */

/**
 * @author
 *
 */
public class q3213sd {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a = 3.132323;
		DecimalFormat df = new DecimalFormat("0.00");
		String str = df.format(a);
		double r = Double.valueOf(str);
		System.out.print("");
		System.out.print(""+r);
	}

}
