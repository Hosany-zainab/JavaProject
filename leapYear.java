import java.util.Scanner; 
/**
 * 
 */

/**
 * @author Hosany zainab
 *
 */
public class leapYear {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//declaring key
		Scanner key = new Scanner (System.in);
		
		// enter a year
		System.out.print("Enter a year: ");
		int year = key.nextInt();
		
		// if year is a multiple of 4
		//then is leap year
		if(year % 4 == 0 ) {
			
			//if year not multiple of 100
			//then not leap year
			if(year % 100 == 0) {
				
				//if year multiple of 400
				//then is a leap year
				if (year % 400 == 0) {
					//output leap year
					System.out.println(year + " is leap");
				}
				
			    else
			    	//output not a leap year
			    	System.out.println(year + " is not a leap year");
			}
			
		    else
		    	//output leap year
			    System.out.println(year + "is leap");
		}	
		else 
			//output not a leap year
			System.out.print(year + "is not a leap");
		
		key.close();
			    
				}
		
		}

		

