package com.company;

public class Carro extends Viatura implements ICarro{

    @Override
    public void vira(String direcao) {
        System.out.println("Virou à " +  direcao);
    }

    private int _distancia;

    public int get_distancia() {

        return _distancia;
    }

    public void set_distancia(int distancia) {
        if(distancia >=0)this._distancia = distancia;
    }

    public  Carro(String marca, String modelo){
       super(marca,modelo);

   }

    public  Carro(){
       super();
   }

    @Override
    public void mostrador() {
        super.mostrador();
        System.out.println("Distância:" + this._distancia);
    }

    IOnExcesso_Listener lst;
    public  void setOnExcesso_Listener(IOnExcesso_Listener l){
        this.lst=l;
    }

    @Override
    public void acelera(int delta) {
        super.acelera(delta);
        set_distancia(_distancia + _velocidade);
        if(get_velocidade() > 140)lst.OnExcesso_Handler(new OnExcessoArgs(this,"Lisboa - Istec"));
    }

    @Override
    public void trava() {
        this._velocidade=0;
    }
}
