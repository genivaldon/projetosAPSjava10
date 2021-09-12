package br.ufpb.dcx.aps.atividades.decorator.sorvete;

public class BolaSorvete extends ElementoSorveteDecorator{

    private String sabor;

    public BolaSorvete( String sabor, ElementoSorvete decorated) {
        super(decorated);
        this.sabor = sabor;
    }
    public double getPreco(){
        return 0.5 + super.getPreco();
    }
    public String getSabor() {
        return sabor + ", " + super.getSabor();
    }
    
}
