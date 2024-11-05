package ads.poo;

public class Caneta {
    String Modelo; // Atributos
    String cor;
    float Ponta;
    int carga;
    boolean tampada;
    boolean destampada;

    void status(){
        System.out.println("Modelo" + this.Modelo);
        System.out.println("Uma caneta" + this.cor);
        System.out.println("Está tampada?" + this.tampada);
        System.out.println("Ponta" + this.Ponta);
        System.out.println("Carga" + this.carga);
    }

    void rabiscar(){// Metodos
        if(this.tampada == true) {
            System.out.println("erro, não posso rabiscar");
        }else{
            System.out.println("estou rabiscando");
        }
    }

    void tampar(){
        this.tampada = true;
    }

    void destampar(){
        this.destampada = false;
    }

}

