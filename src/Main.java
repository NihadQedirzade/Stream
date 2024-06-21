import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//Stream
//1.Listdəki Stringleri uzunluguna gore siralayin
//2.Listdeki ededleri tek ve cut olaraq qrublasdir
//3.Listdeki Stringleri boyuk herflere cevirin
//4.Massivdeki elementlerin kublarinin cemini tapin
//5.Listdeki Stringlerin uznlluqlari 5-den boyuk olanlari fitrleyin
//6.Listdeki Stringleri uzunluqlarina gore qruplasdirin
public class Main {
    public static void main(String[] args) {
//sual 1
/*
                List<String> meyveler = new ArrayList<>();
                meyveler.add("alma");
                meyveler.add("heyva");
                meyveler.add("nar");
                meyveler.add("uzum");
                meyveler.add("kivi");
                meyveler.add("banan");
                List<String> yeniversiya = meyveler.stream().sorted((s1, s2) -> Integer.compare(s1.length(), s2.length())).toList();

                for (String str : yeniversiya) {
                    System.out.println(str);
                }

*/
        //sual 2
/*       List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);
        numbers.add(7);
        numbers.add(8);
        numbers.add(9);
        numbers.add(10);

        List<Integer> cutler = numbers.stream().filter(n -> n % 2 == 0).toList();
        List<Integer> tekler = numbers.stream().filter(n -> n % 2 != 0).toList();

        System.out.println(cutler);
        System.out.println(tekler);
*/

        //sual3
/*
        List<String> meyveler = new ArrayList<>();
        meyveler.add("alma");
        meyveler.add("heyva");
        meyveler.add("nar");
        meyveler.add("uzum");
        meyveler.add("kivi");
        meyveler.add("banan");
        List<String> yeniversiya = meyveler.stream().map(String::toUpperCase).toList();

        for (String str : yeniversiya) {
            System.out.println(str);
        }
*/

        //sual 4
/*

        int[] numbers = {1, 2, 3, 4, 5};

        int kublarii = Arrays.stream(numbers).map(n -> n * n * n).sum();

        System.out.println("kublari : " + kublarii);

*/

        //sual 5
        /*
        List<String> strings = new ArrayList<>();
        strings.add("afre");
        strings.add("heyvaqede");
        strings.add("nwfar");
        strings.add("uzuwerfm");
        strings.add("kivrq  i");
        strings.add("banfrean");
        List<String> filterStrings =strings.stream()
                .filter(s -> s.length() > 5).toList()

        filterStrings.forEach(System.out::println);
*/
        //sual 6

    }}