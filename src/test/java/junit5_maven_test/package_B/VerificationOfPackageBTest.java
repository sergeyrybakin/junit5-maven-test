package junit5_maven_test.package_B;

import junit5_maven_test.App;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

@Tag("package_B")
@DisplayName("Package_B: running...")
public class VerificationOfPackageBTest
{
    @Tag("package_B")
    @DisplayName("Package_B: Test App.get()")
    @Test
    public void verificationAppTest()
    {
        assertEquals("Hello JUnit 5!", App.get());
    }

    @Tag ("package_B")
    @Tag("failed")
    @DisplayName("Package_B: For verification Failed tests")
    @Test
    public void verificationOfFailedTestInPackage_B()
    {
        assertEquals(true, false);
    }
}
