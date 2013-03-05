package ee.zeroturnaround.xmas;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MerryXmas {

  // page, line, word
  private List<Page> book;

  public MerryXmas() {
    book = createBook();
  }

  public static String declarationLookup(int x, int y) {
    return new MerryXmas().getWord(x, y);
  }

  private static String delimeterPrefix = "---------------------------------------";

  private static List<Page> createBook() {
    try {
      String filename = "/home/shelajev/repo/tmp/xmas2012/jvms7.txt";
      List<String> lines = readAllLines(filename);
      List<Page> book = new ArrayList<Page>();
      Page currentPage = new Page();
      for (String line : lines) {
        if (line.startsWith(delimeterPrefix)) {
          if (!currentPage.isEmpty()) {
            book.add(currentPage);
            currentPage = new Page();
          }
          continue;
        }
        currentPage.addLine(line);
      }
      System.out.println(book.size());
      return book;
    }
    catch (IOException e) {
      throw new RuntimeException(e);
    }
  }

  private static List<String> readAllLines(String filename) throws IOException {
    try (BufferedReader in = new BufferedReader(new FileReader(filename))) {
      String line = null;
      List<String> lines = new ArrayList<String>();
      while ((line = in.readLine()) != null) {
        lines.add(line);
      }
      System.out.println(lines.size());
      return lines;
    }
  }

  public String getWord(int x, int y) {
    // page, line, word
    return strip(book.get(x % book.size()).get(y, gcd(x, y)));
  }

  private static String strip(String string) {
    String replaceAll = string.replaceAll("[^A-Za-z0-9 ]", "");
    if (replaceAll.isEmpty()) {
      return string;
    }
    return replaceAll;
  }

  private static int gcd(int x, int y) {
    return BigInteger.valueOf(x).gcd(BigInteger.valueOf(y)).intValue();
  }

  private static class Page {
    List<List<String>> lines = new ArrayList<List<String>>();

    public boolean isEmpty() {
      return lines.isEmpty();
    }

    private void addLine(String line) {
      if (line.trim().isEmpty()) {
        return;
      }
      String[] split = line.trim().split(" +");
      this.addWords(Arrays.asList(split));
    }

    private void addWords(List<String> words) {
      this.lines.add(words);
    }

    protected String get(int x, int y) {
      int lineIndex = x % lines.size();
      List<String> list = lines.get(lineIndex);
      int index = y % list.size();
      return list.get(index);
    }
  }
}