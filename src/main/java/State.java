import java.util.ArrayList;

public enum State {
    NEW {
        @Override
        State doNext(Tree tree) {
            ArrayList<Leaf> leafList = new ArrayList();
            int leavesAmount= 7;
            //int leavesAmount= (int) (Math.random()*9+1);
            while (0 < leavesAmount--){
                leafList.add(new Leaf());
            }
            tree.setLeaves(leafList);
            tree.printState();
            return BLOOM;
        }
    },
    BLOOM {
        @Override
        State doNext(Tree tree) {
            tree.printState();
            return YELLOWING;
        }
    },
    YELLOWING {
        @Override
        State doNext(Tree tree) {
            for (Leaf leaf: tree.getLeaves()
                    ) {
                leaf.turnYellow();
            }
            tree.printState();
            return FALLING;
        }
    },
    FALLING {
        @Override
        State doNext(Tree tree) {
            tree.getLeaves().clear();
            tree.printState();
            return FROSTED;
        }
    },
    FROSTED {
        @Override
        State doNext(Tree tree) {
            tree.printState();
            return NEW;
        }
    };

    abstract State doNext(Tree tree);
}

