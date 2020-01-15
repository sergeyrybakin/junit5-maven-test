package junit5_maven_test.package_B;

import junit5_maven_test.App;
import junit5_maven_test.package_C.PackageC;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

@Tag("package_B")
@DisplayName("Package_B: running...")
public class VerificationOfPackageBTest
{
    @DisplayName("Package_B: Test App.get()")
    @Test
    public void verificationAppTest()
    {
        assertEquals("Hello JUnit 5!", App.get());
    }

    @Tag("failed")
    @DisplayName("Package_B: For verification Failed tests")
    @Test
    public void verificationOfFailedTestInPackage_B()
    {
        assertEquals(true, false);
    }

    @DisplayName("Package_B: Test PackageC.get()")
    @Test
    public void verificationOfPackageCTest()
    {
        assertEquals("Hello from Package_C!", PackageC.get());
    }
}
