package br.com.wmixvideo.sped.enums;

public enum SFNaturezaBaseCalculoCredito {

    AQUISICAO_DE_BENS_PARA_REVENDA("01"),
    AQUISICAO_DE_BENS_UTILIZADOS_COMO_INSUMO("02"),
    AQUISICAO_DE_SERVICOS_UTILIZADOS_COMO_INSUMO("03"),
    ENERGIA_ELETRICA_E_TERMICA_INCLUSIVE_SOB_A_FORMA_DE_VAPOR("04"),
    ALUGUEIS_DE_PREDIOS("05"),
    ALUGUEIS_DE_MAQUINAS_E_EQUIPAMENTOS("06"),
    ARMAZENAGEM_DE_MERCADORIA_E_FRETE_NA_OPERACAO_DE_VENDA("07"),
    CONTRAPRESTACOES_DE_ARRENDAMENTO_MERCANTIL("08"),
    MAQUINAS_EQUIPAMENTOS_E_OUTROS_BENS_INCORPORADOS_AO_ATIVO_IMOBILIZADO_CREDITO_SOBRE_ENCARGOS_DE_DEPRECIACAO("09"),
    MAQUINAS_EQUIPAMENTOS_E_OUTROS_BENS_INCORPORADOS_AO_ATIVO_IMOBILIZADO_CREDITO_COM_BASE_NO_VALOR_DE_AQUISICAO("10"),
    AMORTIZACAO_E_DEPRECIACAO_DE_EDIFICACOES_E_BENFEITORIAS_EM_IMOVEIS("11"),
    OUTRAS_OPERACOES_COM_DIREITO_A_CREDITO("13"),
    ATIVIDADE_DE_TRANSPORTE_DE_CARGAS_SUBCONTRATACAO("14"),
    ATIVIDADE_IMOBILIARIA_CUSTO_INCORRIDO_DE_UNIDADE_IMOBILIARIA("15"),
    ATIVIDADE_IMOBILIARIA_CUSTO_ORCADO_DE_UNIDADE_NAO_CONCLUIDA("16"),
    ATIVIDADE_DE_PRESTACAO_DE_SERVICOS_DE_LIMPEZA_CONSERVACAO_E_MANUTENCAO_VALE_TRANSPORTE_VALEREFEICAO_OU_VALE_ALIMENTACAO_FARDAMENTO_OU_UNIFORME("17"),
    ESTOQUE_DE_ABERTURA_DE_BENS("18");

    private final String codigo;

    SFNaturezaBaseCalculoCredito(final String codigo) {
        this.codigo = codigo;
    }

    public String getCodigo() {
        return this.codigo;
    }

    @Override
    public String toString() {
        return this.getCodigo();
    }

}
