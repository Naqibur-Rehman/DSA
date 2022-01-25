package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ActivitySelection {

    static void activitySelection(ArrayList<Activity> activities) {
        Comparator<Activity> finishTimeComparator = new Comparator<>() {
            @Override
            public int compare(Activity o1, Activity o2) {
                return o1.getFinishTime() - o2.getFinishTime();
            }
        };

        Collections.sort(activities, finishTimeComparator);

        Activity previousActivity = activities.get(0);

        System.out.println("\n\nRecommended Schedule: \n" + activities.get(0));
        for (int i = 1; i < activities.size(); i++) {
            Activity activity = activities.get(i);
            if (activity.getStartTime() >= previousActivity.getFinishTime()) {
                System.out.println(activity);
                previousActivity = activity;
            }
        }
    }

}
