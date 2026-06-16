Modelagem e implementação das funcionalidades do iPhone utilizando Java e UML.

Funcionalidades modeladas:
- Reprodutor Musical
- Aparelho Telefônico
- Navegador na Internet

O iPhone implementa as três interfaces, concentrando todos os comportamentos do dispositivo.

```mermaid
classDiagram
    class Iphone {

    }
    class ReprodutorMusical {
        <<interface>>
        +tocar()
        +pausar()
        +selecionarMusica(String musica)
    }
    class NavegadorInternet {
        <<interface>>
        +exibirPagina(String url)
        +adicionarNovaAba()
        +atualizarPagina()
    }
    class AparelhoTelefonico {
        <<interface>>
        +ligar(String numero)
        +atender()
        +iniciarCorreioVoz()
    }

    ReprodutorMusical <|.. Iphone
    NavegadorInternet <|.. Iphone
    AparelhoTelefonico <|.. Iphone
```