package org.aulaDIO.FuncaoAltaOrdem;

public class ExemploII {
    public static void main(String[] args) {
//        OutraBarraDeCarregamento outraBarra = new OutraBarraDeCarregamento();
//        outraBarra.start();
        GerarPdf iniciarGerarPdf = new GerarPdf();
        BarraDeCarregamento barraDeCarregamento = new BarraDeCarregamento(iniciarGerarPdf);

        iniciarGerarPdf.start();
        barraDeCarregamento.start();
    }
}

class GerarPdf extends Thread {

    @Override
    public void run() {
        try{
            System.out.println("Iniciar Gerador do Pdf");
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Arquivo PDF Gerado!");
    }
}

class BarraDeCarregamento extends Thread {
    private Thread iniciarGerarPdf;

    public BarraDeCarregamento(Thread iniciarGerarPdf) {
        this.iniciarGerarPdf = iniciarGerarPdf;
    }

    @Override
    public void run() {
        while (true){
            try{
                Thread.sleep(500);
                if (!iniciarGerarPdf.isAlive()) {
                    break;
                }
                System.out.println("Loading...");

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class OutraBarraDeCarregamento extends Thread {

    @Override
    public void run() {
        super.run();
        System.out.println("Rodei: " + this.getName());

        try{
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

