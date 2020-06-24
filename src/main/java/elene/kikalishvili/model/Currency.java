package elene.kikalishvili.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Currency {
    String description;
    Double cur;

    public Currency(){

    }

    public Currency(Double cur, String desc) {
        this.cur = cur;
        description = desc;
    }

    public Double getCur() {
        return cur;
    }

    public void setCur(Double cur) {
        this.cur = cur;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String desc) {
        description = desc;
    }


    @Override
    public String toString() {
        return "Currency{" +
                "currency=" + cur +
                ", description='" + description + '\'' +
                '}';
    }
}


