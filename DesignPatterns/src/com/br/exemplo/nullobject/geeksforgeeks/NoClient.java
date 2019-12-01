package com.br.exemplo.nullobject.geeksforgeeks;

public class NoClient extends Emp {
    @Override
    public boolean isNull() {
        return true;
    }

    @Override
    public String getName() {
        return "Not available";
    }
}
