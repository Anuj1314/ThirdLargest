public class Main
{
  public static void main (String[]args)
  {
    //You can define own array, but size must be greater than 3
    int arr[] = { 22, 44, 22, 44, 22 };
    //  int arr[] = {11,22,33,44,55};
    // int arr[] = { 22, 22, 22, 22, 11 };
    int firstLargest = Integer.MIN_VALUE;
    int secondLargest = Integer.MIN_VALUE;
    int thirdLargest = Integer.MIN_VALUE;
    //This for loop is to iterate through an array an find the solution
    for (int i = 0; i < arr.length; i++){
    	if (arr[i] > firstLargest){
        thirdLargest = secondLargest;
        secondLargest = firstLargest;
        firstLargest = arr[i];
	    }
      else if (arr[i] > secondLargest && arr[i] != firstLargest){
        thirdLargest = secondLargest;
        secondLargest = arr[i];
	    }
	    else if (arr[i] > thirdLargest && arr[i] != secondLargest && arr[i]!= firstLargest){
	      thirdLargest = arr[i];
	    }
    }
    
    //If there exist some ambiguity, so this conditions prints output accordingly
    if (thirdLargest == Integer.MIN_VALUE){
    	System.out.println ("There exist no third largest element");
    	System.out.println ("Largest value is " + firstLargest +" and second largest value is " + secondLargest);
    }
    else if (secondLargest == Integer.MIN_VALUE){
	    System.out.println("There exist no second largest and third largest element");
	    System.out.println ("First Largest element is " + firstLargest);
    }
    else{
	    System.out.println ("Largest Value is " + firstLargest +" and the second largest value is " +secondLargest +" and the third largest value is " +thirdLargest);
    }

  }
}
