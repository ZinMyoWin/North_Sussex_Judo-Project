package NorthSussexJudo;

public class Calculator extends InputCollector{
    
	private static final double BEGINNER_FEE = 25.00;
    private static final double INTERMEDIATE_FEE = 30.00;
    private static final double ELITE_FEE = 35.00;
    private static final double PRIVATE_TUITION_FEE = 9.00;
    private static final double COMPETITION_ENTRY_FEE = 22.00;

    
    
    public static String calculateCost() {
        // calculate the cost of training
        double trainingFee = 0.0;
        
        if (getTrainingPlan().equalsIgnoreCase("beginner")) {
            trainingFee = BEGINNER_FEE;
            
        } else if (getTrainingPlan().equalsIgnoreCase("intermediate")) {
            trainingFee = INTERMEDIATE_FEE;
            
        } else if (getTrainingPlan().equalsIgnoreCase("elite")) {
            trainingFee = ELITE_FEE;
            
        }
        System.out.println("🔧🔧🔧🔧🔧🔧🔧🔧🔧🔧Training Fee🔧🔧🔧🔧🔧🔧🔧🔧🔧🔧🔧🔧🔧🔧🔧🔧🔧🔧🔧🔧");
        System.out.println("🔧🔧🔧🔧🔧🔧🔧🔧🔧🔧$"+trainingFee+"🔧🔧🔧🔧🔧🔧🔧🔧🔧🔧🔧🔧🔧🔧🔧🔧🔧🔧🔧🔧");
        // calculate the cost of private coaching
        int privateCoachingHours = getPrivateCoachingHours();
        double privateTuitionFee = PRIVATE_TUITION_FEE * privateCoachingHours;
        System.out.println("");
        System.out.println("");
        System.out.println("🙃🙃🙃🙃🙃🙃🙃🙃🙃Private Tuition Fee🙃🙃🙃🙃🙃🙃🙃🙃🙃");
        System.out.print( "🙃🙃🙃🙃🙃🙃🙃🙃🙃 $"+privateTuitionFee+"🙃🙃🙃🙃🙃🙃🙃🙃🙃");
        
        
        
//calculate the cost of competition entry fees
        double competitionFee = 0.0;
        if (getTrainingPlan().equalsIgnoreCase("intermediate") ||  getTrainingPlan().equalsIgnoreCase("elite")) {
            competitionFee = COMPETITION_ENTRY_FEE * getNumCompetitions();
            System.out.println("");
            System.out.println("");
            System.out.println("🧐🧐🧐🧐🧐🧐🧐🧐🧐🧐Competition Fee🧐🧐🧐🧐🧐🧐🧐🧐🧐🧐");
            System.out.println("🧐🧐🧐🧐🧐🧐🧐🧐🧐🧐 $"+competitionFee+"🧐🧐🧐🧐🧐🧐🧐🧐🧐🧐");
        }

        // return the total cost
        System.out.println("");
        System.out.println("");
        
        double totalCost= trainingFee + privateTuitionFee + competitionFee;
//        System.out.println("This is the total cost of the month-->$"+totalCost);
		return "This is the total cost of the month--> $"+totalCost;
    }

    
    public static String compareWeight(){
        
		double currentWeight = getCurrentWeight();
        String weightCategory = getCompetitionWeightCategory();
        
        switch(weightCategory.toLowerCase()){
        
            case "heavyweight":
                if(currentWeight > 100){
                    return "❤️❤️Your are in the heavyweight category❤️❤️";
                }else{
                	
                	double different = 101-currentWeight;
                	
                    return "❤️❤️You need be gain "+ different+"Kg to be able to compete in the Heavy Weight❤️❤️";
                  
                }
            case "light-heavyweight":
                if(currentWeight <= 100&&currentWeight>90){
                    return "❤️❤️You are in the light-heavyweight category❤️❤️";
                }
                else{
                	if(currentWeight>100) {
                		double different = currentWeight-100;
                		return "❤️❤️You need to loose weight "+different+"Kg to be able to compete in the light-heavyweight.❤️❤️";
                	}
                	else if(currentWeight<91) {
                		double different = 91-currentWeight;
                		 return "❤️❤️You need to gain weight "+different+"Kg to be able to compete in the light-heavyweight.❤️❤️";
                	}
                }
            case "middleweight":
                if(currentWeight <= 90&&currentWeight>81){
                    return "❤️❤️You are in the middleweight category❤️❤️";
                }else{
                	if(currentWeight>90) {
                		double different= currentWeight-90;
                		return "❤️❤️You need to loose weight "+different+"Kg to be able to compete in the middleweight.❤️❤️";
                	}
                	else if(currentWeight<82){
                		double different= 82-currentWeight;
                		return "❤️❤️You need to gain weight "+different+"Kg to be able to compete in the middleweight.❤️❤️";
                	}
                	                	
                }
                
                
            case "light-middleweight":
                if(currentWeight <= 81&&currentWeight>73){
                    return "❤️❤️You are in the light-middleweight category❤️❤️";
                }else{
                	if(currentWeight>81) {
                		double different = currentWeight-81;
                		return "❤️❤️You need to loose weight "+different+"Kg to be able to compete in the light-middleweight.❤️❤️";
                	}
                	else if(currentWeight<74){
                		double different = 74-currentWeight;
                		return "❤️❤️You need to gain weight "+different+"Kg to be able to compete in the light-middleweight.❤️❤️";
                	}
                    
                }
                
                
            case "lightweight":
                if(currentWeight <= 73&& currentWeight>66){
                    return "❤️❤️You are in the lightweight category❤️❤️";
                }
                   
                else{
                    	if(currentWeight<67){
                    	double different = 67-currentWeight;
                    	return "❤️❤️You need be gain weight "+ different+"Kg to be able to compete in the Light Weight.❤️❤️";
                                  		
                	}
                    	else if(currentWeight>73){
                    		double different = currentWeight - 73;
                    		return "❤️❤️You need to loose weight "+different+"Kg to be able to compete in the Light Weight.❤️❤️";
                		
                	}
                }
                
                
            case "flyweight":
                if(currentWeight <= 66){
                    return "❤️❤️You are in the flyweight category❤️❤️";
                }else{
                	if(currentWeight>66) {
                		double different=currentWeight-66;
                		return "❤️❤️You need to loose weight "+different+"Kg to be able to compete in the Fly Weight.❤️❤️";
                	}
                	
                    
                }
            default:
                return "Invalid category";
        }
    }


	 
}
