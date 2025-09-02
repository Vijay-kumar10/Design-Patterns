
interface ProtoType {
    ProtoType getClone();
}

class Car implements ProtoType{
    private String name;
    private String color;

    //constructor to set the values of new car
    public Car(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }
    
    @Override
    public String toString() {
        return "Car [name=" + name + ", color=" + color + "]";
    }

    @Override
    public ProtoType getClone() {
        return new Car(this.name, this.color);
    }
}