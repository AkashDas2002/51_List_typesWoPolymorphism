/**
  Implement a list of integer elements, including
  both data and operations.
 */

public class List_inArraySlots {
	enum Type {
		INT, DOUBLE, STRING
	}
    // declare fields here
	
    private int[]    intElements;
    private double[] doubleElements;
    private String[] stringElements;
    private int numberOfElements;
    private Type[] typeOfElements;
    private static final int INITIAL_CAPACITY = 10;


    /**
      Construct an empty list with a small initial capacity.
     */
  public List_inArraySlots() {
	intElements = new int[INITIAL_CAPACITY];
	doubleElements = new double[INITIAL_CAPACITY];
	stringElements = new String[INITIAL_CAPACITY];
	typeOfElements = new Type[INITIAL_CAPACITY];		
  }


  /**
    @return the number of elements in this list
   */
  public int size() {
    return numberOfElements;
  }


   /**
     @return a string representation of this list,
     in [a,b,c,] format
    */

/* DELETE THIS CODE FOR THE toString method
  public String toString() {
  	String output = "[";
		for(int i : list) {
			output += i + ", ";
		}
		output += "]";
		return output;
  }


    /**
      Appends @value to the end of this list.
      @return true, in keeping with conventions yet to be discussed
     */
     public boolean add( Type type   // same meaning as in typeOfElements
                       , int    intValue
                       , double doubleValue
                       , String stringValue
	                       ) {
		if (typeOfElements.length == numberOfElements) expand();
		typeOfElements[numberOfElements] = type;
		if (type == Type.INT) {
		    intElements[numberOfElements] = intValue;
		}
		if (type == Type.DOUBLE) {
		    doubleElements[numberOfElements] = doubleValue;
		}
		if (type == Type.STRING) {
		    stringElements[numberOfElements] = stringValue;
		}
		return true;
		    
			
     }


  /**
    Double the capacity of the List_inArraySlots,
    preserving existing data
   */
  private void expand() {
      // System.out.println( "expand... (for debugging)");
      int[] intDoubledArray = new int[intElements.length * 2];
      for(int i = 0; i < numberOfElements; i++){
	  intDoubledArray[i] = intElements[i];
      }

      double[] doubleDoubledArray = new double[doubleElements.length * 2];
      for(int i = 0; i < numberOfElements; i++){
	  doubleDoubledArray[i] = doubleElements[i];
      }
      
      String[] stringDoubledArray = new String[stringElements.length * 2];
      for(int i = 0; i < numberOfElements; i++){
	  stringDoubledArray[i] = stringElements[i];
      }

      Type[] typeDoubledArray = new Type[typeOfElements.length * 2];
      for(int i = 0; i < numberOfElements; i++){
	  typeDoubledArray[i] = typeOfElements[i];
      }


    intElements = intDoubledArray;
    doubleElements = doubleDoubledArray;
    stringElements = stringDoubledArray;
    typeOfElements = typeDoubledArray;
 // /* S.O.P. rules for debugging:
            // Working methods should be silent. But during
            // development, the programmer must verify that
            // this method is called when that is appropriate.
            // So test using the println(), then comment it out.
            // */
   }

   
  /**
    accessor
    @return element @index from this list
    precondition: @index is within the bounds of the array.
        (Having warned the user about this precondition,
         you should NOT complicate your code to check
         whether user violated the condition.)
   */

/* DELETE THIS COMMENT FOR THE get method 
  public int get(int index) {
		return list[index];
  }

  /**
    Set value at @index to @newValue
    @return old value at @index
    @precondition: @index is within the bounds of this list.
   */

/* DELETE THIS COMMENT FOR THE set method 
  public int set(int index, int newValue) {
		int oldValue = list[index];
		list[index] = newValue;
		return oldValue;
  }

  /**
    Remove the element at position @index in this list.
    Shift any subsequent elements to the left (that is,
    decrease the index associated with each).
    @return the value that was removed from the list
  */
    
 /* DELETE THIS COMMENT FOR THE remove  method 
  public int remove (int index) {
		int oldValue = list[index];
		int[] newArray = new int[list.length - 1];
		for(int i = 0; i < numberOfElements; i++) {
		    if (i < index) {
					newArray[i] = list[i];
		    }
		    else {
					newArray[i] = list[i+1];
		    }
		}
		list = newArray;
		numberOfElements -= 1;
		return oldValue;
  }

  /**
    Insert @value at position @index in this list.
    Shift the element currently at that position (if any)
    and any subsequent elements to the right
    (that is, increase the index associated with each).
  */

 /* delete this method for the add method
  public void add( int index, int value) {
  	add(list[numberOfElements - 1]);
		for(int i = numberOfElements - 2; i > index; i--){
    	list[i] = list[i - 1];
		}
		list[index] = value;
  }
 */
}

