import lombok.Setter;
import lombok.Getter;
import java.util.ArrayList;


public class Tree {

    private State state;
    @Setter @Getter
    private ArrayList<Leaf> leaves = new ArrayList<>();

    public Tree(){
        state = State.NEW;
    }
    public void changeState() { state = state.doNext(this);
    }
    @Override
    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof Tree))
            return false;
        Tree anotherTree = (Tree) o;
        return anotherTree.leaves.size() == leaves.size() && anotherTree.state == state;
    }
    @Override
    public String toString(){
        StringBuilder resultString = new StringBuilder("Tree has " + leaves.size() + " leaves: {");
        for (int i = 0; i < leaves.size(); i++){
            resultString.append("[" + leaves.get(i) + "]" +  ",");
        }
        resultString.append("}");
        return resultString.toString();
    }
}

