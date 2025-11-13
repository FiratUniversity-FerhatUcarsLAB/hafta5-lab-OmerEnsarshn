/*
 * Ad Soyad: Ömer Ensar Şahin
 * Ogrenci No: 250542022
 * Tarih: 13.11.2025
 * Aciklama: Gorev 3 - E-Ticaret Sepet Hesaplayici
 *
 * Bu program 3 adet urunun sepet tutarini
 * KDV, indirim ve kargo dahil hesaplar.
 */

import java.util.Scanner;

class Main {
    final static double VAT_RATE = 0.18;
    final static double SHIPPING_FEE = 29.99;
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Urun 1 fiyatini gir: ");
        double price1 = input.nextDouble();
        System.out.print("Urun 1 adedini gir: ");
        int qty1 = input.nextInt();
        
        System.out.print("Urun 2 fiyatini gir: ");
        double price2 = input.nextDouble();
        System.out.print("Urun 2 adedini gir: ");
        int qty2 = input.nextInt();
        
        System.out.print("Urun 3 fiyatini gir: ");
        double price3 = input.nextDouble();
        System.out.print("Urun 3 adedini gir: ");
        int qty3 = input.nextInt();
        
        double itemTotal1 = calculateItemTotal(price1, qty1);
        double itemTotal2 = calculateItemTotal(price2, qty2);
        double itemTotal3 = calculateItemTotal(price3, qty3);
        
        double subtotal = calculateSubtotal(itemTotal1, itemTotal2, itemTotal3);
        
        System.out.print("Indirim yuzdesini gir: ");
        double discountRate = input.nextDouble();
        
        double discountAmount = calculateDiscount(subtotal, discountRate);
        double discountedTotal = calculateDiscountedTotal(subtotal, discountAmount);
        
        double vat = calculateVAT(discountedTotal);
        double grandTotal = calculateGrandTotal(discountedTotal, vat, SHIPPING_FEE);

        System.out.printf("Ara Toplam: %.2f\n", subtotal);
        System.out.printf("Indirim Tutari: %.2f\n", discountAmount);
        System.out.printf("Indirimli Toplam: %.2f\n", discountedTotal);
        System.out.printf("KDV Tutari: %.2f\n", vat);
        System.out.printf("Genel Toplam: %.2f\n", grandTotal);

        input.close();
    }
    
    public static double calculateItemTotal(double price, int quality){
        return price * quality;
    }
    
    public static double calculateSubtotal(double total1, double total2, double total3){
        return total1 + total2 + total3;
    }
    
    public static double calculateDiscount(double subtotal, double discountRate){
        return subtotal * (discountRate / 100);
    }
    
    public static double calculateDiscountedTotal(double subtotal, double discountAmount){
        return subtotal - discountAmount;
    }
    
    public static double calculateVAT(double discountedTotal){
        return discountedTotal * VAT_RATE;
    }
    
    public static double calculateGrandTotal(double discountedTotal, double vat, double shippingFee){
        return discountedTotal + vat + shippingFee;
    }

}
