public class data {
    private int dia;
    private int mes;
    private int ano;

    public data(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }
    public boolean validarData(){
        if (mes < 1 || mes > 12) {
            return false;
        }


        if (dia < 1) {
            return false;
        }

        if (mes == 1 || mes == 3 || mes == 5 || mes == 7 ||
                mes == 8 || mes == 10 || mes == 12) {
            return dia <= 31;
        }
        else if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
            return dia <= 30;
        }


        return true;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String formatarData() {
        return String.format("%02d/%02d/%04d", dia, mes, ano);
    }
}
