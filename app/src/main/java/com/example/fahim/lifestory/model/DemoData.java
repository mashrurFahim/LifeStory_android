package com.example.fahim.lifestory.model;

import com.example.fahim.lifestory.R;

import java.util.ArrayList;
import java.util.List;

import static android.R.attr.visible;
import static com.example.fahim.lifestory.R.drawable.like;

/**
 * Created by Fahim on 2/12/2017.
 */

public class DemoData {

    private static final int[] person_profile = {R.drawable.leonardo_dicaprio_profile, R.drawable.brad_pitt_pro,
        R.drawable.ben_afflec_pro, R.drawable.matt_damon_pro, R.drawable.bradly_cooper_pro};

    private static final String[] person_name = {"Leonardo De Caprio", "Brad Pitt", "Ben Affleck",
            "Matt Damon", "Bradly Cooper"};

    private static final int[] catagory_icons = {R.drawable.type_icon,
            like, R.drawable.like_pressed, R.drawable.square, R.drawable.location};

    private static final String[] catagory_status = {"Lifestyle", "Travel", "Festival", "Plan", "Philosophy"};

    private static final String[] status_time = {"12:00 PM", "10:30 AM", "02:15 PM", "11:00 AM", "06:15 PM"};

    private static final String[] person_status = {"Feeling cool with childhood friends :D",
        "Traveling to Bangladesh :D", "Welcome! Today is Pohela Falgun.", "Looking for a weekend plan", "Last sentence by people often not completed :("};

//    public static String[] like_update = {"Like","Unlike","Like","Unlike","Like"};
//    public static int[] like_icon = {R.drawable.like,R.drawable.like_pressed,R.drawable.like,R.drawable.like_pressed,R.drawable.like,};
    public static  int[] like_count = {0,0,0,0,0};
    public static List<ListItem> getListData() {
        List<ListItem> data = new ArrayList<>();

        for (int i =0;i<4;i++)
        {
            for (int j = 0; j<person_name.length; j++){
                ListItem item = new ListItem();
                item.setProfileImage(person_profile[j]);
                item.setProfileName(person_name[j]);
                item.setCatagoryIconId(catagory_icons[j]);
                item.setCatagoryStatus(catagory_status[j]);
                item.setStatusTime(status_time[j]);
                item.setProfileStatus(person_status[j]);
//                item.setLikeUpdate(like_update[j]);
//                item.setLikeIconId(like_icon[j]);
                item.setLikeCounter(like_count[j]);
                data.add(item);
            }
        }
        return data;
    }
}
