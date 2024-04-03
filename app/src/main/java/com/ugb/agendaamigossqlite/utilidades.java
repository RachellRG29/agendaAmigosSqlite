package com.ugb.agendaamigossqlite;

import android.annotation.SuppressLint;
import android.os.Build;


import java.util.Base64;

public class utilidades {
    static String urlConsulta = "http://192.168.1.2:5984/amigos/_design/amigos/_view/amigos";

    static String urlMto = "http://192.168.1.2:5984/amigos";
    static String user = "Cindy";
    static String passwd = "couch129.29";
    @SuppressLint("NewApi")
    static String credencialesCodificadas = Base64.getEncoder().encodeToString((user +":"+ passwd).getBytes());
    public String generarIdUnico(){
        return java.util.UUID.randomUUID().toString();
    }
}