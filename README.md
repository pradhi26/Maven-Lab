# Maven Lab Questions: 15 Projects

Each numbered folder is a separate Maven project with `pom.xml`, `src/main/java/`, and `src/test/java/`.

Requirements: JDK 21, Maven 3.9.x, JUnit 4.13.2.

Run inside any numbered project folder:
```powershell
mvn clean test
mvn package
```

Notes:
- Student grade boundaries are assumed as A >= 90, B >= 80, C >= 70, D >= 60, otherwise F.
- Fibonacci `generate(n)` returns the first n terms beginning with 0.
- String palindrome ignores letter case, spaces, and punctuation.
- Factorial rejects negative numbers; maximum-array operation rejects empty arrays.
- Your `mvn -version` output shows Maven running on Java 21, while `java -version` shows Java 25. These projects compile for Java 21. For consistent commands, set JAVA_HOME and PATH to JDK 21.
