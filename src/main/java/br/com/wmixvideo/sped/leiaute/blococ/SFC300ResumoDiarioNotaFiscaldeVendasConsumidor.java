package br.com.wmixvideo.sped.leiaute.blococ;

import java.math.BigDecimal;
import java.time.LocalDate;

import br.com.wmixvideo.sped.enums.SFDocumentoModelo;
import br.com.wmixvideo.sped.leiaute.SFLinha;
import br.com.wmixvideo.sped.util.SFStringBuilder;
import br.com.wmixvideo.sped.util.SFUtil;

public class SFC300ResumoDiarioNotaFiscaldeVendasConsumidor implements SFLinha {

	private SFDocumentoModelo campo02CodigoModelo;
    private String campo03SerieDocumento;
	private String campo04SubSerieDocumento;
	private String campo05NumeroDocumentoFiscalInicial;
	private String campo06NumeroDocumentoFiscalFinal;
    private LocalDate campo07DataEmissaoDocumentosFiscais;
    private BigDecimal campo08ValorTotalDocumentos;
    private BigDecimal campo09ValorTotalPIS;
    private BigDecimal campo10ValorTotalCOFINS;
    private String campo11CodigoContaAnaliticaContabilDebitadaCreditada;

    @Override
    public String getCampo01CodigoRegistro() {
        return "C300";
    }

    @Override
    public String toString() {
        final SFStringBuilder linha = new SFStringBuilder();
        linha.append(this.getCampo01CodigoRegistro());
        linha.append(SFUtil.formatToString(this.campo02CodigoModelo));
        linha.append(this.campo03SerieDocumento);
        linha.append(this.campo04SubSerieDocumento);
        linha.append(this.campo05NumeroDocumentoFiscalInicial);
        linha.append(this.campo06NumeroDocumentoFiscalFinal);
        linha.append(SFUtil.formatToString(this.campo07DataEmissaoDocumentosFiscais));
        linha.append(SFUtil.formatToString(this.campo08ValorTotalDocumentos));
        linha.append(SFUtil.formatToString(this.campo09ValorTotalPIS));
        linha.append(SFUtil.formatToString(this.campo10ValorTotalCOFINS));
        linha.append(this.campo11CodigoContaAnaliticaContabilDebitadaCreditada);
        return linha.toString();
    }

    public SFC300ResumoDiarioNotaFiscaldeVendasConsumidor setCampo02CodigoModelo(SFDocumentoModelo campo02CodigoModelo) {
        this.campo02CodigoModelo = campo02CodigoModelo;
        return this;
    }

    public SFC300ResumoDiarioNotaFiscaldeVendasConsumidor setCampo03Descricao(String campo03SerieDocumento) {
        this.campo03SerieDocumento = campo03SerieDocumento;
        return this;
    }
    
    public SFC300ResumoDiarioNotaFiscaldeVendasConsumidor setCampo04SubSerieDocumento(String campo04SubSerieDocumento) {
        this.campo04SubSerieDocumento = campo04SubSerieDocumento;
        return this;
    }
    
    public SFC300ResumoDiarioNotaFiscaldeVendasConsumidor setCampo05NumeroDocumentoFiscalInicial(String campo05NumeroDocumentoFiscalInicial) {
        this.campo05NumeroDocumentoFiscalInicial = campo05NumeroDocumentoFiscalInicial;
        return this;
    }
    
    public SFC300ResumoDiarioNotaFiscaldeVendasConsumidor setCampo06NumeroDocumentoFiscalFinal(String campo06NumeroDocumentoFiscalFinal) {
        this.campo06NumeroDocumentoFiscalFinal = campo06NumeroDocumentoFiscalFinal;
        return this;
    }
        
    public SFC300ResumoDiarioNotaFiscaldeVendasConsumidor setCampo07DataEmissaoDocumentosFiscais(LocalDate campo07DataEmissaoDocumentosFiscais) {
        this.campo07DataEmissaoDocumentosFiscais = campo07DataEmissaoDocumentosFiscais;
        return this;
    }
    
    public SFC300ResumoDiarioNotaFiscaldeVendasConsumidor setCampo08ValorTotalDocumentos(BigDecimal campo08ValorTotalDocumentos) {
        this.campo08ValorTotalDocumentos = campo08ValorTotalDocumentos;
        return this;
    }
    
    public SFC300ResumoDiarioNotaFiscaldeVendasConsumidor setCampo09ValorTotalPIS(BigDecimal campo09ValorTotalPIS) {
        this.campo09ValorTotalPIS = campo09ValorTotalPIS;
        return this;
    }
    
    public SFC300ResumoDiarioNotaFiscaldeVendasConsumidor setCampo10ValorTotalCOFINS(BigDecimal campo10ValorTotalCOFINS) {
        this.campo10ValorTotalCOFINS = campo10ValorTotalCOFINS;
        return this;
    }
    
    public SFC300ResumoDiarioNotaFiscaldeVendasConsumidor setCampo11CodigoContaAnaliticaContabilDebitadaCreditada(String campo11CodigoContaAnaliticaContabilDebitadaCreditada) {
        this.campo11CodigoContaAnaliticaContabilDebitadaCreditada = campo11CodigoContaAnaliticaContabilDebitadaCreditada;
        return this;
    }
    
}
