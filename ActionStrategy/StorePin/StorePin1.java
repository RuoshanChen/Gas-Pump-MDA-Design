package ActionStrategy.StorePin;

import PlatformData.Data;
import PlatformData.DataGasPump1;

public class StorePin1 extends StorePin {

    public StorePin1 (Data data) {
        super(data);
    }

    /*
        Read the temporarily pin information input by the InputProcessor
        and store it in the cash attribute of the shared data structure.
        Then, print the amount of cash that was inserted
     */
    @Override
    public void storePin() {
        DataGasPump1 d = (DataGasPump1) data;
        d.pin = d.temp_pin;
        System.out.println("Your pin entered is " + d.pin);
        System.out.println("Choose 3 to verify your pin:  ");
    }
}
