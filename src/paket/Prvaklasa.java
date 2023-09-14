package paket;

import java.util.Scanner;

public class Prvaklasa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//prvi komentar 
		
		/*vise
		 * linijski
		 * komentar
		 */

		        Scanner scanner = new Scanner(System.in);
		        int n = Integer.parseInt(scanner.nextLine());
		        int[] a = new int[n];
		        for (int i = 0; i < a.length; i++) {
		            a[i] = Integer.parseInt(scanner.nextLine());
		        }
		        for (int i = 0; i < a.length; i++) {
		            if (a[i] % 2 == 0) {
		                System.out.println(a[i]);
		            }
		        }
		    }
		}