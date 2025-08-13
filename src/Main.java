public class Principal {
    public static void main(String[ ] args) {
        Funcionario objeto1 = new Funcionario( );
        Funcionario objeto2 = new Funcionario( );

        objeto1.cadastrar(“Robin”, 2021, 2500);
        objeto1.exibirDados( );

        objeto2.cadastrar(“Hulk”, 2020, 1000);
        objeto2.exibirDados( );
    }
}

/* Altere o código acima para criar um vetor com duas
instâncias (objetos) da classe Funcionário e, em seguida,
chame os métodos cadastrar e exibirDados */
public class Principal{
    public static void main(String[ ] args) {
        Funcionario[ ] vetObjetos = new Funcionario[2];

        vetObjetos[0] = new Funcionario();
        vetObjetos[1] = new Funcionario();

        vetObjetos[0].cadastrar(“Robin”, 2021, 2500);
        vetObjetos[0].exibirDados();

        vetObjetos[1].cadastrar(“Hulk”, 2020, 1500);
        vetObjetos[1].exibirDados();
    }
}

/* Crie um programa em Java que some os elementos
de um array formado por cinco elementos do tipo
inteiro. */
public class PrincipalSomaVetor {
    public static void main(String[ ] args) {
        int[ ] valores = {37, 42, 75, 13, 94};
        int i, soma = 0;

        for (i = 0; i < valores.length; i++) {
            soma = soma + valores[i];
        }

        System.out.println(“Soma: ” + soma);
    }
}

/* Altere o código acima para que o usuário do programa
forneça os 5 números inteiros. 
Dica: utilize a classe Scanner */