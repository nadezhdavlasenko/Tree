
class Leaf {
    private enum LeafColor {GREEN, YELLOW}
    private LeafColor color;

    public Leaf(){
        color = LeafColor.GREEN;
    }
    void turnYellow(){
        color = LeafColor.YELLOW;
    }
    @Override
    public boolean equals(Object o){
        if (o == this) return true;
        if (!(o instanceof Leaf))
            return false;
        return ((Leaf) o).color == this.color;
    }
    @Override
    public String toString(){
        return (this.color + " leaf").toLowerCase();
    }
    @Override
    public int hashCode(){
        int result = 17;

        return result;
    }
}
