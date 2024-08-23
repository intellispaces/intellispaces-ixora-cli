package intellispaces.ixora.cli;

import intellispaces.core.annotation.MovableObjectHandle;
import intellispaces.core.annotation.Mover;

import java.io.PrintStream;

@MovableObjectHandle("PrintStreamBasedConsole")
public abstract class AbstractPrintStreamBasedConsole implements MovableConsole {
  private final PrintStream ps;

  public AbstractPrintStreamBasedConsole(PrintStream ps) {
    this.ps = ps;
  }

  @Mover
  @Override
  public Void print(String string) {
    ps.print(string);
    return null;
  }

  @Mover
  @Override
  public Void print(int number) {
    ps.print(number);
    return null;
  }

  @Mover
  @Override
  public Void println(String string) {
    ps.println(string);
    return null;
  }

  @Mover
  @Override
  public Void println(int number) {
    ps.println(number);
    return null;
  }
}
