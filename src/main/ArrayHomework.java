package main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

    public class ArrayHomework {
        private Scanner s = new Scanner(System.in);

        private ArrayList<String> arrayRep = new ArrayList<>();
        private ArrayList <Integer> numbers = new ArrayList<>();

        public ArrayHomework() {
            numbers.add(2);
            numbers.add(1);
            numbers.add(7);
            numbers.add(3);
            numbers.add(11);
            arrayRep.add("One");
            arrayRep.add("Two");
            arrayRep.add("Tree");
            arrayRep.add("Four");
        }

        private void NumberScanner() {
            System.out.print("Enter the size of the array: ");
            int size = s.nextInt();
            numbers.clear();
            System.out.print("Enter the numbers: ");
            for (int i =0; i< size; i++) {
                numbers.add(s.nextInt());
            }
        }

        public void DecsOrder()  {
            System.out.println("Initial order: " + numbers.toString());
            Collections.sort(numbers, Collections.reverseOrder());
            System.out.println("List after the use of Collection.reverseOrder(): " + numbers);
        }

        public void ArrayReplaceOrder() {
            System.out.println("Initial values: " + arrayRep.toString());
            int index = arrayRep.indexOf("Tree");
            arrayRep.set(index, "Three");
            System.out.println("Changed array element Tree " + arrayRep);
        }

        private int SumPositiveNum() {
            int sum = 0;
            for ( int i = 0; i<numbers.size(); i++ ) {
                if (numbers.get(i) >= 0) {
                    sum += numbers.get(i);
                }
            }
            return sum;
        }

        private double ArrayAverage() {
            double sum = 0.0;
            for (int i = 0; i<numbers.size(); i++) {
                sum += numbers.get(i);
            }
            return sum / numbers.size();
        }

        public void PositiveNumberSum() {
            NumberScanner();
            System.out.println("Positive nums sum equals " + SumPositiveNum());
        }

        public void AverageOfArray() {
            NumberScanner();
            System.out.println("Average is " + ArrayAverage());
        }

        public void NumsDivisibleByThree() {
            numbers.clear();
            numbers.add(3);
            numbers.add(9);
            numbers.add(11);
            numbers.add(18);
            numbers.add(20);
            numbers.add(22);

            numbers.removeIf(n -> (n%3 == 0));
            System.out.print("Numbers that aren't divisible by 3: " + numbers);
        }
        public void NumsDivisibleByThreeAltern() {
            numbers.clear();
            numbers.add(3);
            numbers.add(9);
            numbers.add(11);
            numbers.add(18);
            numbers.add(20);
            numbers.add(22);

            for (int i =0; i<numbers.size();i++) {
                if (numbers.get(i) % 3 == 0) {
                    numbers.remove(i--);
                }
            }
            System.out.println("Numbers that aren't divisible by 3" + numbers);
        }
    }
