class NoticePeriod extends TestDetail{
    boolean[] cyt =new boolean [Nstudent];
    void calcyt(){
        int stdcount = 0;
        for (int x = 0; x< Nstudent; ++x){
            int testcount = 0;
            int markscount = 0;
            for(int y = 0; y< Ntest && markscount<3; ++y)
            {
                if (marks[x][y] != -1) testcount++;
                if (marks[x][y]>=50) marks++;
            }
            if (testcount<3 || markscount<3)
            {
                cyt[x] = true;
                stdcount++;
            }
            else 
            cyt[x] = false;
        }
        system.out.println("number of student=" + stdcount);

    }
    void displaycyt(){
        for (int x = 0; x < Nstudent ;++x)
            if (cyt[x])
                system.out.println ("student"+ x );
        system.out.println();
    }
}