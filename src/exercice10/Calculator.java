package exercice10;

public class Calculator {
    public Floor floor;
    public Carpet carpet;

    public Calculator(Floor floor, Carpet carpet){
        this.floor = floor;
        this.carpet = carpet;
    }

    public double getTotalCost(){
        return this.carpet.getCost()*this.floor.getArea();
    }

    // testing:
    public static void main(String[] args){
        Carpet carpet = new Carpet(3.5);
        Floor floor = new Floor(2.75,4.0);
        Calculator calculator = new Calculator(floor,carpet);
        System.out.println("total = " + calculator.getTotalCost());

        Carpet carpet1 = new Carpet(1.5);
        Floor floor1 = new Floor(5.4,4.5);
        Calculator calculator1 = new Calculator(floor1,carpet1);
        System.out.println("total = " + calculator1.getTotalCost());
    }

}
