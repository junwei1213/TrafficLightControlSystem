/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trafficlightcontrolsystem;

/**
 *
 * @author iuqe1
 */
public class Thread1 extends Thread{
    Trafficlight tfl1 = new Trafficlight();
    public Thread1 (Trafficlight TFL1){
        tfl1 = TFL1;
        System.out.println(" Thread 1 is ready");
    }
    
    public void run(){
        try{
            tfl1.One();
        } catch (InterruptedException e){
            
        }
    }
}
