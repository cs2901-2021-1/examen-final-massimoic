package pc2.vacunacion;

import java.util.ArrayList;
import java.util.List;

public class VacInterface {
    private static long total = 22935533;
    private long avance = 0;
    private long cobertura = 0;
    private int centros = 0;
    private int vacParcial = 0;
    private int vacCompleta = 0;
    private List<Centro> centroList = new ArrayList();

    private static VacInterface instance = new VacInterface();

    private VacInterface(){}

    public static VacInterface getInstance(){
        if(instance == null){
            instance = new VacInterface();
        }
        return instance;
    }

    public void createCentro(Centro centro) {
        centroList.add(centro);
        addCentro();
    }

    public void deleteCentro(int id) {
        for(Centro centro: centroList){
            if(id == centro.getId()){
                centroList.remove(centro);
                removeCentro();
            }
        }
    }

    public int getAvance(){return (int) (avance*100/total);}

    public void setAvance(long avance) {
        this.avance = avance;
    }

    public void addAvance(){this.avance += 1;}

    public int getCobertura() { return (int) (cobertura*100/total); }

    public void setCobertura(long cobertura) {
        this.cobertura = cobertura;
    }

    public void addCobertura(){this.cobertura += 1;}

    public int getCentros() { return centros; }
    public void addCentro() {this.centros += 1;}
    public void removeCentro() {this.centros -= 1;}

    public int getVacParcial() { return vacParcial; }
    public void addVacParcial() {this.vacParcial += 1;}
    public void removeVacParcial() {this.vacParcial -= 1;}

    public int getVacCompleta() { return vacCompleta; }
    public void addVacCompleta() {this.vacCompleta += 1;}

    public List<Centro> getCentroList() {
        return centroList;
    }
}
