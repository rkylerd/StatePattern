public class NoGumballQuarter extends GumballMachineState {
    public void removeQuarter(GumballMachine machine) {
        machine.setQuarterInSlot(false);
    }

    public void enter(GumballMachine machine) {
        machine.setState(new NoGumballQuarter());
    }

    public void exit(GumballMachine machine) {
        machine.setState(null);
    }
}
