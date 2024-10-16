package org.example;

import org.example.entity.*;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        Task task1 = new Task("Project A" , "Task1 is important" , "Ann" , Status.ASSIGNED , Priority.HIGH);
        Task task2 = new Task("Project B" , "Task2 is important" , "Bob" , Status.ASSIGNED , Priority.HIGH);
        Task task3 = new Task("Project C" , "Task3 is important" , "Carol" , Status.ASSIGNED , Priority.HIGH);
        Task task4 = new Task("Project D" , "Task4 is important" , null , Status.ASSIGNED , Priority.HIGH);

        Set<Task> annsTasks = new HashSet<Task>();
        annsTasks.add(task1);
        annsTasks.add(task2);

        Set<Task> bobsTasks = new HashSet<Task>();
        bobsTasks.add(task3);

        Set<Task> carolTasks = new HashSet<Task>();
        carolTasks.add(task3);
        carolTasks.add(task2);

        Set<Task> unassignedTasks = new HashSet<Task>();
        unassignedTasks.add(task4);

        TaskData taskData = new TaskData(annsTasks, bobsTasks, carolTasks, unassignedTasks);
        System.out.println(taskData);

        taskData.getTasks("all");
        System.out.println("---------");
        taskData.getTasks("Ann");
        System.out.println("--------");
        taskData.getTasks("Bob");
        System.out.println("--------");
        taskData.getTasks("Carol");
        System.out.println("--------");
        taskData.getTasks("Unassigned");
        System.out.println("--------");

        System.out.println(taskData.getDifferences(annsTasks, bobsTasks));
        System.out.println(taskData.getIntersection(annsTasks, carolTasks));

        System.out.println("*************");

        Set<String> uniqueWords = StringSet.findUniqueWords();
        System.out.println(uniqueWords);
        System.out.println(uniqueWords.size());

    }


}