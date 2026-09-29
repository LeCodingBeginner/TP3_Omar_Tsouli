package exercice9;

public class Point {

    private int x;
    private int y;

    public Point(){
        this.x = 0;
        this.y = 0;
    }

    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }

    // methods:
    // getters:
    public int getX(){
        return x;
    }

    public int getY(){
        return y;
    }

    // setters:
    public void setX(int x){
        this.x = x;
    }

    public void setY(int y){
        this.y = y;
    }

    // distance relative rto (0,0)
    public double distance(){
        return Math.sqrt(Math.pow(this.x,2)+Math.pow(this.y,2));
    }

    // distance relative a point p
    public double distance(Point p){
        return Math.sqrt(Math.pow(this.x-p.x,2)+Math.pow(this.y-p.y,2));
    }

    // distance relative to (x,y)
    public double distance(int x , int y){
        return Math.sqrt(Math.pow(this.x-x,2)+Math.pow(this.y-y,2));
    }

    // main for testing:

    public static void main(String[] args){
        Point p1 = new Point(1,0);
        Point p2 = new Point (0,1);

        System.out.println("La distance de p1 relative à 0 est : "+p1.distance());
        System.out.println("La distance de p1 relative à p2 est : "+p2.distance(p2));
        System.out.println("La distance de p2 relative à 0 est : "+p2.distance());



    }

}
