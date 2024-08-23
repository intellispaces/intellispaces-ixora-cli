package intellispaces.ixora.cli;

import intellispaces.core.annotation.Configuration;
import intellispaces.core.annotation.Projection;

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
