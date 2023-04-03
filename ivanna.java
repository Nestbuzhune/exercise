import java.util.Scanner;
public class ivanna{
     /**
     * @param args
     */
    pub lic static void main(String[] args) {
        int grade =1;
        String school;
        Scanner nesty = new Scanner(System.in);
            System.out.println("enter grade");
            grade = nesty.nextInt();
        if(grade <= 5 && grade>=1){
            school ="elementary school";
            System.out.println(school);
        }
        else if(grade >= 6 && grade<=8){
            school= "junior school";
            System.out.println(school);
        }
        else if(grade >= 9 && grade<=12){
            school= "high school";
            System.out.println(school);
            
        }
        else if(grade>12){
            school = "college";
            System.out.println(school);
        }
       

        }
}

        switch(grade){
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            school ="elementary school";
            System.out.println(school);
            break;
            case 6:
            case 7:
            case 8:
            school= "junior school";
            System.out.println(school);
            break;
            case 9:
            case 10:
            case 11:
            case 12:
            school= "high school";
            System.out.println(school);
            break;
            default:
            school = "college";
            System.out.println(school);
            String [] cars ={ "passo", "toyota","raum"};
            System.out.println(cars[2]);*/

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

        }
    }
}   
