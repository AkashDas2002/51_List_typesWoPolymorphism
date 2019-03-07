/**
  Implement a list of integer elements, including
  both data and operations.
 */

public class List_inArraySlots {

    // declare fields here
	private int[] list;
	private int size;

	private static final int INITIAL_CAPACITY = 10;

    /**
      Construct an empty list with a small initial capacity.
     */
    public List_inArraySlots() {
    list = new int[INITIAL_CAPACITY];
	}


    /** 
      @return the number of elements in this list
     */
    public int size() {
    return size;
	}


     /** 
       @return a string representation of this list,
       in [a,b,c,] format
      */ 
    public String toString() {
    	output = "[";
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
     // public boolean add( int value) {
     // }


    /** 
      Double the capacity of the List_inArraySlots, 
      preserving existing data
     */
     private void expand() {
        System.out.println( "expand... (for debugging)");
        
   // /* S.O.P. rules for debugging:
              // Working methods should be silent. But during 
              // development, the programmer must verify that 
              // this method is called when that is appropriate.
              // So test using the println(), then comment it out.
              // */
<<<<<<< HEAD
     // }
=======
     }
>>>>>>> d1db718207a3c0d877928a90cbb0c8585e9a773b
}
