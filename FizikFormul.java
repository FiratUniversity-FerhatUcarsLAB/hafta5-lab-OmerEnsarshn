/*
 * Ad Soyad: Ömer Ensar ŞAHİN
 * Ogrenci No: 250542022
 * Tarih: 11.11.2025
 * Aciklama: Gorev 2 - Fizik Formulu Asistani
 *
 * Bu program temel fizik formullerini kullanarak
 * hesaplamalar yapar.
 */

import java.util.Scanner;

class Main {
    final static double GRAVITY =9.8;
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Gidilen mesafeyi girin (m): ");
        double distance = input.nextDouble();

        System.out.print("Gecen sureyi girin (s): ");
        double time = input.nextDouble();
        
        double v = calculateVelocity(distance, time);
        System.out.printf("Hiz: %2f m/s\n", v);
        
        System.out.print("Hiz degisimini gir (m/s): ");
        double deltaV = input.nextDouble();
        
        System.out.print("Gecen sureyi gir (s): ");
        double t = input.nextDouble();
        
        double a = calculateAcceleration(deltaV, t);
        System.out.printf("Ivme: %.2f m/s²\n", a);
        
        System.out.print("Kutleyi gir (kg): ");
        double mass = input.nextDouble();
        
        double F = calculateForce(mass, a);
        System.out.printf("Kuvvet: %.2f N\n", F);
        
        System.out.print("Alinan mesafeyi gir (m): ");
        double workDistance = input.nextDouble();
        
        double W = calculateWork(F, workDistance);
        System.out.printf("Is: %.2f J\n", W);
        
        System.out.print("Isi tamamlamak icin gecen sureyi gir (s): ");
        double powerTime = input.nextDouble();
        
        double P = calculatePower(W, powerTime);
        System.out.printf("Guc: %.2f W\n", P);
        
        double KE = calculateKineticEnergy(mass, v);
        System.out.printf("Kinetik Enerji: %.2f J\n", KE);
        
        System.out.print("Yuksekligi gir (m): ");
        double height = input.nextDouble();
        
        double PE = calculatePotentialEnergy(mass, height);
        System.out.printf("Potansiyel Enerji: %.2f J\n", PE);
        
        double momentum = calculateMomentum(mass, v);
        System.out.printf("Momentum: %.2f kg·m/s\n", momentum);
        
        input.close();
        
        
    }
    
    public static double calculateVelocity(double distance, double time){
        return distance / time;
    }
    
    public static double calculateAcceleration(double deltaV, double time){
        return deltaV / time;
    }
    
    public static double calculateForce(double mass, double acceleration){
        return mass * acceleration;
    }
    
    public static double calculateWork(double force, double distance){
        return force * distance;
    }
    
    public static double calculatePower(double work, double time){
        return work / time;
    }
    
    public static double calculateKineticEnergy(double mass, double velocity){
        return 0.5 * mass * Math.pow(velocity, 2);
    }
    
    public static double calculatePotentialEnergy(double mass, double height){
        return mass * GRAVITY * height;
    }
    
    public static double calculateMomentum(double mass, double velocity){
        return mass * velocity;
    }
}
