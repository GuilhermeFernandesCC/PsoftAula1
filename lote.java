import java.util.Date;

public class lote {
    String id;
    produto prod;
    Date dataFab;
    Date dataVal;
    int quatidade;

    public lote(produto p,Date dataFab, Date dataVal,int quantidade){
        this.prod = p;
        this.dataFab = dataFab;
        this.dataVal = dataVal;
        this.quatidade = quantidade;
        this.id = this.toString();
    }
}
