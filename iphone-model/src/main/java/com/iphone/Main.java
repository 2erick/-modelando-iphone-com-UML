package com.iphone;

public class Main {

    public static void main(String[] args) {
        Iphone iphone = new Iphone();

        iphone.ligar("99999-9999");
        iphone.tocar();
        iphone.exibirPagina("https://www.google.com");
    }
}
