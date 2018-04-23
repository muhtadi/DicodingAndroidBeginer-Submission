package com.example.muhtadi.heroesmobilelegends;

import java.util.ArrayList;

/**
 * Created by Muhtadi on 23/04/2018.
 */

public class HeroesData {
    public static String [][] data = new String[][]{
            {"Saber", "Assasins","https://img-cdn.mobilelegends.com/HeroHead003.png","https://img-cdn.mobilelegends.com/o_1biirct01okovpg7jh8ulj7sp.jpg?imageView2/0/w/400/h/300", "Lab 1718 terletak di celah ruang dalam kabin planar raksasa dimana dikumpulkan beberapa ilmuwan dari seluruh dunia. Mereka mengabdikan diri mereka untuk menciptakan manusia yang lebih kuat dan canggih. Mengumpulkan DNA ahli pedang dari ratusan ras berbeda, mereka menciptakan ahli pedang yang mahir dengan menggunakan teknologi yang canggih dan menamainya Saber. Pedangnya mampu membuat lubang ruang dan waktu, memperbolehkannya pergi ke tempat atau waktu apa saja. Setelah penantang yang tidak dapat dihitung jumlahnya ditarik ke Land of Dawn, Saber juga mengalihkan perhatiannya ke tempat ini, merobek susunan ruang dan waktu untuk menginjakkan kakinya di Land of Dawn dan menemukan lawan yang memiliki kekuatan setara untuk melawannya."},
            {"Tigreal", "Tank", "https://img-cdn.mobilelegends.com/HeroHead006.png","https://img-cdn.mobilelegends.com/o_1biiqtkbf1u5poof10ec1gpk1od7p.jpg?imageView2/0/w/400/h/300","In every battle, the mystic warrior Tigreal always fought in the front line and never suffered defeat. Even the vilest of enemies did not dare to challenge Tigreal on the battlefield, because they knew such a foolish action would only be met with Tigreal\\'s merciless blade. The name of Tigreal, a believer in the Lord of Light, has become synonymous with bravery and fearlessness. His kingdom has conferred upon him the honorable title of Warrior of Light as a reward."}
    };

    public static ArrayList<Heroes> getListData(){
        Heroes heroes= null;
        ArrayList<Heroes> list = new ArrayList<>();
        for (int i = 0; i <data.length; i++) {
            heroes = new Heroes();
            heroes.setName(data[i][0]);
            heroes.setCategory(data[i][1]);
            heroes.setPhoto(data[i][2]);
            heroes.setImage(data[i][3]);
            heroes.setStory(data[i][4]);

            list.add(heroes);
        }

        return list;
    }
}
