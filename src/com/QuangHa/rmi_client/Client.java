package com.QuangHa.rmi_client;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

import javax.swing.JOptionPane;

import com.QuangHa.rmi_interface.RMI_interface;

public class Client {
    private static RMI_interface look_up;

    public static void main(String[] args) throws MalformedURLException, RemoteException, NotBoundException {

        look_up = (RMI_interface) Naming.lookup("//localhost/MyServer");
        String id = JOptionPane.showInputDialog("Input student id: ");

        String response = look_up.tranfer(id);
        JOptionPane.showMessageDialog(null, response);
    }
}