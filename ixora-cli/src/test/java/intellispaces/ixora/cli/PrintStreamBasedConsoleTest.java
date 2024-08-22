package intellispaces.ixora.cli;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import intellispaces.core.IntellispacesFramework;
import intellispaces.core.annotation.Preprocessing;
import intellispaces.core.system.Modules;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Tests fo {@link AbstractPrintStreamBasedConsole} class.
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
  public void testPrintStreamBasedConsoleHandle() {
    // Given
    var os = new ByteArrayOutputStream();
    var ps = new PrintStream(os, true, StandardCharsets.UTF_8);
    var console = new PrintStreamBasedConsole(ps);

    // When
    console.println("abc");
    console.print("def");

    // Then
    String output = os.toString(StandardCharsets.UTF_8);
    assertThat(output).isEqualTo("abc" + System.lineSeparator() + "def");
  }
}
