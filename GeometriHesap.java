/*
 * Ad Soyad: Ömer Ensar ŞAHİN
 * Ogrenci No: 250542022
 * Tarih: 11.11.2025
 * Aciklama: Gorev 1 - Geometrik Sekil Hesaplayici
 * 
 * Bu program temel geometrik sekillerin alan ve
 * cevre hesaplamalarini yapar.
 */

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // KARE
        System.out.print("Karenin kenarini gir: ");
        double squareSide = input.nextDouble();
        double squareArea = calculateSquareArea(squareSide);
        double squarePerimeter = calculateSquarePerimeter(squareSide);
        System.out.printf("Karenin alani: %.2f\n", squareArea);
        System.out.printf("Karenin cevresi: %.2f\n\n", squarePerimeter);
        
        //DİKDÖRTGEN
        System.out.print("Dikdortgenin uzun kenarini gir: ");
        double rectLength = input.nextDouble();
        System.out.print("Dikdortgenin kisa kenarini gir: ");
        double rectWidth = input.nextDouble();
        if(rectWidth > rectLength){
            double temp = rectWidth;
            rectWidth = rectLength;
            rectLength = temp;
        }
        double rectangleArea = calculateRectangleArea(rectLength, rectWidth);
        double rectanglePerimeter = calculateRectanglePerimeter(rectLength, rectWidth);
        System.out.printf("Dikdortgenin alani: %.2f\n", rectangleArea);
        System.out.printf("Dikdortgenin cevresi: %.2f\n\n", rectanglePerimeter);
        
        //DAİRE 
        System.out.print("Dairenin yaricapini gir: ");
        double radius = input.nextDouble();
        double circleArea = calculateCircleArea(radius);
        double circleCircumference = calculateCircleCircumference(radius);
        System.out.printf("Dairenin alani: %.2f\n", circleArea);
        System.out.printf("Dairenin cevresi: %.2f\n\n", circleCircumference);
        
        //ÜÇGEN
        System.out.print("Ucgenin tabanini gir: ");
        double base = input.nextDouble();
        System.out.print("Ucgenin yuksekligini gir: ");
        double height = input.nextDouble();
        System.out.print("Ucgenin birinci kenarini gir: ");
        double side1 = input.nextDouble();
        System.out.print("Ucgenin ikinci kenarini gir: ");
        double side2 = input.nextDouble();
        System.out.print("Ucgenin ucuncu kenarini gir: ");
        double side3 = input.nextDouble();

        double triangleArea = calculateTriangleArea(base, height);
        double trianglePerimeter = calculateTrianglePerimeter(side1, side2, side3);
        System.out.printf("Ucgenin alani: %.2f\n", triangleArea);
        System.out.printf("Ucgenin cevresi: %.2f\n", trianglePerimeter);
        
        input.close();
        
    }
    
    public static double calculateSquareArea(double side) {
        return side * side;
    }
    
    public static double calculateSquarePerimeter(double side) {
        return 4 * side;
    }
    
    public static double calculateRectangleArea(double length, double width) {
        return length * width;
    }
    
    public static double calculateRectanglePerimeter(double length, double width) {
        return 2 * (length + width);
    }
    
    public static double calculateCircleArea(double radius) {
        return Math.PI * radius * radius;
    }
    
    public static double calculateCircleCircumference(double radius) {
        return 2 * Math.PI * radius;
    }
    
    public static double calculateTriangleArea(double base, double height) {
        return (base * height) / 2;
    }
    
    public static double calculateTrianglePerimeter(double a, double b, double c) {
        return a + b + c;
    }
    
    
}
