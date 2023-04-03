public class cynthia {
    public static void main(String[] args) {
        int lbound = 1;
        int ubound = 1000;
        int sum = 0;
        double avrg=0;
        int i = lbound;
        for( i = 1; i <= ubound; ++i){
            sum= sum+ i;
            avrg = sum/2;
        }
        System.out.println(sum);
        System.out.println(avrg);
        
    
        while(i<=ubound){
            sum = sum +i;
            avrg = sum/2;
            ++i;
        }
        System.out.println(sum);
        System.out.println(avrg);
        do{
            sum = sum +i;
            avrg = sum/2;
            ++i;
         
        }   while(i<=ubound);
        System.out.println(sum);
        System.out.println(avrg);  

        int number = 0;
        String day;
        if (number==0){
            day = "sunday";
            System.out.println(day);
        }
        else if (number==1){
            day = "monday";
            System.out.println(day);
        }
        else if (number==2){
            day = "tuesday";
            System.out.println(day);
        }
        else if (number==3){
            day = "wednesday";
            System.out.println(day);
        }
        else if (number==4){
            day = "thursday";
            System.out.println(day);
        }
        else if (number==5){
            day = "friday";
            System.out.println(day);
        }
        else if (number==6){
            day = "saturday";
            System.out.println(day);
        }else{
            day = "INVALID";
            System.out.println(day);
        }
        String[]cars = {"toyota","vangurg","prado","carina"};
        int i;
        for(i = 0; i<=cars.length;i++){
            System.out.println(cars[i]);
        }
        int lbound = 1;
        int ubound = 10;
        int product = 1;
        int i = lbound;
        for( i = 1; i <= ubound; ++i){
            product = product*i;
        }
        System.out.println(product);
        


    }

}
