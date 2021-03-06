public class GumballsNoQuarter extends GumballMachineState {

    public void insertQuarter(GumballMachine machine) {
        machine.setQuarterInSlot(true);
    }

    public void enter(GumballMachine machine) {
        machine.setState(new GumballsNoQuarter());
    }

    public void exit(GumballMachine machine) {
        machine.setState(null);
    }
}
