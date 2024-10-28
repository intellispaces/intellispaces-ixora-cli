package intellispaces.ixora.cli;

import intellispaces.jaquarius.annotation.Configuration;
import intellispaces.jaquarius.annotation.Projection;

@Configuration
public class CliConfiguration {

  /**
   * Projection to module system console.
   */
  @Projection
  public MovableConsole console() {
    return Consoles.get(System.out);
  }
}
