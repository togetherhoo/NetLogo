package org.nlogo.prim.etc

import org.nlogo.api.Syntax
import org.nlogo.nvm.{ Context, Procedure, Reporter }

class _dump extends Reporter {
  override def syntax =
    Syntax.reporterSyntax(Syntax.StringType, "O---")
  override def report(context: Context) =
    world.program.dump + "\n" +
    workspace.getProcedures.values.mkString("", "\n", "\n")
}
