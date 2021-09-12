package br.ufpb.dcx.aps.atividades.decorator.sorvete;

public class Calda extends ElementoSorveteDecorator {

    
    private String sabor;

    public Calda( String sabor, ElementoSorvete decorated) {
        super(decorated);
        this.sabor = sabor;
    }
    public double getPreco(){
        return 0.1 + super.getPreco();
    }
    public String getSabor() {
        return "calda(" + sabor + "), " + super.getSabor();
    }
    }
    
 

