import java.util.ArrayList;

class tracking {
    private int step;
    private int time;
    private ArrayList<String> activity;
    private int calories;
    public int goal;


    tracking(int step, int time, int calories, String activity) {
        this.step = step;
        this.time = time;
        this.activity = new ArrayList<>();
        this.calories = calories;
    }

    public int getstep() {
        return step;
    }

    public int gettime() {
        return time;
    }

    public int getcalories() {
        return calories;
    }

    public void setgoal(int goaltoday) {
        goal = goaltoday;
    }

    public void task(int taskgoal) {
        if (goal >= taskgoal) {
            System.out.println("DAily goal completed");
        } else {
            System.out.println("on process");
        }
    }

    public void addActivity(String activityy) {
        activity.add(activityy);
    }

    public void showActivities() {
        System.out.println("Activities done today:");
        for (String a : activity) {
            System.out.println(a);
        }
    }

    public void caloriescount(int steps){
        calories+=(steps*2);
    }

    public void dailyreports() {
        System.out.println("calories:" + getcalories());
        System.out.println("time" + getcalories());
        System.out.println("Activity: " + activity);
        System.out.println("Steps: " + getstep());
        System.out.println("Time: " + gettime() + " minutes");
    }
}
class user extends tracking{
    String username;
    int goalsteps;
    user(int goal,int time,int calories,String username){
        this.username=username;
        super(goal,time,calories," ");
    }

    public void userdetails(){
        System.out.print("user:"+username);
        System.out.print("goal"+goal);
    }

    public void checkGoal() {
        task(goalsteps);
    }


    public static void main(String[] args) {

//        tracking t = new tracking(8500, 60, 320, "Running");
//        t.addActivity("Running");
//        t.addActivity("Walking");
//        t.addActivity("Cycling");
//        t.showActivities();
//        t.setgoal(8000);
//
//        t.dailyreports();
//
//        t.task(9000);

        user u1 = new user(8000,100,400,"deepak");
        u1.userdetails();
        u1.addActivity("Running");
        u1.addActivity("Walking");
        u1.showActivities();
        u1.dailyreports();
        u1.checkGoal();
        u1.caloriescount(100);
        System.out.println();
        u1.dailyreports();
    }
}