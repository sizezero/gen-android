package com.foo.bar

import junit.framework.TestCase
import junit.framework.Assert._

class ScalaJunitTest extends TestCase {

  def testOne {
    assertEquals(2, 1+1)
  }

}

