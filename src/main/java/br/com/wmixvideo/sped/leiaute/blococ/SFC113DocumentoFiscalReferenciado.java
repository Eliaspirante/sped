package br.com.wmixvideo.sped.leiaute.blococ;

import java.time.LocalDate;

import br.com.wmixvideo.sped.enums.SFIndicadorEmitente;
import br.com.wmixvideo.sped.enums.SFIndicadorProcessoOrigem;
import br.com.wmixvideo.sped.leiaute.SFLinha;
import br.com.wmixvideo.sped.util.SFStringBuilder;
import br.com.wmixvideo.sped.util.SFUtil;

public class SFC113DocumentoFiscalReferenciado implements SFLinha{

	private SFIndicadorProcessoOrigem campo02IndicadorOperacao;
    private SFIndicadorEmitente campo03IndicadorEmitente;
    private String campo04CodigoParticipanteEmitente;
    private String campo05CodigoDocumentoFiscal;
    private String campo06SerieDoDocumentoFiscal;
    private String campo07SubSerieDoDocumentoFiscal;
    private String campo08NumeroDocumentoFiscal;
    private LocalDate campo09DataEmissao;
    private String campo10ChaveDocumentoEletronico;

    @Override
    public String getCampo01CodigoRegistro() {
        return "C113";
    }

    @Override
    public String toString() {
        final SFStringBuilder linha = new SFStringBuilder();
        linha.append(this.getCampo01CodigoRegistro());
        linha.append(SFUtil.formatToString(this.campo02IndicadorOperacao));
        linha.append(SFUtil.formatToString(this.campo03IndicadorEmitente));
        linha.append(this.campo04CodigoParticipanteEmitente);
        linha.append(this.campo05CodigoDocumentoFiscal);
        linha.append(this.campo06SerieDoDocumentoFiscal);
        linha.append(this.campo07SubSerieDoDocumentoFiscal);
        linha.append(this.campo08NumeroDocumentoFiscal);
        linha.append(SFUtil.formatToString(this.campo09DataEmissao));
        linha.append(this.campo10ChaveDocumentoEletronico);
        return linha.toString();
    }

    public SFC113DocumentoFiscalReferenciado setCampo02Numero(SFIndicadorProcessoOrigem campo02IndicadorOperacao) {
        this.campo02IndicadorOperacao = campo02IndicadorOperacao;
        return this;
    }
    
    public SFC113DocumentoFiscalReferenciado setCampo03IndicadorOrigem(SFIndicadorEmitente campo03IndicadorEmitente) {
        this.campo03IndicadorEmitente = campo03IndicadorEmitente;
        return this;
    }

    public SFC113DocumentoFiscalReferenciado setCampo04CodigoParticipanteEmitente(String campo04CodigoParticipanteEmitente) {
        this.campo04CodigoParticipanteEmitente = campo04CodigoParticipanteEmitente;
        return this;
    }

    public SFC113DocumentoFiscalReferenciado setCampo05CodigoDocumentoFiscal(String campo05CodigoDocumentoFiscal) {
        this.campo05CodigoDocumentoFiscal = campo05CodigoDocumentoFiscal;
        return this;
    }
    
    public SFC113DocumentoFiscalReferenciado setCampo06SerieDoDocumentoFiscal(String campo06SerieDoDocumentoFiscal) {
        this.campo06SerieDoDocumentoFiscal = campo06SerieDoDocumentoFiscal;
        return this;
    }

    public SFC113DocumentoFiscalReferenciado setcampo07SubSerieDoDocumentoFiscal(String campo07SubSerieDoDocumentoFiscal) {
        this.campo07SubSerieDoDocumentoFiscal = campo07SubSerieDoDocumentoFiscal;
        return this;
    }
    
    public SFC113DocumentoFiscalReferenciado setCampo10ChaveDocumentoEletronico(String campo10ChaveDocumentoEletronico) {
        this.campo10ChaveDocumentoEletronico = campo10ChaveDocumentoEletronico;
        return this;
    }
    
    public SFC113DocumentoFiscalReferenciado setCampo09DataEmissao(LocalDate campo09DataEmissao) {
        this.campo09DataEmissao = campo09DataEmissao;
        return this;
    }
    
    public SFC113DocumentoFiscalReferenciado setCampo08NumeroDocumentoFiscal(String campo08NumeroDocumentoFiscal) {
        this.campo08NumeroDocumentoFiscal = campo08NumeroDocumentoFiscal;
        return this;
    }
    
}
