package Temp.pra2;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;
class CustomException extends Exception {
    public CustomException(String m){
        super(m);
    }
}
class cls {
    double id;
    String name;
    int nProducts;
    ArrayList<String> products;
    ArrayList<Integer> prices;

    public cls(double id, String name, int nProducts, ArrayList<String> products, ArrayList<Integer> prices) {
        this.id = id;
        this.name = name;
        this.nProducts = nProducts;
        this.products = products;
        this.prices = prices;
    }

    @Override
    public String toString() {
        return "cls{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", nProducts=" + nProducts +
                ", products=" + products +
                ", prices=" + prices +
                '}';
    }
}
public class InputPractice2 {
    public static double findAvg(ArrayList<cls> arr, String op1){
        try{
            double sum = 0;
            int size = 0;
            for(cls c: arr){
                if(c.name.equalsIgnoreCase(op1)){
                    for(int a: c.prices){
                        sum+=a;
                        size++;
                    }
                }
            }
            if(size!=0){
                return sum/size;
            }
            else {
                throw new CustomException("Not Found");
            }
        }
        catch (CustomException e){
            e.printStackTrace();
        }
        return -1;
    }
    public static void main(String[] args) throws Exception {
        String path = "C:\\Users\\ashis\\IdeaProjects\\JavaLessons\\src\\Temp\\pra2\\input.txt";
        File fileObj = new File(path);
        Scanner sc = new Scanner(fileObj);
        int n = Integer.parseInt(sc.nextLine().trim());
        ArrayList<cls> arr = new ArrayList<>();
        for(int i=0;i<n;i++) {
            double id = Double.parseDouble(sc.nextLine().trim());
            String name = sc.nextLine();
            int nProduct = Integer.parseInt(sc.nextLine().trim());
            ArrayList<String> products = new ArrayList<>();
            ArrayList<Integer> prices = new ArrayList<>();
            for(int j =0;j<nProduct;j++){
                String s1 = sc.nextLine();
                int p = Integer.parseInt(sc.nextLine().trim());
                products.add(s1);
                prices.add(p);
            }
            arr.add(new cls(id,name,nProduct,products,prices));
        }
        int op1 = Integer.parseInt(sc.nextLine().trim());
        String op2 = sc.nextLine();
        int op3 = Integer.parseInt(sc.nextLine().trim());
        System.out.println(op1);
        System.out.println(op2);
        System.out.println(op3);
        System.out.println(arr);
        System.out.println(findAvg(arr,op2));
    }
}
