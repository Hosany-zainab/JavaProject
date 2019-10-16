import java.util.Scanner;
/**
 * 
 */

/**
 * @author Hosany zainab
 *
 */
public class average {

	/**
	 * @param args
	 */
    public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner key = new Scanner(System.in);
		

		//declare and initialize count 
		int count = 0;
	    
	    
		
		//declare and initialize mark, total, average, min and max
	     double total = 0;
	     double average = 0;
	     
	     double largest = 1;
	     double smallest = 100;
	     
	     
	   //input mark and ask user to stop when mark input = -1
			System.out.println("Enter a mark and press -1 to stop ");
			System.out.println("Do not take -1 as a mark");
			double mark = key.nextDouble();
	
		//check until mark not equal to -1
		while (mark != -1)
		{
			//calculate total
			total = mark + total;
			
			//increment count
			count = count + 1;
			
			//store mark
			mark = key.nextDouble();
			
			
			//compare mark with smallest and largest
			if (mark < smallest && mark > 0){
				smallest = mark;
			}
			    if (mark > largest && mark >0) {
			    	largest = mark;
			    }
			    
			    
		}	
	
		
		//calculate average
		average = total/count;
		
		//output average, smallest, largest
		System.out.println(average + " is the average.");
	    System.out.println(smallest + " is the smallest.");
		System.out.println(largest + " is the largest.");
		
		key.close();
		
			
			    }
    }
		
		