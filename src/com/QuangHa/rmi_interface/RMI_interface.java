package com.QuangHa.rmi_interface;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface RMI_interface extends Remote {
    public String tranfer(String id) throws RemoteException;
}