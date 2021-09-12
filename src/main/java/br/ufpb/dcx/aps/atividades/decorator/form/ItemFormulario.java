package br.ufpb.dcx.aps.atividades.decorator.form;

public interface ItemFormulario {
  
    public String getId();

    public String getLabel();

    public void setValor(String valor);

    public Resultado validar();

    public void setObrigatorio(boolean obrigatorio);

    public boolean isPreenchido();

    public boolean isObrigatorio();

    public String getNome();
    
}
