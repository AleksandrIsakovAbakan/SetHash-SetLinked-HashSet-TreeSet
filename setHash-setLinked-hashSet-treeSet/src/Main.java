import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        String[] stringsOne = {"red", "orange", "blue", "purple", "white", "black"};
        String[] stringsTwo = {"red", "yellow", "green", "blue", "purple", "white", "black"};
        HashSet<String> hashSetOne = new HashSet<>(List.of(stringsOne));
        LinkedHashSet<String> hashSetTwo = new LinkedHashSet<>(List.of(stringsTwo));
        System.out.println(comparingTwoSetsAndKeepingElementsThatSame( hashSetOne, hashSetTwo));

        Integer[] ints ={1, 0, 5, 8, 9, 15, 26, 48, 96, 155, 999, -5, -55, -48};
        Set<Integer> integerSet = new HashSet<>(List.of(ints));
        outputToConsoleElementsFromSetIntegers(integerSet);
    }

    /*
    Создайте два набора, хранящих в себе элементы строкового типа, характеризующие цвет чего – либо.
    Напишите метод для сравнения двух наборов и сохранения элементов, которые одинаковы для обоих наборов.
    */
    public static Set<String> comparingTwoSetsAndKeepingElementsThatSame(Set<String> hashSetOne,
                                                                         Set<String> hashSetTwo){
        HashSet<String> result = new HashSet<>();
        for (String string : hashSetOne){
            if (hashSetTwo.contains(string)) result.add(string);
        }
        return result;
    }

    /*
    Создайте множество целых чисел.
    Необходимо вывести в консоль все его элементы, которые больше 15 и являются четными.
    Остальные элементы набора тоже необходимо вывести в консоль, но каждый из них разделив на 2.
    */
    public static void outputToConsoleElementsFromSetIntegers(Set<Integer> set){

        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        for (Integer integer : set){
            if ((integer > 15) && (integer % 2 == 0)){
                set1.add(integer);
            } else {
                set2.add(integer / 2);
            }
        }

        System.out.println("Элементы множества целых чисел, которые больше 15 и являются четными:" + set1);
        System.out.println("Остальные элементы набора, но каждый из них разделен на 2: " + set2);
    }
}
