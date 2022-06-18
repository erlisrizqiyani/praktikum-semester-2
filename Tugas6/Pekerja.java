package TugasEnam;

public class Pekerja extends Manusia{
    private int gaji;
    private double bonus;
    private int jamKerja;
    private int hariKerja;
    private String NIP;

    public Pekerja(String nama, String nik, boolean jenisKelamin, boolean statusMenikah, int jamKerja, int hariKerja, String NIP) {
        super(nama, nik, jenisKelamin, statusMenikah);
        this.jamKerja = jamKerja;
        this.hariKerja = hariKerja;
        this.NIP = NIP;
    }


    public void setGaji(int gaji) {
        this.gaji = gaji;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public int getJamKerja() {
        return jamKerja;
    }

    public void setJamKerja(int jamKerja) {
        this.jamKerja = jamKerja;
    }

    public int getHariKerja() {
        return hariKerja;
    }

    public void setHariKerja(int hariKerja) {
        this.hariKerja = hariKerja;
    }

    public String getNIP() {
        return NIP;
    }

    public void setNIP(String NIP) {
        this.NIP = NIP;
    }

    public int getGaji() {
        gaji = getHariKerja()*getJamKerja()*15;
        return gaji;
    }

    public double getBonus() {
        if(getJamKerja()>7){
            if(getHariKerja()>20){
                bonus = (20*(getJamKerja()-7)*7) + ((getHariKerja()-20)*getJamKerja()*20);
            } else bonus = getHariKerja()*(getJamKerja()-7)*7;
        } else if(getJamKerja()<7 && getHariKerja()>20){
            bonus = ((getHariKerja()-20)*getJamKerja()*20);
        } else bonus =0;
        return bonus;
    }

    public String getStatus(){
        String department;
        String cabang;
        int a = Integer.parseInt(getNIP().substring(0,1));
        int b = Integer.parseInt(getNIP().substring(6,7));
        int c = Integer.parseInt(getNIP().substring(2,3));
        {if (b==1){
            department = "Pemasaran";
        }else if (b==2){
            department = "Humas";
        }else if (b==3){
            department = "Riset";
        }else if (b==4){
            department = "Teknologi";
        }else if (b==5){
            department = "Personalia";
        }else if (b==6){
            department = "Akademik";
        }else if (b==7){
            department = "Administrasi";
        }else if (b==8){
            department = "Operasional";
        }else if (b==9){
            department = "Pembangunan";
        }else department = "Departmen Tidak Ada";}


        if (a==1){
            return department + ", " + "Mondstadt" + " cabang ke- "+ c;
        }else if (a==2){
            return department + ", " + "Liyue" + " cabang ke- "+ c;
        }else if (a==3){
            return department + ", " + "Inazuma" + " cabang ke- "+ c;
        }if (a==4){
            return department + ", " + "Sumeru" + " cabang ke- "+ c;
        }if (a==5){
            return department + ", " + "Fontaine" + " cabang ke- "+ c;
        }if (a==6){
            return department + ", " + "Natlan" + " cabang ke- "+ c;
        }if (a==7){
            return department + ", " + "Snezhnaya" + " cabang ke- "+ c;
        } else cabang = "Cabang Tidak Ada";

        return department + ", " + cabang + " cabang ke- "+ c;
    }

    @Override
    public double getPendapatan() {
        return super.getPendapatan()+getGaji()+getBonus();
    }

    @Override
    public String toString() {
        return super.toString() + "\n" +
                "Gaji                : "+ getGaji() +"$ \n" +
                "Bonus               : "+ getBonus() + "$ \n" +
                "Status              : "+ getStatus() + "\n";
    }
}
