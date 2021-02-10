package console;

import common.FileReader;
import common.FileWriter;
import common.ArraySorter;
import util.Convertors;

import java.util.*;

public class ConsoleMain {

    public static void main(String[] args) throws Exception {
        int[][] primaryArr = Convertors.toIntArray(Convertors.toStringArray
                (FileReader.readFile("tests/" + readFileName() + ".txt")));
        int[][] sortedArr = ArraySorter.sortArray(primaryArr);
        FileWriter.writeFile(sortedArr);
    }

    private static String readFileName() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter name of file here: ");
        return sc.nextLine();
    }
}