package datasource;

import common.WebAPI;
import databases.ConnectToSqlDB;
import utility.DataReader;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class DataSource extends WebAPI {
    public static ConnectToSqlDB connectToSqlDB = new ConnectToSqlDB();
   public static List<String> getListFromDB() throws Exception {
       List<String> amazonList = new ArrayList<>();
       amazonList=connectToSqlDB.readDataBase("Employee","first_name");
       return amazonList;
   }
   public static List<String> getExcelItem() throws IOException {
       DataReader dataReader = null;
       String path = "Data/CNNData.xlsx";
       String[] itemArray = dataReader.fileReader2(path, 0);
       for (int i = 1; i < itemArray.length; i++)
           System.out.println(itemArray[i] + " ");

           ArrayList<String> list = new ArrayList<>();
           for (int i = 0; i < itemArray.length; i++)
                list.add(itemArray[i]);

           return list;
   }
}
