package com.example.kotlinlab.ch1;

import java.util.ArrayList;

public class JavaClass {

  public static void main(String[] args) {
    final ArrayList<User> list = new ArrayList<>();
    final User user1 = new User();
    user1.setNo(1);
    user1.setName("kkang");
    user1.setEmail("a@a.com");
    list.add(user1);

    final User user2 = new User();
    user2.setNo(1);
    user2.setName("kkang");
    user2.setEmail("a@a.com");
    list.add(user1);

    System.out.println("List Size: " + list.size());
    if (user1.getNo() == user2.getNo()
        && user1.getName().equals(user2.getName())
        && user1.getEmail().equals(user2.getEmail())) {
      System.out.println("user1 == user2");
    } else {
      System.out.println("user1 != user2");
    }
  }
}
