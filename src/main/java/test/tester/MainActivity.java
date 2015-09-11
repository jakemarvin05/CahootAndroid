package test.tester;

import android.app.ActionBar;
import android.app.TabActivity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.TabHost;


public class MainActivity extends ActionBarActivity {


    public class tab extends TabActivity {
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
            TabHost tabHost;
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

            ActionBar actionBar = getActionBar();
            actionBar.show();


        }


        @Override
        public boolean onCreateOptionsMenu(Menu menu) {
            // Inflate the menu; this adds items to the action bar if it is present.
            MenuInflater inflater = getMenuInflater();
            inflater.inflate(R.menu.menu_main, menu);

            return super.onCreateOptionsMenu(menu);

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
            if (id == R.id.inbox_menu) {
                Intent i = new Intent(this, Inbox.class);
                startActivity(i);
                return true;
            }
            if (id == R.id.profile_menu) {
                Intent i = new Intent(this, Profile.class);
                startActivity(i);
                return true;
            }

            return super.onOptionsItemSelected(item);
        }


    }
}
