package deqo.ysan.mysimplestack;

public class Item {
    public int getData() {
        return _data;
    }

    public void setData(int data) {
        _data = data;
    }

    public Item(int data) {
        _data = data;
    }

    private int _data;
}
