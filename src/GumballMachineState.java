public abstract class GumballMachineState {

    public void addGumballs(GumballMachine machine, int count) {
        machine.incrementGumballQty(count);
    }

    public void insertQuarter(GumballMachine machine) {}

    public void removeQuarter(GumballMachine machine) {}

    public void turnHandle(GumballMachine machine) {}

    public void enter(GumballMachine machine) {}

    public void exit(GumballMachine machine) {}

}
