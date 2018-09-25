package br.com.wmixvideo.sped.leiaute.blococ;

import br.com.wmixvideo.sped.leiaute.SFLinha;
import br.com.wmixvideo.sped.util.SFStringBuilder;

public class SFC310DocumentosCanceladosDeNotasFiscaisDeVendaAConsumidor implements SFLinha{
	private String campo02NumeroDocumentoCancelado;

    @Override
    public String getCampo01CodigoRegistro() {
        return "C310";
    }

    @Override
    public String toString() {
        final SFStringBuilder linha = new SFStringBuilder();
        linha.append(this.getCampo01CodigoRegistro());
        linha.append(this.campo02NumeroDocumentoCancelado);
        return linha.toString();
    }

    public SFC310DocumentosCanceladosDeNotasFiscaisDeVendaAConsumidor setCampo02NumeroDocumentoCancelado(String campo02NumeroDocumentoCancelado) {
        this.campo02NumeroDocumentoCancelado = campo02NumeroDocumentoCancelado;
        return this;
    }
}
