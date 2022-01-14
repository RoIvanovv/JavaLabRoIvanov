package com.company;

import java.util.Scanner;

public class point3d {

    private double xCoord;
    private double yCoord;
    private double zCoord;

    public point3d (double x, double y, double z)
    {
        xCoord = x;
        yCoord = y;
        zCoord = z;
    }
    public point3d ()
    {
        xCoord = 0;
        yCoord = 0;
        zCoord = 0;
    }
    public boolean isEaqual2 (point3d test)
    {
        return (xCoord == test.getX())&&(yCoord == test.getY())&&(zCoord == test.getZ());
    }

    public double getX()
    {
        return xCoord;
    }
    public double getY()
    {
        return yCoord;
    }
    public double getZ()
    {
        return zCoord;
    }
    public void setX (double val)
    {
        xCoord = val;
    }
    public void setY (double val)
    {
        yCoord = val;
    }
    public void setZ (double val)
    {
        zCoord = val;
    }
    public static double distance(point3d a, point3d b)
    {
        double rez, rezX, rezY, rezZ;
        rezX = Math.pow(a.getX()-b.getX(),2);
        rezY = Math.pow(a.getY()-b.getY(),2);
        rezZ = Math.pow(a.getZ()-b.getZ(),2);
        rez = Math.sqrt(rezX+rezY+rezZ);
        return rez;
    }
    public static double computeArea()
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("input X1,Y1,Z1; X2,Y2,Z2; X3,Y3,Z3");
        String tmp = scan.nextLine();
        scan.close();
        String[] mas = tmp.split(" ");
        point3d[] newMass = new point3d[mas.length];
        for (int i=0;i<=mas.length-1;i++){
            String[] TMP = mas[i].split(",");
            newMass[i] = new point3d(Integer.parseInt(TMP[0]),Integer.parseInt(TMP[1]),Integer.parseInt(TMP[2]));

        }
        double halfP = (point3d.distance(newMass[0],newMass[1]) + point3d.distance(newMass[1],newMass[2])+point3d.distance(newMass[2],newMass[0]));
        return Math.sqrt(halfP * (halfP - point3d.distance(newMass[0],newMass[1]))*(halfP - point3d.distance(newMass[1],newMass[2]))+(halfP - point3d.distance(newMass[2],newMass[0])));
    }

}
