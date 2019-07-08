package ActionStrategy.WrongPinMsg;

/* This class is the factory that produces the necessary driver objects for GasPump1
    Instantiates the proper action strategies with the shared data structure
    OutputProcessor object will be instantiated with an object of this class when it needs to
    display output for GasPump1. Output processor will call the methods provided by this class in order to bind
    GasPump2 specific actions.*/

public abstract class WrongPinMsg {
	public WrongPinMsg(){
	}
	public abstract void wrongPinMsg();
	
}
