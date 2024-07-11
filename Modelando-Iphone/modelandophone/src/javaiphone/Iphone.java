package javaiphone;

public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {
    // Implementação dos métodos das interfaces ReprodutorMusical, AparelhoTelefonico e NavegadorInternet
    @Override
    public void tocarMusica(String musica) {
        System.out.println("Tocando música: " + musica);
    }

    @Override
    public void pausarMusica() {
        System.out.println("Música pausada");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Música selecionada: " + musica);
    }

    @Override
    public void ligar() {
        System.out.println("Ligando...");  
    }

    @Override
    public void atenderChamada() {
        System.out.println("Chamada atendida");  
    }

    @Override
    public void iniciarCorreioDeVoz() {
        System.out.println("Correio de voz iniciado");
    }

    @Override
    public void exibirPagina(String url) {
        // Implemente a lógica para exibir a página da URL no iPhone
        System.out.println("Exibindo página: " + url); 
    }
    
    @Override
    public void adicionarNovaAba() {
        // Implemente a lógica para adicionar uma nova aba no iPhone
        System.out.println("Adicionando nova aba"); 
    }
    @Override
    public void atualizarPagina() {
        System.out.println("Página atualizada");
    }
}