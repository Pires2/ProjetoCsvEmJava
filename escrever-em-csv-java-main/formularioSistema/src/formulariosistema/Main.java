package formulariosistema;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;  // Declara a variável opcao aqui

        do {
            // Exibe o menu
            System.out.println("Menu:");
            System.out.println("1. Inserir Produto");
            System.out.println("2. Sair");
            System.out.print("Escolha uma opção: ");
            
            // Lê a opção escolhida pelo usuário
            opcao = scanner.nextInt();
            scanner.nextLine();  // Limpa o buffer do scanner

            switch (opcao) {
                case 1:
                    // Chama a função para inserir o produto
                    Produto novoProduto = inserirProduto(scanner);
                    
                    if (novoProduto != null) {
                        // Adiciona o produto no CSV (você deve ter essa implementação em ProdutoCSV)
                        ProdutoCSV.AdicionarProduto(novoProduto);
                        System.out.println("Produto adicionado com sucesso! ID: " + novoProduto.getId());
                    }
                    break;

                case 2:
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }

        } while (opcao != 2); // O loop continua até que o usuário escolha sair 

        scanner.close();  // Fechar o scanner para evitar vazamentos de recurso
    }

    public static Produto inserirProduto(Scanner scanner) {
        // Pedir ao usuário para inserir todas as informações do produto
        System.out.println("Digite o ID do produto: ");
        String id = scanner.nextLine();

        System.out.println("Digite o tipo do produto: ");
        String tipo = scanner.nextLine();

        System.out.println("Digite o SKU Pai: ");
        String skuPai = scanner.nextLine();

        System.out.println("Digite o SKU: ");
        String sku = scanner.nextLine();

        System.out.println("O produto está ativo? (true/false): ");
        String ativo = scanner.nextLine();

        System.out.println("O produto é usado? (true/false): ");
        String usado = scanner.nextLine();

        System.out.println("O produto é destaque? (true/false): ");
        String destaque = scanner.nextLine();

        System.out.println("Digite o NCM: ");
        String ncm = scanner.nextLine();

        System.out.println("Digite o GTIN: ");
        String gtin = scanner.nextLine();

        System.out.println("Digite o MPN: ");
        String mpn = scanner.nextLine();

        System.out.println("Digite o nome do produto: ");
        String nome = scanner.nextLine();

        System.out.println("Digite o SEO Tag Title: ");
        String seoTagTitle = scanner.nextLine();

        System.out.println("Digite o SEO Tag Description: ");
        String seoTagDescription = scanner.nextLine();

        System.out.println("Digite a descrição completa do produto: ");
        String descricaoCompleta = scanner.nextLine();

        System.out.println("Digite a URL do vídeo no YouTube: ");
        String urlVideoYoutube = scanner.nextLine();

        System.out.println("O estoque é gerenciado? (true/false): ");
        String estoqueGerenciado = scanner.nextLine();

        System.out.println("Digite a quantidade em estoque: ");
        String estoqueQuantidade = scanner.nextLine();

        System.out.println("Digite a situação em estoque: ");
        String estoqueSituacaoEmEstoque = scanner.nextLine();

        System.out.println("Digite a situação sem estoque: ");
        String estoqueSituacaoSemEstoque = scanner.nextLine();

        System.out.println("O preço é sob consulta? (true/false): ");
        String precoSobConsulta = scanner.nextLine();

        System.out.println("Digite o preço de custo: ");
        String precoCusto = scanner.nextLine();

        System.out.println("Digite o preço cheio: ");
        String precoCheio = scanner.nextLine();

        System.out.println("Digite o preço promocional: ");
        String precoPromocional = scanner.nextLine();

        System.out.println("Digite a marca do produto: ");
        String marca = scanner.nextLine();

        System.out.println("Digite o peso do produto em Kg: ");
        String pesoEmKg = scanner.nextLine();

        System.out.println("Digite a altura do produto em cm: ");
        String alturaEmCm = scanner.nextLine();

        System.out.println("Digite a largura do produto em cm: ");
        String larguraEmCm = scanner.nextLine();

        System.out.println("Digite o comprimento do produto em cm: ");
        String comprimentoEmCm = scanner.nextLine();

        System.out.println("Digite o nome da categoria (Nível 1): ");
        String categoriaNomeNivel1 = scanner.nextLine();

        System.out.println("Digite o nome da categoria (Nível 2): ");
        String categoriaNomeNivel2 = scanner.nextLine();

        System.out.println("Digite o nome da categoria (Nível 3): ");
        String categoriaNomeNivel3 = scanner.nextLine();

        System.out.println("Digite o nome da categoria (Nível 4): ");
        String categoriaNomeNivel4 = scanner.nextLine();

        System.out.println("Digite o nome da categoria (Nível 5): ");
        String categoriaNomeNivel5 = scanner.nextLine();

        System.out.println("Digite a URL da imagem 1: ");
        String imagem1 = scanner.nextLine();

        System.out.println("Digite a URL da imagem 2: ");
        String imagem2 = scanner.nextLine();

        System.out.println("Digite a URL da imagem 3: ");
        String imagem3 = scanner.nextLine();

        System.out.println("Digite a URL da imagem 4: ");
        String imagem4 = scanner.nextLine();

        System.out.println("Digite a URL da imagem 5: ");
        String imagem5 = scanner.nextLine();

        System.out.println("Digite o gênero da grade: ");
        String gradeGenero = scanner.nextLine();

        System.out.println("O produto tem uma cor na grade? (true/false): ");
        String gradeProdutoComUmaCor = scanner.nextLine();

        System.out.println("O produto tem duas cores na grade? (true/false): ");
        String gradeProdutoComDuasCores = scanner.nextLine();

        System.out.println("Digite o tamanho de anel/aliança na grade: ");
        String gradeTamanhoDeAnelalianca = scanner.nextLine();

        System.out.println("Digite o tamanho de calça na grade: ");
        String gradeTamanhoDeCalca = scanner.nextLine();

        System.out.println("Digite o tamanho de camisa/camiseta na grade: ");
        String gradeTamanhoDeCamisacamiseta = scanner.nextLine();

        System.out.println("Digite o tamanho do capacete na grade: ");
        String gradeTamanhoDeCapacete = scanner.nextLine();

        System.out.println("Digite o tamanho de tênis na grade: ");
        String gradeTamanhoDeTenis = scanner.nextLine();

        System.out.println("Digite a voltagem na grade: ");
        String gradeVoltagem = scanner.nextLine();

        System.out.println("Digite o tamanho juvenil/infantil na grade: ");
        String gradeTamanhoJuvenilInfantil = scanner.nextLine();

        System.out.println("Digite o aparelho na grade: ");
        String gradeAparelho = scanner.nextLine();

        System.out.println("Digite as cores da blusa na grade: ");
        String gradeCoresDaBlusa = scanner.nextLine();

        System.out.println("Digite a essência/fragrância na grade: ");
        String gradeEssenciafragrancia = scanner.nextLine();

        System.out.println("Digite o tamanho na grade: ");
        String gradeTamanho = scanner.nextLine();

        System.out.println("Digite o tamanho da calça na grade: ");
        String gradeTamanhoDaCalca = scanner.nextLine();

        System.out.println("Digite o tamanho da saia na grade: ");
        String gradeTamanhoDaSaia = scanner.nextLine();

        System.out.println("Digite a unidade de volume (líquidos/sólidos/peso): ");
        String gradeUnidadeDeVolumeLiquidosolidospeso = scanner.nextLine();

        // Criação do objeto Produto com os dados fornecidos
        try {
            return new Produto(
                id, 
                tipo, 
                skuPai, 
                sku, 
                ativo, 
                usado, 
                destaque, 
                ncm, 
                gtin, 
                mpn, 
                nome, 
                seoTagTitle, 
                seoTagDescription, 
                descricaoCompleta, 
                urlVideoYoutube, 
                estoqueGerenciado, 
                estoqueQuantidade, 
                estoqueSituacaoEmEstoque, 
                estoqueSituacaoSemEstoque, 
                precoSobConsulta, 
                precoCusto, 
                precoCheio, 
                precoPromocional, 
                marca, 
                pesoEmKg, 
                alturaEmCm, 
                larguraEmCm, 
                comprimentoEmCm, 
                categoriaNomeNivel1, 
                categoriaNomeNivel2, 
                categoriaNomeNivel3, 
                categoriaNomeNivel4, 
                categoriaNomeNivel5, 
                imagem1, 
                imagem2, 
                imagem3, 
                imagem4, 
                imagem5, 
                gradeGenero, 
                gradeProdutoComUmaCor, 
                gradeProdutoComDuasCores, 
                gradeTamanhoDeAnelalianca, 
                gradeTamanhoDeCalca, 
                gradeTamanhoDeCamisacamiseta, 
                gradeTamanhoDeCapacete, 
                gradeTamanhoDeTenis, 
                gradeVoltagem, 
                gradeTamanhoJuvenilInfantil, 
                gradeAparelho, 
                gradeCoresDaBlusa, 
                gradeEssenciafragrancia, 
                gradeTamanho, 
                gradeTamanhoDaCalca, 
                gradeTamanhoDaSaia, 
                gradeUnidadeDeVolumeLiquidosolidospeso
            );
        } catch (Exception e) {
            System.out.println("Erro ao criar o produto: " + e.getMessage());
            return null;
        }
    }
}
