package br.ufpb.dcx.aps.atividades.decorator.sorvete;

public class Banana extends ElementoSorveteDecorator {

    public Banana(ElementoSorvete decorated) {
        super(decorated);
        //TODO Auto-generated constructor stub
    }
    public double getPreco(){
        
        return 0.3 + super.getPreco();
    }
    public String getSabor(){

        return "banana, " + super.getSabor();
    }
}

