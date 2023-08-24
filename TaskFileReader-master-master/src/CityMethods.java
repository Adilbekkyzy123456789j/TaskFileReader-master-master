import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

public interface CityMethods {
    List<City> readFile() throws FileNotFoundException;

    void printAllCities(List<City> cities);

    void groupByRegion(List<City> cities);

    void searchByName(String name);
}
