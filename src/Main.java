public class Main {
    public static void main(String[] args) {
        Movie novoFilme = new Movie();
        novoFilme.name = "StarWars";
        novoFilme.anoDeLancamento = 2019;
        novoFilme.avaliacao = 3.0;
        novoFilme.inclusoNoPlano = true;
        novoFilme.duracaoEmMinutos = 1000;
        novoFilme.totalDeAvaliacoes = 6;

        System.out.println(novoFilme.name);
    }
}
