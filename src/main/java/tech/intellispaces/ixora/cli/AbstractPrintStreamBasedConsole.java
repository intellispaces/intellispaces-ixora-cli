package tech.intellispaces.ixora.cli;

import intellispaces.ixora.cli.MovableConsoleHandle;
import tech.intellispaces.core.annotation.MovableObjectHandle;
import tech.intellispaces.core.annotation.Mover;

import java.io.PrintStream;

@MovableObjectHandle("PrintStreamBasedConsole")
public abstract class AbstractPrintStreamBasedConsole implements MovableConsoleHandle {
  private final PrintStream ps;

  public AbstractPrintStreamBasedConsole(PrintStream ps) {
    this.ps = ps;
  }

  @Mover
  @Override
  public Void print(String message) {
    ps.print(message);
    return null;
  }

  @Mover
  @Override
  public Void println(String message) {
    ps.println(message);
    return null;
  }
}
