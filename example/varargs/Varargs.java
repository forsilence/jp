package varargs;

public class Varargs {

  public static void main(String[] args) {
    varargsFn(0);
    varargsFn(1, "1");
    varargsFn(2, "1", "2");
  }

  public static void varargsFn(int i, String ...str){
    System.out.printf("i is %d , str length is %d\n", i, str.length);
  }

  public static void otherArrayFn(int i, String[] str){
  }
}