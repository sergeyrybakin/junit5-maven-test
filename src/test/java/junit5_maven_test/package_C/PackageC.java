package junit5_maven_test.package_C;

import junit5_maven_test.App;

import org.junit.jupiter.api.DisplayName;

@DisplayName("Package_C: running...")
public class PackageC
{
    @DisplayName("Package_C: get()")
    public static String get()
    {
        return ("Hello from Package_C!");
    }
}
