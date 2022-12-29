package de.dhbw.experimental.foodstore;

import de.dhbw.commons.DateTimeUtil;

import java.io.File;
import java.io.FileNotFoundException;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.*;

public class DataLoader {

    private static final String SEMICOLON_DELIMITER = ";";
    private static final ZonedDateTime endOfThisCentury =
            ZonedDateTime.of(2099,12,31,0,0,0,0, ZoneId.systemDefault());

    public Set<Product> load(String csvFile) {
        Set<Product> products = new HashSet<>();

        try (Scanner scanner = new Scanner(new File(csvFile));) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                Product product = getProductFromLine(line);
                products.add(product);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        return products;
    }

    private Product getProductFromLine(String line) {
        if (isHeaderLine(line)) {
            return null;
        }
        String[] values = line.split(SEMICOLON_DELIMITER);

        FoodGroup foodGroup = FoodGroup.from(values[0]);
        String productName = values[1];

        ZonedDateTime bestBeforeDate;
        try {
            String date = values[5];
            bestBeforeDate = DateTimeUtil.from(date);
        } catch (ArrayIndexOutOfBoundsException e) {
            bestBeforeDate = endOfThisCentury;
        }

        Product product = new Product(foodGroup, productName);
        product.setBestBeforeDate(bestBeforeDate);

        return product;
    }

    private boolean isHeaderLine(String line) {
        return line.contains("Warengruppe");
    }

    /*
    private List<String> getRecordFromLine(String line) {
        List<String> values = new ArrayList<String>();
        try (Scanner rowScanner = new Scanner(line)) {
            rowScanner.useDelimiter(SEMICOLON_DELIMITER);
            while (rowScanner.hasNext()) {
                values.add(rowScanner.next());
            }
        }
        return values;
    }
    */

}