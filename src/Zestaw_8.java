
//    class Klient {
//        String imie;
//        String nazwisko;
//
//        public Klient(String imie, String nazwisko) {
//            this.imie = imie;
//            this.nazwisko = nazwisko;
//        }
//
//        public String getImie() {
//            return imie;
//        }
//
//        public String getNazwisko() {
//            return nazwisko;
//        }
//
//    }
//
//
//    class KlientFirmowy extends Klient {
//        final String NIP;
//        final String REGON;
//
//        public KlientFirmowy(String imie, String nazwisko, String NIP, String REGON) {
//            super(imie, nazwisko);
//            this.NIP = NIP;
//            this.REGON = REGON;
//        }
//
//        public String getNIP() {
//            return NIP;
//        }
//
//        public String getREGON() {
//            return REGON;
//        }
//
//        @Override
//        public String toString() {
//            return "KlientFirmowy{" +
//                    "imie='" + getImie() + '\'' +
//                    ", nazwisko='" + getNazwisko() + '\'' +
//                    ", NIP='" + NIP + '\'' +
//                    ", REGON='" + REGON + '\'' +
//                    '}';
//        }
//    }
//
//
//class KlientIndywidualny extends Klient {
//    final String PESEL;
//
//    public KlientIndywidualny(String imie, String nazwisko, String PESEL) {
//        super(imie, nazwisko);
//        this.PESEL = PESEL;
//    }
//
//    public String getPESEL() {
//        return PESEL;
//    }
//
//    @Override
//    public String toString() {
//        return "KlientIndywidualny{" +
//                "imie='" + getImie() + '\'' +
//                ", nazwisko='" + getNazwisko() + '\'' +
//                ", PESEL='" + PESEL + '\'' +
//                '}';
//    }
//
//}
//
//
//
//
//
//    public abstract class Owoc {
//        public abstract String smak();
//        public abstract void umyj();
//        public abstract void zjedz();
//    }
//
//    public class Arbuz extends Owoc {
//        @Override
//        public String smak() {
//            return "Słodki";
//        }
//
//        @Override
//        public void umyj() {
//            System.out.println("Myje arbuza");
//        }
//
//        @Override
//        public void zjedz() {
//            System.out.println("Zjadlem arbuza.");
//        }
//    }
//
//    public abstract class Warzywo {
//        public abstract String smak();
//        public abstract void umyj();
//        public abstract void zjedz();
//    }
//
//    public class Pomidor extends Warzywo {
//        @Override
//        public String smak() {
//            return "slodki";
//        }
//
//        @Override
//        public void umyj() {
//            System.out.println("Myje pomidora");
//        }
//
//        @Override
//        public void zjedz() {
//            System.out.println("Zjadlem pomidora");
//        }
//    }
//
//
//
//
//
//
//    public class Zestaw_8 {
//
//        public static void main(String[] args) {
//            KlientFirmowy firma = new KlientFirmowy("Jan", "Kowalski", "1234567890", "0987654321");
//            KlientIndywidualny osoba = new KlientIndywidualny("Anna", "Nowak", "95031012345");
//
//            System.out.println(firma);
//            System.out.println(osoba);
//
//
//
//
//
//            Owoc arbuz = new Arbuz();
//            Warzywo pomidor = new Pomidor();
//
//            System.out.println("Arbuz:");
//            System.out.println("Smak: " + Arbuz.smak());
//            Arbuz.umyj();
//            Arbuz.zjedz();
//
//            System.out.println("\nPomidor:");
//            System.out.println("Smak: " + pomidor.smak());
//            pomidor.umyj();
//            Pomidor.zjedz();
//
//
//
//        }
//
//    }
//
//
//
//
//
//
//
//
