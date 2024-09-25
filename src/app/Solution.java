package app;

public class Solution {

    public static void main(String[]args){

        String prodNumb = "Product №";
        String prodName = "smartphone";
        String totalSales = "total sales for";
        String salesBy = "sales by day is";
        String dayIs = "day is";
        String currancy = "EUR";
        int numberPro = 1;


        double salesSum = 12153.41;
        int totalDays = 5;
        double daySales = salesSum/totalDays;
        int smartQuant = 20;
        double priceSmart = salesSum / smartQuant;
        byte dayNum1 = 1;
        byte dayNum2 = dayNum1++;
        byte dayNum3 = dayNum2++;
        byte dayNum4 = dayNum3++;
        byte dayNum5 = dayNum4++;

        int day1Sale = 3;
        int day2Sale = day1Sale +3;
        int day3Sale = day2Sale +6;
        int day4Sale = day3Sale +2;
        int day5Sale = day4Sale +6;

        double sum1Day = day1Sale * priceSmart;
        double sum2Day = day2Sale * priceSmart;
        double sum3Day = day3Sale * priceSmart;
        double sum4Day = day4Sale * priceSmart;
        double sum5Day = day5Sale * priceSmart;

        System.out.printf("%s %d: %s,\n%s %d %s %s %.2f,\n%s %s %.2f.\n ",
                prodNumb, numberPro, prodName, totalSales, totalDays,
                dayIs, currancy, salesSum, salesBy, currancy, daySales);







    }
}
