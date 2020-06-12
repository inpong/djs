package com.objis.jaxws_rs.demoWsClientRsServer;

import javax.ws.rs.*;

import clientws.ServerInfo;
import clientws.ServerInfoService;

@Path("/getws")
public class RsServer {
	
	@GET
	@Path("/getstring")
	public String getString() {
        ServerInfoService monService = new ServerInfoService();
                
        ServerInfo monApi = monService.getServerInfoPort();
        
        //System.out.println(monApi.getIpAddress());
        return monApi.getIpAddress();
	}

}
