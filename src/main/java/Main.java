import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
//        Leaf leaf1 = new Leaf();
//        Leaf leaf2 = new Leaf();
//        System.out.println(leaf1.equals(leaf2));
//        leaf1.turnYellow();
//        System.out.println(leaf1.equals(leaf2));
//        leaf2.turnYellow();
//        System.out.println(leaf2.equals(leaf1));
//
//        System.out.println(leaf1 + " " + leaf2);

        Tree tree1 = new Tree();
        Tree tree2 = new Tree();
        System.out.println("tree1=tree2: " + tree1.equals(tree2));

        for (int i = (int) (Math.random()*5+1); i > 0; i--) {
            tree1.changeState();
            tree2.changeState();
        }
        System.out.println("tree1=tree2: " + tree1.equals(tree2));
//
//        tree1.blossom();
//        tree1.yellowingLeaves();
//        tree1.fallLeaves();
//        tree1.frost();
//
//        System.out.println("tree1=tree2: " + tree2.equals(tree1));

    }
}
