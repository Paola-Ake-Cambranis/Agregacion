class MochilaEscolar {
    private String marca;
    private Libro libro;
    private Boligrafo boligrafo;
    private Tijera tijera;
    private Regla regla;
    private Borrador borrador;
    private Sacapunta sacapunta;
    private Pegamento pegamento;
    private Lapiz lapiz;
    private Corrector corrector;
    private Marcatexto marcatexto;
    
    public MochilaEscolar(String marca, Libro libro, Boligrafo boligrafo, Tijera tijera,
    Regla regla, Borrador borrador, Sacapunta sacapunta,Pegamento pegamento, Lapiz lapiz, 
    Corrector corrector, Marcatexto marcatexto) {
        this.marca = marca;
        this.libro = libro;
        this.boligrafo = boligrafo;
        this.tijera = tijera;
        this.regla = regla;
        this.borrador = borrador;
        this.sacapunta = sacapunta;
        this.pegamento = pegamento;
        this.lapiz = lapiz;
        this.corrector = corrector;
        this.marcatexto = marcatexto;
    }

    public String getMarca() {
        return marca;
    }

    public Libro getLibro() {
        return libro;
    }

    public Boligrafo getBoligrafo() {
        return boligrafo;
    }

    public Tijera getTijera() {
        return tijera;
    }

    public Regla getRegla() {
        return regla;
    }

    public Borrador getBorrador() {
        return borrador;
    }

    public Sacapunta getSacapunta() {
        return sacapunta;
    }

    public Pegamento getPegamento() {
        return pegamento;
    }

    public Lapiz getLapiz() {
        return lapiz;
    }

    public Corrector getCorrector() {
        return corrector;
    }

    public Marcatexto getMarcatexto() {
        return marcatexto;
    }
}
