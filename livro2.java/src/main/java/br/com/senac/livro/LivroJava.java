/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package br.com.senac.livro;

/**
 *
 * @author geovanna62993406
 */
public class LivroJava {

    public static void main(String[] args) {

        Livro livro1 = new Livro("Alice no País das Maravilhas", "Lewis Carroll", "Fantasia", 1865, 200, 39.90);

        Livro livro2 = new Livro("O Pequeno Príncipe", "Antoine de Saint-Exupéry", "Fantasia", 1943, 96, 29.90);

        Livro livro3 = new Livro("Harry Potter e a Pedra Filosofal", "J.K. Rowling", "Fantasia", 1997, 223, 49.90);

        Livro livro4 = new Livro("O Diário de um Banana", "Jeff Kinney", "Comédia", 2007, 224, 34.90);

        Livro livro5 = new Livro("O Hobbit", "J.R.R. Tolkien", "Fantasia", 1937, 310, 45.90);

        Livro livro6 = new Livro("A Menina que Roubava Livros", "Markus Zusak", "Drama", 2005, 480, 44.90);

        Livro livro7 = new Livro("Coraline", "Neil Gaiman", "Fantasia", 2002, 160, 32.90);

        Livro livro8 = new Livro("Percy Jackson e o Ladrão de Raios", "Rick Riordan", "Fantasia", 2005, 400, 42.90);

        Livro livro9 = new Livro("O Diário de Anne Frank", "Anne Frank", "Biografia", 1947, 352, 39.90);

        Livro livro10 = new Livro("Extraordinário", "R.J. Palacio", "Drama", 2012, 320, 41.90);

        Livro livro11 = new Livro("It: A Coisa", "Stephen King", "Terror", 1986, 1104, 69.90);

        Livro livro12 = new Livro("A Culpa é das Estrelas", "John Green", "Romance", 2012, 288, 37.90);

        Livro livro13 = new Livro("O Código Da Vinci", "Dan Brown", "Suspense", 2003, 480, 46.90);

        Livro livro14 = new Livro("Jogos Vorazes", "Suzanne Collins", "Distopia", 2008, 400, 44.90);

        Livro livro15 = new Livro("Crepúsculo", "Stephenie Meyer", "Romance", 2005, 416, 43.90);

        System.out.println(livro1.titulo + " - " + livro1.autor + " - " + livro1.genero + " - " + livro1.anoPublicacao + " - " + livro1.numeroPaginas + " páginas - R$ " + livro1.preco + " - " + livro1.calcularIdade() + " anos");

        System.out.println(livro2.titulo + " - " + livro2.autor + " - " + livro2.genero + " - " + livro2.anoPublicacao + " - " + livro2.numeroPaginas + " páginas - R$ " + livro2.preco + " - " + livro2.calcularIdade() + " anos");

        System.out.println(livro3.titulo + " - " + livro3.autor + " - " + livro3.genero + " - " + livro3.anoPublicacao + " - " + livro3.numeroPaginas + " páginas - R$ " + livro3.preco + " - " + livro3.calcularIdade() + " anos");

        System.out.println(livro4.titulo + " - " + livro4.autor + " - " + livro4.genero + " - " + livro4.anoPublicacao + " - " + livro4.numeroPaginas + " páginas - R$ " + livro4.preco + " - " + livro4.calcularIdade() + " anos");

        System.out.println(livro5.titulo + " - " + livro5.autor + " - " + livro5.genero + " - " + livro5.anoPublicacao + " - " + livro5.numeroPaginas + " páginas - R$ " + livro5.preco + " - " + livro5.calcularIdade() + " anos");

        System.out.println(livro6.titulo + " - " + livro6.autor + " - " + livro6.genero + " - " + livro6.anoPublicacao + " - " + livro6.numeroPaginas + " páginas - R$ " + livro6.preco + " - " + livro6.calcularIdade() + " anos");

        System.out.println(livro7.titulo + " - " + livro7.autor + " - " + livro7.genero + " - " + livro7.anoPublicacao + " - " + livro7.numeroPaginas + " páginas - R$ " + livro7.preco + " - " + livro7.calcularIdade() + " anos");

        System.out.println(livro8.titulo + " - " + livro8.autor + " - " + livro8.genero + " - " + livro8.anoPublicacao + " - " + livro8.numeroPaginas + " páginas - R$ " + livro8.preco + " - " + livro8.calcularIdade() + " anos");

        System.out.println(livro9.titulo + " - " + livro9.autor + " - " + livro9.genero + " - " + livro9.anoPublicacao + " - " + livro9.numeroPaginas + " páginas - R$ " + livro9.preco + " - " + livro9.calcularIdade() + " anos");

        System.out.println(livro10.titulo + " - " + livro10.autor + " - " + livro10.genero + " - " + livro10.anoPublicacao + " - " + livro10.numeroPaginas + " páginas - R$ " + livro10.preco + " - " + livro10.calcularIdade() + " anos");

        System.out.println(livro11.titulo + " - " + livro11.autor + " - " + livro11.genero + " - " + livro11.anoPublicacao + " - " + livro11.numeroPaginas + " páginas - R$ " + livro11.preco + " - " + livro11.calcularIdade() + " anos");

        System.out.println(livro12.titulo + " - " + livro12.autor + " - " + livro12.genero + " - " + livro12.anoPublicacao + " - " + livro12.numeroPaginas + " páginas - R$ " + livro12.preco + " - " + livro12.calcularIdade() + " anos");

        System.out.println(livro13.titulo + " - " + livro13.autor + " - " + livro13.genero + " - " + livro13.anoPublicacao + " - " + livro13.numeroPaginas + " páginas - R$ " + livro13.preco + " - " + livro13.calcularIdade() + " anos");

        System.out.println(livro14.titulo + " - " + livro14.autor + " - " + livro14.genero + " - " + livro14.anoPublicacao + " - " + livro14.numeroPaginas + " páginas - R$ " + livro14.preco + " - " + livro14.calcularIdade() + " anos");

        System.out.println(livro15.titulo + " - " + livro15.autor + " - " + livro15.genero + " - " + livro15.anoPublicacao + " - " + livro15.numeroPaginas + " páginas - R$ " + livro15.preco + " - " + livro15.calcularIdade() + " anos");

    }

}  

