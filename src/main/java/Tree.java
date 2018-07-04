import lombok.Data;

import java.util.ArrayList;

public class Tree {
    private ArrayList<Leaf> leaves = new ArrayList<>();
    public void blossom(){}
    public void fallLeaves(){
        leaves.clear();
    }
    public void frost(){}
    public void yellowingLeaves(){
        for (Leaf leaf: leaves
             ) {
            leaf.turnYellow();
        }
    }
}

