public interface UsuarioEstado {

    String getEstado();
    String ativo(Usuario usuario);
    String bloqueado(Usuario usuario);
    String aguardando(Usuario usuario);
    String executando(Usuario usuario);
    String inativo(Usuario usuario);

}
