package common;

import java.io.BufferedReader;
import java.util.ArrayList;
import java.util.List;


public class FileReader {

    public static List<String> readFile(String fileName) throws Exception {
        BufferedReader bReader = new BufferedReader(new java.io.FileReader(fileName));
        String str;
        List<String> list = new ArrayList<>();
        while ((str = bReader.readLine()) != null) {
            if (!str.isEmpty()) {
                list.add(str);
            }
        }
        bReader.close();

        return list;
    }
}
