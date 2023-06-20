package com.codekul.Multithreading;

 class thread1 extends Thread
 {
  int i=0;
  public void run() {
   while (i < 4) {
    System.out.println("I am thread 1");
    i++;
   }
  }
  public void name(String s){

  }
}

class thread2 extends Thread {
 int i = 0;

 public void run() {
  while (i < 4) {
   System.out.println("I am thread 2");
   i++;
  }
 }
}

class main{
 public static void main(String[] args) {
  thread1 t1 =new thread1();
  thread2 t2=new thread2();
  t1.start();
  t2.start();
  System.out.println(t1.getId());
  System.out.println(t1.getName());
  System.out.println(t2.getId());
  System.out.println(t2.getName());

 }
}
