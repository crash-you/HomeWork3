package com.liumou.DesignHomework.small1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class tcpServer {
    public static void main(String[] args) {
            try {
                ServerSocket ss = new ServerSocket(9999);
                System.out.println("Server is running. Waiting for client connection...");

                Socket s = ss.accept();

                System.out.println("Client connected.");

                BufferedReader in = new BufferedReader(new InputStreamReader(s.getInputStream()));
                PrintWriter out = new PrintWriter(s.getOutputStream(), true);

                String str;
                while ((str = in.readLine()) != null) {
                    System.out.println("Received: " + str);
                    if (str.equals("end")) {
                        break;
                    }
                    out.println(str);
                }

                in.close();
                out.close();
                s.close();
                ss.close();
                System.out.println("Connection closed.");
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

        }

    }
