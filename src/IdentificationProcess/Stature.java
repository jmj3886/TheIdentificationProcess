package IdentificationProcess;

public class Stature{
       
    public Stature(){
        
    }
    
    public double hieght(String race, String sex, String bone, String leng){
        double stature = 0;
        double length = Double.parseDouble(leng);
        System.out.println("g");
        if(bone.equals("Femur")){
            stature = femurStature(race, sex, length);
        }
        if(bone.equals("Humerus")){
            stature = humerusStature(race, sex, length);
        }
        if(bone.equals("Tibia")){
            stature = tibiaStature(race, sex, length);
        }
        if(bone.equals("Fibula")){
            stature = fibulaStature(race, sex, length);
        }
        if(bone.equals("Ulna")){
            stature = ulnaStature(race, sex, length);
        }
        if(bone.equals("Radius")){
            stature = radiusStature(race, sex, length);
        }
        
        return stature;        
    }
    
    private double femurStature(String race, String sex, double length){
        double stature = 0;
        
        if(sex.equals("Male")){
            stature = maleFemurStature(race, length);
        }
        if(sex.equals("Female")){
            stature = femaleFemurStature(race, length);
        }
        
        return stature;
    } 
    
    private double humerusStature(String race, String sex, double length){
        double stature = 0;
        
        if(sex.equals("Male")){
            stature = maleHumerusStature(race, length);
        }
        if(sex.equals("Female")){
            stature = femaleHumerusStature(race, length);
        }
        
        return stature;
    }  
    
    private double tibiaStature(String race, String sex, double length){
        double stature = 0;
        
        if(sex.equals("Male")){
            stature = maleTibiaStature(race, length);
        }
        if(sex.equals("Female")){
            stature = femaleTibiaStature(race, length);
        }
        
        return stature;
    }  
    
    private double fibulaStature(String race, String sex, double length){
        double stature = 0;
        
        if(sex.equals("Male")){
            stature = maleFibulaStature(race, length);
        }
        if(sex.equals("Female")){
            stature = femaleFibulaStature(race, length);
        }
        
        return stature;
    }  
    
    private double ulnaStature(String race, String sex, double length){
        double stature = 0;
        
        if(sex.equals("Male")){
            stature = maleUlnaStature(race, length);
        }
        if(sex.equals("Female")){
            stature = femaleUlnaStature(race, length);
        }
        
        return stature;
    }  
    
    private double radiusStature(String race, String sex, double length){
        double stature = 0;
        
        if(sex.equals("Male")){
            stature = maleRadiusStature(race, length);
        }
        if(sex.equals("Female")){
            stature = femaleRadiusStature(race, length);
        }
        
        return stature;
    } 
    
    private double maleFemurStature(String race, double length){
        double stature = 0;
        
        if(race.equals("Caucasoid")){
            stature = caucasoidMaleFemurStature(length);
        }
        if(race.equals("Negroid")){
            stature = negroidMaleFemurStature(length);
        }
        if(race.equals("Mongoloid")){
            stature = mongoloidMaleFemurStature(length);
        }
        
        return stature;
    } 
    
    private double maleHumerusStature(String race, double length){
        double stature = 0;
        
        if(race.equals("Caucasoid")){
            stature = caucasoidMaleHumerusStature(length);
        }
        if(race.equals("Negroid")){
            stature = negroidMaleHumerusStature(length);
        }
        if(race.equals("Mongoloid")){
            stature = mongoloidMaleHumerusStature(length);
        }
        
        return stature;
    } 
    
    private double maleTibiaStature(String race, double length){
        double stature = 0;
        
        if(race.equals("Caucasoid")){
            stature = caucasoidMaleTibiaStature(length);
        }
        if(race.equals("Negroid")){
            stature = negroidMaleTibiaStature(length);
        }
        if(race.equals("Mongoloid")){
            stature = mongoloidMaleTibiaStature(length);
        }
        
        return stature;
    } 
    
    private double maleFibulaStature(String race, double length){
        double stature = 0;
        
        if(race.equals("Caucasoid")){
            stature = caucasoidMaleFibulaStature(length);
        }
        if(race.equals("Negroid")){
            stature = negroidMaleFibulaStature(length);
        }
        if(race.equals("Mongoloid")){
            stature = mongoloidMaleFibulaStature(length);
        }
        
        return stature;
    } 
    
    private double maleUlnaStature(String race, double length){
        double stature = 0;
        
        if(race.equals("Caucasoid")){
            stature = caucasoidMaleUlnaStature(length);
        }
        if(race.equals("Negroid")){
            stature = negroidMaleUlnaStature(length);
        }
        if(race.equals("Mongoloid")){
            stature = mongoloidMaleUlnaStature(length);
        }
        
        return stature;
    } 
    
    private double maleRadiusStature(String race, double length){
        double stature = 0;
        
        if(race.equals("Caucasoid")){
            stature = caucasoidMaleRadiusStature(length);
        }
        if(race.equals("Negroid")){
            stature = negroidMaleRadiusStature(length);
        }
        if(race.equals("Mongoloid")){
            stature = mongoloidMaleRadiusStature(length);
        }
        
        return stature;
    } 
    
    private double femaleFemurStature(String race, double length){
        double stature = 0;
        
        if(race.equals("Caucasoid")){
            stature = caucasoidFemaleFemurStature(length);
        }
        if(race.equals("Negroid")){
            stature = negroidFemaleFemurStature(length);
        }
        if(race.equals("Mongoloid")){
            stature = mongoloidFemaleFemurStature(length);
        }
        
        return stature;
    } 
    
    private double femaleHumerusStature(String race, double length){
        double stature = 0;
        
        if(race.equals("Caucasoid")){
            stature = caucasoidFemaleHumerusStature(length);
        }
        if(race.equals("Negroid")){
            stature = negroidFemaleHumerusStature(length);
        }
        if(race.equals("Mongoloid")){
            stature = mongoloidFemaleHumerusStature(length);
        }
        
        return stature;
    } 
    
    private double femaleTibiaStature(String race, double length){
        double stature = 0;
        
        if(race.equals("Caucasoid")){
            stature = caucasoidFemaleTibiaStature(length);
        }
        if(race.equals("Negroid")){
            stature = negroidFemaleTibiaStature(length);
        }
        if(race.equals("Mongoloid")){
            stature = mongoloidFemaleTibiaStature(length);
        }
        
        return stature;
    } 
    
    private double femaleFibulaStature(String race, double length){
        double stature = 0;
        
        if(race.equals("Caucasoid")){
            stature = caucasoidFemaleFibulaStature(length);
        }
        if(race.equals("Negroid")){
            stature = negroidFemaleFibulaStature(length);
        }
        if(race.equals("Mongoloid")){
            stature = mongoloidFemaleFibulaStature(length);
        }
        
        return stature;
    } 
    
    private double femaleUlnaStature(String race, double length){
        double stature = 0;
        
        if(race.equals("Caucasoid")){
            stature = caucasoidFemaleUlnaStature(length);
        }
        if(race.equals("Negroid")){
            stature = negroidFemaleUlnaStature(length);
        }
        if(race.equals("Mongoloid")){
            stature = mongoloidFemaleUlnaStature(length);
        }
        
        return stature;
    } 
    
    private double femaleRadiusStature(String race, double length){
        double stature = 0;
        
        if(race.equals("Caucasoid")){
            stature = caucasoidFemaleRadiusStature(length);
        }
        if(race.equals("Negroid")){
            stature = negroidFemaleRadiusStature(length);
        }
        if(race.equals("Mongoloid")){
            stature = mongoloidFemaleRadiusStature(length);
        }
        
        return stature;
    }
    
    private double caucasoidMaleFemurStature(double length){
        double stature = 0;
        
        stature = 2.32 * length + 65.53;   
            
        return stature;        
    }
    
    private double caucasoidFemaleFemurStature(double length){
        double stature = 0;
        
        stature = 2.47 * length + 54.10;
                
        return stature;
    }
    private double caucasoidMaleHumerusStature(double length){
        double stature = 0;
        
        stature = 2.89 * length + 78.10;   
            
        return stature;        
    }
    
    private double caucasoidFemaleHumerusStature(double length){
        double stature = 0;
        
        stature = 3.36 * length + 57.97;
                
        return stature;
    }
    private double caucasoidMaleTibiaStature(double length){
        double stature = 0;
        
        stature = 2.42 * length + 81.93;   
            
        return stature;        
    }
    
    private double caucasoidFemaleTibiaStature(double length){
        double stature = 0;
        
        stature = 2.90 * length + 61.53;
                
        return stature;
    }
    private double caucasoidMaleFibulaStature(double length){
        double stature = 0;
        
        stature = 2.60 * length + 75.50;   
            
        return stature;        
    }
    
    private double caucasoidFemaleFibulaStature(double length){
        double stature = 0;
        
        stature = 2.93 * length + 59.61;
                
        return stature;
    }
    private double caucasoidMaleRadiusStature(double length){
        double stature = 0;
        
        stature = 3.79 * length + 79.42;   
            
        return stature;        
    }
    
    private double caucasoidFemaleRadiusStature(double length){
        double stature = 0;
        
        stature = 4.74 * length + 54.93;
                
        return stature;
    }
    private double caucasoidMaleUlnaStature(double length){
        double stature = 0;
        
        stature = 3.76 * length + 75.55;   
            
        return stature;        
    }
    
    private double caucasoidFemaleUlnaStature(double length){
        double stature = 0;
        
        stature = 4.27 * length + 57.76;
                
        return stature;
    }
    private double negroidMaleFemurStature(double length){
        double stature = 0;
        
        stature = 2.10 * length + 72.22;   
            
        return stature;        
    }
    
    private double negroidFemaleFemurStature(double length){
        double stature = 0;
        
        stature = 2.28 * length + 59.76;
                
        return stature;
    }
    
    private double negroidMaleHumerusStature(double length){
        double stature = 0;
        
        stature = 2.88 * length + 75.48;   
            
        return stature;        
    }
    
    private double negroidFemaleHumerusStature(double length){
        double stature = 0;
        
        stature = 3.08 * length + 64.67;
                
        return stature;
    }
    
    private double negroidMaleTibiaStature(double length){
        double stature = 0;
        
        stature = 2.19 * length + 85.36;   
            
        return stature;        
    }
    
    private double negroidFemaleTibiaStature(double length){
        double stature = 0;
        
        stature = 2.45 * length + 72.65;
                
        return stature;
    }
    
    private double negroidMaleFibulaStature(double length){
        double stature = 0;
        
        stature = 2.34 * length + 80.07;   
            
        return stature;        
    }
    
    private double negroidFemaleFibulaStature(double length){
        double stature = 0;
        
        stature = 2.49 * length + 70.90;
                
        return stature;
    }
    
    private double negroidMaleRadiusStature(double length){
        double stature = 0;
        
        stature = 3.32 * length + 85.43;   
            
        return stature;        
    }
    
    private double negroidFemaleRadiusStature(double length){
        double stature = 0;
        
        stature = 3.67 * length + 71.79;
                
        return stature;
    }
    
    private double negroidMaleUlnaStature(double length){
        double stature = 0;
        
        stature = 3.20 * length + 80.77;   
            
        return stature;        
    }
    
    private double negroidFemaleUlnaStature(double length){
        double stature = 0;
        
        stature = 3.31 * length + 75.38;
                
        return stature;
    }
    
    private double mongoloidMaleFemurStature(double length){
        double stature = 0;
        
        stature = 2.15 * length + 72.57;   
            
        return stature;        
    }
    
    private double mongoloidFemaleFemurStature(double length){
        double stature = 0;
        
        stature = 2.15 * length + 72.57;
                
        return stature;
    }
    
    private double mongoloidMaleHumerusStature(double length){
        double stature = 0;
        
        stature = 2.68 * length + 85.19;   
            
        return stature;        
    }
    
    private double mongoloidFemaleHumerusStature(double length){
        double stature = 0;
        
        stature = 2.68 * length + 85.19;
                
        return stature;
    }
    
    private double mongoloidMaleTibiaStature(double length){
        double stature = 0;
        
        stature = 2.39 * length + 81.45;   
            
        return stature;        
    }
    
    private double mongoloidFemaleTibiaStature(double length){
        double stature = 0;
        
        stature = 2.39 * length + 81.45;
                
        return stature;
    }
    
    private double mongoloidMaleFibulaStature(double length){
        double stature = 0;
        
        stature = 2.40 * length + 80.56;   
            
        return stature;        
    }
    
    private double mongoloidFemaleFibulaStature(double length){
        double stature = 0;
        
        stature = 2.40 * length + 80.56;
                
        return stature;
    }
    
    private double mongoloidMaleRadiusStature(double length){
        double stature = 0;
        
        stature = 3.54 * length + 82.00;   
            
        return stature;        
    }
    
    private double mongoloidFemaleRadiusStature(double length){
        double stature = 0;
        
        stature = 3.54 * length + 82.00;
                
        return stature;
    }
    
    private double mongoloidMaleUlnaStature(double length){
        double stature = 0;
        
        stature = 3.48 * length + 77.45;   
            
        return stature;        
    }
    
    private double mongoloidFemaleUlnaStature(double length){
        double stature = 0;
        
        stature = 3.48 * length + 77.45;
                
        return stature;
    }
    
    public String convertToInches(double length){
        double stature = 0;
        double inches  = 0;
        
        stature = length / 2.54;
        
        inches = stature;
        
        stature = (int) (stature / 12);
        
        inches = (int) ((((inches / 12) - stature) * 12) + 0.5);
        
        return (int) stature + "\' " +  (int) inches + "\"";
    }
}