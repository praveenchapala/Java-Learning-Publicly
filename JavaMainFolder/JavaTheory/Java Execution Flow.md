Java Execution Flow
Java Source Code (.java)
        │
        ▼
Java Compiler (javac)
        │
        ▼
Bytecode (.class)
        │
        ▼
Class Loader
        │
        ▼
Bytecode Verifier
        │
        ▼
JVM (Java Virtual Machine)
        │
        ▼
Execution Engine
   ├── Interpreter
   └── JIT Compiler
        │
        ▼
Machine Code
        │
        ▼
Operating System
        │
        ▼
Output
Step 1: Write the Java Program

You write your code in a file with the .java extension.

Example:

public class Hello {
    public static void main(String[] args) {
        System.out.println("Hello Java");
    }
}

File Name:

Hello.java
Step 2: Compilation

The Java compiler (javac) checks your program for syntax errors.

Command:

javac Hello.java

If there are no errors, the compiler generates a bytecode file.

Output:

Hello.class

Important:

.java → Human-readable source code.
.class → Bytecode.
Step 3: Bytecode

Bytecode is not machine code.

It is an intermediate representation that any JVM can understand.

This is why Java is platform-independent.

Hello.java
      ↓
javac
      ↓
Hello.class (Bytecode)
Step 4: Class Loader

When you run:

java Hello

The JVM starts.

The Class Loader loads the required .class files into memory.

It loads:

Your class (Hello.class)
Java library classes (System, String, Object, etc.)
Step 5: Bytecode Verifier

Before execution, the JVM verifies the bytecode to ensure it is safe and valid.

It checks:

Valid bytecode instructions
Type safety
Illegal memory access
Stack consistency

If verification fails, the program will not run.

Step 6: JVM (Java Virtual Machine)

The JVM provides a runtime environment for Java programs.

It is responsible for:

Memory management
Garbage collection
Security
Thread management
Executing bytecode

Because different operating systems have their own JVM implementations, the same bytecode can run on Windows, Linux, or macOS.

Step 7: Execution Engine

The JVM's Execution Engine executes the bytecode.

It consists mainly of:

Interpreter
Reads bytecode line by line.
Executes each instruction immediately.
Starts execution quickly.
Can be slower for code that runs repeatedly.
JIT (Just-In-Time) Compiler

The JIT compiler identifies frequently executed code (called hot code) and compiles it into native machine code.

Benefits:

Faster execution after compilation.
Improves overall application performance.
Step 8: Machine Code

The JIT compiler generates machine code specific to the processor.

Examples:

Intel x86
AMD64
ARM

The CPU executes this machine code directly.

Step 9: Output

The operating system displays the program's output.

Hello Java
Visual Flow
Write Code (.java)
        │
        ▼
Compile (javac)
        │
        ▼
Bytecode (.class)
        │
        ▼
Run (java ClassName)
        │
        ▼
JVM Starts
        │
        ▼
Class Loader
        │
        ▼
Bytecode Verifier
        │
        ▼
Execution Engine
      │        │
Interpreter   JIT Compiler
      │        │
      └────────┘
          ▼
Machine Code
          ▼
CPU Executes
          ▼
Output
Example

Source Code:

public class Test {
    public static void main(String[] args) {
        System.out.println("Welcome");
    }
}

Compile:

javac Test.java

Generated:

Test.class

Run:

java Test

Execution Flow:

Test.java
    ↓
javac
    ↓
Test.class
    ↓
JVM
    ↓
Class Loader
    ↓
Bytecode Verifier
    ↓
Execution Engine
    ↓
Interpreter + JIT
    ↓
Machine Code
    ↓
CPU
    ↓
Welcome