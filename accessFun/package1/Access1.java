package com.learning.accessFun.package1;

public class Access1 {
    /**default, int hours =4     int minutes = 27 in same package**/
    // public we can access from anywhere
    // public,public int hours =4 public int minutes = 27; if you want to run from another package u need to import.
    // private,does only in  the same class, private int hours =4;
    // protected gives access in the same package and also if you need to run another package use 'extends'

    protected int hours =4;
    protected int minutes = 27;
}
