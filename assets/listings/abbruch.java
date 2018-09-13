int anzahlIterationenOhneVerbesserung = 0;
int maxAnzahlIteratinenOhneVerbesserung = 5;
    for (int i = 0; i < maxIteration; i++) {
        if (result != null) {
        if (result.fitness == nextBest.fitness) {
            anzahlIterationenOhneVerbesserung++;
        } else {
            anzahlIterationenOhneVerbesserung = 0;
        }
        double sumFitness += nextBest.fitness;
        double avgFitness = sumFitness/i;
        if(fitness <= avgFitness){
            System.out.println("Fitnessziel wurde erreicht.");
            break;
        }
        if (anzahlIterationenOhneVerbesserung > maxAnzahlIteratinenOhneVerbesserung) {
            System.out.println("Maximale Anzahl an Wiederholungen ohne Verbesserung wurde erreicht.");
            break;
          }
        }
        result = nextBest;
    }
return result;