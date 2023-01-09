public abstract class Food {
    protected String name;
    protected float price;

    Food(String name){
        this.name=name;
    }

    public String getName() {
        return name;
    }

    public float getPrice() {
        return price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract void setPrice(float price);
}
