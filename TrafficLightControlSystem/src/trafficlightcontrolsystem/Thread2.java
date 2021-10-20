/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trafficlightcontrolsystem;

/**
 *
 * @author iuqe1
 */
public class Thread2 extends Thread{
    Trafficlight tfl2 = new Trafficlight();
    public Thread2 (Trafficlight TFL2){
        tfl2 = TFL2;
        System.out.println(" Thread 2 is ready");
    }
    
    public void run(){
        try{
            tfl2.Two();
        } catch (InterruptedException e){
            
        }
    }
}

