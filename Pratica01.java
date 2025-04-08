class Pessoa {
    String nome;
    String cpf;
    int idade;

    Pessoa(String nome, String cpf, int idade){
        this.nome = nome;
        this.cpf = cpf;
        this.idade  = idade;
    }

    void comer(){
        System.out.println(nome +" está comendo");
    }

    void dormir(){
        System.out.println(nome +" esta dormindo");
    }

    void falar(){
        System.out.println(nome + " esta falando");
    }


}
public class Pratica01 {

    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("mariana", "414.234.123-04", 21);
        Pessoa p2 = new Pessoa("pereira", "392.123.421-12", 24);

        p1.comer();
        p2.falar();

        p2.dormir();

    }
}
