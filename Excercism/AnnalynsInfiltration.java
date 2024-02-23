class AnnalynsInfiltration {
    public static boolean canFastAttack(boolean knightIsAwake) {
       return !knightIsAwake;
    }
 
    public static boolean canSpy(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake) {
       return knightIsAwake || archerIsAwake || prisonerIsAwake;
    }

    public static boolean canSignalPrisoner(boolean archerIsAwake, boolean prisonerIsAwake) {
        return !archerIsAwake && prisonerIsAwake;
    }

    public static boolean canFreePrisoner(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake, boolean petDogIsPresent) {
       if((!knightIsAwake && !archerIsAwake && !prisonerIsAwake && petDogIsPresent )||
          (!knightIsAwake && !archerIsAwake && prisonerIsAwake && petDogIsPresent ) ||
          (!knightIsAwake && !archerIsAwake && prisonerIsAwake && !petDogIsPresent ) ||
          (knightIsAwake && !archerIsAwake && prisonerIsAwake && petDogIsPresent ) ||
          (knightIsAwake && !archerIsAwake && !prisonerIsAwake && petDogIsPresent )
         )
           return true;

        else
           return false;
    }           
}
