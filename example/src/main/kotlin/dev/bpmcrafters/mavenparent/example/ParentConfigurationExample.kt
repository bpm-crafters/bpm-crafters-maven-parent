package dev.bpmcrafters.mavenparent.example

object ParentConfigurationExample {
  fun javaFeatureVersion(): Int = Runtime.version().feature()
}
