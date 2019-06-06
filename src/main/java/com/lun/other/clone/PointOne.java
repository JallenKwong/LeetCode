package com.lun.other.clone;

public class PointOne
{
    private Integer x;
    private Integer y;
 
    public PointOne(PointOne point){
        this.x = point.x;
        this.y = point.y;
    }
    
    public PointOne(Integer x, Integer y)
    {
        this.x = x;
        this.y = y;
    }
    
    public PointOne copyPoint(PointOne point) throws CloneNotSupportedException
    {
        if(!(point instanceof Cloneable))
        {
            throw new CloneNotSupportedException("Invalid cloning");
        }
 
        //Can do multiple other things here
        return new PointOne(point.x, point.y);
    }
    
}
