package intellispaces.ixora.cli;

import intellispaces.framework.core.IntellispacesFramework;
import intellispaces.framework.core.annotation.Preprocessing;
import intellispaces.framework.core.system.Modules;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Tests fo {@link PrintStreamBasedConsole} class.
 */
@Preprocessing(CliConfiguration.class)
public class PrintStreamBasedConsoleTest {

  @BeforeEach
  public void init() {
    IntellispacesFramework.loadModule(CliConfiguration.class);
  }

  @AfterEach
  public void destroy() {
    Modules.current().stop();
  }

  @Test
  public void testPrintStreamBasedConsole() {
    // Given
    var os = new ByteArrayOutputStream();
    var ps = new PrintStream(os, true, StandardCharsets.UTF_8);
    var console = Consoles.get(ps);

    // When
    console.println("abc");
    console.print("def");

    // Then
    String output = os.toString(StandardCharsets.UTF_8);
    assertThat(output).isEqualTo("abc" + System.lineSeparator() + "def");
  }
}
