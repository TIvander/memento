public class UsuarioBloqueado implements UsuarioEstado{
    private UsuarioBloqueado(){};
    private static UsuarioBloqueado instance = new UsuarioBloqueado();
    public static UsuarioBloqueado getInstance(){
        return instance;
    }

    @Override
    public String getEstado() {
        return "não autorizado";
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
        return "não autorizado";
    }

    @Override
    public String inativo(Usuario usuario) {
        return "não autorizado";
    }
}
