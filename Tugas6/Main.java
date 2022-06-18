package TugasEnam;

public class Main {
    public static void main(String[] args) {
        System.out.println("""
                Erlis Maulidiyah Rizqiyani
                215150700111015
                Teknologi Informasi A""");
        System.out.println("-".repeat(40));
        System.out.println("-".repeat(40));

        Manusia man1 = new Manusia("Adam","253040889526",true,true);
        System.out.println(man1.toString());
        Manusia man2 = new Manusia("Putri", "253040889527",false, true);
        System.out.println(man2.toString());
        Manusia man3 = new Manusia("Muhammad","253040889528",true,false);
        System.out.println(man3.toString());
        Manusia man4 = new Manusia("Dian","253040889529",false,false);
        System.out.println(man4.toString());

        System.out.println("-".repeat(40));
        System.out.println("-".repeat(40));
        System.out.println("Profesi Mahasiswa :");
        System.out.println("-".repeat(40));
        System.out.println();

        Mahasiswa mhs1 = new Mahasiswa("Erlis Rizqiyani","253040289530",false,false,"205150700111015",3.8);
        System.out.println(mhs1.toString());
        Mahasiswa mhs2 = new Mahasiswa("Salma Annissa","253040689531",false,true,"215150400111015",3.4);
        System.out.println(mhs2.toString());
        Mahasiswa mhs3 = new Mahasiswa("Ahmad Galih","253040389530",true,false,"225150300111015",3.6);
        System.out.println(mhs3.toString());
        Mahasiswa mhs4 = new Mahasiswa("Muhammad Rizky","253040789530",true,true,"215150600111015",4);
        System.out.println(mhs4.toString());

        System.out.println("-".repeat(40));
        System.out.println("-".repeat(40));
        System.out.println("Profesi Pekerja :");
        System.out.println("-".repeat(40));
        System.out.println();

        Pekerja pk1 = new Pekerja("Ahmad Sofyan","253040784000",true,true,8,25,"11540882230");
        System.out.println(pk1.toString());
        Pekerja pk2 = new Pekerja("Rudi Barudi","253040784020",true,false,5,20,"31240552230");
        System.out.println(pk2.toString());
        Pekerja pk3 = new Pekerja("Kirana Khansa","253040784002",false,true,9,20,"51440112230");
        System.out.println(pk3.toString());
        Pekerja pk4 = new Pekerja("Ervi Fitrawan","253040784033",false,false,7,30,"71640332230");
        System.out.println(pk4.toString());

        System.out.println("-".repeat(40));
        System.out.println("-".repeat(40));
        System.out.println("Profesi Manajer :");
        System.out.println("-".repeat(40));
        System.out.println();

        Manager mng1 = new Manager("Satria Pamungkas", "253040666900",true,true,7,23,"11140982230",2000);
        System.out.println(mng1.toString());
        Manager mng2 = new Manager("Diva Viranda", "253040666999",false,true,9,24,"21240662230",2000);
        System.out.println(mng2.toString());
        Manager mng3 = new Manager("Rasyid Handiko", "25304065580",true,false,8,20,"4134052230",2000);
        System.out.println(mng3.toString());
        Manager mng4 = new Manager("Jasmin Putriana", "253040678900",false,false,6,29,"61540442230",2000);
        System.out.println(mng4.toString());
    }
}
