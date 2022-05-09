import java.util.Date;

public class Main {
    public static void main(String[] args) {
        produto p = new produto("Leite","Mococa");
        lote l1 = new lote(p,new Date(22,5,9),new Date(22,5,9),100);

    }
}
