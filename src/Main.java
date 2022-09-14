import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args){
        City[]cities={new City(-1,"Bishkek"),new City(-2,"Tokmok"),new City(-4,"Osh"),new City(2,"Kara-Balta"),new City(-5,"Kadamzhay"),new City(1,"safdsaf")};
        Set<City> set=new TreeSet<>();
        for (City city:cities){
           if(city.getCode()<0){ set.add(city);}
        }
        for (City city: set) {
            System.out.println(city+"\n");
        }
    }
}