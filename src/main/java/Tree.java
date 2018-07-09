import java.util.ArrayList;

public class Tree {
    private State state;
    private ArrayList<Leaf> leaves = new ArrayList<>();

    public Tree(){
        state = State.NEW;
    }

    public void changeState() {
        state = state.doNext(this);
    }

    public void printState(){
        System.out.printf("%-9s: ", state);
        System.out.println(this);
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
    public int hashCode(){
        int result = 17;
        result = 31 * result + ((state == null) ? 0 : state.hashCode());
        result = 31 * result + ((leaves == null) ? 0 : leaves.hashCode());
        return result;
    }

    @Override
    public String toString(){
        StringBuilder resultString = new StringBuilder("Tree has " + leaves.size() + " leaves: {");
        for (int i = 0; i < leaves.size(); i++){
            resultString.append(leaves.get(i) +  ",");
        }
        resultString.append("}");
        return resultString.toString();
    }

    public ArrayList<Leaf> getLeaves() {
        return leaves;
    }

    public void setLeaves(ArrayList<Leaf> leaves) {
        this.leaves = leaves;
    }
}

