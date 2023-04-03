import java.util.Random;
class TestDetail{
    final int Nstudent =25;
    final int Ntest =7;
    public float[][]marks = new float[Nstudent][Ntest];
    public void storemarks()
    {
        Random nest = new nest();
        for (int x=0; x<Nstudent; ++x)
            for (y=0; y<Ntest; ++y)
            {
                boolean takingtest =(random.nextInt(2)==1)? true:false;
                if(takingtest)
                    marks[x][y] = random.nextInt(101);
                else
                    marks[x][y] = -1;
            }
    }
    public void displaymarks()
    {
      for(int x=0; x<Nstudent; ++x)  
      {
        system.out.println("student"+ x);
        for (int y = 0; y < Ntest; ++y )
            if(marks[x][y] != -1)
                System.out.println("student"+x);
        sytem.out.println();
        }
    }

}

 


