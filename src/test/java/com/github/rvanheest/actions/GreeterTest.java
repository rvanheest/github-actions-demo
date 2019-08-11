package com.github.rvanheest.actions;

import org.junit.Test;
import static org.junit.Assert.*;

public class GreeterTest {

  @Test
  public void testGreet() {
    Greeter greeter = new Greeter("my-name");
    assertEquals("Hello my-name", greeter.greet());
  }
}
