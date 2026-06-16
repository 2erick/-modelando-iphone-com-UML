```mermaid
classDiagram
    class Iphone {

    }
    class ReprodutorMusical {
        +tocar()
        +pausar()
        +selecionarMusica(String musica)
    }
    class NavegadorInternet {
        +exibirPagina(String url)
        +adicionarNovaAba()
        +atualizarPagina()
    }
    class AparelhoTelefonico {
        +ligar(String numero)
        +atender()
        +iniciarCorreioVoz()
    }

    ReprodutorMusical <|.. Iphone
    NavegadorInternet <|.. Iphone
    AparelhoTelefonico <|.. Iphone
```