package co.com.rappi.utilities;

import com.fasterxml.jackson.dataformat.csv.CsvMapper;
import com.fasterxml.jackson.dataformat.csv.CsvSchema;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class ManejoCsv {

  public static List<Map<String, String>> obtenerDatosCsv(String rutaCsv) throws IOException {
    List<Map<String, String>> listaDatos = new ArrayList<>();
    File file = new File(rutaCsv);
    InputStream inputStream = new FileInputStream(file);
    Reader reader = new InputStreamReader(inputStream, StandardCharsets.UTF_8);
    Iterator<Map<String, String>> iterator =
        new CsvMapper().readerFor(Map.class).with(CsvSchema.emptySchema().withColumnSeparator(';').withHeader()).readValues(reader);
    while(iterator.hasNext()){
      Map<String, String> fila = iterator.next();
      listaDatos.add(fila);
    }
    inputStream.close();
    reader.close();
    return listaDatos;
  }

}
