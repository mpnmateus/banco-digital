import com.banco.model.Cliente;
import com.banco.model.Conta;
import com.banco.model.ContaCorrente;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ContaTeste {

    private Conta conta;

    @BeforeEach
    public void setUp(){
        conta = new ContaCorrente(new Cliente("Mateus"));
        conta.depositar(1000);
    }

    @Test
    public void efetuarSaqueTeste(){
        conta.sacar(500);
        Assertions.assertEquals(500, conta.getSaldo(), "O saldo após o saque deve ser R$ 500,00");
    }

    @Test
    public void efetuarDepositoTeste(){
        conta.depositar(500);
        Assertions.assertEquals(1500, conta.getSaldo(), "O saldo após o depósito deve ser R$ 1500,00");
    }

}

