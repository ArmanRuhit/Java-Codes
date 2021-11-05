import java.util.regex.*;
public class test1 {
  public static void main(String[] args) {
    Pattern pattern = Pattern.compile(".xx.");
    Matcher matcher = pattern.matcher("AxxB");
    System.out.println(matcher.matches());
    System.out.println(Pattern.matches("[abc]*", "b"));
  }
}
