import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;



public class TestDataFactory {



        public  void createTestData(int prodNumber) throws IOException {

            Randomnumber randomnumber = new Randomnumber();

             CurrentDate currentDate = new CurrentDate();


            String file_header="Name,ProductNumber,Color,StandartCost,ListPrice,Size,Weight,ProductCategoryID,ProductModellID,SellStartDate"+"\n";


            File newFile = new File("./../producttestdata.csv");

            if (!newFile.exists()) {
                newFile.createNewFile();
            }

            FileWriter fileW = new FileWriter(newFile);
            BufferedWriter buffW = new BufferedWriter(fileW);

            buffW.write(file_header);

            for (int i = 0; i < prodNumber; i++) {

                buffW.write("productnew"+ i +","+randomnumber.getNmber()+",galben," + randomnumber.getNmber() + "." + randomnumber.getNmber() +","+ randomnumber.getNmber() + "." + randomnumber.getNmber() +","+ randomnumber.getNmber() +","+ randomnumber.getNmber() +","+ randomnumber.getNmber() +","+ randomnumber.getNmber() +"," + currentDate.getdateTime() +"\n");

            }
            System.out.println("Test Data File is Created");
            buffW.close();


        }
    }

