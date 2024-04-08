package com.ugb.agendaamigossqlite;

import java.util.Base64;

public class utilidades {
    static String urlConsulta = "http://192.168.1.2:5984/amigos/_design/amigos/_view/amigos";

    static String urlMto = "http://192.168.1.2:5984/amigos";
    static String user = "Cindy";
    static String passwd = "couch129.29";
    static String credencialesCodificadas = Base64.getEncoder().encodeToString((user +":"+ passwd).getBytes());
    public String generarIdUnico(){
        return java.util.UUID.randomUUID().toString();
    }
}