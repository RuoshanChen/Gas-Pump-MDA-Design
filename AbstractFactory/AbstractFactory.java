package AbstractFactory;

import ActionStrategy.CancelMsg.CancelMsg;
import ActionStrategy.DisplayMenu.DisplayMenu;
import ActionStrategy.EnterPinMsg.EnterPinMsg;
import ActionStrategy.GasPumpedMsg.GasPumpedMsg;
import ActionStrategy.InitializeData.InitializeData;
import ActionStrategy.PayMsg.PayMsg;
import ActionStrategy.PrintReceipt.PrintReceipt;
import ActionStrategy.PumpGasUnit.PumpGasUnit;
import ActionStrategy.ReadyMsg.ReadyMsg;
import ActionStrategy.RejectMsg.RejectMsg;
import ActionStrategy.ReturnCash.ReturnCash;
import ActionStrategy.SetInitialValues.SetInitialValues;
import ActionStrategy.SetPrice.SetPrice;
import ActionStrategy.StopMsg.StopMsg;
import ActionStrategy.StoreCash.StoreCash;
import ActionStrategy.StoreData.StoreData;
import ActionStrategy.StorePin.StorePin;
import ActionStrategy.WrongPinMsg.WrongPinMsg;
import PlatformData.Data;

/*
    This class groups all ConcreteFactory classes under 1 abstract superclass
    It defines the methods that return the GasPump specific action components which
    all ConcreteFactories need to implement

 */
public abstract class AbstractFactory {

    public abstract Data getDataObj();

    public abstract CancelMsg getCancelMsg();

    public abstract DisplayMenu getDisplayMenu();

    public abstract GasPumpedMsg getGasPumpedMsg();

    public abstract PayMsg getPayMsg();

    public abstract PrintReceipt getPrintReceipt();

    public abstract PumpGasUnit getPumpGasUnit();

    public abstract ReadyMsg getReadyMsg();

    public abstract RejectMsg getRejectMsg();

    public abstract ReturnCash getReturnCash();

    public abstract SetInitialValues getSetInitialValues();

    public abstract SetPrice getSetPrice();

    public abstract StopMsg getStopMsg();

    public abstract StoreCash getStoreCash();

    public abstract StoreData getStoreData();
    
    public abstract WrongPinMsg getWrongPinMsg();
    
    public abstract InitializeData getInitializeData();
    
    public abstract EnterPinMsg getEnterPinMsg();
    
    public abstract StorePin getStorePin();
    
    
}