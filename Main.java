import java.util.*;

public class Main {
    public static void main(String[] args) {
        String boringString = "abbccCDdBCCcc";
        List<Integer> sIndexes = new ArrayList<>();
        List<Integer> eIndexes = new ArrayList<>();

        sIndexes.add(1);
        sIndexes.add(5);
        sIndexes.add(7);
        sIndexes.add(11);

        eIndexes.add(3);
        eIndexes.add(5);
        eIndexes.add(10);
        eIndexes.add(12);

        StringFunifier funifier = new StringFunifier(boringString, sIndexes, eIndexes);
        String funnyString = funifier.getFunnyString();
        System.out.println(funnyString);
    }
}