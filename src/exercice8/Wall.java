package exercice8;

public class Wall {
    private double width;
    private double height;

    // no args constructor:
    Wall(){
        this.width = 0;
        this.height = 0;
    }

    // args constructor:
    Wall(double width, double height){
        if (width<0){
            this.width = 0;
        }
        else{
            this.width = width;
        }
        if (height<0){
            this.height = 0;
        }
        else {
            this.height = height;
        }
    }

    // getters:
    public double getWidth(){
        return this.width;
    }

    public double getHeight(){
        return this.height;
    }

    // setters:
    public void setWidth(double width){
        if (width < 0){
            this.width = 0;
        }
        else{
            this.width = width;
        }
    }

    public void setHeight(double height){
        if (height < 0){
            this.height = 0;
        }
        else{
            this.height = width;
        }
    }

    public double getArea(){
        return this.width*this.height;
    }

    // the main function for testing:
    public static void main(String[] args){
        Wall w1 = new Wall(4,5);

        System.out.println("area= " + w1.getArea());

        w1.setHeight(-1.5);
        System.out.println("width = " + w1.getWidth());
        System.out.println("height = " + w1.getHeight());
        System.out.println("area = " + w1.getArea());


    }


}
