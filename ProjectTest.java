public class ProjectTest {
    public static void main(String[] args){

        Project project = new Project();
        Project project2 = new Project("Second Project");
        Project project3 = new Project("Third Project", "This is the project's description.");
        Project project4 = new Project("Fourth Project", 25000, "This project is going to be EXPENSIVE.");


        project.setName("My first project ever!");
        project.setDescription("This is an awesome description.");
        project.setInitialCost(400);

        System.out.println(project3.getName());
        System.out.println(project3.getDescription());

        project.elevatorPitch();
        project2.elevatorPitch();
        project3.elevatorPitch();
        project4.elevatorPitch();
    }
}

