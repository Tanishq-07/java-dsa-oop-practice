package inheirtance;

public class BoxPrice extends BoxWeight{
    double price ;

    public BoxPrice() {
        super();
        this.price = -1 ;
    }

    public BoxPrice(double price) {
        super();
        this.price = price;
    }

    public BoxPrice(double l, double h, double w, double weight, double price) {
        super(l, h, w, weight);
        this.price = price;
    }
}