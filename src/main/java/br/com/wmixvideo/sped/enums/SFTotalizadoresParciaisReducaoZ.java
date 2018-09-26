package br.com.wmixvideo.sped.enums;

public enum SFTotalizadoresParciaisReducaoZ {
	TRIBUTADO_ICMS_18("T1800", "Carga tributária efetiva = 18,00%"),
    ISENTO_ICMS("I0", "Valores isentos do ICMS");
    
    private final String codigo;
    private final String descricao;

    SFTotalizadoresParciaisReducaoZ(final String codigo, final String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    @Override
    public String toString() {
        return this.codigo;
    }
}
