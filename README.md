# junit5-maven-test
Experiments with starting tests with parameters. 

src/main/java/junit5_maven_test/App - it's application only.
package_A: it uses @Tag for whole java class and for all tests in this java class. Some tests has two different @Tags.
package_B: it uses @Tag for whole java class. And @Tag("failed") specailly for ignoring of broken test.
package_C: it was created for additional functions, not for tests!

For @Tag see official manual: https://junit.org/junit5/docs/current/user-guide/#running-tests-tag-expressions
----------------------------------------------------------------------------------------------------------------------------------
This is a running of specific test class, except of marhed as @Tag("failed")
$ mvn test -DexcludedGroups="failed" -Dtest=package_B/VerificationOfPackageBTest.java

----------------------------------------------------------------------------------------------------------------------------------
This is a running of all tests, except of marked as @Tag("failed"), and then type maven-surefire-plugin reports 
$ mvn test -DexcludedGroups="failed"; cat target/surefire-reports/*.txt

----------------------------------------------------------------------------------------------------------------------------------
This is a running of tests, marked as @Tag("package_B") OR @Tag("package_A") OR @Tag("fast"), except of marked as @Tag("failed"):
$ mvn test -DexcludedGroups="failed" -Dgroups="package_B, package_A, fast"
