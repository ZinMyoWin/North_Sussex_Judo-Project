package NorthSussexJudo;

import java.util.Scanner;


    public class InputCollector extends Athlete{
    	
        
    	Scanner scanner = new Scanner(System.in);
    	
    	public void collectInput() {  
    		System.out.println("🐷🐷🐷🐷🐷🐷🐷🐷🐷🐷🐷🐷🐷🐷🐷🐷🐷🐷🐷🐷🐷🐷🐷🐷🐷🐷🐷🐷");
            System.out.println("🐷 							"+"🐷");
            System.out.println("🐷 							"+"🐷");
            System.out.println("🐷 Welcome to North Sussex Judo Training Fee Calculator "+"🐷");
            System.out.println("🐷 							"+"🐷");
            System.out.println("🐷 							"+"🐷");
            System.out.println("🐷🐷🐷🐷🐷🐷🐷🐷🐷🐷🐷🐷🐷🐷🐷🐷🐷🐷🐷🐷🐷🐷🐷🐷🐷🐷🐷🐷");
            
            while(true){
                	String regax = "([A-Z][a-z]+)(\s[A-Z][a-z]+)*";
                	System.out.println("");
                	System.out.println("");
                	
                	System.out.println("(●'◡'●)(●'◡'●)(●'◡'●)(●'◡'●)(●'◡'●)(●'◡'●)(●'◡'●)");
                	System.out.println("");
                	System.out.println("❤️❤️❤️❤️❤️ Hello!! Our Lovely Client!!!❤️❤️❤️❤️❤️");
                	System.out.println(" ❤️❤️❤️❤️❤️   		    	       "+"❤️❤️❤️❤️❤️");
                	System.out.println("  ❤️❤️❤️❤️❤️   		    	      "+"❤️❤️❤️❤️❤️");
                	System.out.println("   ❤️❤️❤️❤️❤️   		     "+"❤️❤️❤️❤️❤️");
                	System.out.println("    ❤️❤️❤️❤️❤️   		    "+"❤️❤️❤️❤️❤️");
                	System.out.println("    👇👇👇👇👇Enter Your Name Below👇👇👇👇👇 ");
                    
                	setName(scanner.nextLine());
                    if( getName().matches(regax)){
                        
                        break;
                    }
                    else{
                    	System.out.println("\t🤒🤒🤒🤒🤒🤒🤒 Oops!! 🤒🤒🤒🤒🤒🤒🤒");
                    	System.out.println("");
                        System.out.println("\t(˘･_･˘)(˘･_･˘)Invalid input.(˘･_･˘)(˘･_･˘)");
                        System.out.println("");
                        
                        System.out.println("\tPlease enter the name in this format ");
                        System.out.println("             ↆↆↆↆↆↆↆↆↆↆↆↆↆↆↆↆↆↆↆↆↆↆↆↆↆↆↆↆↆↆↆↆↆↆↆↆↆↆↆↆↆↆↆ");
                        System.out.println("\t\t       'First Last'");
                    }
                    
                }
                System.out.println("\t\t We Got Your Name ---> "+getName());
                System.out.println("");

                
                //This step is about printing the message to the user 
                System.out.println("👋👋👋👋👋👋👋👋 Choose Your Traning Plan! 👋👋👋👋👋👋👋👋");
                System.out.println("");
                System.out.println("\tPlease enter a training plan");
                System.out.println("             ↆↆↆↆↆↆↆↆↆↆↆↆↆↆↆↆↆↆↆↆↆↆↆↆↆↆↆↆↆↆↆↆↆↆↆↆↆↆↆↆↆↆↆ");
                
                
                System.out.println("");
                System.out.println("\t+------------+------------+");
                System.out.println("\t|       Training Plan     |");
                System.out.println("\t+------------+------------+");
                System.out.println("\t| Beginner   |            |");
                System.out.println("\t+------------+------------+");
                System.out.println("\t|Intermediate|            |");
                System.out.println("\t+------------+------------+");
                System.out.println("\t| Elite      |            |");
                System.out.println("\t+------------+------------+");
                
                 
                
                String trainingPlan = scanner.nextLine();
                while (!(trainingPlan.equalsIgnoreCase("beginner") || trainingPlan.equalsIgnoreCase("intermediate") || trainingPlan.equalsIgnoreCase("elite"))) {
                                        
                    System.out.println("\t🤒🤒🤒🤒🤒🤒🤒 Oops!! 🤒🤒🤒🤒🤒🤒🤒");
                	System.out.println("");
                    System.out.println("\t(˘･_･˘)(˘･_･˘)Invalid input.(˘･_･˘)(˘･_･˘)");
                    System.out.println("");
                    System.out.println("\tPlease enter a training plan");
                    System.out.println("");
                    System.out.println("\t+------------+------------+");
                    System.out.println("\t|       Training Plan     |");
                    System.out.println("\t+------------+------------+");
                    System.out.println("\t| Beginner   |            |");
                    System.out.println("\t+------------+------------+");
                    System.out.println("\t|Intermediate|            |");
                    System.out.println("\t+------------+------------+");
                    System.out.println("\t| Elite      |            |");
                    System.out.println("\t+------------+------------+");
                    
                                        
                    
                    trainingPlan = scanner.nextLine();
                }
                setTrainingPlan(trainingPlan);
                
                
                System.out.println("----------------Enter your current weight in kilograms --------------------");
                 
//                double weight = scanner.nextDouble();
//                setCurrentWeight(weight);
                
                double currentWeight = 0.0;
                while (!scanner.hasNextDouble()) {
                    System.out.print("Please Re-Enter current weight in kilograms: ");
                    scanner.nextLine();
                    if (!scanner.hasNextDouble()) {
                    	System.out.println("\t🤒🤒🤒🤒🤒🤒🤒 Oops!! 🤒🤒🤒🤒🤒🤒🤒");
                    	System.out.println("\t(˘･_･˘)(˘･_･˘)Invalid input.(˘･_･˘)(˘･_･˘)");
                        System.out.println("");
                        System.out.println("\t Please enter a valid number.");
                    }
                }
                currentWeight = scanner.nextDouble();
                setCurrentWeight(currentWeight);
                scanner.nextLine();
                

//                System.out.print("Enter competition weight category: ");
//                String competitionWeightCategory = scanner.nextLine();
//                
//                while (!(competitionWeightCategory.equalsIgnoreCase("heavyweight") || competitionWeightCategory.equalsIgnoreCase("light-heavyweight") ||
//                		competitionWeightCategory.equalsIgnoreCase("middleweight") || competitionWeightCategory.equalsIgnoreCase("light-middleweight") ||
//                		competitionWeightCategory.equalsIgnoreCase("lightweight") || competitionWeightCategory.equalsIgnoreCase("flyweight"))){
//                    System.out.print("Invalid input. Please enter a valid competition weight category (Heavyweight, light-heavyweight, middleweight, light-middleweight, lightweight or flyweight): ");
//                    competitionWeightCategory=scanner.nextLine();
//                }
//                setCompetitionWeightCategory(competitionWeightCategory);
                
                System.out.println("👋👋👋👋👋👋👋👋 Choose The Competition Category! 👋👋👋👋👋👋👋👋");
                System.out.println("");
                System.out.println("\tPlease enter a competition category");
                System.out.println("             ↆↆↆↆↆↆↆↆↆↆↆↆↆↆↆↆↆↆↆↆↆↆↆↆↆↆↆↆↆↆↆↆↆↆↆↆↆↆↆↆↆↆↆ");
                 
                System.out.println("\t+--------------------+------------+");
                System.out.println("\t| Competition Category            |");
                System.out.println("\t+--------------------+------------+");
                System.out.println("\t| flyweight          |            |");
                System.out.println("\t+--------------------+------------+");
                System.out.println("\t| lightweight        |            |");
                System.out.println("\t+--------------------+------------+");
                System.out.println("\t| light-middleweight |            |");
                System.out.println("\t+--------------------+------------+");
                System.out.println("\t| middleweight       |            |");
                System.out.println("\t+--------------------+------------+");
                System.out.println("\t| light-heavyweight  |            |");
                System.out.println("\t+--------------------+------------+");
                System.out.println("\t| heavyweight        |            |");
                System.out.println("\t+--------------------+------------+");

                
                
                String competitionCategory = scanner.next().toLowerCase();
                while (!competitionCategory.equals("flyweight") && 
                	!competitionCategory.equals("lightweight") && 
                	!competitionCategory.equals("light-middleweight") && 
                	!competitionCategory.equals("middleweight") && 
                	!competitionCategory.equals("light-heavyweight") && 
                	!competitionCategory.equals("heavyweight")) 
                {
                	System.out.println("\t🤒🤒🤒🤒🤒🤒🤒 Oops!! 🤒🤒🤒🤒🤒🤒🤒");
                	System.out.println("");
                    System.out.println("\t(˘･_･˘)(˘･_･˘)Invalid input.(˘･_･˘)(˘･_･˘)");
                    
                    
                    System.out.println("\tPlease enter a competition category");
                    System.out.println("             ↆↆↆↆↆↆↆↆↆↆↆↆↆↆↆↆↆↆↆↆↆↆↆↆↆↆↆↆↆↆↆↆↆↆↆↆↆↆↆↆↆↆↆ");
                     
                    System.out.println("\t+--------------------+------------+");
                    System.out.println("\t| Competition Category            |");
                    System.out.println("\t+--------------------+------------+");
                    System.out.println("\t| flyweight          |            |");
                    System.out.println("\t+--------------------+------------+");
                    System.out.println("\t| lightweight        |            |");
                    System.out.println("\t+--------------------+------------+");
                    System.out.println("\t| light-middleweight |            |");
                    System.out.println("\t+--------------------+------------+");
                    System.out.println("\t| middleweight       |            |");
                    System.out.println("\t+--------------------+------------+");
                    System.out.println("\t| light-heavyweight  |            |");
                    System.out.println("\t+--------------------+------------+");
                    System.out.println("\t| heavyweight        |            |");
                    
                    
                    
                    competitionCategory = scanner.next().toLowerCase();
                }
                setCompetitionWeightCategory(competitionCategory);

//                System.out.print("Enter the number of competitions entered this month: ");
//                int numCompetitions = scanner.nextInt();
//                setNumCompetitions(numCompetitions);
//                scanner.nextLine();
                
                //Collecting Number of the Competition
                if (getTrainingPlan().equalsIgnoreCase("intermediate") || getTrainingPlan().equalsIgnoreCase("elite")) {
                    int numCompetitions = 0;
                    while (numCompetitions < 1) {
                        System.out.print("\t!!!!!!!Enter number of competitions this month!!!!!!! ");
                        numCompetitions = scanner.nextInt();
                        scanner.nextLine();
                        if (numCompetitions < 1) {
                        	System.out.println("\t🤒🤒🤒🤒🤒🤒🤒 Oops!! 🤒🤒🤒🤒🤒🤒🤒");
                        	System.out.println("");
                            System.out.println("\t(˘･_･˘)(˘･_･˘)Invalid input.(˘･_･˘)(˘･_･˘)");
                            System.out.println("\tNumber of competitions must be at least 1.");
                        }
                    }
                    setNumCompetitions(numCompetitions);
                } else {
                    setNumCompetitions(0);
                }
                
                
                System.out.print("\t***************Enter number of private coaching hours this month (maximum 5)*************** ");
                System.out.println("");
                int privateCoachingHours = scanner.nextInt();
                
                while (privateCoachingHours > 5) {
                    System.out.print("\t***************Please re-Enter number of private coaching hours this month (maximum 5)*************** ");
                    System.out.println("");
                    privateCoachingHours = scanner.nextInt();
                    scanner.nextLine();
                    if (privateCoachingHours > 5) {
                    	System.out.println("\t🤒🤒🤒🤒🤒🤒🤒 Oops!! 🤒🤒🤒🤒🤒🤒🤒");
                    	System.out.println("");
                        System.out.println("\t(˘･_･˘)(˘･_･˘)Invalid input.(˘･_･˘)(˘･_･˘)");
                        System.out.println("\tMaximum number of private coaching hours is 5.");
                    }
                }
                setPrivateCoachingHours(privateCoachingHours);
                // other code
            
                
                // calculate the cost
                                
                String weightComparison = Calculator.compareWeight();
                System.out.println("");
                System.out.println("");
                 System.out.println(weightComparison);
                 System.out.println("");
                 System.out.println("");
                 System.out.println("🤒🤒🤒🤒🤒🤒🤒🤒🤒Itemized costs for the month🤒🤒🤒🤒🤒🤒🤒🤒🤒");
                 System.out.println("");
                 System.out.println("");
                System.out.println(Calculator.calculateCost());
            }
        }
    
