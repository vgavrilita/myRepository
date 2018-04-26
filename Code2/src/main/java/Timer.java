import javax.management.Query;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public class Timer {

    public String getDbTime(Connection conn) {
        QueryFactory queryFactory = new QueryFactory();
        String getDbTime = "SELECT CONVERT(time, GETDATE()) as timp ";

        List<Map<String,String>> startTest = queryFactory.queryExecutor(conn,getDbTime,"timp");

        return startTest.get(0).get("timp");
    }

}