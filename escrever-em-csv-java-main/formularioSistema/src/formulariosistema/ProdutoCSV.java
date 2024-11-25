/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package formulariosistema;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;


public class ProdutoCSV {
    // caminho do arquivo
    private static String nomeArquivo = "./dados/Produtos.CSV";
    //metodo para adicionar um produto ao arquivo CSV
    public static void AdicionarProduto(Produto p){
        try{
            // verificar sa o arquivo ja existe
            boolean arquivoExiste = new File(nomeArquivo).exists();
            
            // abre o escritor para adicionar dados ao arquivo
            FileWriter escritor = new FileWriter(nomeArquivo,StandardCharsets.ISO_8859_1, arquivoExiste);
            if (!arquivoExiste){
                escritor.write("id;tipo;sku-pai;sku;ativo;usado;destaque;ncm;gtin;mpn;nome;seo-tag-title;seo-tag-description;descricao-completa;url-video-youtube;estoque-gerenciado;estoque-quantidade;estoque-situacao-em-estoque;estoque-situacao-sem-estoque;preco-sob-consulta;preco-custo;preco-cheio;preco-promocional;marca;peso-em-kg;altura-em-cm;largura-em-cm;comprimento-em-cm;categoria-nome-nivel-1;categoria-nome-nivel-2;categoria-nome-nivel-3;categoria-nome-nivel-4;categoria-nome-nivel-5;imagem-1;imagem-2;imagem-3;imagem-4;imagem-5;grade-genero;grade-produto-com-uma-cor;grade-produto-com-duas-cores;grade-tamanho-de-anelalianca;grade-tamanho-de-calca;grade-tamanho-de-camisacamiseta;grade-tamanho-de-capacete;grade-tamanho-de-tenis;grade-voltagem;grade-tamanho-juvenil-infantil;grade-aparelho;grade-cores-da-blusa;grade-essenciafragrancia;grade-tamanho;grade-tamanho-da-calca;grade-tamanho-da-saia;grade-unidade-de-volume-liquidosolidospeso\n");
            }
            //escrever dados do produto no formato apropriado
            escritor.write(p.getId() + ";" +
                        p.getTipo() + ";" +
                        p.getSkuPai() + ";" +
                        p.getSku() + ";" +
                        p.getAtivo() + ";" +
                        p.getUsado() + ";" +
                        p.getDestaque() + ";" +
                        p.getNcm() + ";" +
                        p.getGtin() + ";" +
                        p.getMpn() + ";" +
                        p.getNome() + ";" +
                        p.getSeoTagTitle() + ";" +
                        p.getSeoTagDescription() + ";" +
                        p.getDescriçãoCompleta() + ";" +
                        p.getUrlVideoYoutube() + ";" +
                        p.getEstoqueGerenciado() + ";" +
                        p.getEstoqueQuantidade() + ";" +
                        p.getEstoqueSituacaoEmEstoque() + ";" +
                        p.getEstoqueSituacaoSemEstoque() + ";" +
                        p.getPrecoSobConsulta() + ";" +
                        p.getPrecoCusto() + ";" +
                        p.getPrecoCheio() + ";" +
                        p.getPrecoPromocional() + ";" +
                        p.getMarca() + ";" +
                        p.getPesoEmKg() + ";" +
                        p.getAlturaEmCm() + ";" +
                        p.getLarguraEmCm() + ";" +
                        p.getComprimentoEmCm() + ";" +
                        p.getCategoriaNomeNivel1() + ";" +
                        p.getCategoriaNomeNivel2() + ";" +
                        p.getCategoriaNomeNivel3() + ";" +
                        p.getCategoriaNomeNivel4() + ";" +
                        p.getCategoriaNomeNivel5() + ";" +
                        p.getImagem1() + ";" +
                        p.getImagem2() + ";" +
                        p.getImagem3() + ";" +
                        p.getImagem4() + ";" +
                        p.getImagem5() + ";" +
                        p.getGradeGenero() + ";" +
                        p.getGradeProdutoComUmaCor() + ";" +
                        p.getGradeProdutoComDuasCores() + ";" +
                        p.getGradeTamanhoDeAnelalianca() + ";" +
                        p.getGradeTamanhoDeCalca() + ";" +
                        p.getGradeTamanhoDeCamisacamiseta() + ";" +
                        p.getGradeTamanhoDeCapacete() + ";" +
                        p.getGradeTamanhoDeTenis() + ";" +
                        p.getGradeVoltagem() + ";" +
                        p.getGradeTamanhoJuvenilInfantil() + ";" +
                        p.getGradeAparelho() + ";" +
                        p.getGradeCoresDaBlusa() + ";" +
                        p.getGradeEssenciafragrancia() + ";" +
                        p.getGradeTamanho() + ";" +
                        p.getGradeTamanhoDaCalca() + ";" +
                        p.getGradeTamanhoDaSaia() + ";" +
                        p.getGradeUnidadeDeVolumeLiquidosolidospeso()+"\n");
            //escrever todos od dados do buffer no arquivo imediatamente
            escritor.flush();
            //fecha o recurso de escrita
            escritor.close();
        }catch (IOException e) {
            e.printStackTrace();
        }
    }
    //metodo para listar os produtos
}
//28min