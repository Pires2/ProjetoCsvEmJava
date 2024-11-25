/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package formulariosistema;

/**
 *
 * @author Meu Computador
 */
public class Produto {
    // atributos
    private String id;
    private String tipo;
    private String skuPai;
    private String sku;
    private String ativo;
    private String usado;
    private String destaque;
    private String ncm;
    private String gtin;
    private String mpn;
    private String nome;
    private String seoTagTitle;
    private String SeoTagDescription;
    private String descriçãoCompleta;
    private String urlVideoYoutube;
    private String estoqueGerenciado;
    private String estoqueQuantidade;
    private String estoqueSituacaoEmEstoque;
    private String estoqueSituacaoSemEstoque;
    private String precoSobConsulta;
    private String  precoCusto;
    private String precoCheio;
    private String precoPromocional;
    private String marca;
    private String pesoEmKg;
    private String alturaEmCm;
    private String larguraEmCm;
    private String comprimentoEmCm;
    private String categoriaNomeNivel1;
    private String categoriaNomeNivel2;
    private String categoriaNomeNivel3;
    private String categoriaNomeNivel4;
    private String categoriaNomeNivel5;
    private String imagem1;
    private String imagem2;
    private String imagem3;
    private String imagem4;
    private String imagem5;
    private String gradeGenero;
    private String gradeProdutoComUmaCor;
    private String gradeProdutoComDuasCores;
    private String gradeTamanhoDeAnelalianca;
    private String gradeTamanhoDeCalca;
    private String gradeTamanhoDeCamisacamiseta;
    private String gradeTamanhoDeCapacete;
    private String gradeTamanhoDeTenis;
    private String gradeVoltagem;
    private String gradeTamanhoJuvenilInfantil;
    private String gradeAparelho;
    private String gradeCoresDaBlusa;
    private String gradeEssenciafragrancia;
    private String gradeTamanho;
    private String gradeTamanhoDaCalca;
    private String gradeTamanhoDaSaia;
    private String gradeUnidadeDeVolumeLiquidosolidospeso;
    
    // metodo construtor

    public Produto(String id, String tipo, String skuPai, String sku, String ativo, String usado, String destaque, String ncm, String gtin, String mpn, String nome, String seoTagTitle, String SeoTagDescription, String descriçãoCompleta, String urlVideoYoutube, String estoqueGerenciado, String estoqueQuantidade, String estoqueSituacaoEmEstoque, String estoqueSituacaoSemEstoque, String precoSobConsulta, String precoCusto, String precoCheio, String precoPromocional, String marca, String pesoEmKg, String alturaEmCm, String larguraEmCm, String comprimentoEmCm, String categoriaNomeNivel1, String categoriaNomeNivel2, String categoriaNomeNivel3, String categoriaNomeNivel4, String categoriaNomeNivel5, String imagem1, String imagem2, String imagem3, String imagem4, String imagem5, String gradeGenero, String gradeProdutoComUmaCor, String gradeProdutoComDuasCores, String gradeTamanhoDeAnelalianca, String gradeTamanhoDeCalca, String gradeTamanhoDeCamisacamiseta, String gradeTamanhoDeCapacete, String gradeTamanhoDeTenis, String gradeVoltagem, String gradeTamanhoJuvenilInfantil, String gradeAparelho, String gradeCoresDaBlusa, String gradeEssenciafragrancia, String gradeTamanho, String gradeTamanhoDaCalca, String gradeTamanhoDaSaia, String gradeUnidadeDeVolumeLiquidosolidospeso) {
        this.id = id;
        this.tipo = tipo;
        this.skuPai = skuPai;
        this.sku = sku;
        this.ativo = ativo;
        this.usado = usado;
        this.destaque = destaque;
        this.ncm = ncm;
        this.gtin = gtin;
        this.mpn = mpn;
        this.nome = nome;
        this.seoTagTitle = seoTagTitle;
        this.SeoTagDescription = SeoTagDescription;
        this.descriçãoCompleta = descriçãoCompleta;
        this.urlVideoYoutube = urlVideoYoutube;
        this.estoqueGerenciado = estoqueGerenciado;
        this.estoqueQuantidade = estoqueQuantidade;
        this.estoqueSituacaoEmEstoque = estoqueSituacaoEmEstoque;
        this.estoqueSituacaoSemEstoque = estoqueSituacaoSemEstoque;
        this.precoSobConsulta = precoSobConsulta;
        this.precoCusto = precoCusto;
        this.precoCheio = precoCheio;
        this.precoPromocional = precoPromocional;
        this.marca = marca;
        this.pesoEmKg = pesoEmKg;
        this.alturaEmCm = alturaEmCm;
        this.larguraEmCm = larguraEmCm;
        this.comprimentoEmCm = comprimentoEmCm;
        this.categoriaNomeNivel1 = categoriaNomeNivel1;
        this.categoriaNomeNivel2 = categoriaNomeNivel2;
        this.categoriaNomeNivel3 = categoriaNomeNivel3;
        this.categoriaNomeNivel4 = categoriaNomeNivel4;
        this.categoriaNomeNivel5 = categoriaNomeNivel5;
        this.imagem1 = imagem1;
        this.imagem2 = imagem2;
        this.imagem3 = imagem3;
        this.imagem4 = imagem4;
        this.imagem5 = imagem5;
        this.gradeGenero = gradeGenero;
        this.gradeProdutoComUmaCor = gradeProdutoComUmaCor;
        this.gradeProdutoComDuasCores = gradeProdutoComDuasCores;
        this.gradeTamanhoDeAnelalianca = gradeTamanhoDeAnelalianca;
        this.gradeTamanhoDeCalca = gradeTamanhoDeCalca;
        this.gradeTamanhoDeCamisacamiseta = gradeTamanhoDeCamisacamiseta;
        this.gradeTamanhoDeCapacete = gradeTamanhoDeCapacete;
        this.gradeTamanhoDeTenis = gradeTamanhoDeTenis;
        this.gradeVoltagem = gradeVoltagem;
        this.gradeTamanhoJuvenilInfantil = gradeTamanhoJuvenilInfantil;
        this.gradeAparelho = gradeAparelho;
        this.gradeCoresDaBlusa = gradeCoresDaBlusa;
        this.gradeEssenciafragrancia = gradeEssenciafragrancia;
        this.gradeTamanho = gradeTamanho;
        this.gradeTamanhoDaCalca = gradeTamanhoDaCalca;
        this.gradeTamanhoDaSaia = gradeTamanhoDaSaia;
        this.gradeUnidadeDeVolumeLiquidosolidospeso = gradeUnidadeDeVolumeLiquidosolidospeso;
    }

   

    
    // metodos Get e Set

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getSkuPai() {
        return skuPai;
    }

    public void setSkuPai(String skuPai) {
        this.skuPai = skuPai;
    }

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    public String getAtivo() {
        return ativo;
    }

    public void setAtivo(String ativo) {
        this.ativo = ativo;
    }

    public String getUsado() {
        return usado;
    }

    public void setUsado(String usado) {
        this.usado = usado;
    }

    public String getDestaque() {
        return destaque;
    }

    public void setDestaque(String destaque) {
        this.destaque = destaque;
    }

    public String getNcm() {
        return ncm;
    }

    public void setNcm(String ncm) {
        this.ncm = ncm;
    }

    public String getGtin() {
        return gtin;
    }

    public void setGtin(String gtin) {
        this.gtin = gtin;
    }

    public String getMpn() {
        return mpn;
    }

    public void setMpn(String mpn) {
        this.mpn = mpn;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSeoTagTitle() {
        return seoTagTitle;
    }

    public void setSeoTagTitle(String seoTagTitle) {
        this.seoTagTitle = seoTagTitle;
    }

    public String getSeoTagDescription() {
        return SeoTagDescription;
    }

    public void setSeoTagDescription(String SeoTagDescription) {
        this.SeoTagDescription = SeoTagDescription;
    }

    public String getDescriçãoCompleta() {
        return descriçãoCompleta;
    }

    public void setDescriçãoCompleta(String descriçãoCompleta) {
        this.descriçãoCompleta = descriçãoCompleta;
    }

    public String getUrlVideoYoutube() {
        return urlVideoYoutube;
    }

    public void setUrlVideoYoutube(String urlVideoYoutube) {
        this.urlVideoYoutube = urlVideoYoutube;
    }

    public String getEstoqueGerenciado() {
        return estoqueGerenciado;
    }

    public void setEstoqueGerenciado(String estoqueGerenciado) {
        this.estoqueGerenciado = estoqueGerenciado;
    }

    public String getEstoqueQuantidade() {
        return estoqueQuantidade;
    }

    public void setEstoqueQuantidade(String estoqueQuantidade) {
        this.estoqueQuantidade = estoqueQuantidade;
    }

    public String getEstoqueSituacaoEmEstoque() {
        return estoqueSituacaoEmEstoque;
    }

    public void setEstoqueSituacaoEmEstoque(String estoqueSituacaoEmEstoque) {
        this.estoqueSituacaoEmEstoque = estoqueSituacaoEmEstoque;
    }

    public String getEstoqueSituacaoSemEstoque() {
        return estoqueSituacaoSemEstoque;
    }

    public void setEstoqueSituacaoSemEstoque(String estoqueSituacaoSemEstoque) {
        this.estoqueSituacaoSemEstoque = estoqueSituacaoSemEstoque;
    }

    public String getPrecoSobConsulta() {
        return precoSobConsulta;
    }

    public void setPrecoSobConsulta(String precoSobConsulta) {
        this.precoSobConsulta = precoSobConsulta;
    }

    public String getPrecoCusto() {
        return precoCusto;
    }

    public void setPrecoCusto(String precoCusto) {
        this.precoCusto = precoCusto;
    }

    public String getPrecoCheio() {
        return precoCheio;
    }

    public void setPrecoCheio(String precoCheio) {
        this.precoCheio = precoCheio;
    }

    public String getPrecoPromocional() {
        return precoPromocional;
    }

    public void setPrecoPromocional(String precoPromocional) {
        this.precoPromocional = precoPromocional;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getPesoEmKg() {
        return pesoEmKg;
    }

    public void setPesoEmKg(String pesoEmKg) {
        this.pesoEmKg = pesoEmKg;
    }

    public String getAlturaEmCm() {
        return alturaEmCm;
    }

    public void setAlturaEmCm(String alturaEmCm) {
        this.alturaEmCm = alturaEmCm;
    }

    public String getLarguraEmCm() {
        return larguraEmCm;
    }

    public void setLarguraEmCm(String larguraEmCm) {
        this.larguraEmCm = larguraEmCm;
    }

    public String getComprimentoEmCm() {
        return comprimentoEmCm;
    }

    public void setComprimentoEmCm(String comprimentoEmCm) {
        this.comprimentoEmCm = comprimentoEmCm;
    }

    public String getCategoriaNomeNivel1() {
        return categoriaNomeNivel1;
    }

    public void setCategoriaNomeNivel1(String categoriaNomeNivel1) {
        this.categoriaNomeNivel1 = categoriaNomeNivel1;
    }

    public String getCategoriaNomeNivel2() {
        return categoriaNomeNivel2;
    }

    public void setCategoriaNomeNivel2(String categoriaNomeNivel2) {
        this.categoriaNomeNivel2 = categoriaNomeNivel2;
    }

    public String getCategoriaNomeNivel3() {
        return categoriaNomeNivel3;
    }

    public void setCategoriaNomeNivel3(String categoriaNomeNivel3) {
        this.categoriaNomeNivel3 = categoriaNomeNivel3;
    }

    public String getCategoriaNomeNivel4() {
        return categoriaNomeNivel4;
    }

    public void setCategoriaNomeNivel4(String categoriaNomeNivel4) {
        this.categoriaNomeNivel4 = categoriaNomeNivel4;
    }

    public String getCategoriaNomeNivel5() {
        return categoriaNomeNivel5;
    }

    public void setCategoriaNomeNivel5(String categoriaNomeNivel5) {
        this.categoriaNomeNivel5 = categoriaNomeNivel5;
    }

    public String getImagem1() {
        return imagem1;
    }

    public void setImagem1(String imagem1) {
        this.imagem1 = imagem1;
    }

    public String getImagem2() {
        return imagem2;
    }

    public void setImagem2(String imagem2) {
        this.imagem2 = imagem2;
    }

    public String getImagem3() {
        return imagem3;
    }

    public void setImagem3(String imagem3) {
        this.imagem3 = imagem3;
    }

    public String getImagem4() {
        return imagem4;
    }

    public void setImagem4(String imagem4) {
        this.imagem4 = imagem4;
    }

    public String getImagem5() {
        return imagem5;
    }

    public void setImagem5(String imagem5) {
        this.imagem5 = imagem5;
    }

    public String getGradeGenero() {
        return gradeGenero;
    }

    public void setGradeGenero(String gradeGenero) {
        this.gradeGenero = gradeGenero;
    }

    public String getGradeProdutoComUmaCor() {
        return gradeProdutoComUmaCor;
    }

    public void setGradeProdutoComUmaCor(String gradeProdutoComUmaCor) {
        this.gradeProdutoComUmaCor = gradeProdutoComUmaCor;
    }

    public String getGradeProdutoComDuasCores() {
        return gradeProdutoComDuasCores;
    }

    public void setGradeProdutoComDuasCores(String gradeProdutoComDuasCores) {
        this.gradeProdutoComDuasCores = gradeProdutoComDuasCores;
    }

    public String getGradeTamanhoDeAnelalianca() {
        return gradeTamanhoDeAnelalianca;
    }

    public void setGradeTamanhoDeAnelalianca(String gradeTamanhoDeAnelalianca) {
        this.gradeTamanhoDeAnelalianca = gradeTamanhoDeAnelalianca;
    }

    public String getGradeTamanhoDeCalca() {
        return gradeTamanhoDeCalca;
    }

    public void setGradeTamanhoDeCalca(String gradeTamanhoDeCalca) {
        this.gradeTamanhoDeCalca = gradeTamanhoDeCalca;
    }

    public String getGradeTamanhoDeCamisacamiseta() {
        return gradeTamanhoDeCamisacamiseta;
    }

    public void setGradeTamanhoDeCamisacamiseta(String gradeTamanhoDeCamisacamiseta) {
        this.gradeTamanhoDeCamisacamiseta = gradeTamanhoDeCamisacamiseta;
    }

    public String getGradeTamanhoDeCapacete() {
        return gradeTamanhoDeCapacete;
    }

    public void setGradeTamanhoDeCapacete(String gradeTamanhoDeCapacete) {
        this.gradeTamanhoDeCapacete = gradeTamanhoDeCapacete;
    }

    public String getGradeTamanhoDeTenis() {
        return gradeTamanhoDeTenis;
    }

    public void setGradeTamanhoDeTenis(String gradeTamanhoDeTenis) {
        this.gradeTamanhoDeTenis = gradeTamanhoDeTenis;
    }

    public String getGradeVoltagem() {
        return gradeVoltagem;
    }

    public void setGradeVoltagem(String gradeVoltagem) {
        this.gradeVoltagem = gradeVoltagem;
    }

    public String getGradeTamanhoJuvenilInfantil() {
        return gradeTamanhoJuvenilInfantil;
    }

    public void setGradeTamanhoJuvenilInfantil(String gradeTamanhoJuvenilInfantil) {
        this.gradeTamanhoJuvenilInfantil = gradeTamanhoJuvenilInfantil;
    }

    public String getGradeAparelho() {
        return gradeAparelho;
    }

    public void setGradeAparelho(String gradeAparelho) {
        this.gradeAparelho = gradeAparelho;
    }

    public String getGradeCoresDaBlusa() {
        return gradeCoresDaBlusa;
    }

    public void setGradeCoresDaBlusa(String gradeCoresDaBlusa) {
        this.gradeCoresDaBlusa = gradeCoresDaBlusa;
    }

    public String getGradeEssenciafragrancia() {
        return gradeEssenciafragrancia;
    }

    public void setGradeEssenciafragrancia(String gradeEssenciafragrancia) {
        this.gradeEssenciafragrancia = gradeEssenciafragrancia;
    }

    public String getGradeTamanho() {
        return gradeTamanho;
    }

    public void setGradeTamanho(String gradeTamanho) {
        this.gradeTamanho = gradeTamanho;
    }

    public String getGradeTamanhoDaCalca() {
        return gradeTamanhoDaCalca;
    }

    public void setGradeTamanhoDaCalca(String gradeTamanhoDaCalca) {
        this.gradeTamanhoDaCalca = gradeTamanhoDaCalca;
    }

    public String getGradeTamanhoDaSaia() {
        return gradeTamanhoDaSaia;
    }

    public void setGradeTamanhoDaSaia(String gradeTamanhoDaSaia) {
        this.gradeTamanhoDaSaia = gradeTamanhoDaSaia;
    }

    public String getGradeUnidadeDeVolumeLiquidosolidospeso() {
        return gradeUnidadeDeVolumeLiquidosolidospeso;
    }

    public void setGradeUnidadeDeVolumeLiquidosolidospeso(String gradeUnidadeDeVolumeLiquidosolidospeso) {
        this.gradeUnidadeDeVolumeLiquidosolidospeso = gradeUnidadeDeVolumeLiquidosolidospeso;
    }
        
}
