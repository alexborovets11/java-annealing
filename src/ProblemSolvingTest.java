import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.Set;

import org.junit.jupiter.api.Test;

public class ProblemSolvingTest {
  @Test
  void testAllStartWithA_trueMixedCase() {
    // arrange
    Set<String> input = Set.of("armadillo", "Arcanine", "asbestos", "ABBA");
    // act
    boolean actual = ProblemSolving.allStartWithA(input);
    //assert
    assertTrue(actual);
  }

  @Test
  void testAllStartWithA_falseOneElement() {
    // arrange
    Set<String> input = Set.of("armadillo", "utopia", "Arcanine");
    // act
    boolean actual = ProblemSolving.allStartWithA(input);
    // assert
    assertFalse(actual);
  }

  // TODO:
  // Come up with more tests to thoroughly test testAllStartWithA
  // Suggestions:
  //  - test an empty set
  //  - test a set where none start with A
  //  - test a set with only a single element
  //  - more you can think of!

  @Test
  void testHasEmptyString_falseAllNonEmpty() {
    // arrange
    Set<String> input = Set.of("armadillo", "Arcanine", "utopia");
    // act
    boolean actual = ProblemSolving.hasEmptyString(input);
    // assert
    assertFalse(actual);
  }

  @Test
  void testHasEmptyString_trueOneEmpty() {
    // arrange
    Set<String> input = Set.of("armadillo", "", "utopia", "yeah");
    // act
    boolean actual = ProblemSolving.hasEmptyString(input);
    // assert
    assertTrue(actual);
  }


  // TODO:
  // Come up with more tests to thoroughly test hasEmptyString
  // Use your creativity here!


  @Test
  void testMaxLength_multipleWords() {
    // arrange
    Set<String> input = Set.of("by", "a", "commodius", "vicus");
    // act
    int actual = ProblemSolving.maxLength(input);
    // assert
    assertEquals(9, actual);
  }


  // TODO:
  // Come up with more tests to thoroughly test maxLength
  // Use your creativity here!

  
  // TODO:
  // Come up with ALL tests to thoroughly test minLength
  // Use your creativity here, and consider looking back at the maxLength
  // tests for inspiration

  @Test
  void testMaxLength_allEmptyStrings() {
    Set<String> input = Set.of("");
    assertEquals(0, ProblemSolving.maxLength(input));
  }

  @Test
  void testMaxLength_includesSpecialCharacters() {
    Set<String> input = Set.of("a!", "b@#$", "normal", "extraordinary!!!");
    assertEquals(16, ProblemSolving.maxLength(input));
  }

  @Test
  void testMaxLength_wordsWithSpaces() {
    Set<String> input = Set.of("short", "longer ", " longest  ");
    assertEquals(10, ProblemSolving.maxLength(input));
  }

  @Test
  void testMinLength_singleSpace() {
    Set<String> input = Set.of(" ", "abc", "longword");
    assertEquals(1, ProblemSolving.minLength(input));
  }

  @Test
  void testMinLength_sameShortLengthWords() {
    Set<String> input = Set.of("hi", "by", "my");
    assertEquals(2, ProblemSolving.minLength(input));
  }

  @Test
  void testMinLength_oneVeryShortAmongLong() {
    Set<String> input = Set.of("encyclopedia", "microbiology", "a");
    assertEquals(1, ProblemSolving.minLength(input));
  }

  @Test
  void testMinLength_wordWithTabOrNewline() {
    Set<String> input = Set.of("\n", "\t", "abc");
    assertEquals(1, ProblemSolving.minLength(input));
  }

}
