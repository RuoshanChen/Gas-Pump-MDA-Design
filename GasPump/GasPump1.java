package GasPump;

import AbstractFactory.AbstractFactory;
import PlatformData.DataGasPump1;
import PlatformData.DataGasPump2;

/*
    This class is the InputProcessor for GasPump1
 */
public class GasPump1 extends GasPump {
    public GasPump1(AbstractFactory af) {
        super(af);
    }

    /*
        Print a menu of supported operations
     */
    @Override
    public void printOperations() {
        System.out.println(
                        "*********************************************************************" +
                        "\nSelect operation: " +
                        "\n(0) Activate(float a, float b) " +
                        "\n(s) Start " +
                        "(1) PayCredit " +
                        "(2) PayDebit " +
                        "(3) Pin" +
                        "(4) Continue"+
                        "\n(5) Approve " +
                        "(6) Reject " +
                        "(7) Regular " +
                        "\n(8) Diesel " +
                        "(9) Cancel " +
                        "(10) StartPump" +
                        "\n(11) PumpGallon " +
                        "(12) StopPump" +
                        "(13) FullTank" +
                        "{q} Quit the program " +
                        "\n*********************************************************************"
        );
    }

    /*
        Check the input parameters for correctness, and call the
        activate() meta-event of the EFSM model

        If input is incorrect, print a message indicating as such

        @param a: price of Regular gas
        @param b: price of Diesel gas1
     */
    public void Activate(float a, float b) {
        if (a > 0 && b > 0) {
            DataGasPump1 d = (DataGasPump1) this.data;
            d.a = a;
            d.b = b;
            model.activate();
        } else {
            System.out.println("Activation failed!");
            System.out.println("Prices must be greater than $0");
        }
    }

    /*
        Call the start() meta-event of the EFSM model
     */
    public void Start() {
        model.start();
    }

    /*
        Call the payType() meta-event of the EFSM model,
        passing in "1" as the payment type which represents credit payment under the model design

        Also print a credit card authentication message
     */
    public void PayCredit() {
    	DataGasPump1 d = (DataGasPump1) data;
        model.payType(1);
        d.M = 1;
        System.out.println("PLEASE WAIT -- AUTHENTICATING CREDIT CARD");
    }
    /* Pay Debit funciton
     */
     
    public void PayDebit(String pin) {
    	DataGasPump1 d = (DataGasPump1) data;
    	d.temp_pin = pin;
    	d.M = 0;
    	model.payType(3);
    }

    
    public void Pin(String pin) {
    	DataGasPump1 d = (DataGasPump1) data;
    	if (d.pin.equals(pin)) {
    		model.CorrectPin();
    	}	
    	else{
    		model.IncorrectPin();
    	}
    }
    
    public void PayCash(float cash) {
        if (cash > 0) {
            DataGasPump2 d = (DataGasPump2) data;
            d.temp_cash = cash;
            d.M = 0;
            model.payType(2);
        } else {
            System.out.println("Cash amount must be greater than $0");
        }
    }
    /*
        Call the approve() meta-event of the EFSM model
     */
    public void Approve() {
        model.approve();
    }
    public void Continue() {
        model.Continue();
    }
   
    /*
        Call the reject() meta-event of the EFSM model
     */
    public void Reject() {
        model.reject();
    }

    /*
        Call the cancel() meta-event of the EFSM model
     */
    public void Cancel() {
        model.cancel();
    }

    /*
        Call the selectGas() meta-event of the EFSM model,
        passing in 1 as the gas-type
     */
    public void Regular() {
        model.selectGas(1);
    }

    /*
        Call the selectGas() meta-event of the EFSM model,
        passing in 2 as the gas-type
     */
    public void Diesel() {
        model.selectGas(2);
    }

    /*
        Call the startPump() meta-event of the EFSM model
     */
    public void StartPump() {
        model.startPump();
    }

    /*
        Call the pump() meta-event of the EFSM model
     */
    public void PumpGallon() {
        model.pump();
    }

    /*
        call the stopPump() and receipt() meta-events of the EFSM model
	*/
    
    public void StopPump() {
        model.stopPump();
        model.receipt();
    }
    
    public void FullTank() {
    	model.stopPump();
        model.receipt();
    }
}
