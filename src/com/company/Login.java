package com.company;

public interface Login {
    String name = null;
    int password = 0;

   public void getInput();
   public void checkInput(String name, int password);
}
