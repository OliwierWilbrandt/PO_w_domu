public class House extends Building {
    private int numberofRooms;

    public House(double height,String color, int numberofRooms) {
        super(height,color);
        this.numberofRooms=numberofRooms;
    }

    @Override
    public String toString() {
        return "Building: height="+height+" color="+color+" numberofRooms="+numberofRooms;
    }
}
