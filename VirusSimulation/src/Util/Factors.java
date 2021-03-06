package Util;

public class Factors {
    public static int ORIGINAL_COUNT = 50;//Original infection
    public static float BROAD_RATE = 0.8f;//Virus transmission rate
    public static float SHADOW_TIME = 140;//Shadow period (1 day equals value of 10)
    public static int HOSPITAL_RECEIVE_TIME = 30;//Response time
    public static int BED_COUNT = 50;//Number of hospital beds
    public static int Quarantine_BED_COUNT = 100;//Number of Quarantine beds
    public static int Quarantine_WAIT_TIME = 30;//Quarantine waiting time
    public static float R=3f;// R factors,R=BROAD_RATE/CURE_RATE
    public static float K=0.8f;//K factors,Which means 80% of infections are caused by K*100% of positive cases.
    public static float CURE_RATE=BROAD_RATE/R;
    public static float RE_INFECTED_RATE=0.2f;//
    public static float BROAD_RATE_SUPER= 4*(1-K)*BROAD_RATE/K;//Super infectors Broad rate
    public static int HARD_TIME= 140;//after hard time people have cure chance

    /**
     * The prevalence of testing and contact tracing range：[-0.99,0.99]
     * -0.99 people will contact with low level of intention
     * 0.99 people will contact with high level of intention
     */
    public static float Contact_Intention = 0.99f;
    public static int CITY_PERSON_SIZE = 5000;//size of people in this city
    public static float FATALITY_RATE = 0.01f;//fatality rate
    public static int DIE_TIME = 100;//from diagnosis to death
    public static double DIE_VARIANCE = 1;//variance of death time
    /**
     * range of city
     */
    public static final int CITY_WIDTH = 700;
    public static final int CITY_HEIGHT = 800;

    public static  float MASK = 0.2f;//have mask
    public static  float MASK_RATE = 0.5f;//rate of people have mask
    public static  int CITY_NUMBER= 1;//If CITY_NUMBER=1,all person would set around one center;else, there are two centers
    public static  int INITINFECTED_MODEL= 2;//if INITINFECTED_MODEL=1 choose ORIGINAL_COUNT people as origin infected patients;INITINFECTED_MODEL=2, average setting 20 infection source at left,middle and right;INITINFECTED_MODEL=3,only south part of population would appear origin 20 patients.
}
