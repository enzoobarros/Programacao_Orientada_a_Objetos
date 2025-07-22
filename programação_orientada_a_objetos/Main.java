public class Main {
    public static void main(String[] args) {
        // (instâncias da classe Pet)
        Pet pet1 = new Pet("Rex", "Cachorro", 5);
        Pet pet2 = new Pet("Mimi", "Gato", 3);

        // Exibindo informações
        System.out.println("=== Dados do Pet 1 ===");
        pet1.exibirInformacoes();

        System.out.println("\n=== Dados do Pet 2 ===");
        pet2.exibirInformacoes();

        // Alterando dados
        pet2.setIdade(4);
        System.out.println("\nApós atualizar a idade do pet 2:");
        pet2.exibirInformacoes();
    }
}

