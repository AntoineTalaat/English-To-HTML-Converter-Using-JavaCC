/*import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class ConverterTest {

//    @Test
//    void GeneratingExpression() {
//        assertAll(
//                ()-> assertEquals("<img src=\"https://www.w3schools.com/html/pic_trulli.jpg\" />",Converter.parse("ADD IMAGE WITH SOURCE \"https://www.w3schools.com/html/pic_trulli.jpg\""))
////                ()-> assertEquals(true,Converter.validate("ADD HEADING WITH TEXT \"Hello World\"")),
////                ()-> assertEquals(true,Converter.validate("ADD PARAGRAPH WITH TEXT \"Welcome\" AND WITH FONT \"Arial\" AND WITH COLOR \"Red\"")),
////                ()-> assertEquals(true,Converter.validate("ADD LINK WITH TEXT \"Search\" AND WITH LINK \"http://google.com")),
////                ()-> assertEquals(true,Converter.validate("ADD LINK WITH TEXT \"Email\" AND WITH LINK \"http://gmail.com\" AND WITH COLOR \"Green")),
////                ()-> assertEquals(true,Converter.validate("ADD PARAGRAPH WITH FONT \"Arial\" AND WITH TEXT \"Good bye\"")),
////                ()-> assertEquals(false,Converter.validate("ADDD PARAGRAPH WITH FONT \"Calibri\" AND TEXT \"Hello\"")),
////                ()-> assertEquals(false,Converter.validate("ADD CANVAS WITH COLOR \"Red\"")),
////                ()-> assertEquals(false,Converter.validate("ADD PARAGRAPH COLOR \"Red\" TEXT \"Hello\"")),
////                ()-> assertEquals(false,Converter.validate("ADD HEADING "))
//        );
//    }

    @Test
    void main() throws Exception {
      assertAll(
              ()-> assertEquals(true,Converter.validate("ADD IMAGE WITH SOURCE \"https://www.w3schools.com/html/pic_trulli.jpg\"")),
              ()-> assertEquals(true,Converter.validate("ADD HEADING WITH TEXT \"Hello World\"")),
              ()-> assertEquals(true,Converter.validate("ADD PARAGRAPH WITH TEXT \"Welcome\" AND WITH FONT \"Arial\" AND WITH COLOR \"Red\"")),
              ()-> assertEquals(true,Converter.validate("ADD LINK WITH TEXT \"Search\" AND WITH LINK \"http://google.com")),
              ()-> assertEquals(true,Converter.validate("ADD LINK WITH TEXT \"Email\" AND WITH LINK \"http://gmail.com\" AND WITH COLOR \"Green")),
              ()-> assertEquals(true,Converter.validate("ADD PARAGRAPH WITH FONT \"Arial\" AND WITH TEXT \"Good bye\"")),
              ()-> assertEquals(false,Converter.validate("ADDD PARAGRAPH WITH FONT \"Calibri\" AND TEXT \"Hello\"")),
              ()-> assertEquals(false,Converter.validate("ADD CANVAS WITH COLOR \"Red\"")),
              ()-> assertEquals(false,Converter.validate("ADD PARAGRAPH COLOR \"Red\" TEXT \"Hello\"")),
              ()-> assertEquals(false,Converter.validate("ADD HEADING "))
              );
    }
}*/