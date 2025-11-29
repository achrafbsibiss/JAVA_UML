public class Adherent extends  Personne{

    private int  numAdherent;

    public Adherent(int numAdherent, String name, int age, String email,  int number){
        super(name,age,email,number);
        this.numAdherent = numAdherent;
    }


    public int getNumAdherent(){
        return numAdherent;
    }

    public void setNumAdherent(int numAdherent){
        this.numAdherent = numAdherent;
    }

    @Override
    public String toString() {
        return super.toString() + " and the numa_dherent" + this.getNumAdherent();
    }
}
