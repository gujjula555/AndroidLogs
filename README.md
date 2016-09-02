# AndroidLogs

Use this library in your gradle(module:app)
repositories {
    maven {
        url  "http://dl.bintray.com/gujjula555/android"
    }
}
compile 'com.colors.android:mylibrary:1.0.1'


How to use 

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        QLog.d("your object ");  //  it print   D/Colors: MainActivity: onCreate() [18] - your object 
         QLog.e("your Object ");  // it print   E/Colors: MainActivity: onCreate() [18] - your object 
        ToastUtil.showShort(this, "Toast");
        ToastUtil.showLong(this, "Long");
       boolean bn =Validator.isValidEmail("gujjula555@gmail.co");  
        QLog.d(bn);   D/Colors: MainActivity: onCreate() [18] -true
      

    }

    @Override
    protected void onStart() {
        super.onStart();
        QLog.e("Qlog.e");
          QLog.d(Validator.isNameValid("ramesh55"));  //  it print   D/Colors: MainActivity: onStart() [18] - true
        QLog.d(TimeUtils.getCurrentDateAndTime());
        
        String[] beginTime = new String[]{"name","ramesh"};
        QLog.d( Converstions.convertArrayToString(beginTime));//  it print   D/Colors: MainActivity: onStart() [18] - "name_,_ramesh"

        QLog.d(Converstions.convertStringToArray(Converstions.convertArrayToString(beginTime)));

        for(String name:Converstions.convertStringToArray(Converstions.convertArrayToString(beginTime)))
                    {
                        QLog.d(name);

        }
        Object[] obj=new Object[]{"String",1,"2"};
        //Converstions.convertArrayToList(obj);

        for(Object ob: Converstions.convertArrayToList(obj)){
            QLog.d(ob);
        }

        Object[] ob1=Converstions.convertListToArray(Converstions.convertArrayToList(obj));
       // QLog.d(Converstions.convertArrayToString((String)ob));
        for(Object ob:ob1){
            QLog.d(ob);
        }

    }

    @Override
    protected void onResume() {
        super.onResume();
        QLog.e("your object"); it print   D/Colors: MainActivity: onResume() [18] - uour object
    }
}






