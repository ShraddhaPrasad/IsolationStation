package com.example.lahacks2020;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import java.util.Random;


public class MainActivity extends AppCompatActivity {

    public static final String MESSAGE = "com.example.LAHacks2020.MESSAGE";
    public static final String IMAGE_ID = "com.example.LAHacks2020.IMAGE_ID";
    public static final String LINK_ID = "com.example.LAHacks2020.LINK_ID";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void openExercise(View view)
    {

        String message = " ";
        String link = " ";

        String[] imageNames = {"bicycle_orange", "situp_image", "running_img", "yoga", "zumba_img", "pushup_image"};
        String[] exerciseTip = {"Dust off your bicycle and explore your city, but remember to stay 6 feet away from everyone you pass!", "Carve out some rock-hard abs with this workout routine!", "Go for a short (or long!) run around your neighborhood.", "Get those limbs stretched and your muscles warmed up with some yoga!", "Get ready to jump, move, and groove with some Zumba!", "Get your blood flowing with some push-ups!"};
        int[] imageIDs = {R.drawable.bicycle_orange, R.drawable.situp_image, R.drawable.running_img, R.drawable.yoga, R.drawable.zumba, R.drawable.pushup};
        String[] urls = {"https://www.active.com/cycling/articles/9-tips-for-beginner-cyclists", "https://www.healthline.com/health/sit-ups-benefits", " https://www.outsideonline.com/2239021/the-best-running-tips-all-time", "https://www.youtube.com/user/yogawithadriene", "https://www.youtube.com/channel/UCQkaczRlyBjl3UKBH59W3XQ", "https://hundredpushups.com/"};

        Random rand = new Random();
        int randInt = rand.nextInt(6);

        Intent intent = new Intent(this, DisplayActivity.class);
        message = exerciseTip[randInt];
        link = urls[randInt];
        intent.putExtra(MESSAGE, message);
        intent.putExtra(LINK_ID, link);

        String imageKey = imageNames[randInt];
        int imageID = imageIDs[randInt];

        Bundle bundle=new Bundle();
        bundle.putInt(imageKey,imageID);
        bundle.putString(IMAGE_ID, imageKey);
        intent.putExtras(bundle);
        startActivity(intent);
    }

    public void openCooking(View view)
    {
        String message = " ";
        String link = " ";

        String[] imageNames = {"past_img", "pie_img", "sugar_img", "lemon_img", "tres_img"};
        String[] exerciseTip = {"Pasta Con Ceci", "Chickpea Pot Pie", "Swirled Cinnamon Sugar Croissant Loaf", "Blender Lemon Pie", "Tres Leches Confetti Cake"};
        int[] imageIDs = {R.drawable.pasta, R.drawable.pie, R.drawable.sugar, R.drawable.lemon, R.drawable.tresleches};
        String[] urls = {"https://food52.com/recipes/66790-victoria-granof-s-pasta-con-ceci", "https://food52.com/recipes/80893-chickpea-pot-pie", "https://www.halfbakedharvest.com/easy-swirled-cinnamon-sugar-croissant-loaf/", "https://pinchofyum.com/blender-lemon-pie", "https://www.howsweeteats.com/2019/05/tres-leches-confetti-cake/"};

        Random rand = new Random();
        int randInt = rand.nextInt(5);

        Intent intent = new Intent(this, DisplayActivity.class);
        message = exerciseTip[randInt];
        link = urls[randInt];
        intent.putExtra(MESSAGE, message);
        intent.putExtra(LINK_ID, link);

        String imageKey = imageNames[randInt];
        int imageID = imageIDs[randInt];

        Bundle bundle=new Bundle();
        bundle.putInt(imageKey,imageID);
        bundle.putString(IMAGE_ID, imageKey);
        intent.putExtras(bundle);
        startActivity(intent);
    }

    public void openMusic(View view)
    {
        String message = " ";
        String link = " ";

        String[] imageNames = {"piano_img", "guitar_img", "sheetMusic_img"};
        String[] exerciseTip = {"Learn how to play the piano through this free app!", "Learn how to play your favorite pop song on the guitar.", "Learn how to read sheet music to impress your friends!"};
        int[] imageIDs = {R.drawable.piano, R.drawable.guitar, R.drawable.sheetmusic};
        String[] urls = {"https://www.joytunes.com/", "https://www.ultimate-guitar.com/top/tabs", "https://www.musicnotes.com/now/tips/how-to-read-sheet-music/"};

        Random rand = new Random();
        int randInt = rand.nextInt(3);

        Intent intent = new Intent(this, DisplayActivity.class);
        message = exerciseTip[randInt];
        link = urls[randInt];
        intent.putExtra(MESSAGE, message);
        intent.putExtra(LINK_ID, link);

        String imageKey = imageNames[randInt];
        int imageID = imageIDs[randInt];

        Bundle bundle=new Bundle();
        bundle.putInt(imageKey,imageID);
        bundle.putString(IMAGE_ID, imageKey);
        intent.putExtras(bundle);
        startActivity(intent);
    }

    public void openLiterature(View view)
    {
        String message = " ";
        String link = " ";

        String[] imageNames = {"catcher_img", "gone_img", "suns_img", "adventure_img", "murder_img"};
        String[] exerciseTip = {"The Catcher in the Rye by JD Salinger", "Gone Girl by Gillian Flynn", "A Thousand Splendid Suns by Khaled Hosseini", "The Abominable Snowman/Journey Under the Sea/Space and Beyond/The Lost Jewels of Nabooti (Choose Your Own Adventure 1-4) by R. A. Montgomery", "Say Nothing: A True Story of Murder and Memory in Northern Ireland, by Patrick Radden Keefe"};
        int[] imageIDs = {R.drawable.catcher, R.drawable.gonegirl, R.drawable.suns, R.drawable.adventure, R.drawable.murder};
        String[] urls = {"https://www.barnesandnoble.com/w/catcher-in-the-rye-j-d-salinger/1100192775", "https://www.barnesandnoble.com/w/gone-girl-gillian-flynn/1105608095", "https://www.barnesandnoble.com/w/thousand-splendid-suns-khaled-hosseini/1100311165", "https://www.amazon.com/gp/product/1933390948/ref=as_li_qf_sp_asin_il_tl?ie=UTF8&camp=1789&creative=9325&creativeASIN=1933390948&linkCode=as2&tag=jamesclear-20&linkId=IJBGCKTP3THN3TQH", "https://www.amazon.com/Say-Nothing-Murder-Northern-Ireland-ebook/dp/B07CWGBK5K"};

        Random rand = new Random();
        int randInt = rand.nextInt(5);

        Intent intent = new Intent(this, DisplayActivity.class);
        message = exerciseTip[randInt];
        link = urls[randInt];
        intent.putExtra(MESSAGE, message);
        intent.putExtra(LINK_ID, link);

        String imageKey = imageNames[randInt];
        int imageID = imageIDs[randInt];

        Bundle bundle=new Bundle();
        bundle.putInt(imageKey,imageID);
        bundle.putString(IMAGE_ID, imageKey);
        intent.putExtras(bundle);
        startActivity(intent);
    }

    public void openGames(View view)
    {
        String message = " ";
        String link = " ";

        String[] imageNames = {"puzzle_img", "pictionary_img", "catan_img", "chutes_img", "board_img", "teaser_img"};
        String[] exerciseTip = {"Pass some time with a jigsaw puzzle!", "Have some fun with the family with Pictionary!", "Battle with your friends while playing Catan, the online version!", "Be transported back to your childhood with a quick game of Chutes and Ladders!", "Have some online fun with these board games!", "Stimulate your brain with a few of these brain teasers!"};
        int[] imageIDs = {R.drawable.puzzle, R.drawable.pictionary, R.drawable.catan, R.drawable.chutes, R.drawable.boardgame, R.drawable.brainteaser};
        String[] urls = {"https://www.jigsawexplorer.com250 × 188", "https://www.amazon.com/Matel-Game-DKD47-Pictionary-Board/dp/B0145GMV7Y", "https://colonist.io/", "https://www.amazon.com/Chutes-Ladders-Game-Amazon-Exclusive/dp/B00000DMF6", "https://boardgamearena.com/welcome", "https://www.puzzleprime.com/brain-teasers/"};

        Random rand = new Random();
        int randInt = rand.nextInt(6);

        Intent intent = new Intent(this, DisplayActivity.class);
        message = exerciseTip[randInt];
        link = urls[randInt];
        intent.putExtra(MESSAGE, message);
        intent.putExtra(LINK_ID, link);

        String imageKey = imageNames[randInt];
        int imageID = imageIDs[randInt];

        Bundle bundle=new Bundle();
        bundle.putInt(imageKey,imageID);
        bundle.putString(IMAGE_ID, imageKey);
        intent.putExtras(bundle);
        startActivity(intent);
    }

    public void openCrafts(View view)
    {
        String message = " ";
        String link = " ";

        String[] imageNames = {"pillow_img", "sew_img", "picture_img"};
        String[] exerciseTip = {"Make a new pillowcase to keep you company in this lonely time!", "Learn how to use that sewing machine you’ve had lying around but forgot about", "Preserve your photos from the special moments in your life by making a photo book!"};
        int[] imageIDs = {R.drawable.pillow, R.drawable.sew, R.drawable.picture};
        String[] urls = {"https://www.youtube.com/watch?v=dD4Pzo5TntM&list=PLe2x8GAZR026O3jZIMYNrSvL8Op5nscm_&index=7", "https://www.youtube.com/watch?v=dxitW4LqAtI", "https://www.shutterfly.com/ideas/how-to-make-the-perfect-photo-book/"};

        Random rand = new Random();
        int randInt = rand.nextInt(3);

        Intent intent = new Intent(this, DisplayActivity.class);
        message = exerciseTip[randInt];
        link = urls[randInt];
        intent.putExtra(MESSAGE, message);
        intent.putExtra(LINK_ID, link);

        String imageKey = imageNames[randInt];
        int imageID = imageIDs[randInt];

        Bundle bundle=new Bundle();
        bundle.putInt(imageKey,imageID);
        bundle.putString(IMAGE_ID, imageKey);
        intent.putExtras(bundle);
        startActivity(intent);
    }
}
