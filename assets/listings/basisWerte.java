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