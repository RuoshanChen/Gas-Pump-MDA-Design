package ActionStrategy.StorePin;

import PlatformData.Data;

/*
    Abstract StorePin action strategy
    Groups all "Store Pin" actions under 1 abstract superclass
 */
public abstract class StorePin {
    Data data;

    public StorePin() {
    }


    public StorePin(Data  data) {
        this.data = data;
    }

    public abstract void storePin();
}
