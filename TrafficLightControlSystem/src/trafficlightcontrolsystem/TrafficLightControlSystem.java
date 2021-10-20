/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package trafficlightcontrolsystem;

/**
 *
 * @author iuqe1
 */
public class TrafficLightControlSystem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Trafficlight tflight = new Trafficlight();
        Thread T1 = new Thread1 (tflight);
        Thread T2 = new Thread2 (tflight);
        Thread T3 = new Thread3 (tflight);
        Thread T4 = new Thread4 (tflight);
        T1.start();
        T2.start();
        T3.start();
        T4.start();
        
    }
    
}