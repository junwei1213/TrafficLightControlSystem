/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trafficlightcontrolsystem;

/**
 *
 * @author iuqe1
 */
public class Trafficlight {
    int condition = 1;
    
    public synchronized void One () throws InterruptedException {
        while (condition == 1){
            System.out.print(" Condition 1 is waiting ");
            wait();
        }
        ForCondition1();
        Thread.sleep(1500);
        condition = 2;
        notify();
    }
    
    public synchronized void Two () throws InterruptedException {
        while (condition == 2){
            System.out.print(" Condition 1 is waiting ");
            wait();
        }
        ForCondition2();
        Thread.sleep(1500);
        condition = 3;
        notify();
    }
    
    public synchronized void Three () throws InterruptedException {
        while (condition == 3){
            System.out.print(" Condition 1 is waiting ");
            wait();
        }
        ForCondition3();
        Thread.sleep(1500);
        condition = 4;
        notify();
    }
    
    public synchronized void Four () throws InterruptedException {
        while (condition == 4){
            System.out.print(" Condition 1 is waiting ");
            wait();
        }
        ForCondition4();
        Thread.sleep(1500);
        condition = 1;
        notify();
    }
    
    public void ForCondition1(){
        System.out.println("__________Condition 1 is doing the job, no longer blocked");
        System.out.println("South To North and North To South, Green Light");
        for (int i = 1; i <= 30; i++){
            System.out.println(i + " seconds");
        }
        System.out.println("South To North and North To South, Yellow Light");
        for (int i = 1; i <= 5; i++){
            System.out.println(i + " seconds");
        }
        System.out.println("South To North and North To South, Red Light");
    }
    
    public void ForCondition2(){
        System.out.println("__________Condition 2 is doing the job, no longer blocked");
        System.out.println("South To West and North To East, Green Light");
        for (int i = 1; i <= 30; i++){
            System.out.println(i + " seconds");
        }
        System.out.println("South To West and North To East, Yellow Light");
        for (int i = 1; i <= 5; i++){
            System.out.println(i + " seconds");
        }
        System.out.println("South To West and North To East, Red Light");
    }
    
    public void ForCondition3(){
        System.out.println("__________Condition 1 is doing the job, no longer blocked");
        System.out.println("East To West and North To South, Green Light");
        for (int i = 1; i <= 30; i++){
            System.out.println(i + " seconds");
        }
        System.out.println("East To West and North To South, Yellow Light");
        for (int i = 1; i <= 5; i++){
            System.out.println(i + " seconds");
        }
        System.out.println("East To West and North To South, Red Light");
    }
    
    public void ForCondition4(){
        System.out.println("__________Condition 1 is doing the job, no longer blocked");
        System.out.println("East To South and West To North, Green Light");
        for (int i = 1; i <= 30; i++){
            System.out.println(i + " seconds");
        }
        System.out.println("East To South and West To North, Yellow Light");
        for (int i = 1; i <= 5; i++){
            System.out.println(i + " seconds");
        }
        System.out.println("East To South and West To North, Red Light");
    }
}
