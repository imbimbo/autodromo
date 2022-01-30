package com.company;

public class Motor {
    public String ModeloMotor;
     class  CabecaMotor{
        public  String CabecaTipo;
        CabecaMotor(String xxx){
            this.CabecaTipo=xxx;
        }
    }
    public  Motor(String modeloMotor){
        this.ModeloMotor=modeloMotor;
    }
}
