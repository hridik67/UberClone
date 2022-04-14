package com.example.uber1;


import android.app.Application;


import com.parse.Parse;
import com.parse.ParseACL;

public class StarterAppliction extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        //Enable Local Datascore
        Parse.enableLocalDatastore(this);

        //Add your initialization code here
        Parse.initialize(new Parse.Configuration.Builder(getApplicationContext())
                .applicationId("myappID")
                .clientKey("sq9vdst8OgI4")
                .server( "http://3.16.216.204/parse/")
                .build()
        );

     /*   ParseObject object=new ParseObject("ExampleObject");
        object.put("mynumber","123");
        object.put("myString","rob");
        object.saveInBackground(e -> {
            if (e==null){
                Log.i("Parse Result","Successful");
            }
            else {
                Log.i("Parse Result",e.toString());
            }
        });


      */
        //ParseUser.enableAutomaticUser();

        ParseACL defaultACL=new ParseACL();
        defaultACL.setPublicReadAccess(true);
        defaultACL.setPublicWriteAccess(true);
        ParseACL.setDefaultACL(defaultACL,true);
    }

}