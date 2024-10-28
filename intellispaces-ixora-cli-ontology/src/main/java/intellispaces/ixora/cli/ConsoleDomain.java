package intellispaces.ixora.cli;

import intellispaces.jaquarius.annotation.Channel;
import intellispaces.jaquarius.annotation.Domain;
import intellispaces.jaquarius.traverse.TraverseTypes;

/**
 * Console is a simple text in/out system port.
 */
@Domain("ac5ad94b-0d0b-4bc1-b0af-a32c65a28793")
public interface ConsoleDomain {

  @Channel(
      value = "e09d266d-9568-44fd-8ed2-cf27da326a37",
      name = "ConsolePrintStringChannel",
      allowedTraverse = TraverseTypes.Moving
  )
  ConsoleDomain print(String string);

  @Channel(
      value = "5c0ac95a-a8f9-4a77-a6f7-7897659e80b1",
      name = "ConsolePrintIntegerChannel",
      allowedTraverse = TraverseTypes.Moving
  )
  ConsoleDomain print(int number);

  @Channel(
      value = "0df1747b-b0dc-4a34-9584-54d06af4ffe2",
      name = "ConsolePrintlnStringChannel",
      allowedTraverse = TraverseTypes.Moving
  )
  ConsoleDomain println(String string);

  @Channel(
      value = "1e2ffbd9-dd81-4fa5-8658-93052623c1b9",
      name = "ConsolePrintlnIntegerChannel",
      allowedTraverse = TraverseTypes.Moving
  )
  ConsoleDomain println(int number);
}
