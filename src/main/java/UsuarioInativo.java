public class UsuarioInativo implements UsuarioEstado{
    private UsuarioInativo(){};
    private static UsuarioInativo instance = new UsuarioInativo();
    public static UsuarioInativo getInstance(){
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
        return "não autorizado";
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
        return "Inativo";
    }
}
