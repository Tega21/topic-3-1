// Brandon Ortega// CST-239// 11.05.2023// I used code given to us by example in activity 2
package app;

/**
 * This class represents a person with a first name and a last name.
 */

public class Person implements PersonInterface, Comparable<Person> {

    private String firstName = "Brandon";
    private String lastName = "Ortega";
	private boolean running;
	private int age;
    
    /**
     * Constructs new Person with the specified first and last name
     * @param firstName Person's first name
     * @param lastName Person's last name
     */
    public Person(String firstName, String lastName, int age){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }
    
    /**
     * Constructs a new person by copying the names from another person.
     *
     * @param person The person to copy data from.
     */
    public Person(Person person){
        this.firstName = person.getFirstName();
        this.lastName = person.getLastName();
       this.age = person.getAge();
    }
    
    /**
     * Retrieves the first name of the person.
     *
     * @return A string representing the person's first name.
     */
    public String getFirstName(){
        return firstName;
    }
    
    /**
    * Retrieves the last name of the person.
    *
    * @return A string representing the person's last name.
    */
    public String getLastName(){
        return lastName;
    }
    
    public int getAge() {
    	return age;
    }
    
    /**
     * Indicates whether some other object is "equal to" this one.
     * 
     * @param other The reference object with which to compare.
     * @return {@code true} if this object is the same as the other argument; {@code false} otherwise.
     */
    public boolean equals(Object other) {
    	if(other == this) {
    		System.out.println("I am here in other == this");
    		return true;
    	}
    	if (other == null) {
    		System.out.println("I am here in other == null");
    		return false;
    	}
    	if(getClass() != other.getClass()) {
    		System.out.println("I am here in getClass() != other.getClass()");
    		return false;    		
    	}
    	Person person = (Person) other;
    	return (this.firstName == person.firstName && this.lastName == person.lastName);
    }
    
    /**
     * Returns a string representation of the person, including the class name and the person's names.
     *
     * @return A string representation of the person's information.
     */
    public String toString() {
    	return this.firstName + " " + this.lastName + ", Age: " + this.age;
    }

    /**
     * This method simulates the action of walking.
     * When invoked, it prints out a statement to indicate that the person is walking.
     * It also sets the 'running' status to false since walking is not running.
     */
	@Override
	public void walk() {
		System.out.println("I am walking");
		running = false;
		
	}
	
	/**
	 * This method simulates the action of running.
	 * When invoked, it prints out a statement to indicate that the person is running.
	 * It also sets the 'running' status to true.
	 */

	@Override
	public void run() {
		System.out.println("I am running");
		running = true;
		
	}

	/**
	 * This method checks if the person is currently running.
	 * 
	 * @return boolean This returns true if the person is running, false otherwise.
	 */
	@Override
	public boolean isRunning() {
		return running;
	}

	/**
	 * Compares this person with the specified person for order. Returns a
	 * negative integer, zero, or a positive integer as this person is less
	 * than, equal to, or greater than the specified person. Ordering is
	 * determined first by the last name, and then by the first name if the
	 * last names are the same.
	 * 
	 * @param p the person to be compared.
	 * @return a negative integer, zero, or a positive integer as this person
	 *         is less than, equal to, or greater than the specified person.
	 */
	@Override
	public int compareTo(Person p) {
		 return Integer.compare(this.age, p.age);
//		int value = this.lastName.compareTo(p.lastName);
//		if(value == 0) {
//			return this.firstName.compareTo(p.firstName);
//		}else {
//			return value;
//		}
	}
    

}
