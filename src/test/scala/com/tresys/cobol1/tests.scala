
package com.tresys.cobol1

import org.junit.Test
import org.apache.daffodil.tdml.Runner
import org.junit.AfterClass

object Tests {
  lazy val runner = Runner("com/tresys/cobol1", "tests.tdml")

  @AfterClass def shutdown: Unit = { runner.reset }

}

class Tests {
  import Tests._

  @Test def test1 { runner.runOneTest("test1") }

}
