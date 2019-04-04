package projeto;

public class Professor {

    String nome;
    String areas[];
    long siape;

    //getset Nome
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    //getset Áreas
    public String[] getAreas() {
        return areas;
    }

    public void setAreas(String[] areas) {
        this.areas = areas;
    }

    //getset SIAPE
    public long getSiape() {
        return siape;
    }

    public void setSiape(long siape) {
        this.siape = siape;
    }

    void alterarNome(String novoNome) {
        this.nome = novoNome;
    }

    boolean novaArea(String area) {
        for (int i = 0; i < areas.length; i++) {
            if (areas[i] == null) {
                areas[i] = area;
                return true;
            }
        }
        return false;
    }

    boolean removerArea(String area) {
        for (int i = 0; i < areas.length; i++) {
            if (areas[i].equals(area)) {
                areas[i] = null;
                return true;
            }
        }
        return false;
    }
}
