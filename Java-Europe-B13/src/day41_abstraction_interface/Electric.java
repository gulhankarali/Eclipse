package day41_abstraction_interface;

public interface Electric {

	public abstract void charge();
	
	public static final boolean HAS_BATTERIES= true;
	
	boolean HAS_BATTERIES2= true; //automatically public static final 
	
	void charge2(); // automatically public abstract
	
	public default void methodA() {
		
	}
	
	public static void methodB() {
		
	}
	
}
