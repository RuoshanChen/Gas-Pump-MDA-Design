package PlatformData;

/*
    GasPump2 data storage object responsible for storing key platform-specific data that must be shared between
    system components

    NOTE: For the sake of shorter code and simplicity, fields are accessed directly, instead of through getters and setters
 */
public class DataGasPump2 extends Data {
    public String   gasType;
    public float    R_price;
    public float    S_price;
    public float    P_price;
    public float    D_price;
    public float    cash;
    public float    price;
    public int      L;
    public float    total;
    public int      M;


    // temporary variables
    public float a;
    public float b;
    public float c;
    public float temp_cash;
}
