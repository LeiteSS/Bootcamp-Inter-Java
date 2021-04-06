package digital.innovation.one.utils.operacao.internal;
import digital.innovation.one.utils.operacao.Operacao;

public class SubHelper implements Operacao {

    @Override
    public int execute(int a, int b) {
        return a - b;
    }
}

