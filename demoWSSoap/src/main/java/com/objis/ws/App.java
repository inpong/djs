package com.objis.ws;

import javax.xml.ws.Endpoint;

//Endpoint publisher
public class App{

	public static void main(String[] args) {
	   Endpoint.publish("http://localhost:8888/ws/server", new ServerInfo());

	   System.out.println("Service is published!");
    }

}