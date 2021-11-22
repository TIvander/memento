public class UsuarioAtivo implements UsuarioEstado{
    private UsuarioAtivo(){};
    private static UsuarioAtivo instance = new UsuarioAtivo();
    public static UsuarioAtivo getInstance(){
        return instance;
    }

    @Override
    public String getEstado() {
        return "Ativo";
    }

    @Override
    public String ativo(Usuario usuario) {
        return "Ativo";
    }

    @Override
    public String bloqueado(Usuario usuario) {
        return "Bloqueado";
    }

    @Override
    public String aguardando(Usuario usuario) {
        return "Aguardando";
    }

    @Override
    public String executando(Usuario usuario) {
        return "Executando";
    }

    @Override
    public String inativo(Usuario usuario) {
        return "Inativo";
    }
}
