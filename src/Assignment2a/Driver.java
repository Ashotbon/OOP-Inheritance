package Assignment2a;

import java.util.Arrays;
import pack1.WheeledTransportation;
import pack2.Train;
import pack2.Tram;
import pack3.Metro;
import pack4.Monowheel;
import pack5.Aircraft;
import pack5.WorldWarIIAiroplane;
import pack6.Ferry;

public class Driver{


    public static void main(String[] args) {

         WheeledTransportation wt1 = new WheeledTransportation(8, 120.0);
         WheeledTransportation wt2 = new WheeledTransportation();
         Train t1 = new Train();
         Train t2 = new Train();
         Train t3 = new Train(40 ,400, 32, "New York", "Montreal");
         Metro m1 =new Metro();
         Metro m2= new Metro (50, 200, 40,
                 "Laval", "Montreal", 15);
         Metro m4= new Metro (50, 400, 40,
                 "Boston", "New York", 15);
         Metro m3= new Metro (m2);
         Metro m5= new Metro (m4);
         Metro m6 =new Metro(70, 380, 65,
                 "Rome", "Paris", 15);
         Tram tram1 =new Tram();
         Tram tram2 =new Tram(12, 60, 1,
                 "Cann", "Paris", 30, 1945);
         Tram tram3 =new Tram( tram1);
         Monowheel mono =new Monowheel(8, 267, 5);
         Monowheel mono1 =new Monowheel(12, 185, 7);
         Aircraft B7 =new Aircraft( 300000000, 12000);
         Ferry F3000 =new Ferry( 16, 320, 30000);
         WorldWarIIAiroplane L22 =new WorldWarIIAiroplane( );
         WorldWarIIAiroplane L25 =new WorldWarIIAiroplane( 15000000, 3, true);
         Object[] mixedArray = new Object[20];
         mixedArray[0] = new Train();  
         mixedArray[1] = new Metro(); 
//         mixedArray[2] = new Aircraft(1000000.0, 15000.0);
//         findLeastAndMostExpensiveAircraft(mixedArray);
         
         System.out.println(wt1.toString());
         System.out.println(wt2.toString());
         System.out.println(t1.toString());
         System.out.println(t2.toString());
         System.out.println(t3.toString());
         System.out.println(m1.toString());
         System.out.println(m2.toString());
         System.out.println(m3.toString());
         System.out.println(m3.equals(m2));
         System.out.println(m3.equals(t1));
         System.out.println(m4.equals(m5));
         System.out.println(m6.equals(tram1));
         System.out.println(tram2.equals(tram1));
         System.out.println(tram3.toString());
         System.out.println(mono.toString());
         System.out.println(mono1.toString());
         System.out.println(B7.toString());
         System.out.println(F3000.toString());
         System.out.println(L22.equals(L25));
         Object[] array1 = createMixedObjectsArray();
         Object[] array2 = createArrayWithoutAircraft();

         // Step 3: Call findLeastAndMostExpensiveAircraft() for both arrays
         findLeastAndMostExpensiveAircraft(array1);
         findLeastAndMostExpensiveAircraft(array2);
       

     
    }

    
    
    private static Object[] createMixedObjectsArray() {
        // Created an array and filled it with objects from different classes
        Object[] array = new Object[20];
        Aircraft aircraft1=new Aircraft(2300,4000);
        Aircraft aircraft2=new Aircraft(4300,5000);
        Aircraft aircraft3=new Aircraft(900000,4000);
        Aircraft aircraft4=new Aircraft(120000000,5000);
        array[0] = new WheeledTransportation();
        array[1] = new Train();
        array[2] = new Metro();
        array[3] = new Tram();
        array[4] = new Monowheel();
        array[5] = new Ferry();
        array[6] = new Aircraft();
        array[7] = new WorldWarIIAiroplane();
       
        array[9] = aircraft2;
        array[10] = aircraft3;
        array[11] = aircraft4;
        array[12] = aircraft1;
 

        return array;
    }
    private static Object[]  createArrayWithoutAircraft() {
        // Created an array and filled it with objects from different classes
        Object[] array = new Object[20];
  
        Train t1 = new Train();
        Train t2 = new Train();
        Train t3 = new Train(40 ,400, 32, "New York", "Montreal");
        Metro m1 =new Metro();
        Metro m2= new Metro (50, 200, 40,
                "Laval", "Montreal", 15);
        Metro m4= new Metro (50, 400, 40,
                "Boston", "New York", 15);
        array[0] = new WheeledTransportation();
        array[1] = new Train();
        array[2] = new Metro();
        array[3] = new Tram();
        array[4] = new Monowheel();
        array[5] = new Ferry();
        array[6] = m1;
        array[7] = new WorldWarIIAiroplane();
        array[8] = new WheeledTransportation();
        array[9] = t1;
        array[10] = t2;
        array[11] = t3;
        array[12] = new Monowheel();
        array[13] = m1;
        array[14] = m2;
        array[17] = m4;
        array[18]= new Aircraft();

        return array;
    }


    private static void findLeastAndMostExpensiveAircraft(Object[] array) {
        double leastExpensivePrice = Double.MAX_VALUE;
        double mostExpensivePrice = Double.MIN_VALUE;
        Aircraft leastExpensiveAircraft = null;
        Aircraft mostExpensiveAircraft = null;

        boolean aircraftFound = false;

        for (Object obj : array) {
            if (obj instanceof Aircraft) {
                Aircraft aircraft = (Aircraft) obj;
                double price = aircraft.getPrice();

                if (price < leastExpensivePrice) {
                    leastExpensivePrice = price;
                    leastExpensiveAircraft = aircraft;
                }

                if (price > mostExpensivePrice) {
                    mostExpensivePrice = price;
                    mostExpensiveAircraft = aircraft;
                }

                aircraftFound = true;
            }
        }

       
        try {
            if (aircraftFound) {
                if (leastExpensiveAircraft != null) {
                    System.out.println("Least Expensive Aircraft: " + leastExpensiveAircraft);
                }

                if (mostExpensiveAircraft != null) {
                    System.out.println("Most Expensive Aircraft: " + mostExpensiveAircraft);
                }
            } else {
                System.out.println("No Aircraft found in the array.");
            }
        } catch (Exception e) {
            // Handle the exception 
            e.printStackTrace();
        }
    }


}
