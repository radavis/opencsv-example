package opencsv.example;

import com.opencsv.bean.CsvToBeanBuilder;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.List;

public class MameRomCsvReader {

  private static final char CSV_COLUMN_SEPARATOR = ';';

  public static List<MameRomCsvRow> readFile(File csvFile) throws FileNotFoundException {
    return new CsvToBeanBuilder<MameRomCsvRow>(new FileReader(csvFile))
        .withSeparator(CSV_COLUMN_SEPARATOR)
        .withIgnoreQuotations(true)
        .withType(MameRomCsvRow.class)
        .build()
        .parse();
  }
}
