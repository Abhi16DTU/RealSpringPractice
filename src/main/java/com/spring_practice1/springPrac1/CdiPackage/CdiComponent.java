package com.spring_practice1.springPrac1.CdiPackage;

import javax.inject.Inject;
import javax.inject.Named;

@Named
public class CdiComponent {

    @Inject
    private CdiJDBC cdiJDBC;

    public CdiJDBC getCdiJDBC() {
        return cdiJDBC;
    }

    public void setCdiJDBC(CdiJDBC cdiJDBC) {
        this.cdiJDBC = cdiJDBC;
    }
}
