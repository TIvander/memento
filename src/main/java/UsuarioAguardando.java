public class UsuarioAguardando implements UsuarioEstado{
    private UsuarioAguardando(){};
    private static UsuarioAguardando instance = new UsuarioAguardando();
    public static UsuarioAguardando getInstance(){
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
        return "Aguardando";
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
