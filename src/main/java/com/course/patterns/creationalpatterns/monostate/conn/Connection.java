package com.course.patterns.creationalpatterns.monostate.conn;

public class Connection {
    private Boolean inUse;

    public Connection(){
        inUse = false;
    }

    public Object query(String sql){
        System.out.println("Running '"+ sql + "' in Connection" + this);
        return null;
    }

    public boolean isInUse(){
        return inUse;
    }

    public void setInUse(boolean status){
        inUse = status;
    }
}
