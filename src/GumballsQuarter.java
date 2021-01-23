public class GumballsQuarter extends GumballMachineState {

    public void removeQuarter(GumballMachine machine) {
        machine.setQuarterInSlot(false);
    }

    public void turnHandle(GumballMachine machine) {
        machine.addToProfit();
        machine.decrementGumballQty();
    }

    public void enter(GumballMachine machine) {
        machine.setState(new GumballsQuarter());
    }

    public void exit(GumballMachine machine) {
        machine.setState(null);
    }

}
