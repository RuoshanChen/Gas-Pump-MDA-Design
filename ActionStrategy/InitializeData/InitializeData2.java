package ActionStrategy.InitializeData;

import PlatformData.Data;
import PlatformData.DataGasPump2;

public class InitializeData2 extends InitializeData {

    public InitializeData2(Data data) {
        super(data);
    }

    /*
        Set the cash and price initially to zero for this transaction
     */
    @Override
    public void initializeData() {
        DataGasPump2 d = (DataGasPump2) data;
        d.price = 0;
        d.cash = 0;
    }
}
