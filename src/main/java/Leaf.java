class Leaf {

    private enum LeafColor {GREEN, YELLOW}
    private LeafColor color;

    public Leaf(){
        color = LeafColor.GREEN;
    }
    void turnYellow(){
        color = LeafColor.YELLOW;
    }

}
