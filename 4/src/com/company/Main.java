package com.company;

import com.company.point3d;


public class Main {

    public static void main(String[] args) {

        point3d myPoint = new point3d(3,6,5);
        System.out.println(myPoint.getX());
        System.out.println(myPoint.getY());
        System.out.println(myPoint.getZ());
        myPoint.setX(100);
        System.out.println(myPoint.getX());
        myPoint.setY(74);
        System.out.println(myPoint.getY());
        myPoint.setZ(274);
        System.out.println(myPoint.getZ());
        point3d newPoint = new  point3d(1064,374,-4);
        System.out.println(myPoint.isEaqual2(newPoint));
        System.out.println(point3d.distance(myPoint,newPoint));
        System.out.println(point3d.computeArea());
    }


}

