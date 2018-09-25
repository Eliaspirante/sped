package br.com.wmixvideo.sped.leiaute.blococ;

import br.com.wmixvideo.sped.enums.SFDocumentoModelo;
import br.com.wmixvideo.sped.leiaute.SFLinha;
import br.com.wmixvideo.sped.util.SFStringBuilder;
import br.com.wmixvideo.sped.util.SFUtil;

public class SFC400EquipamentoECF implements SFLinha{
	
	private SFDocumentoModelo campo02CodigoModelo;
    private String campo03ModeloEquipamento;
    private String campo04NumeroSerieECF;
    private String campo05NumeroCaixaAtribuidoECF;

    @Override
    public String getCampo01CodigoRegistro() {
        return "C400";
    }

    @Override
    public String toString() {
        final SFStringBuilder linha = new SFStringBuilder();
        linha.append(this.getCampo01CodigoRegistro());
        linha.append(SFUtil.formatToString(this.campo02CodigoModelo));
        linha.append(this.campo03ModeloEquipamento);
        linha.append(this.campo04NumeroSerieECF);
        linha.append(this.campo05NumeroCaixaAtribuidoECF);
        return linha.toString();
    }

    public SFC400EquipamentoECF setCampo02CodigoModelo(SFDocumentoModelo campo02CodigoModelo) {
        this.campo02CodigoModelo = campo02CodigoModelo;
        return this;
    }
    
    public SFC400EquipamentoECF setCampo03ModeloEquipamento(String campo03ModeloEquipamento) {
        this.campo03ModeloEquipamento = campo03ModeloEquipamento;
        return this;
    }
    
    public SFC400EquipamentoECF setCampo04NumeroSerieECF(String campo04NumeroSerieECF) {
        this.campo04NumeroSerieECF = campo04NumeroSerieECF;
        return this;
    }
    
    public SFC400EquipamentoECF setCampo05NumeroCaixaAtribuidoECF(String campo05NumeroCaixaAtribuidoECF) {
        this.campo05NumeroCaixaAtribuidoECF = campo05NumeroCaixaAtribuidoECF;
        return this;
    }

    
}
