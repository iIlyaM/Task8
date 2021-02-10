package common;

import java.io.BufferedWriter;

public class FileWriter {

    public static void writeFile(int[][] arr) throws Exception {
        StringBuilder sBuilder = new StringBuilder();
        for(int row = 0; row < arr.length; row++) {
            for(int col = 0; col < arr[row].length; col++) {
                sBuilder.append(arr[row][col] + ", ");
            }
            sBuilder.append("\n");
        }

        BufferedWriter bWriter = new BufferedWriter(new java.io.FileWriter("output.txt"));
        bWriter.write(sBuilder.toString());
        bWriter.close();
    }
}
