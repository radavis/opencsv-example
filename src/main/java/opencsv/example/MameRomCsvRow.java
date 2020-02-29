package opencsv.example;

import com.opencsv.bean.CsvBindByName;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class MameRomCsvRow {
  @CsvBindByName private String name;

  @CsvBindByName private String description;

  @CsvBindByName private String year;

  @CsvBindByName private String manufacturer;

  @CsvBindByName private Integer width;

  @CsvBindByName private Integer height;

  @CsvBindByName private Integer rotate;
}
