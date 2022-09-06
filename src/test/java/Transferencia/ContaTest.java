package Transferencia;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContaTest {
    Cliente xuxa;
    Cliente silvioSantos;
    Conta contaXuxa;
    Conta contaSilvioSantos;

    @BeforeEach
    void setUp() {
        xuxa = new Cliente("Xuxa", "12345678900", "1111111");
        silvioSantos = new Cliente("Silvio Santos", "00987654321", "222222");

        contaXuxa = new Conta("0025", "2254", 2500.00, xuxa);
        contaSilvioSantos = new Conta("0026", "2251", 3500.00, silvioSantos);
    }

    @Test
    public void realizarTransacao(){
        contaXuxa.realizarTransferencia(1000.00, contaSilvioSantos);
        assertEquals(1500.00, contaXuxa.getSaldo());
        assertEquals(4500.00, contaSilvioSantos.getSaldo());
    }

    @Test
    public void validarTransferenciaInvalida(){
        boolean resultado = contaXuxa.realizarTransferencia(3500.00, contaSilvioSantos);
        assertFalse(resultado);
    }

    @Test
    public void validarProprietario(){
        assertEquals(xuxa, contaXuxa.getProprietario());
    }

    @Test
    @DisplayName("Validar numero da Agencia = 0025")
    public void validarAgencia(){
        assertEquals("0025", contaXuxa.getAgencia());
    }

    @Test
    @DisplayName("Validar numero da Conta = 2254")
    public void validarNumeroConta(){
        assertEquals("2254", contaXuxa.getNumeroConta());
    }

    @Test
    @DisplayName("Validar NOME = Silvio Santos")
    public void validarNome(){
        assertEquals("Silvio Santos", silvioSantos.getNome());
    }

    @Test
    @DisplayName("Validar CPF = Silvio Santos = 00987654321")
    public void validarCpf(){
        assertEquals("00987654321", silvioSantos.getCpf());
    }

    @Test
    @DisplayName("Validar RG = Silvio Santos = 222222")
    public void validarRg(){
        assertEquals("222222", silvioSantos.getRg());
    }
}
