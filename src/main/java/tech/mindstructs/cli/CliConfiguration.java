package tech.mindstructs.cli;

import intellispaces.ixora.mindstructs.cli.MovableConsoleHandle;
import tech.intellispaces.framework.core.annotation.Configuration;
import tech.intellispaces.framework.core.annotation.Projection;

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
