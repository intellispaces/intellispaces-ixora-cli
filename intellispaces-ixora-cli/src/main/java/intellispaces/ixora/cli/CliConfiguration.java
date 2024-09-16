package intellispaces.ixora.cli;

import intellispaces.framework.core.annotation.Configuration;
import intellispaces.framework.core.annotation.Projection;

@Configuration
public class CliConfiguration {

  /**
   * Projection to module system console.
   */
  @Projection
  public MovableConsole console() {
    return new PrintStreamBasedConsole(System.out);
  }
}
