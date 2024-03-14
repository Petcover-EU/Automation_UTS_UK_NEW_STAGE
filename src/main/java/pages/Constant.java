package pages;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import utils.Log;

import java.io.FileInputStream;
import java.util.Random;

public class Constant {
    public static String ENVIRONMENT = System.getProperty("environment");

    public static String url;

    static {
        if (ENVIRONMENT.equals("UTS-UK2Stage")) {
            url = "https://stage.petcovergroup.com:7779/";
        } else if (ENVIRONMENT.equals("UTS-UK2production")) {
            url = "https://fitlocal2.britishpetinsurance.co.uk:94/";
        } else if (ENVIRONMENT.equals("Test")) {
            url = "https://stage.petcovergroup.com:5557/";
        } else {
            Log.error("Please check environment");
        }
    }

    protected static String getSaltString() {
        String SALTCHARS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
        StringBuilder salt = new StringBuilder();
        Random rnd = new Random();
        while (salt.length() < 10) { // length of the random string.
            int index = (int) (rnd.nextFloat() * SALTCHARS.length());
            salt.append(SALTCHARS.charAt(index));
        }
        return salt.toString();

    }

    protected static String getAlphaNumericString() {

        // choose a Character random from this String
        String AlphaNumericString = "0123456789";

        // create StringBuffer size of AlphaNumericString
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < 11; i++) {

            // generate a random number between
            // 0 to AlphaNumericString variable length
            int index
                    = (int) (AlphaNumericString.length()
                    * Math.random());

            // add Character one by one in end of sb
            sb.append(AlphaNumericString
                    .charAt(index));
        }

        return sb.toString();
    }

    public static void excelReader() {
        try {
            FileInputStream file = new FileInputStream("test-data/Exotic_Transactional_Scenarios_Dataset.xlsx");
            Workbook workbook = new XSSFWorkbook(file);
            Sheet sheet = workbook.getSheet("TestData-UTS2-UK");

            String val = sheet.getRow(3).getCell(3).getStringCellValue();
            System.out.println(val);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

}
