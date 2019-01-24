package Exception;

public class MyException extends Exception {
    int option;
    String answer;

    public MyException(int option) {
        this.option = option;
    }

    @Override
    public String getMessage(){
        switch (option){
            case 0:{
                answer = "List is Full.";
            }
            break;
            case 1:{
                answer = "List is Empty.";
            }
            break;
            case 2:{
                answer = "Stack is Full";
            }
            break;
            case 3:{
                answer = "Stack is Empty.";
            }
            break;
            case 4:{
                answer = "IndexOutOfBounds";
            }
            break;
            case 5:{
                answer = "Field Empty.";
            }
            break;
            default:{
                answer ="Could not identify the error.";
            }
            break;
        }
        return answer;
    }
}