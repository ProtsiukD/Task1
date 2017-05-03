package homework;

/**
 * Created by prots on 03.05.2017.
 */
public class Tariff {
    private String country;
    private double time;
    Tariff(String country, double time){
        this.country=country;
        this.time=time;
    }
    public double payment(){
        double cost = 0;
        double tariff1 = 0.33, tariff2 = 0.5, tariff3 = 0.9;
        if(country == "Ukraine"){
            cost = time * tariff1;
        }
        if(country == "USA"){
            cost = time * tariff2;
        }
        if(country == "British"){
            cost = time * tariff3;
        }
        return cost;
    }

    public static void main(String[] args) {
        Tariff tariff1 = new Tariff("Ukraine", 12.9);
        Tariff tariff2 = new Tariff("USA", 23.98);
        Tariff tariff3 = new Tariff("British", 1.67);

        System.out.printf("Cost = "+"%.2f",tariff1.payment());
        System.out.println(". Country "+tariff1.country+", time "+tariff1.time);
        System.out.printf("Cost = "+"%.2f",tariff2.payment());
        System.out.println(". Country "+tariff2.country+", time "+tariff2.time);
        System.out.printf("Cost = "+"%.2f",tariff3.payment());
        System.out.println(". Country "+tariff3.country+", time "+tariff3.time);
    }
}
