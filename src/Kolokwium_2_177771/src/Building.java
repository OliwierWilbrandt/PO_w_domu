public class Building {
    protected double height;
    protected String color;

    public Building(double height,String color){
        this.height=height;
        this.color=color;
    }

    @Override
    public String toString() {
        return "Building: height="+height+" color="+color;
    }

}