package ActionStrategy.DisplayMenu;

import PlatformData.Data;
import PlatformData.DataGasPump1;

/*
    GasPump1 DisplayMenu action responsible for printing the main menu
 */
public class DisplayMenu1 extends DisplayMenu {

    public DisplayMenu1(Data data) {
        super(data);
    }

    /*
        Print a menu --> Also serves as the "credit card approved" message
        Also reads the data structure to inform the user of current gas prices
     */
    @Override
    public void displayMenu() {
        DataGasPump1 d = (DataGasPump1) data;
        System.out.println("Please select gas type:");
        System.out.println(
                "(7) Regular [$" + d.R_price + "/gal] " +
                        "\n(8) Diesel [$" + d.S_price + "/gal]");
        System.out.println("Otherwise, select (9) to cancel");
    }
}
