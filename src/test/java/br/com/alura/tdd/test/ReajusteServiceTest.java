package br.com.alura.tdd.test;

import br.com.alura.tdd.modelo.Funcionario;
import br.com.alura.tdd.service.Desempenho;
import br.com.alura.tdd.service.ReajusteService;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReajusteServiceTest {

    @Test
    public void reajusteDeveriaSerDeTresPorcentoQuandoDesempenhoForADesejar() {
            ReajusteService service = new ReajusteService();
            Funcionario funcionario = new Funcionario("Ana", LocalDate.now(), new BigDecimal("1000"));
            service.concederReajuste(funcionario, Desempenho.A_DESEJAR);

            assertEquals(new BigDecimal("1030.00"), funcionario.getSalario());
    }
}