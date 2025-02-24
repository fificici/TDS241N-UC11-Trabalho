public class AvaliadorDeNotas {

    public static String calcularNota(Estudante estudante) {

        if(estudante.getNota() < 30 && estudante.getNota() >= 0){
            return "Aluno reprovado!!!";
        } else if (estudante.getNota() < 50 && estudante.getNota() >= 30) {
            return "Insuficiente! Estude mais.";
        } else if (estudante.getNota() < 75 && estudante.getNota() >= 50) {
            return "Regular! Nota suficiente.";
        } else if (estudante.getNota() < 90 && estudante.getNota() >= 75) {
            return "Bom trabalho! Continue assim.";
        } else if (estudante.getNota() < 0 || estudante.getNota() > 100) {
            return "Erro! Notas irreais.";
        } else {
            return "Excelente! Parabéns!!!";
        }
    }
}
