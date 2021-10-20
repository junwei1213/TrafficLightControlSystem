/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trafficlightcontrolsystem;

/**
 *
 * @author iuqe1
 */
public class Thread4 extends Thread{
    Trafficlight tfl4 = new Trafficlight();
    public Thread4 (Trafficlight TFL4){
        tfl4 = TFL4;
        System.out.println(" Thread 4 is ready");
    }
    
    public void run(){
        try{
            tfl4.Four();
        } catch (InterruptedException e){
            
        }
    }
}
