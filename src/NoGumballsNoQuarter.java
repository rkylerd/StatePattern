public class NoGumballsNoQuarter extends GumballMachineState {

    public void insertQuarter(GumballMachine machine) {
        machine.setQuarterInSlot(true);
    }

    public void enter(GumballMachine machine) {
        machine.setState(new NoGumballsNoQuarter());
    }

    public void exit(GumballMachine machine) {
        machine.setState(null);
    }
}
