package com.liumou.DesignHomework.small1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class tcpClient {
    public static void main(String[] args) {

        try {
            Socket s = new Socket("localhost", 9999);
            BufferedReader in = new BufferedReader(new InputStreamReader(s.getInputStream()));
            PrintWriter out = new PrintWriter(s.getOutputStream(), true);

            BufferedReader sysIn = new BufferedReader(new InputStreamReader(System.in));
            String userInput;
            while ((userInput = sysIn.readLine()) != null) {
                out.println(userInput);
                String serverResponse = in.readLine();
                System.out.println("Server: " + serverResponse);
                if (userInput.equals("end")) {
                    break;
                }
            }

            in.close();
            out.close();
            sysIn.close();
            s.close();
        } catch (UnknownHostException e) {
            System.err.println("Don't know about host: localhost.");
        } catch (IOException e) {
            System.err.println("Couldn't get I/O for the connection to: localhost.");
        }
    }


}



