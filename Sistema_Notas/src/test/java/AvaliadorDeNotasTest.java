import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AvaliadorDeNotasTest {

    private Estudante aluno1, aluno2, aluno3, aluno4, aluno5, aluno6, aluno7;


    @BeforeEach
    public void setup() {

        System.out.println("Criando novos alunos...");

        aluno1 = new Estudante("João", 80.0);
        aluno2 = new Estudante ("Jemerson", 10.0);
        aluno3 = new Estudante ("Jobson", 40.0);
        aluno4 = new Estudante("José", 95.0);
        aluno5 = new Estudante("Jonas", 60.0);
        aluno6 = new Estudante("Jonathan", -1.0);
        aluno7 = new Estudante("Jackson", 101.0);

    }

    @Test
    public void testNotaSuficiente() {
        System.out.println("Testando notas suficiente...");
        String notaProva = AvaliadorDeNotas.calcularNota(aluno1);
        assertEquals("Bom trabalho! Continue assim.", notaProva, "Feedback da nota!");

    }

    @Test
    public void testNotaSuficiente2() {
        System.out.println("Testando notas suficiente...");
        String notaProva = AvaliadorDeNotas.calcularNota(aluno2);
        assertEquals("Aluno reprovado!!!", notaProva, "Feedback da nota!");

    }

    @Test
    public void testNotaSuficiente3() {
        System.out.println("Testando notas suficiente...");
        String notaProva = AvaliadorDeNotas.calcularNota(aluno3);
        assertEquals("Insuficiente! Estude mais.", notaProva, "Feedback da nota!");

    }

    @Test
    public void testNotaSuficiente4() {
        System.out.println("Testando notas suficiente...");
        String notaProva = AvaliadorDeNotas.calcularNota(aluno4);
        assertEquals("Excelente! Parabéns!!!", notaProva, "Feedback da nota!");

    }

    @Test
    public void testNotaSuficiente5() {
        System.out.println("Testando notas suficiente...");
        String notaProva = AvaliadorDeNotas.calcularNota(aluno5);
        assertEquals("Regular! Nota suficiente.", notaProva, "Feedback da nota!");

    }

    @Test
    public void testNotaSuficiente6() {
        System.out.println("Testando notas suficiente...");
        String notaProva = AvaliadorDeNotas.calcularNota(aluno6);
        assertEquals("Erro! Notas irreais.", notaProva, "Feedback da nota!");

    }

    @Test
    public void testNotaSuficiente7() {
        System.out.println("Testando notas suficiente...");
        String notaProva = AvaliadorDeNotas.calcularNota(aluno7);
        assertEquals("Erro! Notas irreais.", notaProva, "Feedback da nota!");

    }
}