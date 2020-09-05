package dataproviders;

import framework.utils.datareader.ExcelReader;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.testng.annotations.DataProvider;

import java.io.IOException;

public class TestData {

    private static ExcelReader excelReader = new ExcelReader();

    @DataProvider
    public static Object[][] selectLanguagePageData() throws IOException {
        String[][] data = new String[1][10];
        XSSFSheet xssfSheet = excelReader.getExcelSheet(
                "src/main/resources/testdata/YaraTestData.xlsx"
                , 0);
        for (int i=0; i<10; i++){
            data[0][i] = xssfSheet.getRow(0).getCell(i).getStringCellValue();
        }
        return data;
    }

    @DataProvider
    public static Object[][] welcomePageData() throws IOException {
        String[][] data = new String[1][4];
        XSSFSheet xssfSheet = excelReader.getExcelSheet(
                "src/main/resources/testdata/YaraTestData.xlsx"
                , 0);
        for (int i=0; i<4; i++){
            data[0][i] = xssfSheet.getRow(1).getCell(i).getStringCellValue();
        }
        return data;
    }

    @DataProvider
    public static Object[][] newCropPageData() throws IOException {
        String[][] data = new String[1][4];
        XSSFSheet xssfSheet = excelReader.getExcelSheet(
                "src/main/resources/testdata/YaraTestData.xlsx"
                , 0);
        for (int i=0; i<4; i++){
            data[0][i] = xssfSheet.getRow(2).getCell(i).getStringCellValue();
        }
        return data;
    }
}
