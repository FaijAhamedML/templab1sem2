package Lab1;

class EvenOddNumber {
    public boolean findEvenOrOdd(int i){
        int reminder= i%2;
        if (reminder==1){
            return true;
        }else{
            return false;
        }
    }
}
