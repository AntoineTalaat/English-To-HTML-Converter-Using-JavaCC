import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.charset.Charset;

class ConverterTest {
 @Test

  void Verification (){
     String string = "ss";
     InputStream inputStream = new ByteArrayInputStream(string.getBytes(Charset.forName("UTF-8")));
     Converter obj = new Converter();

 }
}