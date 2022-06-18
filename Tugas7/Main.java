package TugasTujuh;

public class Main {
    public static void main(String[] args) {
        System.out.println("""
                Nama    : Erlis Maulidiyah Rizqiyani
                NIM     : 215150700111015
                Kelas   : TI A
                ------------------------------------""");
        Pegawai ttp1 = new PegawaiTetap("Aldo", "215150700111015",3000000);
        System.out.println(ttp1.toString());
        Pegawai ttp2 = new PegawaiTetap("Sinta", "215150700999101",3500000);
        System.out.println(ttp2.toString());
        Pegawai ttp3 = new PegawaiTetap("Hana", "215150700888014", 4000000);
        System.out.println(ttp3.toString());

        Pegawai hari1 = new PegawaiHarian("Indah","205150800222451",50000,40);
        System.out.println(hari1.toString());
        Pegawai hari2 = new PegawaiHarian("Eja","205150800221079", 50000,45);
        System.out.println(hari2.toString());
        Pegawai hari3 = new PegawaiHarian("Gita", "20515080045332", 50000,34);
        System.out.println(hari3.toString());

        Pegawai sls1 = new Sales("Erlis","280111089700154",30,30000);
        System.out.println(sls1.toString());
        Pegawai sls2 = new Sales("Dini","280111038917983",45,30000);
        System.out.println(sls2.toString());
        Pegawai sls3 = new Sales("Sofyan", "280111018291739",37,35000);
        System.out.println(sls3.toString());

    }
}
