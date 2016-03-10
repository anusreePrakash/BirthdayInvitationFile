public class State {
    private final String state;

    public State(String state) {
        this.state = state;
    }

    protected Boolean isSameState(String otherState) {
        return this.state.equals(otherState);
    }
}
