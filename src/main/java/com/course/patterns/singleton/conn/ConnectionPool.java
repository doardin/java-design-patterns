package com.course.parterns.singleton.conn;

import java.util.ArrayList;
import java.util.List;

public class ConnectionPool {
    private static final ConnectionPool instance = new ConnectionPool();
    public final static int POOL_SIZE = 2;
    private List<Connection> connectionsPool;

    private ConnectionPool(){
        connectionsPool = new ArrayList<Connection>();
        for(int i = 0; i < POOL_SIZE; i++){
            connectionsPool.add(new Connection());
        }
    }

    public static ConnectionPool getInstance(){
        return instance;
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
