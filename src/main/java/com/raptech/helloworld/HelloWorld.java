package com.raptech.helloworld;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class HelloWorld {

  public static void main(final String[] args) {
    final DateTimeFormatter dtf = DateTimeFormatter.ofPattern("h:mm:ss a 'on' MMMM d, yyyy'.'");
    final LocalDateTime now = LocalDateTime.now();

    System.out.println("Hello, Welcome to My World! Your Applicatiom is Successfully Deployed ! The current time is " + dtf.format(now));
  }

}
