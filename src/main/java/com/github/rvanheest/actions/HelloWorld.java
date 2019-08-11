package com.github.rvanheest.actions;

public class HelloWorld {

  public static void main(String[] args) {
    String name = args.length == 0
        ? "unknown person"
        : args[0];

    Greeter greeter = new Greeter(name);

    System.out.println(greeter.greet());
  }
}
