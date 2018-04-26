
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class QueryFactory {

    public List<Map<String, String>> queryExecutor(Connection coni, String query, String... columns) {
        List<Map<String, String>> queryResults = new ArrayList();

        try {
            Statement stmt = coni.createStatement();
            ResultSet resultsQuery = stmt.executeQuery(query);

            while (resultsQuery.next()) {
                Map<String, String> values = new HashMap();
                for (String column : columns) {
                    String value = resultsQuery.getString(column);
                    values.put(column, value);
                }
                queryResults.add(values);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return queryResults;
    }


    public void updateTable(Connection coni, String sqlupdate, int randomNumber) throws SQLException {//todo to add for(loop[)

        int loops = 10;
        for (int i = 0; i < loops; i++) {

            sqlupdate = "INSERT INTO [Perf_DB].[dbo].[SalesLT.Product1new] (Name, ProductNumber, Color,StandartCost,ListPrice,Size,Weight,ProductCategoryID,ProductModellID) VALUES ('bombo',randomPN,'red',Randomnumber,252.11,40,212,18,6)";
            Statement stmt2 = coni.createStatement();

            stmt2.executeUpdate(sqlupdate);
            System.out.println("Executed update");
        }

    }


}



