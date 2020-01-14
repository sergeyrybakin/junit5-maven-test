# junit5-maven-test
Experiments with starting tests with parameters. 
----------------------------------------------------------------------------------------------------------------------------------
This is a running of specific test class, except of marhed as @Tag("failed")
$ mvn test -DexcludedGroups="failed" -Dtest=package_B/VerificationOfPackageBTest.java

----------------------------------------------------------------------------------------------------------------------------------
This is a running of all tests, except of marked as @Tag("failed"), and then type maven-surefire-plugin reports 
$ mvn test -DexcludedGroups="failed"; cat target/surefire-reports/*.txt

----------------------------------------------------------------------------------------------------------------------------------
This is a running of tests, marked as @Tag("package_B") OR @Tag("package_A") OR @Tag("fast"), except of marked as @Tag("failed"):
$ mvn test -DexcludedGroups="failed" -Dgroups="package_B, package_A, fast"
