import java.util.Random;
public class RandomOdd {
	static int numberOfChances=0;
	static int randomNumber;
	static int numEntered;
	static Random obj=new Random();
	
	//method to generate a random number
	static int generateNumber() {
	 randomNumber=obj.nextInt(999);
	    return randomNumber;
		}
	
	public static void main(String[] args) {
		// condition for odd random number generation
		 while(randomNumber%2==0){
	 		generateNumber();
	 		numberOfChances++;
	 		
	 	}
		
	    
    //reads the input from command line argument
    int size=args.length;
	int array []=new int[size];
	for(int i=0;i<size;i++) {
       array[i]=Integer.parseInt(args[i]);
	}
	// checking the 
	if(numEntered<randomNumber) {
    	System.out.println("Too low");
    }
    else if(numEntered>randomNumber) {
    	System.out.println("Too high");
    }
    else {
    	System.out.println("Correct");
    }
    
    System.out.println("The number generated is" + randomNumber );
    if(numberOfChances<3) {
    	generateNumber();
    	
    }
	}}
