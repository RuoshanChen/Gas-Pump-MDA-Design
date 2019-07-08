package ActionStrategy.InitializeData;

import PlatformData.Data;
/*initialize price and cash*/
public abstract class InitializeData {
    Data data;

    public InitializeData(Data data) {
        this.data = data;
    }

    public abstract void initializeData();
}
