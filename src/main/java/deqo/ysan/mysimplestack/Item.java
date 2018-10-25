package deqo.ysan.mysimplestack;

/**
 * Un Item contient une valeur de type int.
 * @author Yoan Sanna
 */
class Item {

    /**
     * Valeur de l'item de type int.
     */
    private int data;

    /**
     * Retourne la valeur de l'item.
     * @return La valeur de l'item
     */
    int getData() {
        return data;
    }

    /**
     * Affecte une nouvelle valeur à l'item.
     * @param newData La nouvelle valeur à affecter
     */
    void setData(final int newData) {
        data = newData;
    }

    /**
     * Instancie un nouvel item.
     * @param newData La valeur de base de l'item à instancier
     */
    Item(final int newData) {
        data = newData;
    }

    private int _data;
}
