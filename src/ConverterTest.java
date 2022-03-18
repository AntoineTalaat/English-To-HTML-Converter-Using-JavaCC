import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class ConverterTest {
//
//    @Test
//   void GeneratingExpression() {
//       assertAll(
//               ()-> assertEquals("<img src=\"https://www.w3schools.com/html/pic_trulli.jpg\" />",
//                       Converter.parse("ADD IMAGE WITH SOURCE \"https://www.w3schools.com/html/pic_trulli.jpg\"")),
//               ()-> assertEquals("<h1>Hello World</h1>",Converter.parse("ADD HEADING WITH TEXT \"Hello World\"")),
//               ()-> assertEquals("<p style=\"font-family:Arial;color:Red;\">Welcome</p>",
//                       Converter.parse("ADD PARAGRAPH WITH TEXT \"Welcome\" AND WITH FONT \"Arial\" AND WITH COLOR \"Red\"")),
//               ()-> assertEquals("<a href=\"http://google.com\">Search</a>",
//                       Converter.parse("ADD LINK WITH TEXT \"Search\" AND WITH LINK \"http://google.com")),
//               ()-> assertEquals("<a href=\"http://gmail.com\" style=\"color:Green;\">Email</a>",
//                       Converter.parse("ADD LINK WITH TEXT \"Email\" AND WITH LINK \"http://gmail.com\" AND WITH COLOR \"Green"))
//      );
//    }

    @Test
    void ParsingImage() throws Exception {
        assertEquals("<img src=\"https://www.w3schools.com/html/pic_trulli.jpg\" />",
                Converter.parse("ADD IMAGE WITH SOURCE \"https://www.w3schools.com/html/pic_trulli.jpg\""));
    }

    @Test
    void ParsingHeader() throws Exception {
        assertEquals("<h1>Hello World</h1>",Converter.parse("ADD HEADING WITH TEXT \"Hello World\""));
    }

    @Test
    void ParsingParagraphWithTextAndStyle() throws Exception{
        assertEquals("<p style=\"font-family:Arial;color:Red;\">Welcome</p>",
                Converter.parse("ADD PARAGRAPH WITH TEXT \"Welcome\" AND WITH FONT \"Arial\" AND WITH COLOR \"Red\""));
    }

    @Test
    void ParsingLink() throws Exception{
        assertEquals("<a href=\"http://google.com\">Search</a>",
                Converter.parse("ADD LINK WITH TEXT \"Search\" AND WITH LINK \"http://google.com"));
    }

    @Test
    void ParsingLinkWithStyle() throws Exception {
        assertEquals("<a href=\"http://gmail.com\" style=\"color:Green;\">Email</a>",
                Converter.parse("ADD LINK WITH TEXT \"Email\" AND WITH LINK \"http://gmail.com\" AND WITH COLOR \"Green"));
    }

    @Test
    void ImageValidation() throws Exception{
        assertEquals(true,Converter.validate("ADD IMAGE WITH SOURCE \"https://www.w3schools.com/html/pic_trulli.jpg\""));
    }

    @Test
    void HeaderValidation() throws Exception{
        assertEquals(true,Converter.validate("ADD HEADING WITH TEXT \"Hello World\""));
    }

    @Test
    void ParagraphWithStyleValidation() throws Exception{
        assertEquals(true,Converter.validate("ADD PARAGRAPH WITH TEXT \"Welcome\" AND WITH FONT \"Arial\" AND WITH COLOR \"Red\""));
    }

    @Test
    void LinkValidation() throws Exception{
        assertEquals(true,Converter.validate("ADD LINK WITH TEXT \"Search\" AND WITH LINK \"http://google.com"));
    }

    @Test
    void LinkWithStyleValidation() throws Exception {
        assertEquals(true,Converter.validate("ADD LINK WITH TEXT \"Email\" AND WITH LINK \"http://gmail.com\" AND WITH COLOR \"Green"));
    }

    @Test
    void ParaWithStyleValidation() throws Exception {
        assertEquals(true,Converter.validate("ADD PARAGRAPH WITH FONT \"Arial\" AND WITH TEXT \"Good bye\""));
    }

    @Test
    void WrongTokenValidation() throws Exception{
        assertEquals(false,Converter.validate("ADDD PARAGRAPH WITH FONT \"Calibri\" AND TEXT \"Hello\""));
    }

    @Test
    void AddingElementOutOfGrammarValidation() throws Exception{
         assertEquals(false,Converter.validate("ADD CANVAS WITH COLOR \"Red\""));
    }

    @Test
    void WrongGrammarValidation2() throws Exception {
         assertEquals(false,Converter.validate("ADD PARAGRAPH COLOR \"Red\" TEXT \"Hello\""));
    }

    @Test
    void WrongGrammarValidation3() throws Exception {
        assertEquals(false,Converter.validate("ADD HEADING "));
    }

//    @Test
//    void main() throws Exception {
//      assertAll(
//              ()-> assertEquals(true,Converter.validate("ADD IMAGE WITH SOURCE \"https://www.w3schools.com/html/pic_trulli.jpg\"")),
//              ()-> assertEquals(true,Converter.validate("ADD HEADING WITH TEXT \"Hello World\"")),
//              ()-> assertEquals(true,Converter.validate("ADD PARAGRAPH WITH TEXT \"Welcome\" AND WITH FONT \"Arial\" AND WITH COLOR \"Red\"")),
//              ()-> assertEquals(true,Converter.validate("ADD LINK WITH TEXT \"Search\" AND WITH LINK \"http://google.com")),
//              ()-> assertEquals(true,Converter.validate("ADD LINK WITH TEXT \"Email\" AND WITH LINK \"http://gmail.com\" AND WITH COLOR \"Green")),
//              ()-> assertEquals(true,Converter.validate("ADD PARAGRAPH WITH FONT \"Arial\" AND WITH TEXT \"Good bye\"")),
//              ()-> assertEquals(false,Converter.validate("ADDD PARAGRAPH WITH FONT \"Calibri\" AND TEXT \"Hello\"")),
//              ()-> assertEquals(false,Converter.validate("ADD CANVAS WITH COLOR \"Red\"")),
//              ()-> assertEquals(false,Converter.validate("ADD PARAGRAPH COLOR \"Red\" TEXT \"Hello\"")),
//              ()-> assertEquals(false,Converter.validate("ADD HEADING "))
//              );
//    }
}