public class Pizza extends Food implements Extra {
    private int size;

    Pizza(String name, int size){
        super(name);
        this.size=size;
    }

    @Override
    public void setPrice(float price) {
        this.price=this.size-10;
    }

    @Override
    public float discount() {
        if(getPrice()>=30){
        double i = 0.05;
        return (float) i;
        }
        return 0;
    }

    @Override
    public float delivery(int tip) {
        if(getPrice()>=50){return 8+tip;}
            return 6+tip;
    }

    public float delivery() {
        if(getPrice()>=50){return 8;}
            return 6;
    }
}

