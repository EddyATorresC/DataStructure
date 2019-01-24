package TSeqStack;

public class TSeqStack {
    private Object[] array;
    private int idx;

    public TSeqStack(int quantity) {
        this.idx = -1;
        array = new Object[quantity];
    }

    public TSeqStack(Object[] array) {
        this.array = array;
        int idx = array.length;
    }

    public int getIdx() {
        return idx;
    }

    public boolean isEmpty(){
        boolean flag = false;
        if(idx == -1){
            flag = true;
        }
        return flag;
    }

    public boolean isFull(){
        boolean flag = false;
        if(idx+1 == array.length){
            flag = true;
        }
        return flag;
    }

    public void add(Object element){
        if(!isFull()) {
            idx++;
            array[idx] = element;
        }
    }
    public void delete(){
        array[idx] = new Object();
        idx--;
    }

    public Object getInfo(){
        return array[idx];
    }
}
