import javafx.animation.Transition;

import java.util.ArrayList;
import java.util.List;

public class State {

    private List<TransitionFunction> transitions = new ArrayList<>();
    private List<OutputFunction> outputs = new ArrayList<>();

    public void addTransition(TransitionFunction transition) {
        this.transitions.add(transition);
    }

    public void addOutput(OutputFunction output) {
        this.outputs.add(output);
    }

    public void removeTransition(TransitionFunction transition){
        transitions.remove(transition);
    }

    public void removeOutput(OutputFunction output){
        outputs.remove(output);
    }

    public List<TransitionFunction> getTransition() {
        return transitions;
    }

    public List<OutputFunction> getOutput() {
        return outputs;
    }
}
