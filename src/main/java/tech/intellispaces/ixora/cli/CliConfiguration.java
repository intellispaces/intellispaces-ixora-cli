package tech.intellispaces.ixora.cli;

import intellispaces.ixora.cli.MovableConsoleHandle;
import tech.intellispaces.core.annotation.Configuration;
import tech.intellispaces.core.annotation.Projection;

@Configuration
public class CliConfiguration {

  /**
   * Projection to module system console.
   */
  @Projection
  public MovableConsoleHandle console() {
    return new PrintStreamBasedConsole(System.out);
  }
}
