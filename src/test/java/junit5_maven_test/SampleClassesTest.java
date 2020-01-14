package junit5_maven_test;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Tag;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 * Unit test for simple App.
 */
@Tag("sample")
@DisplayName("It's a Sample Classes Test running")
public class SampleClassesTest
{
    @Tag("sample")
    @DisplayName("Should answer with True")
    @Test
    public void shouldAnswerWithTrue()
    {
        assertEquals( true, true);
        assertNotEquals(true,false);
    }

    @Tag("failed")
    @DisplayName("For verification Failed tests")
    @Test
    public void verificationOfFailedTest()
    {
        assertEquals(true, false);
    }

    @Tag("sample")
    @Tag("fast")
    @DisplayName("Test App.get()")
    @Test
    public void verifyAppTest()
    {
        assertEquals("Hello JUnit 5!", App.get());
    }
}
