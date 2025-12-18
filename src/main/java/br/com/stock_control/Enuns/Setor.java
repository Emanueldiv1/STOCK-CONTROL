package br.com.stock_control.Enuns;

public enum Setor {

    GABINETE_DO_PREFEITO("Gabinete do Prefeito"),
    SECRETARIA_ADMINISTRACAO("Secretaria de Administração"),
    SECRETARIA_FINANCAS("Secretaria de Finanças"),
    SECRETARIA_PLANEJAMENTO("Secretaria de Planejamento"),
    PROCURADORIA_JURIDICA("Procuradoria Jurídica"),
    DEPARTAMENTO_LIMPEZA_PUBLICA("Departamento de Limpeza Pública"),
    DEPARTAMENTO_ILUMINACAO_PUBLICA("Departamento de Iluminação Pública"),
    ALMOXARIFADO_CENTRAL("Almoxarifado Central"),
    DEPARTAMENTO_TI("Departamento de TI");

    private final String descricao;

    Setor(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    @Override
    public String toString() {
        return descricao;
    }
}
