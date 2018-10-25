package deqo.ysan.mysimplestack;

class Item {

    /**
     * Retourne la valeur de l'item
     * @return La valeur de l'item
     */
    int getData() {
        return _data;
    }

    /**
     * Affecte une nouvelle valeur à l'item
     * @param data La nouvelle valeur à affecter
     */
    void setData(int data) {
        _data = data;
    }

    /**
     * Instancie un nouvel item
     * @param data La valeur de base de l'item à instancier
     */
    Item(int data) {
        _data = data;
    }

    private int _data;
}
