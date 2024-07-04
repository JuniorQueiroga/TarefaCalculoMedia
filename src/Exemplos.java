/**
* @author queiroga
 */

public class Exemplos {
    private int codigo;

    private long codigoMaior;
    // decimal sempre colocar f no final
    private float valorDecimal=10.1f;

    //private double valorDecimal;

    private String texto;

    private boolean status = false;

    private short shor;

    private byte bi;

    public Exemplos(){
    }

    public Exemplos(int val){
        this.codigo = val;
    }

    public String retornarTexto() {
        this.codigo = 0;
        return "retornou";
    }

    public int retornarInteiro() {
     //so usado no metodo "VAL"
        int val = 10;
        return 9;
    }

    public long retornarLong(long num) {
        return num;
    }

}
