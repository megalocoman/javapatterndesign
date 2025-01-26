package com.cfjofre.patterndesign.proxy;

import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class MyRemoteImpl extends UnicastRemoteObject implements MyRemote {

    protected MyRemoteImpl() throws RemoteException {}

    @Override
    public String sayHello() throws RemoteException {
        return "hello from the server";
    }
    public static void main(String[] args) {
        try{
            MyRemote myRemote = new MyRemoteImpl() ;
                Naming.rebind("remote_server", myRemote);  
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }

}
