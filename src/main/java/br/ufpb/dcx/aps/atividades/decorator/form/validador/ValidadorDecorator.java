package br.ufpb.dcx.aps.atividades.decorator.form.validador;


import br.ufpb.dcx.aps.atividades.decorator.form.Resultado;
import br.ufpb.dcx.aps.atividades.decorator.form.validador.ValidadorCampo;


public class ValidadorDecorator implements ValidadorCampo {

    private ValidadorCampo componente;

    protected ValidadorCampo decorated;

    public ValidadorDecorator(){}

    public ValidadorDecorator(ValidadorCampo decorated){
        this.decorated = decorated;
    }

    @Override
    public Resultado validarCampo(String valor) {
        if(decorated == null) return new Resultado();
        return decorated.validarCampo(valor);
    }

    public void setDecorated(ValidadorCampo decorated){
        this.decorated = decorated;
    }
}
