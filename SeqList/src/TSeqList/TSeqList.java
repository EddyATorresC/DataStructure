package TSeqList;

public class TSeqList {
    private Object[] array;
    private int idx;

    public TSeqList(int quantity) {
        this.idx = -1;
        array = new Object[quantity];
    }

    public TSeqList(Object[] array) {
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
    public void addAt(int position, Object element){
        if (!isFull()) {
            idx++;
            for (int i = idx; i >= position ; i--) {
                array[i] = array[i-1];
            }
            array[position] = element;
        }
    }

    public Object getInfo(int position){
        return array[position];
    }
}
