package br.com.wmixvideo.sped.leiaute.blococ;

import java.math.BigDecimal;

import br.com.wmixvideo.sped.enums.SFTotalizadoresParciaisReducaoZ;
import br.com.wmixvideo.sped.leiaute.SFLinha;
import br.com.wmixvideo.sped.util.SFStringBuilder;
import br.com.wmixvideo.sped.util.SFUtil;

public class SFC420RegistroTotalizadoresParciaisReducaoZ implements SFLinha{
	private SFTotalizadoresParciaisReducaoZ campo02TotalizadoresParciaisReducaoZ;
	private BigDecimal campo03ValorAcumuladoNoTotalizador;
    private String campo04NumeroTotalizadorMesmaCargaTributaria;
    private String campo05DescricaoTotalizadoresParciaisReducaoZ;

    @Override
    public String getCampo01CodigoRegistro() {
        return "C420";
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

    public SFC420RegistroTotalizadoresParciaisReducaoZ setCampo02TotalizadoresParciaisReducaoZ(SFTotalizadoresParciaisReducaoZ campo02TotalizadoresParciaisReducaoZ) {
        this.campo02TotalizadoresParciaisReducaoZ = campo02TotalizadoresParciaisReducaoZ;
        return this;
    }
    
    public SFC420RegistroTotalizadoresParciaisReducaoZ setCampo03ValorAcumuladoNoTotalizador(BigDecimal campo03ValorAcumuladoNoTotalizador) {
        this.campo03ValorAcumuladoNoTotalizador = campo03ValorAcumuladoNoTotalizador;
        return this;
    }
    
    public SFC420RegistroTotalizadoresParciaisReducaoZ setCampo04NumeroTotalizadorMesmaCargaTributaria(String campo04NumeroTotalizadorMesmaCargaTributaria) {
        this.campo04NumeroTotalizadorMesmaCargaTributaria = campo04NumeroTotalizadorMesmaCargaTributaria;
        return this;
    }
    
    public SFC420RegistroTotalizadoresParciaisReducaoZ setCampo05DescricaoTotalizadoresParciaisReducaoZ(String campo05DescricaoTotalizadoresParciaisReducaoZ) {
        this.campo05DescricaoTotalizadoresParciaisReducaoZ = campo05DescricaoTotalizadoresParciaisReducaoZ;
        return this;
    }
}
