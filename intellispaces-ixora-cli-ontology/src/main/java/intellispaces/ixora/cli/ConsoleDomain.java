package intellispaces.ixora.cli;

import intellispaces.framework.core.annotation.Domain;
import intellispaces.framework.core.annotation.Transition;
import intellispaces.framework.core.traverse.TraverseTypes;
import intellispaces.ixora.base.PointDomain;

/**
 * Console is a simple text in/out system port.
 */
@Domain("ac5ad94b-0d0b-4bc1-b0af-a32c65a28793")
public interface ConsoleDomain extends PointDomain {

  @Transition(
      value = "e09d266d-9568-44fd-8ed2-cf27da326a37",
      name = "ConsolePrintStringTransition",
      allowedTraverse = TraverseTypes.Moving
  )
  ConsoleDomain print(String string);

  @Transition(
      value = "5c0ac95a-a8f9-4a77-a6f7-7897659e80b1",
      name = "ConsolePrintIntegerTransition",
      allowedTraverse = TraverseTypes.Moving
  )
  ConsoleDomain print(int number);

  @Transition(
      value = "0df1747b-b0dc-4a34-9584-54d06af4ffe2",
      name = "ConsolePrintlnStringTransition",
      allowedTraverse = TraverseTypes.Moving
  )
  ConsoleDomain println(String string);

  @Transition(
      value = "1e2ffbd9-dd81-4fa5-8658-93052623c1b9",
      name = "ConsolePrintlnIntegerTransition",
      allowedTraverse = TraverseTypes.Moving
  )
  ConsoleDomain println(int number);
}
