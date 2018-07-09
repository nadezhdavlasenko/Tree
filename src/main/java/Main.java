

public class Main {
    //Equal objects must have equal hash codes
    public static void test(Object obj1, Object obj2){
        String equalsString = "obj1.equals(obj2):                 ";
        String hashString = "leaf1.hashCode() == obj2.hashCode(): ";
        if (obj1 instanceof Leaf && obj2 instanceof Leaf){
            equalsString = "leaf1.equals(leaf2):                 ";
            hashString = "obj1.hashCode() == leaf2.hashCode(): ";
        }else if (obj1 instanceof Tree && obj2 instanceof Tree){
            equalsString = "tree1.equals(tree2):                  ";
            hashString = "tree1.hashCode() == tree2.hashCode(): ";
        }
        System.out.println("__________________________________________");
        System.out.println(obj1 + ", " + obj2);
        System.out.print(equalsString);
        System.out.println(obj1.equals(obj2));
        System.out.print(hashString);
        System.out.println(obj1.hashCode() == obj2.hashCode());
        System.out.println("__________________________________________");
    }

    public static void main(String[] args) {

        Leaf leaf1 = new Leaf();
        Leaf leaf2 = new Leaf();
        test(leaf1,leaf2);
        leaf1.turnYellow();
        test(leaf1,leaf2);

        Tree tree1 = new Tree();
        Tree tree2 = new Tree();
        test(tree1, tree2);
        for (int i = 3; i > 0; i--) {
        //for (int i = (int) (Math.random()*5+2); i > 0; i--) {
            tree1.changeState();
            tree2.changeState();
        }
        test(tree1, tree2);

    }
}
