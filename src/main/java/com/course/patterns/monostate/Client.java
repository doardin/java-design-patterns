package com.course.patterns.monostate;

import com.course.patterns.monostate.conn.Connection;
import com.course.patterns.monostate.conn.ConnectionPool;

public class Client {
    public static void doQuery1(){
        ConnectionPool pool = new ConnectionPool();
        Connection conn = pool.getConnection();
        if(conn != null){
            conn.query("SELECT * FROM A1");
            pool.leaveConnection(conn);
        }
    }

    public static void doQuery2(){
        ConnectionPool pool = new ConnectionPool();
        Connection conn = pool.getConnection();
        if(conn != null){
            conn.query("SELECT * FROM A2");
            pool.leaveConnection(conn);
        }
    }

    public static void doQuery3(){
        ConnectionPool pool = new ConnectionPool();
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
