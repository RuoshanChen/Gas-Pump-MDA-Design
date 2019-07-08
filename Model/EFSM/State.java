package Model.EFSM;


//This class is the abstract State superclass in the De-centralized State Design Pattern

public abstract class State {
    StateMachine model;

    public State(StateMachine model) {
        this.model = model;
    }

    void activate()         {notAllowed();}
    void start()            {notAllowed();}

    /*
        credit: t=1
        cash:   t=2
        debit: t=3
     */
    void payType(int t)     {notAllowed();}
    void approve()          {notAllowed();}
    void reject()           {notAllowed();}
    /*
        Regular:    g=1
        Super:      g=2
        Premium:    g=3
        Diesel: 	g=4
     */
    void selectGas(int g)   {notAllowed();}
    void cancel()           {notAllowed();}
    void startPump()        {notAllowed();}
    void pump()             {notAllowed();}
    void stopPump()         {notAllowed();}
    void receipt()          {notAllowed();}
    void noReceipt()        {notAllowed();}
    void IncorrectPin()		{notAllowed();}
    void CorrectPin()		{notAllowed();}
    void StorePin()			{notAllowed();}
    void pin(String p)		{notAllowed();}
    void Continue()			{notAllowed();}
    /*
        Print a "not allowed" message
     */
    private void notAllowed() {
        System.out.println("OPERATION NOT ALLOWED IN THIS STATE");
    }
}
