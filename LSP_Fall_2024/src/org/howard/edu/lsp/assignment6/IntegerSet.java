package org.howard.edu.lsp.assignment6;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class IntegerSet  {
	// Store the set elements in an ArrayList.
	private List<Integer> set = new ArrayList<Integer>();

	// Default Constructor
	public IntegerSet() {
	}

	// Constructor if you want to pass in already initialized
	public IntegerSet(ArrayList<Integer> set) {
		this.set = set;
	}
	//Clears the internal representation of the set.
	public void clear() {
		set.clear();
	}
		
	//Returns the length of the set.
	public int length() {
		return set.size();
	}
	/*
	 * Returns true if the 2 sets are equal, false otherwise;
	 * Two sets are equal if they contain all of the same values in ANY order.
	 * This overrides the equal method from the Object class.
	 */
	@Override
	public boolean equals(Object o) {
		if (o == set) 
			return true;
		if (!(o instanceof IntegerSet)) 
			return false;
		IntegerSet secondSet = (IntegerSet) o;
			
		List<Integer> sortedFirst = new ArrayList<>(set);
		List<Integer> sortedSecond = new ArrayList<>(secondSet.set);
		Collections.sort(sortedFirst);
		Collections.sort(sortedSecond);
		
		return sortedFirst.equals(sortedSecond);
	}
		
	
			

	
	//Returns true if the set contains the value, otherwise false.
	public boolean contains(int value) {
		return set.contains(value);
	}
	
	//Returns the largest item in the set.
	public int largest() {
		 if (isEmpty()) 
			 throw new IllegalStateException("Empty set");
	        return Collections.max(set);
	}
	
	//Returns the smallest item in the set.
	public int smallest() {
		if (isEmpty()) 
			throw new IllegalStateException("Empty set");
        return Collections.min(set);
	}
	
	//Adds an item to the set or does nothing it already there.
	public void add(int item) {
		if (!set.contains(item)) {
            set.add(item);
		}
	}
	
	//Removes an item from the set or does nothing if not there.
	public void remove(int item) {
		 set.remove(Integer.valueOf(item));
	}
	
	//Set union.
	public void union(IntegerSet intSetb) {
		 for (int item : intSetb.set) {
	            add(item);
		 }
	}
	//Set intersection, all elements in s1 and s2.
	public void intersect(IntegerSet intSetb) {
		set.removeIf(item -> !intSetb.contains(item));
	}
	
	 // Set difference, i.e., s1 – s2. 12 pts.
    public void diff(IntegerSet intSetb) {
        set.removeIf(intSetb::contains);
    }
    
    // Set complement, all elements not in s1. 11 pts.
    public void complement(IntegerSet intSetb) {
        set.clear();
        for (int item : intSetb.set) {
            if (!this.contains(item)) {
                set.add(item);
            }
        }
    }
	
	//Returns true if the set is empty, false otherwise.
	public boolean isEmpty() {
		return set.isEmpty();
	}
	
	//Return String representation of your set. This overrides the equal method from the Object Class.
	@Override
	public String toString() {
		return set.toString();
		
	}
	
	
}
		
	
	




	
	


