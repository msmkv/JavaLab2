package Laba;

import java.util.Scanner;

public class Lab1 {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        Point3d a= new Point3d(in.nextDouble(),in.nextDouble(),in.nextDouble());
        Point3d b= new Point3d(in.nextDouble(),in.nextDouble(),in.nextDouble());
        Point3d z= new Point3d(in.nextDouble(),in.nextDouble(),in.nextDouble());
        System.out.println(Point3d.computeArea(a,b,z));
    }
}
