public double fitness(BitSet bitSet) {
	double totalDifficulty = 0.0;
    double totalMood = 0.0;
    double totalPopularity = 0.0;
    double totalDifficultyHigh = 0.0;
    double totalDifficultyLow = 0.0;
    double totalDifficultyWood = 0.0;
	double duration = 0;

    double penaltyWeight = 0.2;
    double difficultyWeight = 0.1;
    double moodWeight = 0.3;
    double popularityWeight = 0.3;
    double equalityWeight = 0.1;

	int count = bitSet.cardinality();
	for(int i = 0, size = musicSheets.size(); i < size; i++) {
		if(bitSet.get(i)) {
		MusicSheet musicSheet = musicSheets.get(i);
		totalDifficulty += 8 - musicSheet.effort;
        totalMood += musicSheet.mood;
        totalPopularity += musicSheet.popularity;
        totalDifficultyHigh += musicSheet.difficultyHigh;
        totalDifficultyLow += musicSheet.totalDifficultyLow;
        totalDifficultyWood += musicSheet.totalDifficultyWood;
		duration += musicSheet.duration;
		}
	}

	totalDifficulty = totalDifficulty / (count * 10);
    totalMood = totalMood / (count * 10);
    totalPopularity = totalPopularity / (count * 10);
    totalDifficultyHigh = totalDifficultyHigh / (count * 10);
    totalDifficultyLow = totalDifficultyLow / (count * 10);
    totalDifficultyWood = totalDifficultyWood / (count * 10);

	double penalty = -Math.abs(duration - 120)/120;
    double averageDifficulty = (totalDifficultyHigh + totalDifficultyLow + totalDifficultyWood)/3;
    double equality = Math.abs(averageDifficulty - totalDifficultyHigh) + Math.abs(averageDifficulty - totalDifficultyLow) + Math.abs(averageDifficulty - totalDifficultyWood);
	double fitness = difficultyWeight * totalDifficulty + penaltyWeight *penalty + equalityWeight * equality ;
	return fitness;
}