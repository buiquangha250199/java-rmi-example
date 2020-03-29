package com.QuangHa.rmi_server;


import com.QuangHa.rmi_interface.RMI_interface;
import java.util.HashMap;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class Server extends UnicastRemoteObject implements RMI_interface{
    private static final long serialVersionUID = 1L;

    protected Server() throws RemoteException {
        super();
    }

    public String tranfer(String id) throws RemoteException{
        System.err.println(id + " is trying to contact!");

        HashMap<Integer, Student> student_data = new HashMap<Integer, Student>();

        student_data.put(17021237, new Student("Bui Quang Ha", "17021237", "K62 Caclc2", "0696656569", "17021237@vnu.edu.vn" ,"Thai Binh" ));
        student_data.put(17021213, new Student("Nguyen Quoc Cuong", "17021213", "K62 Caclc2", "0696656569","17021213@vnu.edu.vn " , "Gia Lai" ));
        student_data.put(17021242, new Student("Pham Tuan Hiep", "17021242", "K62 Caclc2", "0696656569","17021242@vnu.edu.vn" , "Hai Duong" ));

        return "Welcome " + student_data.get(Integer.parseInt(id)).name + "\r\n"
                + "ID: " + student_data.get(Integer.parseInt(id)).id + "\r\n"
                + "Class: " + student_data.get(Integer.parseInt(id)).student_class + "\r\n"
                + "Phone Number: " + student_data.get(Integer.parseInt(id)).phone_number + "\r\n"
                + "Email: " + student_data.get(Integer.parseInt(id)).email + "\r\n"
                + "Address: " + student_data.get(Integer.parseInt(id)).address + "\r\n";
    }

    public static void main(String[] args){

        try {
            Naming.rebind("//localhost/MyServer", new Server());
            System.err.println("Server is running...");

        } catch (Exception e) {
            System.err.println("Server exception: " + e.toString());
            e.printStackTrace();
        }
    }
}