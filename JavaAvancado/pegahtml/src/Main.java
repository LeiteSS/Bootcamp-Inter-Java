import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ProxySelector;
import java.net.URI;
import java.net.URL;
import java.net.URLConnection;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;
import java.util.stream.Collectors;
// o simbolo var é usado para variaveis locais; corpo do metodo
// o var pode ser usado dentro do enhaced for e for interativo
// a nivel de classe, usando var temos um erro - private var nome = new String("Joao");
// não pode usar o var em variaveis locais não-inicializadas - var soma; ... soma = 0;
// o var não pode ser utilizado como parâmetro
public class Main {
    static ExecutorService executor = Executors.newFixedThreadPool(6, new ThreadFactory() {
        @Override
        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable);
            System.out.println("Nova Thread Criada: " + (thread.isDaemon() ? " daemon" : "")+" Thread Group: " +thread.getThreadGroup());
            return thread;
        }
    });

    public static void main(String[] args) throws IOException, InterruptedException, Exception {
        novaFeatureConnectHttp2Client();
    }

    private static void novaFeatureConnectHttpClient() {
        System.out.println("Running HTTP/1.1 example...");
        try {
            HttpClient client = HttpClient.newBuilder()
                    .version(HttpClient.Version.HTTP_1_1)
                    .proxy(ProxySelector.getDefault())
                    .build();
            long start = System.currentTimeMillis();
            HttpRequest mainRequest = HttpRequest.newBuilder()
                    .uri(URI.create("https://http2.akamai.com/demo/h2_demo_frame.html"))
                    .build();
            HttpResponse<String> response = client.send(mainRequest, HttpResponse.BodyHandlers.ofString());
            System.out.println("Status code: " +response.statusCode());
            System.out.println("Headers response: " +response.headers());
            System.out.println(response.body());

            List<Future<?>> future = new ArrayList<>();

            String responseBody = response.body();
            responseBody
                    .lines()
                    .filter(line -> line.trim().startsWith("<img height"))
                    .map(line -> line.substring(line.indexOf("src='")+5, line.indexOf("'/>")))
                    .forEach(image -> {
                        Future<?> imgFuture = executor.submit(() -> {
                            HttpRequest imgRequest = HttpRequest.newBuilder()
                                    .uri(URI.create("https://http2.akamai.com"+image))
                                    .build();
                            try{
                                HttpResponse<String> imgResponse = client.send(imgRequest, HttpResponse.BodyHandlers.ofString());
                                System.out.println("Imagem Carregada: " +image+", status code: "+imgResponse.statusCode());
                            } catch (IOException | InterruptedException e) { System.out.println("Error: Requisição para recuperar a imagem falhou!" +image); }

                        });
                        future.add(imgFuture);
                        System.out.println("Submetido um futuro para a imagem " +image);
                    });
            future.forEach(f -> {
                try { f.get(); } catch (ExecutionException | InterruptedException e) { System.out.println("Erro ao carregar a imagem!"); }
            });
            long end = System.currentTimeMillis();
            System.out.println("Tempo de carregamento total: " +(end - start) +" ms");
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        } finally {
            executor.shutdown();
        }
    }

    private static void novaFeatureConnectHttp2Client() throws Exception{
        System.out.println("Running HTTP/2 example...");
        try {
            HttpClient client = HttpClient.newBuilder()
                    .version(HttpClient.Version.HTTP_2)
                    .proxy(ProxySelector.getDefault())
                    .build();
            long start = System.currentTimeMillis();
            HttpRequest mainRequest = HttpRequest.newBuilder()
                    .uri(URI.create("https://http2.akamai.com/demo/h2_demo_frame.html"))
                    .build();
            HttpResponse<String> response = client.send(mainRequest, HttpResponse.BodyHandlers.ofString());
            System.out.println("Status code: " +response.statusCode());
            System.out.println("Headers response: " +response.headers());
            System.out.println(response.body());

            List<Future<?>> future = new ArrayList<>();

            String responseBody = response.body();
            responseBody
                    .lines()
                    .filter(line -> line.trim().startsWith("<img height"))
                    .map(line -> line.substring(line.indexOf("src='")+5, line.indexOf("'/>")))
                    .forEach(image -> {
                        Future<?> imgFuture = executor.submit(() -> {
                            HttpRequest imgRequest = HttpRequest.newBuilder()
                                    .uri(URI.create("https://http2.akamai.com"+image))
                                    .build();
                            try{
                                HttpResponse<String> imgResponse = client.send(imgRequest, HttpResponse.BodyHandlers.ofString());
                                System.out.println("Imagem Carregada: " +image+", status code: "+imgResponse.statusCode());
                            } catch (IOException | InterruptedException e) { System.out.println("Error: Requisição para recuperar a imagem falhou!" +image); }

                        });
                        future.add(imgFuture);
                        System.out.println("Submetido um futuro para a imagem " +image);
                    });
            future.forEach(f -> {
                try { f.get(); } catch (ExecutionException | InterruptedException e) { System.out.println("Erro ao carregar a imagem!"); }
            });
            long end = System.currentTimeMillis();
            System.out.println("Tempo de carregamento total: " +(end - start) +" ms");
        } finally {
            executor.shutdown();
        }
    }

    public static void connectAndPrintURLJavaOracle() throws IOException {
        var url = new URL("https://docs.oracle.com/javase/10/language/");
        var urlConnection = url.openConnection();
//         Todas as classes quer implementam a classe Closable podem ser usadas no try (), deixando desnecessario
//         chamar o finally
        try (var bufferedReader = new BufferedReader(new InputStreamReader(urlConnection.getInputStream()));) {
            System.out.println(bufferedReader.lines().collect(Collectors.joining()).replaceAll(">", ">\n"));
        }catch(Exception e){
            e.printStackTrace();
        }
    }



    public static void novaFeatureJava() throws IOException, InterruptedException {
        HttpRequest request = HttpRequest.newBuilder()
                .GET().uri(URI.create("https://docs.oracle.com/javase/10/language/"))
                .build();
        HttpClient httpClient = HttpClient.newHttpClient();
        HttpResponse<String> response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());
        System.out.println("Status code: " +response.statusCode());
        System.out.println("Headers response: " +response.headers());
        System.out.println(response.body());
    }
}
