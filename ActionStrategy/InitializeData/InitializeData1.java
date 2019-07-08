package ActionStrategy.InitializeData;

import PlatformData.Data;
import PlatformData.DataGasPump1;

public class InitializeData1 extends InitializeData {

    public InitializeData1(Data data) {
        super(data);
    }

    /*
        Set the number of price initially to zero for this transaction
     */
    @Override
    public void initializeData() {
        DataGasPump1 d = (DataGasPump1) data;
        d.price = 0;
    }
}
