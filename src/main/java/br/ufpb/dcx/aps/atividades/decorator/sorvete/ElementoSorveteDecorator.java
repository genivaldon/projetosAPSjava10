package br.ufpb.dcx.aps.atividades.decorator.sorvete;

public class ElementoSorveteDecorator implements ElementoSorvete{

    private ElementoSorvete decorated;
 

    public ElementoSorveteDecorator(ElementoSorvete decorated){
        this.decorated = decorated;
    }


    @Override
    public String getSabor() {
        if(decorated == null){
            return "";
        }
        return decorated.getSabor();
    }


    @Override
    public double getPreco() {
       if(decorated == null){
           return 0;
       }
        return decorated.getPreco();
    }
  
}
