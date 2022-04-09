package com.course.parterns.singleton;

import com.course.parterns.singleton.conn.Connection;
import com.course.parterns.singleton.conn.ConnectionPool;

public class Client {
    public static void doQuery1(){
        ConnectionPool pool = ConnectionPool.getInstance();
        Connection conn = pool.getConnection();
        if(conn != null){
            conn.query("SELECT * FROM A1");
            pool.leaveConnection(conn);
        }
    }

    public static void doQuery2(){
        ConnectionPool pool = ConnectionPool.getInstance();
        Connection conn = pool.getConnection();
        if(conn != null){
            conn.query("SELECT * FROM A2");
            pool.leaveConnection(conn);
        }
    }

    public static void doQuery3(){
        ConnectionPool pool = ConnectionPool.getInstance();
        Connection conn = pool.getConnection();
        if(conn != null){
            conn.query("SELECT * FROM A3");
            pool.leaveConnection(conn);
        }
    }

    public static void main(String[] args) {
        System.out.println("Connection Pool Size: " + ConnectionPool.POOL_SIZE);
        doQuery1();
        doQuery2();
        doQuery3();
    }

}
