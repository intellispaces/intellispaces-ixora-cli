package tech.intellispaces.jaquarius.ixora.cli;

import java.io.PrintStream;

public interface Consoles {

  static MovableConsole get(PrintStream ps) {
    return new PrintStreamBasedConsoleImpl(ps);
  }
}
