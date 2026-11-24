package dev.bpmcrafters.mavenparent.example

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class ParentConfigurationExampleTest {

  @Test
  fun `inherits the required Java version`() {
    assertEquals(21, ParentConfigurationExample.javaFeatureVersion())
  }
}
