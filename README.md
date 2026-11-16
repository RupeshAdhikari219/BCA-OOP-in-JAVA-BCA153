# BCA OOP in Java — Second Semester

**Course:** OOP in Java · **Course code:** BCA 153  
**University:** Tribhuvan University · **Year/Semester:** First Year / Second Semester  
**Credits:** 3 · **Workload:** 6 hours per week (3 lecture + 3 practical)

This repository contains Java practical examples organized by the official eight-unit BCA 153 syllabus. The actual source folders follow the syllabus order; the detailed index in [`SYLLABUS_MAP.md`](SYLLABUS_MAP.md) lists every Java source file at its current path.

## Folder structure

```text
.
├── Unit_1_Introduction_to_Java_and_OOP/
├── Unit_2_Basic_of_Java_Programming/
│   └── strings/
├── Unit_3_Class_and_Objects/
│   ├── packages/
│   └── recursion/
├── Unit_4_Inheritance_and_Polymorphism/
│   └── polymorphism/
├── Unit_5_Exception_Handling_and_Multithreading/
│   └── combining_runnable_and_thread/
├── Unit_6_File_Handling/
│   └── serialization/
├── Unit_7_Collections_and_Generics/
│   ├── list/
│   ├── map/
│   └── set/
├── Unit_8_Advanced_OOP_Concepts/
└── Supplementary_Topics/
    ├── Swing/
    ├── Applet/
    ├── JDBC/
    └── Java_Utilities/
```

## Syllabus coverage

- **Unit 1 — Introduction to Java and OOP:** 3 Java source files. [Open unit folder](Unit_1_Introduction_to_Java_and_OOP/)
- **Unit 2 — Basic of Java Programming:** 47 Java source files. [Open unit folder](Unit_2_Basic_of_Java_Programming/)
- **Unit 3 — Class and Objects:** 16 Java source files. [Open unit folder](Unit_3_Class_and_Objects/)
- **Unit 4 — Inheritance and Polymorphism:** 13 Java source files. [Open unit folder](Unit_4_Inheritance_and_Polymorphism/)
- **Unit 5 — Exception Handling and Multithreading:** 17 Java source files. [Open unit folder](Unit_5_Exception_Handling_and_Multithreading/)
- **Unit 6 — File Handling:** 6 Java source files. [Open unit folder](Unit_6_File_Handling/)
- **Unit 7 — Collections and Generics:** 19 Java source files. [Open unit folder](Unit_7_Collections_and_Generics/)
- **Unit 8 — Advanced OOP Concepts:** 0 Java source files. [Open unit folder](Unit_8_Advanced_OOP_Concepts/)
- **Supplementary topics:** 37 Java source files covering Swing, Applets, JDBC and Java utility classes.

## Practical topics that still need examples

The following items are not yet represented by a focused practical program in this repository. Existing source files have been moved, not duplicated, and no placeholder Java programs have been added to disguise missing coverage.

### Unit 1 — Introduction to Java and OOP
- Dedicated practicals or notes for Java history/features and buzzwords
- JVM/JDK/JRE architecture demonstration
- Procedural-vs-OOP comparison
- A setup/IDE walkthrough and focused common-error troubleshooting examples

### Unit 2 — Basic of Java Programming
- A focused example distinguishing keywords, identifiers and separators
- A dedicated example showing comment types (comments appear throughout the source, but are not taught in a focused program)

### Unit 3 — Class and Objects
- Copy-constructor example
- Pass-by-value explanation with a focused demonstration of Java's argument-passing semantics
- Variable-length argument (varargs) example

### Unit 4 — Inheritance and Polymorphism
- Multilevel and hierarchical inheritance examples
- Dedicated final-keyword example
- Complete abstract-class/abstract-method example
- Access-control comparison demonstrating private, protected, package-default and public

### Unit 5 — Exception Handling and Multithreading
- Thread-priority example
- Inter-thread communication example using wait(), notify() and/or notifyAll()

### Unit 6 — File Handling
- RandomAccessFile example

### Unit 7 — Collections and Generics
- Comparator-focused sorting example
- Generic class and generic method examples
- Wildcard-argument examples
- Generic interface/hierarchy example
- A focused example of generic type restrictions

### Unit 8 — Advanced OOP Concepts
- Singleton, Factory and Observer design-pattern examples
- Lambda-expression example
- Stream API examples
- Optional example
- Method-reference examples

## Running the examples

- Use a JDK (the project was checked with JDK 21).
- Compile the source tree from the repository root with:

```bash
mkdir -p out
find Unit_* Supplementary_Topics -name '*.java' -print0 | xargs -0 javac -d out
```

- Run a class using its fully qualified package name, for example:

```bash
java -cp out Unit_1_Introduction_to_Java_and_OOP.HelloWorldProgram
```

- File I/O and serialization examples use paths relative to the repository root. Run them from the repository root so the sample input and generated output files resolve correctly.
- JDBC examples compile against the standard JDBC API, but need MySQL Server and MySQL Connector/J at runtime. See [`Supplementary_Topics/JDBC/README.md`](Supplementary_Topics/JDBC/README.md) and [`setup.sql`](Supplementary_Topics/JDBC/setup.sql).
- Applets are legacy technology and are not executable in modern web browsers.

## Notes

- The original class names and teaching logic are retained except for path/package updates and the small JDBC table-schema correction needed for consistency.
- Old compiled `.class` files and generated `.ser` files were removed from source control; `.gitignore` now excludes them.
- Unit 8 intentionally contains no fabricated Java examples. Its README lists the syllabus topics awaiting practical coverage.

Maintained by **Rupesh Adhikari** · **BCA Nepal**
