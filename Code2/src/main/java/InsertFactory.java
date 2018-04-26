//import java.io.IOException;
//import java.sql.Connection;
//import java.sql.SQLException;
//import java.sql.Statement;
//import java.util.List;
//
//
//public class InsertFactory {
//
//
//    public void addValues(Connection coni) throws IOException {
//
//        Randomnumber randomnumber = new Randomnumber();
//
//        CurrentDate currentDate = new CurrentDate();
//
//
//        CsvReader csvReader = new CsvReader();
//        List cards = csvReader.csvBuffer();
//
//
//        int loops = 10;
//        for (int i = 0; i < loops; i++) {
//            String readcard = ((String[]) cards.get(i))[1];
//
//
//            String insertQuery = "INSERT INTO [Perf_DB].[dbo].[SalesLT.Product1new] " +
//                    "(Name, ProductNumber, Color,StandartCost,ListPrice,Size,Weight,ProductCategoryID,ProductModellID,SellStartDate) " +
//                    "VALUES ('newproduct87'," + randomnumber.getNmber() + ",'red'," + randomnumber.getNmber() + "." + randomnumber.getNmber() + ",252.11,40," + readcard + ",18,6,CONVERT(datetime,('" + currentDate.getdateTime() + "'),101))";
//
//
//            try {
//                System.out.println(insertQuery);
//                Statement stmt2 = coni.createStatement();
//                stmt2.executeUpdate(insertQuery);
//            } catch (SQLException e) {
//                e.printStackTrace();
//            }
//
//        }
//
//        System.out.println("Executed update");
//    }
//
//}
