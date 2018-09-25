package br.com.wmixvideo.sped.leiaute.blococ;

import java.math.BigDecimal;
import java.time.LocalDate;

import br.com.wmixvideo.sped.leiaute.SFLinha;
import br.com.wmixvideo.sped.util.SFStringBuilder;
import br.com.wmixvideo.sped.util.SFUtil;

public class SFC405ReducaoZ implements SFLinha{
	private LocalDate campo02DataMovimentoReducaoZ;
    private String campo03PosicaoContadorReinicioOperacao;
    private String campo04PosicaoContatorReducaoZ;
    private String campo05NumeroCOOReducaoZ;
    private BigDecimal campo06ValorGrandeTotal;
    private BigDecimal campo07ValorVendaBruta;

    @Override
    public String getCampo01CodigoRegistro() {
        return "C405";
    }

    @Override
    public String toString() {
        final SFStringBuilder linha = new SFStringBuilder();
        linha.append(this.getCampo01CodigoRegistro());
        linha.append(SFUtil.formatToString(this.campo02DataMovimentoReducaoZ));
        linha.append(this.campo03PosicaoContadorReinicioOperacao);
        linha.append(this.campo04PosicaoContatorReducaoZ);
        linha.append(this.campo05NumeroCOOReducaoZ);
        linha.append(SFUtil.formatToString(this.campo06ValorGrandeTotal));
        linha.append(SFUtil.formatToString(this.campo07ValorVendaBruta));
        return linha.toString();
    }

    public SFC405ReducaoZ setCampo02DataMovimentoReducaoZ(LocalDate campo02DataMovimentoReducaoZ) {
        this.campo02DataMovimentoReducaoZ = campo02DataMovimentoReducaoZ;
        return this;
    }
    
    public SFC405ReducaoZ setCampo03PosicaoContadorReinicioOperacao(String campo03PosicaoContadorReinicioOperacao) {
        this.campo03PosicaoContadorReinicioOperacao = campo03PosicaoContadorReinicioOperacao;
        return this;
    }
    
    public SFC405ReducaoZ setCampo04PosicaoContatorReducaoZ(String campo04PosicaoContatorReducaoZ) {
        this.campo04PosicaoContatorReducaoZ = campo04PosicaoContatorReducaoZ;
        return this;
    }
    
    public SFC405ReducaoZ setCampo05NumeroCOOReducaoZ(String campo05NumeroCOOReducaoZ) {
        this.campo05NumeroCOOReducaoZ = campo05NumeroCOOReducaoZ;
        return this;
    }
    
    public SFC405ReducaoZ setCampo06ValorGrandeTotal(BigDecimal campo06ValorGrandeTotal) {
        this.campo06ValorGrandeTotal = campo06ValorGrandeTotal;
        return this;
    }
    
    public SFC405ReducaoZ setCampo07ValorVendaBruta(BigDecimal campo07ValorVendaBruta) {
        this.campo07ValorVendaBruta = campo07ValorVendaBruta;
        return this;
    }
}
