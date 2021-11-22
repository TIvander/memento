public class Usuario {
    private String nome;
    private UsuarioEstado estado;

    public Usuario(){
        this.estado = UsuarioAtivo.getInstance();
    }

    public void setEstado(UsuarioEstado estado){
        this.estado = estado;
    }

    public String ativo(){
        return estado.ativo(this);
    }

    public String aguardando(){
        return estado.aguardando(this);
    }

    public String executando(){
        return estado.executando(this);
    }

    public String inativo(){
        return estado.inativo(this);
    }

    public String bloqueado(){
        return estado.bloqueado(this);
    }

    public String getNome(){
        return nome;
    }

    public String getEstado(){
        return estado.getEstado();
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}
