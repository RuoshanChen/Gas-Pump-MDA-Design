package Model.EFSM;


class S8 extends State {

    S8(StateMachine model) {
        super(model);
    }
    /*
    Transition to State S0 and call WrongPinMsg() meta-actions
 */
@Override
void IncorrectPin() {
    if (model.s == model.LS[8]) {
        model.s = model.LS[0];
        model.getOP().WrongPinMsg();
    }
}

/*
    Transition to State S0 and call DisplanMenu() meta-actions
 */
@Override
void CorrectPin() {
    if (model.s == model.LS[8]) {
        model.s = model.LS[3];
        model.getOP().DisplayMenu();
    }
    
}
}