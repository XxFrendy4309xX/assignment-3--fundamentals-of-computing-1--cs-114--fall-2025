import java.util.Scanner;

public class Diamond {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
	System.out.println("Enter a Number: ");
	int input = scanner.nextInt();
	//for now, only odd numbers, will fix later...
	
	// chekcing logic:
	int check = (input % 2); 
	if (check == 0) { 
	  System.out.println("Even!"); // even number logic
	  int space = (input / 2);
	  int dots = 1;
	  
	  for (int i = space; i >= 0; i--) {
	    if (dots > 1) {
		  for (int m = i; m > 0; m--) {
		    System.out.print("  ");
		   }
		  }
         if (dots == 1) {
		   for (int m = i; m > 1; m--) {
		     System.out.print("  ");
		   }
		   System.out.print(" ");
		 }			 
		  for (int m = dots; m > 0; m--) {
			if (dots > 1) {
		      System.out.print("* ");
			}
			if (dots == 1) {
			  System.out.print("*");
			}
			if (m == 1) {
			  System.out.print("\n");
			}
		  }
		  if (dots > 1) {
		   dots = (dots + 2);
		  } else {
		    dots = (dots + 1);
		  }
		if (i == 0) {
		  space = 0;
		}
	  }
	  if (space == 0) {
	    int evenDots = (input - 2);
		space = space++;
		System.out.print("  ");
		for (int j = space; j <= (input/2); j++) {
		  if (j > 0) {
			 if (evenDots > 1) {
		      for (int k = j; k >= 0; k--) {
			    System.out.print("  ");
			  }
			}
			}
			
			for (int k = evenDots; k > 0; k--) {
			  if (evenDots > 1) {
			  System.out.print("* ");
			  }
			  //if (evenDots == 1) {
			  //  System.out.print("*\n");
			  //}
			  if (k == 1) {
			    System.out.print("\n");
			  }
			}
		  if (evenDots > 1) { 
		    evenDots = (evenDots - 2);
		  }
		    }
			for (int d = (input - 1); d > 0; d--) {
			  System.out.print(" ");
			}
			System.out.print("*\n");
		  
		}
	  
	} else {
	  System.out.println("Odd!"); // odd number logic
	 int space = (input / 2);
	int dots = 1;
	
	for (int i = space; i >= 0; i--) {
	  if (dots >= 1) {
		  for (int m = i; m > 0; m--) {
		    System.out.print(" ");
		  }
		  for (int m = dots; m > 0; m--) {
		    System.out.print("*");
			if (m == 1) {
			  System.out.print("\n");
			}
		  }
		  dots = (dots + 2);
	  }
	  if (i == 0) {
	    space = 0;
	  }
	}
	if (space == 0) {
		int dotsDown = (input - 2);
		space = space++;
	  for (int j = space; j <= (input/2); j++) {
		  if (j > 0) {
			  for (int k = j; k > 0; k--) {
			    System.out.print(" ");
			  }
			  for (int k = dotsDown; k > 0; k--) {
			    System.out.print("*");
				if (k == 1) {
				System.out.print("\n");
				}
			  }
			dotsDown = (dotsDown - 2);
		  }
	  }
	}
	}
	
	//

	
	// even number here!!!
	
  }
}