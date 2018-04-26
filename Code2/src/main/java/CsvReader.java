//import java.io.BufferedReader;
//import java.io.FileNotFoundException;
//import java.io.FileReader;
//import java.io.IOException;
//import java.util.ArrayList;
//import java.util.List;
//
//public class CsvReader {
//
//
//    public List csvBuffer() throws IOException {
//
//        String line = null;
//
//
//        List list = new ArrayList<String[]>();
//
//        BufferedReader br = null;
//        try {
//            br = new BufferedReader(new FileReader("../cards.csv"));
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        }
//        while ((line = br.readLine()) != null) {
//
//            list.add(line.split(","));
//
//
//        }
//
//        return list;
//    }
//}
//
//
//
