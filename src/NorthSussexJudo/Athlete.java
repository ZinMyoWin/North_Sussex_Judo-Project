package NorthSussexJudo;

public class Athlete {
	
	

	//Instance variable 
    private String name;
    private static String trainingPlan;
    private static double currentWeight;
    private static String competitionWeightCategory;
    private static int numCompetitions;
    private static int privateCoachingHours;

    
    //Instance method
    public String getName() {
        return name;//userInput
    }

    public void setName(String name) {//name= userINput;
        this.name = name;
    }

    public static String getTrainingPlan() {
        return trainingPlan;
    }

    public void setTrainingPlan(String trainingPlan) {
        Athlete.trainingPlan = trainingPlan;
    }

    public static double getCurrentWeight() {
        return currentWeight;
    }

    public void setCurrentWeight(double currentWeight) {
        Athlete.currentWeight = currentWeight;
    }

    public static String getCompetitionWeightCategory() {
        return competitionWeightCategory;
    }

    public void setCompetitionWeightCategory(String competitionWeightCategory) {
        Athlete.competitionWeightCategory = competitionWeightCategory;
    }

    public static int getNumCompetitions() {
        return numCompetitions;
    }

    public void setNumCompetitions(int numCompetitions) {
        Athlete.numCompetitions = numCompetitions;
    }

    public static int getPrivateCoachingHours() {
        return privateCoachingHours;
    }

    public int setPrivateCoachingHours(int privateCoachingHours) {
        return Athlete.privateCoachingHours = privateCoachingHours;
    }
}
