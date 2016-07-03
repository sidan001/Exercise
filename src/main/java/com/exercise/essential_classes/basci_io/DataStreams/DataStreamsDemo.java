package com.exercise.essential_classes.basci_io.DataStreams;

import java.io.*;

public class DataStreamsDemo {

    static final String dataFile = "invoicedata";

    static final double[] prices = {19.99, 9.99, 15.99, 3.99, 4.99};
    static final int[] units = {12, 8, 13, 29, 50};
    static final String[] descs = {
            "Java T-shirt",
            "Java Mug",
            "Duke Juggling Dolls",
            "Java Pin",
            "Java Key Chain"
    };

    public static void main(String[] args) {
        try {
            outputDemo();
            inputDemo();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    private static void inputDemo() {
        DataInputStream in = null;
        try {
            in = new DataInputStream(new
                    BufferedInputStream(new FileInputStream(dataFile)));
            double price;
            int unit;
            String desc;
            double total = 0.0;


            while (true) {
                price = in.readDouble();
                unit = in.readInt();
                desc = in.readUTF();
                System.out.format("You ordered %d" + " units of %s at $%.2f%n",
                        unit, desc, price);
                total += unit * price;
            }
        } catch (EOFException e) {
            //Notice that DataStreams detects an end-of-file condition by catching EOFException,
            // instead of testing for an invalid return value.
            System.out.println("读取到文件末尾");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (in !=null){
                try {
                    in.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    private static void outputDemo() throws IOException {

        DataOutputStream out =null;

        try {
            out = new DataOutputStream(new BufferedOutputStream(
                    new FileOutputStream(dataFile)));

            for (int i = 0; i < prices.length; i++) {
                out.writeDouble(prices[i]);
                out.writeInt(units[i]);
                out.writeUTF(descs[i]);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (out !=null){
                out.close();
            }
        }
    }
}
