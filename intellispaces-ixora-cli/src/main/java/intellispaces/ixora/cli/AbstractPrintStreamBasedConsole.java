package intellispaces.ixora.cli;

import intellispaces.framework.core.annotation.Mover;
import intellispaces.framework.core.annotation.ObjectHandle;

import java.io.PrintStream;

@ObjectHandle(value = ConsoleDomain.class, name = "PrintStreamBasedConsole")
public abstract class AbstractPrintStreamBasedConsole implements MovableConsole {
  private final PrintStream ps;

  public AbstractPrintStreamBasedConsole(PrintStream ps) {
    this.ps = ps;
  }

  @Mover
  @Override
  public Console print(String string) {
    ps.print(string);
    return this;
  }

  @Mover
  @Override
  public Console print(int number) {
    ps.print(number);
    return this;
  }

  @Mover
  @Override
  public Console println(String string) {
    ps.println(string);
    return this;
  }

  @Mover
  @Override
  public Console println(int number) {
    ps.println(number);
    return this;
  }
}
