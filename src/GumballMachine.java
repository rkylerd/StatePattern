public class GumballMachine {

    private long profit;
    private int gumballQty;
    private boolean quarterInSlot;
    private GumballMachineState state;

    public long getProfit() {
        return profit;
    }

    public void addToProfit() {
        this.profit += .25;
    }

    public int getGumballQty() {
        return gumballQty;
    }

    public void incrementGumballQty(int gumballQty) {
        this.gumballQty += gumballQty;
    }

    public void decrementGumballQty() {
        if (gumballQty > 0) {
            gumballQty--;
        }
    }

    public boolean isQuarterInSlot() {
        return quarterInSlot;
    }

    public void setQuarterInSlot(boolean quarterInSlot) {
        this.quarterInSlot = quarterInSlot;
    }

    public GumballMachineState getState() {
        return state;
    }

    public void setState(GumballMachineState newState) {
        if (newState != null) {
            state.exit(this);
        }
        state = newState;

        if (state != null) {
            state.enter(this);
        }
    }

    public boolean addGumballs(int count) {
        state.addGumballs(this, count);
        return false;
    }

    public boolean insertQuarter() {
        state.insertQuarter(this);
        return false;
    }

    public boolean removeQuarter() {
        state.removeQuarter(this);
        return false;
    }

    public void turnHandle() {
        state.turnHandle(this);
    }

}
