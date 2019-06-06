package com.lun.other.clone;

public class Test {
    public static void main(String[] args)
    {
        PointOne one = new PointOne(1,2);
        PointTwo two = new PointTwo(1,2,3);
 
        PointOne clone1 = new PointOne(one);
        PointOne clone2 = new PointOne(two);
 
        //Let check for class types
        System.out.println(clone1.getClass());
        System.out.println(clone2.getClass());
    }
}

/*
class com.lun.other.clone.PointOne
class com.lun.other.clone.PointOne
*/