package models;

public class Type {

    private Integer typeId;
    private String type;

    public Type() {
    }

    public Type(String type) {
        this.type = type;
    }

    public Type(Integer typeId, String type) {
        this.typeId = typeId;
        this.type = type;
    }

    public Integer getTypeId() {
        return typeId;
    }

    public void setTypeId(Integer typeId) {
        this.typeId = typeId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Type{" +
                "typeId=" + typeId +
                ", type='" + type + '\'' +
                '}';
    }
}