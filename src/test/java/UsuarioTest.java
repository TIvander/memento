import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UsuarioTest {
    Usuario usuario;
    @BeforeEach
    public void setUp(){
        usuario = new Usuario();
    }
    @Test
    public void deveRetornarUsuarioAtivo() {
        usuario.setEstado(UsuarioAtivo.getInstance());
        assertEquals("Ativo", usuario.ativo());
    }
    @Test
    public void deveRetornarUsuarioAtivoBloqueado() {
        usuario.setEstado(UsuarioAtivo.getInstance());
        assertEquals("Bloqueado", usuario.bloqueado());
    }
    @Test
    public void deveRetornarUsuarioAtivoAguardando() {
        usuario.setEstado(UsuarioAtivo.getInstance());
        assertEquals("Aguardando", usuario.aguardando());
    }
    @Test
    public void deveRetornarUsuarioAtivoExecutando() {
        usuario.setEstado(UsuarioAtivo.getInstance());
        assertEquals("Executando", usuario.executando());
    }
    @Test
    public void deveRetornarUsuarioAtivoInativo() {
        usuario.setEstado(UsuarioAtivo.getInstance());
        assertEquals("Inativo", usuario.inativo());
    }

    @Test
    public void deveRetornarUsuarioBloqueado() {
        usuario.setEstado(UsuarioBloqueado.getInstance());
        assertEquals("Bloqueado", usuario.bloqueado());
    }
    @Test
    public void naoDeveRetornarUsuarioBloqueadoAtivo() {
        usuario.setEstado(UsuarioBloqueado.getInstance());
        assertEquals("não autorizado", usuario.ativo());
    }
    @Test
    public void naoDeveRetornarUsuarioBloqueadoAguardando() {
        usuario.setEstado(UsuarioBloqueado.getInstance());
        assertEquals("não autorizado", usuario.aguardando());
    }
    @Test
    public void naoDeveRetornarUsuarioBloqueadoExecutando() {
        usuario.setEstado(UsuarioBloqueado.getInstance());
        assertEquals("não autorizado", usuario.executando());
    }
    @Test
    public void naoDeveRetornarUsuarioBloqueadoInativo() {
        usuario.setEstado(UsuarioBloqueado.getInstance());
        assertEquals("não autorizado", usuario.inativo());
    }

    @Test
    public void DeveRetornarUsuarioAguardando() {
        usuario.setEstado(UsuarioAguardando.getInstance());
        assertEquals("Aguardando", usuario.aguardando());
    }
    @Test
    public void naoDeveRetornarUsuarioAguardandoAtivo() {
        usuario.setEstado(UsuarioAguardando.getInstance());
        assertEquals("não autorizado", usuario.ativo());
    }
    @Test
    public void naoDeveRetornarUsuarioAguardandoBloqueado() {
        usuario.setEstado(UsuarioAguardando.getInstance());
        assertEquals("não autorizado", usuario.bloqueado());
    }
    @Test
    public void naoDeveRetornarUsuarioAguardandoExecutando() {
        usuario.setEstado(UsuarioAguardando.getInstance());
        assertEquals("não autorizado", usuario.executando());
    }
    @Test
    public void naoDeveRetornarUsuarioAguardandoInativo() {
        usuario.setEstado(UsuarioAguardando.getInstance());
        assertEquals("não autorizado", usuario.inativo());
    }

    @Test
    public void DeveRetornarUsuarioExecutando() {
        usuario.setEstado(UsuarioExecutando.getInstance());
        assertEquals("Executando", usuario.executando());
    }
    @Test
    public void naoDeveRetornarUsuarioExecutandoAtivo() {
        usuario.setEstado(UsuarioExecutando.getInstance());
        assertEquals("não autorizado", usuario.ativo());
    }
    @Test
    public void DeveRetornarUsuarioExecutandoBloqueado() {
        usuario.setEstado(UsuarioExecutando.getInstance());
        assertEquals("Bloqueado", usuario.bloqueado());
    }
    @Test
    public void naoDeveRetornarUsuarioExecutandoAguardando() {
        usuario.setEstado(UsuarioExecutando.getInstance());
        assertEquals("não autorizado", usuario.aguardando());
    }
    @Test
    public void naoDeveRetornarUsuarioExecutandoInativo() {
        usuario.setEstado(UsuarioExecutando.getInstance());
        assertEquals("não autorizado", usuario.inativo());
    }

    @Test
    public void DeveRetornarUsuarioInativo() {
        usuario.setEstado(UsuarioInativo.getInstance());
        assertEquals("Inativo", usuario.inativo());
    }
    @Test
    public void naoDeveRetornarUsuarioInativoAtivo() {
        usuario.setEstado(UsuarioInativo.getInstance());
        assertEquals("não autorizado", usuario.ativo());
    }
    @Test
    public void naoDeveRetornarUsuarioInativoBloqueado() {
        usuario.setEstado(UsuarioInativo.getInstance());
        assertEquals("não autorizado", usuario.bloqueado());
    }
    @Test
    public void naoDeveRetornarUsuarioInativoAguardando() {
        usuario.setEstado(UsuarioInativo.getInstance());
        assertEquals("não autorizado", usuario.aguardando());
    }
    @Test
    public void naoDeveRetornarUsuarioInativoExecutando() {
        usuario.setEstado(UsuarioInativo.getInstance());
        assertEquals("não autorizado", usuario.executando());
    }
}