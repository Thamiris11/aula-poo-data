public class Main {
    public static void main(String[] args) {
        data dat = new data(0, 10, 2025);
        data dat2 = new data(25, 12, 2025);

        System.out.println(dat.formatarData() + " é válida? " + dat.validarData());
        System.out.println(dat2.formatarData() + " é válida? " + dat2.validarData());


    }
}
