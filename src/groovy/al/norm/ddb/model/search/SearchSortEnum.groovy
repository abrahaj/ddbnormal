package al.norm.ddb.model.search

public enum SearchSortEnum {

    RELEVANCE("RELEVANCE"),
    LPHA_ASC("ALPHA_ASC"),
    ALPHA_DESC("ALPHA_DESC"),
    RANDOM("random"),


    private String name

    private SearchSortEnum(String name) {
        this.name = name
    }

    public String getName() {
        return name
    }
}
