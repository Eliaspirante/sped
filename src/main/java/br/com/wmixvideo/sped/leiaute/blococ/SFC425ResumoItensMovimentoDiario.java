package br.com.wmixvideo.sped.leiaute.blococ;

import java.math.BigDecimal;

import br.com.wmixvideo.sped.enums.SFTotalizadoresParciaisReducaoZ;
import br.com.wmixvideo.sped.leiaute.SFLinha;
import br.com.wmixvideo.sped.util.SFStringBuilder;
import br.com.wmixvideo.sped.util.SFUtil;

public class SFC425ResumoItensMovimentoDiario implements SFLinha{
	private SFTotalizadoresParciaisReducaoZ campo02TotalizadoresParciaisReducaoZ;
	private BigDecimal campo03ValorAcumuladoNoTotalizador;
    private String campo04NumeroTotalizadorMesmaCargaTributaria;
    private String campo05DescricaoTotalizadoresParciaisReducaoZ;

    @Override
    public String getCampo01CodigoRegistro() {
        return "C425";
    }

    @Override
    public String toString() {
        final SFStringBuilder linha = new SFStringBuilder();
        linha.append(this.getCampo01CodigoRegistro());
        linha.append(SFUtil.formatToString(this.campo02TotalizadoresParciaisReducaoZ));
        linha.append(SFUtil.formatToString(this.campo03ValorAcumuladoNoTotalizador));
        linha.append(this.campo04NumeroTotalizadorMesmaCargaTributaria);
        linha.append(this.campo05DescricaoTotalizadoresParciaisReducaoZ);
        return linha.toString();
    }

    public SFC425ResumoItensMovimentoDiario setCampo02TotalizadoresParciaisReducaoZ(SFTotalizadoresParciaisReducaoZ campo02TotalizadoresParciaisReducaoZ) {
        this.campo02TotalizadoresParciaisReducaoZ = campo02TotalizadoresParciaisReducaoZ;
        return this;
    }
}
