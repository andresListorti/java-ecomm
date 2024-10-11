package com.ecom.cliente.ecom.utils;


public class ApiResponse {

    private String mensaje;
    private Object data;

    public ApiResponse(String mensaje, Object data) {
        this.mensaje = mensaje;
        this.data = data;
    }

    public Object getData() {
        return data;
    }

    public String getMensaje() {
        return mensaje;
    }

    
}
