
class BirdWatcher {
    private final int[] birdsPerDay;

    public BirdWatcher(int[] birdsPerDay) {   
        this.birdsPerDay = birdsPerDay.clone();
    }

    public int[] getLastWeek() {   
      int[] lastweekcount= birdsPerDay.clone();
          return lastweekcount;
    }

    public int getToday() {  
        return birdsPerDay[birdsPerDay.length-1];
    }

    public void incrementTodaysCount() {    
       birdsPerDay[birdsPerDay.length-1]=birdsPerDay[birdsPerDay.length-1]+1;
    }

    public boolean hasDayWithoutBirds() {   
       for(int i=0;i<birdsPerDay.length;i++)
            if(birdsPerDay[i]==0)
                return true;

        return false;
    }

    public int getCountForFirstDays(int numberOfDays) {

        int s=0;
        if(numberOfDays<birdsPerDay.length) {
             for(int i=0;i<numberOfDays;i++)
              s=s+birdsPerDay[i];
        }
        else {
            for(int i=0;i<birdsPerDay.length;i++)
              s=s+birdsPerDay[i];
        }
       
        return s;
    }

    public int getBusyDays() {
       int busydays=0;
        for(int i=0;i<birdsPerDay.length;i++)
            if(birdsPerDay[i]>=5)
                busydays++;

        return busydays;
    }
}
