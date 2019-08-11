package com.github.rvanheest.actions;

import java.util.Objects;

public class Greeter {

  private final String name;

  public Greeter(String name) {
    this.name = name;
  }

  public String greet() {
    return String.format("Hello %s", this.name);
  }

  @Override public boolean equals(Object other) {
    if (other instanceof Greeter) {
      Greeter that = (Greeter) other;
      return Objects.equals(this.name, that.name);
    }
    return false;
  }

  @Override public int hashCode() {
    return Objects.hash(this.name);
  }

  @Override public String toString() {
    return String.format("Greeter { name: '%s' }", this.name);
  }
}
