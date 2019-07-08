package Model.OutputProcessor;

import AbstractFactory.AbstractFactory;
import ActionStrategy.PayMsg.PayMsg;
import ActionStrategy.PumpGasUnit.PumpGasUnit;
import ActionStrategy.StopMsg.StopMsg;
import ActionStrategy.StoreCash.StoreCash;
import ActionStrategy.CancelMsg.CancelMsg;
import ActionStrategy.DisplayMenu.DisplayMenu;
import ActionStrategy.EnterPinMsg.EnterPinMsg;
import ActionStrategy.GasPumpedMsg.GasPumpedMsg;
import ActionStrategy.PrintReceipt.PrintReceipt;
import ActionStrategy.ReadyMsg.ReadyMsg;
import ActionStrategy.RejectMsg.RejectMsg;
import ActionStrategy.ReturnCash.ReturnCash;
import ActionStrategy.SetInitialValues.SetInitialValues;
import ActionStrategy.SetPrice.SetPrice;
import ActionStrategy.StoreData.StoreData;
import ActionStrategy.StorePin.StorePin;
import ActionStrategy.WrongPinMsg.WrongPinMsg;
import ActionStrategy.InitializeData.InitializeData;
/*
    This class is the general output processor for the gas pump system.
    It must be initialized with the proper action implementations for the specific
    gas pump that is desired. This is done thorough the Abstract Factory design pattern.

    Each meta-action in this class calls the platform specific implementation of the action

    This class acts as the "Client" class in the strategy design pattern
 */
public class OutputProcessor {
    private CancelMsg cancelMsg;
    private DisplayMenu displayMenu;
    private GasPumpedMsg gasPumpedMsg;
    private PayMsg payMsg;
    private PrintReceipt printReceipt;
    private PumpGasUnit pumpGasUnit;
    private ReadyMsg readyMsg;
    private RejectMsg rejectMsg;
    private ReturnCash returnCash;
    private SetInitialValues setInitialValues;
    private SetPrice setPrice;
    private StopMsg stopMsg;
    private StoreCash storeCash;
    private StoreData storeData;
    private WrongPinMsg wrongPinMsg;
    private InitializeData intializeData;
    private EnterPinMsg enterPinMsg;
    private StorePin storePin;
    

    public OutputProcessor(AbstractFactory af) {
        this.cancelMsg = af.getCancelMsg();
        this.displayMenu = af.getDisplayMenu();
        this.gasPumpedMsg = af.getGasPumpedMsg();
        this.payMsg = af.getPayMsg();
        this.printReceipt = af.getPrintReceipt();
        this.pumpGasUnit = af.getPumpGasUnit();
        this.readyMsg = af.getReadyMsg();
        this.rejectMsg = af.getRejectMsg();
        this.returnCash = af.getReturnCash();
        this.setInitialValues = af.getSetInitialValues();
        this.setPrice = af.getSetPrice();
        this.stopMsg = af.getStopMsg();
        this.storeCash = af.getStoreCash();
        this.storeData = af.getStoreData();
        this.wrongPinMsg = af.getWrongPinMsg();
        this.intializeData = af.getInitializeData();
        this.enterPinMsg = af.getEnterPinMsg();
        this.storePin = af.getStorePin();
        
    }

    /*
     *  Meta-actions (implemented using Strategy pattern)
     */

    public void CancelMsg() {
        this.cancelMsg.cancelMsg();
    }

    public void DisplayMenu() {
        this.displayMenu.displayMenu();
    }

    public void GasPumpedMsg() {
        this.gasPumpedMsg.gasPumpedMsg();
    }

    public void PayMsg() {
        this.payMsg.payMsg();
    }

    public void PrintReceipt() {
        this.printReceipt.printReceipt();
    }

    public void PumpGasUnit() {
        this.pumpGasUnit.pumpGasUnit();
    }

    public void ReadyMsg() {
        this.readyMsg.readyMsg();
    }

    public void RejectMsg() {
        this.rejectMsg.rejectMsg();
    }

    public void ReturnCash() {
        this.returnCash.returnCash();
    }

    public void SetInitialValues() {
        this.setInitialValues.setInitialValues();
    }

    public void SetPrice(int g) {
        this.setPrice.setPrice(g);
    }

    public void StopMsg() {
        this.stopMsg.stopMsg();
    }

    public void StoreCash() {
        this.storeCash.storeCash();
    }

    public void StoreData() {
        this.storeData.storeData();
    }
    
    public void WrongPinMsg() {
        this.wrongPinMsg.wrongPinMsg();
    }
    
    public void InitializeData() {
        this.intializeData.initializeData();
    }
    
    public void EnterPinMsg() {
        this.enterPinMsg.enterPinMsg();
    }
    
    public void StorePin() {
        this.storePin.storePin();
    }

}
