package com.company.homeworkdriver.entity;

import io.jmix.core.metamodel.datatype.EnumClass;

import org.springframework.lang.Nullable;


public enum DocumentType implements EnumClass<String> {

    LICENSE("L"),
    INSURANCE("I"),
    PASSPORT("P");


    private final String id;

    DocumentType(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    @Nullable
    public static DocumentType fromId(String id) {
        for (DocumentType at : DocumentType.values()) {
            if (at.getId().equals(id)) {
                return at;
            }
        }
        return null;
    }
}