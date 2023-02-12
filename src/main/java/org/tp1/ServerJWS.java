package org.tp1;

import jakarta.xml.ws.Endpoint;
import org.tp1.ws.BanqueService;

public class ServerJWS {
    public static void main(String[] args) {
        Endpoint.publish("http://0.0.0.0:9191/",new BanqueService());
        System.out.println("Serveur déployé sur http://0.0.0.0:9191");
    }
}
