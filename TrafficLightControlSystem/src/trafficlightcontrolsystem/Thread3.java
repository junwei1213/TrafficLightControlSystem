/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trafficlightcontrolsystem;

/**
 *
 * @author iuqe1
 */
public class Thread3 extends Thread{
    Trafficlight tfl3 = new Trafficlight();
    public Thread3 (Trafficlight TFL3){
        tfl3 = TFL3;
        System.out.println(" Thread 3 is ready");
    }
    
    public void run(){
        try{
            tfl3.Three();
        } catch (InterruptedException e){
            
        }
    }
}