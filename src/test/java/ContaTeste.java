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
        conta.setSaldo(1000);
    }

    @Test
    public void efetuarSaque(){
        conta.sacar(500);
        Assertions.assertEquals(500, conta.getSaldo(), "O saldo após o saque deve ser R$ 500,00");
    }
}
