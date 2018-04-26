import com.microsoft.sqlserver.jdbc.SQLServerBulkCSVFileRecord;
import com.microsoft.sqlserver.jdbc.SQLServerBulkCopy;
import com.microsoft.sqlserver.jdbc.SQLServerException;


import java.sql.Connection;
import java.sql.Types;

public class BulkInsert {

    public void setBulkCopy(Connection conn)  {
        String csvPath = "./../producttestdata.csv";

        SQLServerBulkCSVFileRecord fileRecord = null;

//        Timer timer = new Timer();
//        timer.dbtime();

        try {
            fileRecord = new SQLServerBulkCSVFileRecord(csvPath, true);

            fileRecord.addColumnMetadata(1, "Name", Types.NVARCHAR, 0, 0);
            fileRecord.addColumnMetadata(2, "ProductNumber", Types.NVARCHAR, 0, 0);
            fileRecord.addColumnMetadata(3, "Color", Types.NVARCHAR, 0, 0);
            fileRecord.addColumnMetadata(4, "StandartCost", Types.DECIMAL, 19, 4);
            fileRecord.addColumnMetadata(5, "ListPrice", Types.DECIMAL, 19, 4);
            fileRecord.addColumnMetadata(6, "Size", Types.NUMERIC, 18, 0);
            fileRecord.addColumnMetadata(7, "Weight", Types.NUMERIC, 18, 0);
            fileRecord.addColumnMetadata(8, "ProductCategoryID", Types.INTEGER, 10, 0);
            fileRecord.addColumnMetadata(9, "ProductModellID", Types.INTEGER, 10, 0);
            fileRecord.addColumnMetadata(10, "SellStartDate", Types.DATE, 23, 3);



            SQLServerBulkCopy bulkCopy = new SQLServerBulkCopy(conn);
            bulkCopy.setDestinationTableName("[Perf_DB].[dbo].[SalesLT.Product1new]");

            bulkCopy.addColumnMapping("Name", "Name");
            bulkCopy.addColumnMapping("ProductNumber", "ProductNumber");
            bulkCopy.addColumnMapping("Color", "Color");
            bulkCopy.addColumnMapping("StandartCost", "StandartCost");
            bulkCopy.addColumnMapping("ListPrice", "ListPrice");
            bulkCopy.addColumnMapping("Size", "Size");
            bulkCopy.addColumnMapping("Weight", "Weight");
            bulkCopy.addColumnMapping("ProductCategoryID", "ProductCategoryID");
            bulkCopy.addColumnMapping("ProductModellID", "ProductModellID");
            bulkCopy.addColumnMapping("SellStartDate", "SellStartDate");



            bulkCopy.writeToServer(fileRecord);


           System.out.println("Test Data is uploaded in DB");

        } catch (SQLServerException e) {
            e.printStackTrace();
        }
//        timer.dbtime();
    }
}







//    public void setBulkCopy(Connection conn) throws ClassNotFoundException {
//
//
//        String csvPath = "D:/JAVA/csv_bulk_load.csv";
//
//        SQLServerBulkCSVFileRecord fileRecord = null;
//
//
//        try {
//            fileRecord = new SQLServerBulkCSVFileRecord(csvPath, null, ",", true);
//
//
//            int colCount = 10;
//            for (int i = 1; i <= colCount; i++)
//                fileRecord.addColumnMetadata(1, null, Types.NVARCHAR, 0, 0);
//                fileRecord.addColumnMetadata(2, null, Types.NVARCHAR, 0, 0);
//                fileRecord.addColumnMetadata(3, null, Types.NVARCHAR, 0, 0);
//                fileRecord.addColumnMetadata(4, null, Types.DECIMAL, 19, 4);
//                fileRecord.addColumnMetadata(5, null, Types.DECIMAL, 19, 4);
//                fileRecord.addColumnMetadata(6, null, Types.NUMERIC, 18, 0);
//                fileRecord.addColumnMetadata(7, null, Types.NUMERIC, 18, 0);
//                fileRecord.addColumnMetadata(8, null, Types.INTEGER, 10, 0);
//                fileRecord.addColumnMetadata(9, null, Types.INTEGER, 10, 0);
//                fileRecord.addColumnMetadata(10, null, Types.DATE, 23, 3);
//
//
//
//
//                SQLServerBulkCopy bulkCopy = new SQLServerBulkCopy(conn);
//
//                    bulkCopy.setDestinationTableName("SalesLT.Product1new");
//
//                    bulkCopy.writeToServer(fileRecord);
//
//
//
//        } catch (SQLServerException e) {
//            e.printStackTrace();
//        }
//    }
