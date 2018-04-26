
import javax.swing.*;
import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;


public class Main {


    public static void main(String[] args) throws IOException, SQLException, InterruptedException {
        int loops = Integer.parseInt(args[0]);

       //int loops = Integer.parseInt(JOptionPane.showInputDialog("Input number of rows"));

        DBConnect dbConnect = new DBConnect();
        Connection dbconn = dbConnect.connectdb();

        Timer timer = new Timer();
        String startTestTime = timer.getDbTime(dbconn);


        TestDataFactory testDataFactory = new TestDataFactory();
        testDataFactory.createTestData(loops);



//        InsertFactory insertFactory = new InsertFactory();
//        insertFactory.addValues(dbconn);

//        CsvReader csvReader = new CsvReader();
//        csvReader.csvBuffer();


        BulkInsert bulkInsert =new BulkInsert();
        bulkInsert.setBulkCopy(dbconn);
        Thread.sleep(1000);

        String endtTestTime = timer.getDbTime(dbconn);

        CalculateTPS.calculateTPS(startTestTime,endtTestTime,loops);

        dbconn.close();





    }
}


