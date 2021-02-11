import java.util.Date;

public class Operations {
    public static void main(String[] args){
        Operations op = new Operations();
        //factorial
        System.out.println(op.factorial(5));
        //array
        System.out.println(op.validateArray("a"));
        System.out.println(op.validateArray("b"));
        System.out.println(op.validateArray("f"));
        //total array
        System.out.println(op.totalArray(new int[]{1, 34, 56, 72, 123}));
        //modulus
        System.out.println(op.getModulus(17, 2));
        //days of the month
        System.out.println(op.getMonthDays("december"));
    }

    public int factorial(int num){
        int x = 0;
        int res=1;
        for(int i = 1; i <= num; i++){
            x = res * i ;
            res = x;
        }
        return x;
    }

    public boolean validateArray(String letter){
        String arr[] = {"a","b","c","d"};
        boolean found = false;
        for(String x : arr){
            if(x.equalsIgnoreCase(letter)){
                found = true;
            }
        }
        return found;
    }

    public int totalArray(int arr[]){
        int x = 0;
        int res=0;
        for(int i =0; i < arr.length; i++){
            x = res + arr[i] ;
            res = x;
        }
        return res;
    }

    public int getModulus(int num, int divide) {
        return num - divide * (num / divide);
    }

    public int getMonthDays(String month){
        int days = 0;
        switch (month.toLowerCase()){
            case "january":
                days = 31;
                break;
            case "february":
                Date date=new Date();
                int year = date.getYear();
                if ((year % 4 == 0) && ((year % 100 != 0) || (year% 400 == 0)))
                    days = 29;
                else
                    days = 28;
                break;
            case "march":
                days = 31;
                break;
            case "april":
                days = 30;
                break;
            case "may":
                days = 31;
                break;
            case "june":
                days = 30;
                break;
            case "july":
                days = 31;
                break;
            case "august":
                days = 31;
                break;
            case "september":
                days = 30;
                break;
            case "october":
                days = 31;
                break;
            case "november":
                days = 30;
                break;
            case "december":
                days = 31;
                break;
            default:
                days = 0;
                break;
        }
        return days;
    }
}
