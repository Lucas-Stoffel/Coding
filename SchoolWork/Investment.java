package SchoolWork;

import java.util.*;
import java.io.*;

class Investment {
    public static void main(String[] args) throws IOException {

        // ArrayList<String> names = new ArrayList<String>(
        //         Arrays.asList("Elena", "Thomas", "Hamilton", "Suzie", "Phil", "Matt", "Alex",
        //                 "Emma", "John", "James", "Jane", "Emily", "Daniel", "Neda", "Aaron", "Kate"));

        ArrayList<String> names = nameList();

        ArrayList<Integer> balances = new ArrayList<Integer>(
                Arrays.asList(341, 273, 278, 329, 445, 402, 388, 275, 243, 334, 412, 393, 299,
                        343, 317, 265));

        printArray(names, balances);
        getHighestBal(names, balances);
    }

    public static ArrayList<String> nameList() throws IOException {
        ArrayList<String> names = new ArrayList<String>();

        Scanner infile = new Scanner(new File("names.txt"));
        while (infile.hasNext()) {
            names.add(infile.nextLine());
        }

        infile.close();
        return names;
    }

    public static ArrayList<Integer> balanceList() throws IOException {
        ArrayList<Integer> bal = new ArrayList<Integer>();

        Scanner s = new Scanner(new File("balance.txt"));
        while (s.hasNext()) {
            bal.add(Integer.parseInt(s.nextLine()));
        }

        s.close();
        return bal;
    }

    public static void printArray(ArrayList<String> str, ArrayList<Integer> arr) {

        for (int i = 0; i < str.size(); i++) {
            System.out.println(str.get(i) + ": $" + arr.get(i));
        }

    }

    public static void getHighestBal(ArrayList<String> str, ArrayList<Integer> arr) {

        int max = Collections.max(arr);
        int index = arr.indexOf(max);

        System.out.println("Highest Balance:");
        System.out.println(str.get(index) + ": $" + max);

    }

    public static void getSecondHighestBal(ArrayList<String> str, ArrayList<Integer> arr) {

        Collections.sort(arr);

        int elm = arr.get(1);

    }

}