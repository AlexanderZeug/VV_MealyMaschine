public class TransitionFunction {

    private State sourceState;
    private State targetState;

    public TransitionFunction(State sourceState, State targetState) {
        this.sourceState = sourceState;
        this.targetState = targetState;
    }

    public State getSourceState() {
        return sourceState;
    }

    public void setSourceState(State sourceState) {
        this.sourceState = sourceState;
    }

    public State getTargetState() {
        return targetState;
    }

    public void setTargetState(State targetState) {
        this.targetState = targetState;
    }
}
