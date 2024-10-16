package org.example.entity;

import java.util.HashSet;
import java.util.Set;

public class TaskData {

   private Set<Task> annsTasks;
   private Set<Task> bobsTasks;
   private Set<Task> carolsTasks;
   private Set<Task> unassignedTasks;


    public TaskData(
            Set<Task> annsTasks,
            Set<Task> bobsTasks,
            Set<Task> carolsTasks,
            Set<Task> unassignedTasks) {

        this.annsTasks = annsTasks;
        this.bobsTasks = bobsTasks;
        this.carolsTasks = carolsTasks;
        this.unassignedTasks = unassignedTasks;
    }

    public Set<Task> getTasks(String employee) {
        switch (employee.toLowerCase()) {
            case "bob": // Bob tasks
                System.out.println("Bob Tasks : " + bobsTasks );
                return bobsTasks;
                case "carol": // Carol Tasks
                    System.out.println("Carol Tasks : " + carolsTasks );
                    return carolsTasks;
                    case "ann": // Ann Tasks
                        System.out.println("Ann Tasks : " + annsTasks );
                        return annsTasks;
                        case "all": // All Tasks => getUnion methodu geleecek
                            Set<Task> allTasks = new HashSet<>(bobsTasks);
                            allTasks.addAll(getUnion(annsTasks, carolsTasks));
                            return allTasks;
                            case "unassigned": // Unassigned Tasks
                                 System.out.println("Unassigned Tasks : " + unassignedTasks );
                                 return unassignedTasks;
                                 default:
                                     return new HashSet<>();
        }
    }

    public Set<Task> getUnion(Set<Task> task1 , Set<Task> task2) {
        // task1 ile uniontask list oluşturduk.
        // 2 Set listesini birleştirdik. unionTasks ta tuttuk return ettik.
        Set<Task> unionTasks = new HashSet<>(task1);
        unionTasks.addAll(task2);
        return unionTasks;
    }

    public Set<Task> getIntersection(Set<Task> task1 , Set<Task> task2) {
        Set<Task> intersectTasks = new HashSet<>(task1);
        intersectTasks.retainAll(task2);
        return intersectTasks;
    }

    public Set<Task> getDifferences(Set<Task> task1 , Set<Task> task2) {
        Set<Task> differenceTasks = new HashSet<>(task1);
        differenceTasks.removeAll(task2);
        return differenceTasks;
    }

    @Override
    public String toString() {
        return "TaskData{" + "\n" +
                "annsTasks=" + annsTasks + "\n" +
                ", bobsTasks=" + bobsTasks + "\n" +
                ", carolsTasks=" + carolsTasks + "\n" +
                ", unassignedTasks=" + unassignedTasks + "\n" +
                '}';
    }
}
