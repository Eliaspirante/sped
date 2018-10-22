package br.com.wmixvideo.sped.leiaute.blococ;

import java.math.BigDecimal;

import br.com.wmixvideo.sped.enums.SFTotalizadoresParciaisReducaoZ;
import br.com.wmixvideo.sped.leiaute.SFLinha;
import br.com.wmixvideo.sped.util.SFStringBuilder;
import br.com.wmixvideo.sped.util.SFUtil;

public class SFC425ResumoItensMovimentoDiario implements SFLinha{
	private String campo02CodigoItem;
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
        linha.append(this.campo02CodigoItem);
        linha.append(SFUtil.formatToString(this.campo03ValorAcumuladoNoTotalizador));
        linha.append(this.campo04NumeroTotalizadorMesmaCargaTributaria);
        linha.append(this.campo05DescricaoTotalizadoresParciaisReducaoZ);
        return linha.toString();
    }

    public SFC425ResumoItensMovimentoDiario setCampo02CodigoItem(String campo02CodigoItem) {
        this.campo02CodigoItem = campo02CodigoItem;
        return this;
    }
}
