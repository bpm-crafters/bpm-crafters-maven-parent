package dev.bpmcrafters.mavenparent.example

object HybridGreeting {
  fun forName(name: String): String = JavaGreeting.forName(name)
}
