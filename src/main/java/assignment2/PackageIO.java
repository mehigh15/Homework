package assignment2;

import assignment2.Package;

import java.io.*;
import java.util.ArrayList;



public class PackageIO  {

    static ArrayList<Package> packages = new ArrayList<>();

    public static void main(String[]args){

            File f = new File("test.txt");
            FileReader fileReader = null;
            try {
                fileReader = new FileReader(f);
            }
            catch (FileNotFoundException e) {
                e.printStackTrace();
            }

            BufferedReader inFile = new BufferedReader(fileReader);

            String line ;
            boolean flag = false;
            try {
                while (!flag) {
                    line = inFile.readLine();
                    if (line == null) {
                        flag = true;
                    }
                    else {
                        String[] tokens = line.trim().split(",");
                        String targetLocation = tokens[0].trim();
                        int targetDistance = Integer.parseInt(tokens[1].trim());
                        int packageValue = Integer.parseInt(tokens[2].trim());
                        String deliveryDate = tokens[3].trim();
                        Package b = new Package(targetLocation,targetDistance,packageValue,deliveryDate);
                        packages.add(b);
                    }
                }
                inFile.close();
            }
            catch (IOException e) {
                e.printStackTrace();
            }

            for (Package newpackage : packages) {
                System.out.println(newpackage);
            }









    }


}

