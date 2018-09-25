package br.com.wmixvideo.sped.leiaute.blococ;

import java.time.LocalDate;

import br.com.wmixvideo.sped.enums.SFDocumentoModelo;
import br.com.wmixvideo.sped.leiaute.SFLinha;
import br.com.wmixvideo.sped.util.SFStringBuilder;
import br.com.wmixvideo.sped.util.SFUtil;

public class SFC114CupomFiscalReferenciado implements SFLinha{
	private SFDocumentoModelo campo02CodigoModeloCupom;
    private String campo03NumeroSerieECF;
    private String campo04NumeroCaixaAtribuidoECF;
    private String campo05NumeroDocumentoFiscal;
    private LocalDate campo06DataDocumento;
    
    @Override
    public String toString() {
        final SFStringBuilder linha = new SFStringBuilder();
        linha.append(this.getCampo01CodigoRegistro());
        linha.append(SFUtil.formatToString(this.campo02CodigoModeloCupom));
        linha.append(this.campo03NumeroSerieECF);
        linha.append(this.campo04NumeroCaixaAtribuidoECF);
        linha.append(this.campo05NumeroDocumentoFiscal);
        linha.append(SFUtil.formatToString(this.campo06DataDocumento));
        return linha.toString();
    }
    
    @Override
    public String getCampo01CodigoRegistro() {
        return "C114";
    }
    
    public SFC114CupomFiscalReferenciado setCampo02CodigoModeloCupom(SFDocumentoModelo campo02CodigoModeloCupom) {
        this.campo02CodigoModeloCupom = campo02CodigoModeloCupom;
        return this;
    }
    
    public SFC114CupomFiscalReferenciado setCampo03NumeroSerieECF(String campo03NumeroSerieECF) {
        this.campo03NumeroSerieECF = campo03NumeroSerieECF;
        return this;
    }
    
    public SFC114CupomFiscalReferenciado setCampo04NumeroCaixaAtribuidoECF(String campo04NumeroCaixaAtribuidoECF) {
        this.campo04NumeroCaixaAtribuidoECF = campo04NumeroCaixaAtribuidoECF;
        return this;
    }
    
    public SFC114CupomFiscalReferenciado setCampo05NumeroDocumentoFiscal(String campo05NumeroDocumentoFiscal) {
        this.campo05NumeroDocumentoFiscal = campo05NumeroDocumentoFiscal;
        return this;
    }
    
    public SFC114CupomFiscalReferenciado setCampo06DataDocumento(LocalDate campo06DataDocumento) {
        this.campo06DataDocumento = campo06DataDocumento;
        return this;
    }
}
