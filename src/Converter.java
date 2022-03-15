/* Converter.java */
/* Generated By:JavaCC: Do not edit this line. Converter.java */
public class Converter implements ConverterConstants {
    public static void main(String arg[]) throws java.text.ParseException{
        Converter obj=new Converter(System.in);
        try {
            obj.Create();
            } catch (ParseException e) {
                e.printStackTrace();
            }
        }

  static final public void Create() throws ParseException {String res="";
    jj_consume_token(ADD);
    res = element();
System.out.println(res);
}

  static final public String element() throws ParseException {String tag="";
  String details="";
    switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
    case IMAGE:{
      details = img();
{if ("" != null) return "<img"+details+"></img>";}
      break;
      }
    case PARA:{
      details = para();
{if ("" != null) return "<p" + details + "/p>"   ;}
      break;
      }
    case HEAD:{
      details = header();
System.out.println(details);
            {if ("" != null) return "<h1" + details + "/h1>";}
      break;
      }
    default:
      jj_la1[0] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
    throw new Error("Missing return statement in function");
}

  static final public String img() throws ParseException {String l;
    jj_consume_token(IMAGE);
    jj_consume_token(WITHSOURCE);
    jj_consume_token(QUOTE);
    l = sentence();
{if ("" != null) return l;}
    throw new Error("Missing return statement in function");
}

  static final public String para() throws ParseException {String text ;
String[] arr;
    jj_consume_token(PARA);
    text = decoratedTxt();
System.out.println("IN para");
                                                 if(text.contains("<<text>>")){
                                                         arr=text.split("<<text>>");
                                                         {if ("" != null) return " " + arr[0] + ">" + arr[1] + "<" ;}
                                                     }else{
                                                         {if ("" != null) return text+"><";}
                                                     }
    throw new Error("Missing return statement in function");
}

  static final public String header() throws ParseException {String text;
    String[] arr;
    jj_consume_token(HEAD);
    text = decoratedTxt();
System.out.println("head>>"+text);
                    if(text.contains("<<text>>")){
                            arr=text.split("<<text>>");
                            {if ("" != null) return " " + arr[0] + ">" + arr[1] + "<" ;}
                        }else{
                            {if ("" != null) return text+"><";}
                        }
    throw new Error("Missing return statement in function");
}

//void url():
//{}
//{
//    <LINK> decoratedURL()
//}
  static final public 

String sentence() throws ParseException {Token t;
    String s="";
    String rs=null;
    t = jj_consume_token(ALPHANUMERIC);
    switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
    case ALPHANUMERIC:{
      rs = sentence();
      break;
      }
    default:
      jj_la1[1] = jj_gen;
      ;
    }
if (rs !=null)
                                              s = t.image + rs;
                                          else s=t.image;
    switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
    case QUOTE:{
      jj_consume_token(QUOTE);
      break;
      }
    default:
      jj_la1[2] = jj_gen;
      ;
    }
{if ("" != null) return s;}
    throw new Error("Missing return statement in function");
}

  static final public String decoratedTxt() throws ParseException {String res="";
 String temp;
 String[] arr;
 String temp2;
 String[] arr2;
 String style;
    temp = minimalDecoratedTxt();
res= temp;
    switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
    case AND:{
      jj_consume_token(AND);
      temp2 = decoratedTxt();
if(temp.contains("style=") && temp2.contains("style=")) {
                                            arr=temp.split("style=\"");
                                            arr2=temp2.split("style=\"");
                                            style= "style=\"" + arr[1].split("\"")[0]+ " " +arr2[1].split("\"")[0];
                                            res = style;
                                        } else if(temp.contains("style=") || temp2.contains("style=")){
                                            style=(temp.contains("style=")?temp+temp2:temp2+temp);
                                            res = style;
                                        } else {
                                            //both are texts
                                            arr = temp.split("<<text>>");
                                            res= temp2 + arr[1] ;
                                        }
      break;
      }
    default:
      jj_la1[3] = jj_gen;
      ;
    }
{if ("" != null) return res;}
    throw new Error("Missing return statement in function");
}

  static final public String minimalDecoratedTxt() throws ParseException {String temp="";
    switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
    case WITHTEXT:{
      temp = text();
{if ("" != null) return "<<text>>"+temp ;}
      break;
      }
    case WITHFONT:{
      temp = font();
{if ("" != null) return "style=\"" + temp + "\"";}
      break;
      }
    case WITHCOLOR:{
      temp = color();
{if ("" != null) return "style=\"" + temp + "\"";}
      break;
      }
    default:
      jj_la1[4] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
    throw new Error("Missing return statement in function");
}

  static final public void minmalDecoratedURL() throws ParseException {
    switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
    case WITHLINK:{
      link();
      break;
      }
    case WITHTEXT:{
      text();
      break;
      }
    case WITHCOLOR:{
      color();
      break;
      }
    default:
      jj_la1[5] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
}

  static final public String text() throws ParseException {String t;
    jj_consume_token(WITHTEXT);
    jj_consume_token(QUOTE);
    t = sentence();
System.out.println(t);
            {if ("" != null) return t;}
    throw new Error("Missing return statement in function");
}

  static final public String color() throws ParseException {String c;
    jj_consume_token(WITHCOLOR);
    jj_consume_token(QUOTE);
    c = sentence();
{if ("" != null) return "color:" +c + ";";}
    throw new Error("Missing return statement in function");
}

  static final public String font() throws ParseException {String f;
    jj_consume_token(WITHFONT);
    jj_consume_token(QUOTE);
    f = sentence();
{if ("" != null) return "font-family:"+f+";";}
    throw new Error("Missing return statement in function");
}

  static final public String link() throws ParseException {String l;
    jj_consume_token(WITHLINK);
    jj_consume_token(QUOTE);
    l = sentence();
{if ("" != null) return "src=" + "\"" + l + "\""  + ";";}
    throw new Error("Missing return statement in function");
}

  static private boolean jj_initialized_once = false;
  /** Generated Token Manager. */
  static public ConverterTokenManager token_source;
  static SimpleCharStream jj_input_stream;
  /** Current token. */
  static public Token token;
  /** Next token. */
  static public Token jj_nt;
  static private int jj_ntk;
  static private int jj_gen;
  static final private int[] jj_la1 = new int[6];
  static private int[] jj_la1_0;
  static {
	   jj_la1_init_0();
	}
	private static void jj_la1_init_0() {
	   jj_la1_0 = new int[] {0xe0000,0x10,0x20,0x400000,0x1a00,0xb00,};
	}

  /** Constructor with InputStream. */
  public Converter(java.io.InputStream stream) {
	  this(stream, null);
  }
  /** Constructor with InputStream and supplied encoding */
  public Converter(java.io.InputStream stream, String encoding) {
	 if (jj_initialized_once) {
	   System.out.println("ERROR: Second call to constructor of static parser.  ");
	   System.out.println("	   You must either use ReInit() or set the JavaCC option STATIC to false");
	   System.out.println("	   during parser generation.");
	   throw new Error();
	 }
	 jj_initialized_once = true;
	 try { jj_input_stream = new SimpleCharStream(stream, encoding, 1, 1); } catch(java.io.UnsupportedEncodingException e) { throw new RuntimeException(e); }
	 token_source = new ConverterTokenManager(jj_input_stream);
	 token = new Token();
	 jj_ntk = -1;
	 jj_gen = 0;
	 for (int i = 0; i < 6; i++) jj_la1[i] = -1;
  }

  /** Reinitialise. */
  static public void ReInit(java.io.InputStream stream) {
	  ReInit(stream, null);
  }
  /** Reinitialise. */
  static public void ReInit(java.io.InputStream stream, String encoding) {
	 try { jj_input_stream.ReInit(stream, encoding, 1, 1); } catch(java.io.UnsupportedEncodingException e) { throw new RuntimeException(e); }
	 token_source.ReInit(jj_input_stream);
	 token = new Token();
	 jj_ntk = -1;
	 jj_gen = 0;
	 for (int i = 0; i < 6; i++) jj_la1[i] = -1;
  }

  /** Constructor. */
  public Converter(java.io.Reader stream) {
	 if (jj_initialized_once) {
	   System.out.println("ERROR: Second call to constructor of static parser. ");
	   System.out.println("	   You must either use ReInit() or set the JavaCC option STATIC to false");
	   System.out.println("	   during parser generation.");
	   throw new Error();
	 }
	 jj_initialized_once = true;
	 jj_input_stream = new SimpleCharStream(stream, 1, 1);
	 token_source = new ConverterTokenManager(jj_input_stream);
	 token = new Token();
	 jj_ntk = -1;
	 jj_gen = 0;
	 for (int i = 0; i < 6; i++) jj_la1[i] = -1;
  }

  /** Reinitialise. */
  static public void ReInit(java.io.Reader stream) {
	if (jj_input_stream == null) {
	   jj_input_stream = new SimpleCharStream(stream, 1, 1);
	} else {
	   jj_input_stream.ReInit(stream, 1, 1);
	}
	if (token_source == null) {
 token_source = new ConverterTokenManager(jj_input_stream);
	}

	 token_source.ReInit(jj_input_stream);
	 token = new Token();
	 jj_ntk = -1;
	 jj_gen = 0;
	 for (int i = 0; i < 6; i++) jj_la1[i] = -1;
  }

  /** Constructor with generated Token Manager. */
  public Converter(ConverterTokenManager tm) {
	 if (jj_initialized_once) {
	   System.out.println("ERROR: Second call to constructor of static parser. ");
	   System.out.println("	   You must either use ReInit() or set the JavaCC option STATIC to false");
	   System.out.println("	   during parser generation.");
	   throw new Error();
	 }
	 jj_initialized_once = true;
	 token_source = tm;
	 token = new Token();
	 jj_ntk = -1;
	 jj_gen = 0;
	 for (int i = 0; i < 6; i++) jj_la1[i] = -1;
  }

  /** Reinitialise. */
  public void ReInit(ConverterTokenManager tm) {
	 token_source = tm;
	 token = new Token();
	 jj_ntk = -1;
	 jj_gen = 0;
	 for (int i = 0; i < 6; i++) jj_la1[i] = -1;
  }

  static private Token jj_consume_token(int kind) throws ParseException {
	 Token oldToken;
	 if ((oldToken = token).next != null) token = token.next;
	 else token = token.next = token_source.getNextToken();
	 jj_ntk = -1;
	 if (token.kind == kind) {
	   jj_gen++;
	   return token;
	 }
	 token = oldToken;
	 jj_kind = kind;
	 throw generateParseException();
  }


/** Get the next Token. */
  static final public Token getNextToken() {
	 if (token.next != null) token = token.next;
	 else token = token.next = token_source.getNextToken();
	 jj_ntk = -1;
	 jj_gen++;
	 return token;
  }

/** Get the specific Token. */
  static final public Token getToken(int index) {
	 Token t = token;
	 for (int i = 0; i < index; i++) {
	   if (t.next != null) t = t.next;
	   else t = t.next = token_source.getNextToken();
	 }
	 return t;
  }

  static private int jj_ntk_f() {
	 if ((jj_nt=token.next) == null)
	   return (jj_ntk = (token.next=token_source.getNextToken()).kind);
	 else
	   return (jj_ntk = jj_nt.kind);
  }

  static private java.util.List<int[]> jj_expentries = new java.util.ArrayList<int[]>();
  static private int[] jj_expentry;
  static private int jj_kind = -1;

  /** Generate ParseException. */
  static public ParseException generateParseException() {
	 jj_expentries.clear();
	 boolean[] la1tokens = new boolean[23];
	 if (jj_kind >= 0) {
	   la1tokens[jj_kind] = true;
	   jj_kind = -1;
	 }
	 for (int i = 0; i < 6; i++) {
	   if (jj_la1[i] == jj_gen) {
		 for (int j = 0; j < 32; j++) {
		   if ((jj_la1_0[i] & (1<<j)) != 0) {
			 la1tokens[j] = true;
		   }
		 }
	   }
	 }
	 for (int i = 0; i < 23; i++) {
	   if (la1tokens[i]) {
		 jj_expentry = new int[1];
		 jj_expentry[0] = i;
		 jj_expentries.add(jj_expentry);
	   }
	 }
	 int[][] exptokseq = new int[jj_expentries.size()][];
	 for (int i = 0; i < jj_expentries.size(); i++) {
	   exptokseq[i] = jj_expentries.get(i);
	 }
	 return new ParseException(token, exptokseq, tokenImage);
  }

  static private boolean trace_enabled;

/** Trace enabled. */
  static final public boolean trace_enabled() {
	 return trace_enabled;
  }

  /** Enable tracing. */
  static final public void enable_tracing() {
  }

  /** Disable tracing. */
  static final public void disable_tracing() {
  }

 }