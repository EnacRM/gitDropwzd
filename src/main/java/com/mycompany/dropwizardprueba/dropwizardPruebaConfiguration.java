package com.mycompany.dropwizardprueba;

import io.dropwizard.Configuration;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Arrays;
import java.util.List;
import javax.validation.constraints.NotEmpty;
import org.hibernate.validator.constraints.*;
import javax.validation.constraints.*;

public class dropwizardPruebaConfiguration extends Configuration {
    @NotEmpty
    private String template;

    @NotEmpty
    private String defaultName = "Stranger";
    
    @NotEmpty
    private List<String> coches;

    @JsonProperty
    public String getTemplate() {
        return template;
    }

    @JsonProperty
    public void setTemplate(String template) {
        this.template = template;
    }

    @JsonProperty
    public String getDefaultName() {
        return defaultName;
    }

    @JsonProperty
    public void setDefaultName(String name) {
        this.defaultName = name;
    }
    
    @JsonProperty
    public List<String> getCoches() {
        return coches;
    }
    
    @JsonProperty
    public int countCoches() {
        int aux=coches.size();
        return aux;
    }
    
    @JsonProperty
    public String getCoche(int n) {
        return coches.get(n);
    }

    @JsonProperty
    public void setCoches(List<String> coches) {
        this.coches = coches;
    }
    
}
