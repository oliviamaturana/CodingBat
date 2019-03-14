public class Runner {

    public boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
        if (aSmile && bSmile) {
            return true;
        }
        if (!aSmile && !bSmile) {
            return true;
        }
        return false;
    }


    public int arrayCount9(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 9) {
                count++;
            }
        }
        return count;
    }

    public String helloName(String name) {
        return "Hello " + name + "!";
    }


    public boolean firstLast6(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[0] == 6) {
                return true;
            }
            if (nums[nums.length - 1] == 6) {
                return true;
            }
        }
        return false;
    }

    public boolean squirrelPlay(int temp, boolean isSummer) {
        if(temp >= 60 && temp <= 90 && !isSummer){
            return true;
        }
        if(temp >= 60 && temp <= 100 && isSummer){
            return true;
        }
        return false;

    }

    public int blackjack(int a, int b) {
        if(a > b && a <= 21){
            return a;
        }
        if(b > a && b <= 21){
            return b;
        }
        if(a > 21 && b > 21){
            return 0;
        }
        if(a > 21){
            return b;
        }
        if(b > 21){
            return a;
        }
        return -1;

    }



    public int countHi(String str) {
        int count = 0;
        for ( int i=0; i<str.length()-1; i++){
            if(str.substring(i, i+2).equals("hi")){
                count++;
            }
        }
        return count;
    }


    public boolean equalIsNot(String str) {
        int isCount = 0;
        int notCount = 0;
        for ( int i = 0; i < str.length()-2; i++){
            if(str.substring(i, i+2).equals("is")){
                isCount++;
            }
            if(str.substring(i, i+3).equals("not")){
                notCount++;
            }
        }
        if(isCount == notCount){
            return true;
        }
        return false;
    }

    public boolean has12(int[] nums) {
        boolean foundOne = false;
        boolean foundOneTwo = false;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 1)
                foundOne = true;
            if(nums[i] == 2 && foundOne)
                foundOneTwo = true;
        }
        return foundOneTwo;
    }


    public int countClumps(int[] nums) {
        boolean match = false;
        int count =0;
        for(int i =0; i<nums.length-1; i++){
            if(nums[i] == nums[i+1] && !match){
                match = true;
                count++;
            }
            else if(nums[i] != nums[i+1]){
                match = false;
            }
        }
        return count;
    }


}


