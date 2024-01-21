package org.example;

public class Door {
    private final boolean withPrize;

    public Door(boolean withPrize) {
        this.withPrize = withPrize;
    }

    /**
     * Проверка статуса двери
     * @return с призом/без приза
     */
    public boolean getWithPrize() {
        return  withPrize;
    }
}
