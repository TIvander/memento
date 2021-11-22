public class UsuarioExecutando implements UsuarioEstado{
    private UsuarioExecutando(){};
    private static UsuarioExecutando instance = new UsuarioExecutando();
    public static UsuarioExecutando getInstance(){
        return instance;
    }

    @Override
    public String getEstado() {
        return "Executando";
    }

    @Override
    public String ativo(Usuario usuario) {
        return "não autorizado";
    }

    @Override
    public String bloqueado(Usuario usuario) {
        return "Bloqueado";
    }

    @Override
    public String aguardando(Usuario usuario) {
        return "não autorizado";
    }

    @Override
    public String executando(Usuario usuario) {
        return "Executando";
    }

    @Override
    public String inativo(Usuario usuario) {
        return "não autorizado";
    }
}
