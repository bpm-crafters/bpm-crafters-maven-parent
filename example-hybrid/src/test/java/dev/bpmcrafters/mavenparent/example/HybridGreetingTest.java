package dev.bpmcrafters.mavenparent.example;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class HybridGreetingTest {

  @Test
  void JavaCanUseKotlinOutput() {
    assertEquals("Hello, BPM Crafters", HybridGreeting.INSTANCE.forName("BPM Crafters"));
  }
}
