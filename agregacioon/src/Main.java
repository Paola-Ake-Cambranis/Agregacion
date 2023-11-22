public class Main {
    public static void main(String[] args) {

        Libro libro = new Libro("Historia del Arte");
        Boligrafo boligrafo = new Boligrafo(" marca Zebra");
        Tijera tijera = new Tijera("Escolar");
        Regla regla = new Regla(30.0);
        Borrador borrador = new Borrador("Con forma de lapiz");
        Sacapunta sacapunta = new Sacapunta(" marca Pelican");
        Pegamento pegamento = new Pegamento("En barra");
        Lapiz lapiz = new Lapiz(" marca Bic");
        Corrector corrector = new Corrector(" marca Bic");
        Marcatexto marcatexto = new Marcatexto("Rosita");


        MochilaEscolar mochilaEscolar = new MochilaEscolar("Converse", libro, boligrafo, tijera,
            regla, borrador, sacapunta, pegamento,lapiz, corrector, marcatexto);

        Libro libroEnMochila = mochilaEscolar.getLibro();
        Boligrafo boligrafoEnMochila = mochilaEscolar.getBoligrafo();
        Tijera tijeraEnMochila = mochilaEscolar.getTijera();
        Regla reglaEnMochila = mochilaEscolar.getRegla();
        Borrador borradorEnMochila = mochilaEscolar.getBorrador();
        Sacapunta sacapuntaEnMochila = mochilaEscolar.getSacapunta();
        Pegamento pegamentoEnMochila = mochilaEscolar.getPegamento();
        Lapiz lapizEnMochila = mochilaEscolar.getLapiz();
        Corrector correctorEnMochila = mochilaEscolar.getCorrector();
        Marcatexto marcatextoEnMochila = mochilaEscolar.getMarcatexto();

        // Imprimir información
        System.out.println("Mochila Escolar: " + mochilaEscolar.getMarca());
        System.out.println("Objetos en la Mochila Escolar:");
        System.out.println("Libro: " + libroEnMochila.getTitulo());
        System.out.println("Bolígrafo: " + boligrafoEnMochila.getMarca());
        System.out.println("Tijera: " + tijeraEnMochila.getTipo());
        System.out.println("Regla: " + reglaEnMochila.getLongitud() + " cm");
        System.out.println("Borrador: " + borradorEnMochila.getTipo());
        System.out.println("Sacapunta: " + sacapuntaEnMochila.getMarca());
        System.out.println("Pegamento: " + pegamentoEnMochila.getTipo());
        System.out.println("Lápiz: " + lapizEnMochila.getMarca());
        System.out.println("Corrector: " + correctorEnMochila.getMarca());
        System.out.println("Marcador de Texto: " + marcatextoEnMochila.getColor());
    }
}
