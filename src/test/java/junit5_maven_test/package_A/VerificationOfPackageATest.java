package junit5_maven_test.package_A;

import junit5_maven_test.App;
import junit5_maven_test.package_C.PackageC;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

@Tag("package_A")
@DisplayName("Package_A: running...")
public class VerificationOfPackageATest
{
    @Tag("package_A")
    @DisplayName("Package_A: Test App.get()")
    @Test
    public void verificationAppTest()
    {
        assertEquals("Hello JUnit 5!", App.get());
    }

    @Tag("package_A")
    @DisplayName("Package_A: Should answer with True")
    @Test
    public void shouldAnswerWithTrue()
    {
        assertEquals(true, true);
    }

    @Tag("package_A")
    @Tag("failed")
    @DisplayName("Package_A: For verification Failed tests")
    @Test
    public void verificationOfFailedTestInPackage_B()
    {
        assertEquals(true, false);

    }

    @Tag("package_A")
    @Tag("fast")
    @Test
    public void verificationOfPackageCTest()
    {
        assertEquals("Hello from Package_C!", PackageC.get());
    }
}
