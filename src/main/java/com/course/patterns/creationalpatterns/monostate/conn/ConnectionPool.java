package com.course.patterns.creationalpatterns.monostate.conn;

import java.util.ArrayList;
import java.util.List;

public class ConnectionPool {
    public final static int POOL_SIZE = 2;
    private static List<Connection> connectionsPool;

    static {
        System.out.println("Creating Connection Pool");
        connectionsPool = new ArrayList<>();
        for(int i = 0; i < POOL_SIZE; i++){
            connectionsPool.add(new Connection());
        }
    }

    public ConnectionPool(){
        System.out.println("New instance of Connection Pool");
    }

    public Connection getConnection(){
        Connection available = null;
        for(Connection conn : connectionsPool){
            if(!conn.isInUse()){
                available = conn;
                break;
            }
        }

        if(available == null){
            System.out.println("No connections available");
            return null;
        }
        available.setInUse(true);
        return available;
    }

    public void leaveConnection(Connection conn){
        conn.setInUse(false);
    }
}
