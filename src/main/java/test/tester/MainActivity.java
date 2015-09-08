package test.tester;

import android.app.TabActivity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TabHost;

public class MainActivity extends TabActivity {

    TabHost tabHost;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tabHost = getTabHost();

        TabHost.TabSpec tabspec1 = tabHost.newTabSpec("page1");
        tabspec1.setIndicator("Explore");
        tabspec1.setContent(new Intent(this, Explore.class));
        tabHost.addTab(tabspec1);

        TabHost.TabSpec tabspec2 = tabHost.newTabSpec("page2");
        tabspec2.setIndicator("Activities");
        tabspec2.setContent(new Intent(this, Activities.class));
        tabHost.addTab(tabspec2);

        TabHost.TabSpec tabspec3 = tabHost.newTabSpec("page3");
        tabspec3.setIndicator("Post");
        tabspec3.setContent(new Intent(this, Post.class));
        tabHost.addTab(tabspec3);

        TabHost.TabSpec tabspec4 = tabHost.newTabSpec("page4");
        tabspec4.setIndicator("Inbox");
        tabspec4.setContent(new Intent(this, Inbox.class));
        tabHost.addTab(tabspec4);

        TabHost.TabSpec tabspec5 = tabHost.newTabSpec("page5");
        tabspec5.setIndicator("Profile");
        tabspec5.setContent(new Intent(this, Profile.class));
        tabHost.addTab(tabspec5);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
