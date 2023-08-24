// TODO: 19.08.2023
//  Реализовать readFile(). Логика проста...
//  Вытащить данные из текстового файла и записать их к объекту класса City.
//  Небольшая подсказказка можно использовать метод .split() класса String.

import java.io.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

// TODO: 19.08.2023
//  После того как ты закончил предыдущий метод можешь приступить к следуещему.
//  Вся суть printAllCities() заключается в том, что надо вывести все города на консоль.
public class CityMethodsImpl implements CityMethods  {
    @Override
    public  List<City> readFile() throws FileNotFoundException {
        List<City> list = new ArrayList<>();
        try {
            File file = new File("city_ru.csv");
            Scanner scanner =new Scanner(file);
            while (scanner.hasNextLine()) {
                City city = new City();
                List<String> list1 = List.of(scanner.nextLine().split(";"));
                city.setId(Integer.parseInt(list1.get(0)));
                city.setName(list1.get(1));
                city.setRegion(list1.get(2));
                city.setDistrict(list1.get(3));
                city.setPopulation(Integer.parseInt(String.valueOf((list1.get(4)))));
                try {
                    city.setFoundation(String.valueOf((list1.get(5))));
                } catch (ArrayIndexOutOfBoundsException a) {
                    city.setFoundation(null);
                    System.out.println(a.getMessage());
                }
                list.add(city);
            }
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
        return list;
    }
    @Override
    public void printAllCities(List<City> cities) {



    }

    @Override
    public void groupByRegion(List<City> cities) {

    }

    @Override
    public void searchByName(String name) {

    }
}