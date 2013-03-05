package ee.zeroturnaround.xmas;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MysteriousTest {

  @Test
  public void test0() {
    assertEquals("bytecode", MerryXmas.declarationLookup(16, 13));
  }

  @Test
  public void test1() {
    assertEquals("machine", MerryXmas.declarationLookup(27, 30));
  }

  @Test
  public void test2() {
    assertEquals("Summary", MerryXmas.declarationLookup(4, 7));
  }

  @Test
  public void test3() {
    assertEquals("Java", MerryXmas.declarationLookup(12, 3));
  }

  @Test
  public void test4() {
    assertEquals("responsibilities", MerryXmas.declarationLookup(2, 12));
  }

  @Test
  public void test5() {
    assertEquals("virtual", MerryXmas.declarationLookup(979, 785));
  }

  @Test
  public void test6() {
    assertEquals("malicious", MerryXmas.declarationLookup(19, 10));
  }

  @Test
  public void test7() {
    assertEquals("Bytecode", MerryXmas.declarationLookup(7, 2));
  }

  @Test
  public void test8() {
    assertEquals("Stack", MerryXmas.declarationLookup(461, 728));
  }

  @Test
  public void test9() {
    assertEquals("thanks", MerryXmas.declarationLookup(13, 13));
  }

  @Test
  public void test10() {
    assertEquals("JAVA", MerryXmas.declarationLookup(4658, 2315));
  }

  @Test
  public void test11() {
    assertEquals("void", MerryXmas.declarationLookup(3935, 1711));
  }

  @Test
  public void test12() {
    assertEquals("synchronized", MerryXmas.declarationLookup(5453, 2756));
  }

  @Test
  public void test13() {
    assertEquals("0x0d", MerryXmas.declarationLookup(581, 1419));
  }

  @Test
  public void test14() {
    assertEquals("instruction", MerryXmas.declarationLookup(7155, 2295));
  }

  @Test
  public void test15() {
    assertEquals("compatible", MerryXmas.declarationLookup(12, 16));
  }

}
