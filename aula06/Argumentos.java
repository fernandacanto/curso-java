// Passo a passo:
// Cria o arquivo .class aceitando acentos: javac Argumentos.java -encoding UTF-8
// 1º exemplo: java Argumentos CursoJava
// 2º exemplo: java Argumentos "Passando o parametro entre aspas, pq estou passando várias palavras."
class Argumentos {
    public static void main(String[] args) {
        System.out.println("Você digitou: " + args[0]);
    }
}