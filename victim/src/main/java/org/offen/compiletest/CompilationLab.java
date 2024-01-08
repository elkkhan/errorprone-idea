package org.offen.compiletest;

import com.google.testing.compile.Compilation;
import com.google.testing.compile.Compiler;
import com.google.testing.compile.JavaFileObjects;
import java.io.File;
import java.util.List;

public class CompilationLab {

  public static void main(String[] args) {
    final Compiler compiler = Compiler.javac().withOptions(List.of(
            "-Xplugin:ErrorProne",
            "-XDcompilePolicy=simple"))
        .withClasspath(List.of(new File("target/classes")));
    final Compilation compiled = compiler.compile(JavaFileObjects.forResource("Victim.java"));
    compiled.diagnostics().forEach(System.out::println);
  }
}
