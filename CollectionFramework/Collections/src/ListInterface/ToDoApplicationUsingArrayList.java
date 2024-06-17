package ListInterface;

import java.util.*;

public class ToDoApplicationUsingArrayList {
    /*
    Adding Task
    removing task
    view of tasks
     */
    private ArrayList<String> myList;
    Scanner sc;

    public ToDoApplicationUsingArrayList() {
        myList = new ArrayList<>();
        sc = new Scanner(System.in);
    }

    public static void main(String[] args) {
        ToDoApplicationUsingArrayList toDo = new ToDoApplicationUsingArrayList();
        toDo.runToDOApp();
    }

    private void runToDOApp() {
        int choise = 0;
        display();
        choise = sc.nextInt();
        sc.nextLine();

        switch (choise) {
            case 1:
                System.out.println("Enter task");
                String task = sc.nextLine();
                addtaks(task);
                break;

            case 2:
                System.out.println("Viewing task ");
                showTask();
                break;

            case 3:
                System.out.println("Enter task Id to delete");
                int taskId = sc.nextInt();
                removalOfTaks(taskId);
            case 4:
                System.out.println("Exiting...");
                break;
            default:
                System.out.println("Invalid choice. Please try again.");
        }

    }


    public void display() {
        System.out.println("1 : To add Task");
        System.out.println("2 : To view Task");
        System.out.println("3 : To remove Task");
        System.out.println("4 : To Exit Task");
        System.out.println("Enter your Choise");
    }

    public void addtaks(String task) {
        myList.add(task);
        System.out.println("task Added");
        showTask();
    }

    public void showTask() {
        for (String task : myList) {
            System.out.println("to do List : " + task);
        }
    }

    public void removalOfTaks(int taskId) {
        if (taskId >= 0 && taskId < myList.size()) {
            myList.remove(taskId);
            showTask();
        } else {
            System.out.println("Invalid task id ");
        }
    }
}


