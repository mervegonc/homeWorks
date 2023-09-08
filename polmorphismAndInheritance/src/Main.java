public class Main {
    public static void main(String[] args) {
        //UserUI userUI = new UserUI();
       // userUI.add(new InstructorManager());
        UserManager [] userManagers = new UserManager[]{new InstructorManager(), new StudentManager()};
        
    }
}