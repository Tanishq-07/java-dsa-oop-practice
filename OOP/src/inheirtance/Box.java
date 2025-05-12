package inheirtance;

public class Box {
    double l ;
    double h ;
    double w ;

    Box() {
        this.l = -1;
        this.h = -1;
        this.w = -1;
    }

    public  Box(double l, double h, double w) {
        this.l = l;
        this.h = h;
        this.w = w;
    }

    //Cube
    Box(double side){
        this.l = side;
        this.w = side;
        this.h = side;
    }

    Box(Box old){
        this.l = old.l;
        this.w = old.w;
        this.h = old.h;
    }

    public void information(){
        System.out.println("Running the box");
    }

}
