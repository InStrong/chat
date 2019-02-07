package com.geekbrains.server;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;
import java.util.logging.*;

public class MainServer {

    protected static final Logger logger = Logger.getLogger("");

    public static void main(String[] args) throws IOException {

        logger.removeHandler(logger.getHandlers()[0]);
        Handler handler = new FileHandler("server.log");
        handler.setFormatter( new XMLFormatter());
        logger.addHandler(handler);
        new Server();
    }
}
