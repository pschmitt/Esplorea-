package io.lxl.android.esplorea.plus.activity;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.widget.DrawerLayout;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import io.lxl.android.esplorea.plus.R;

/**
 * Created by pschmitt on 2/26/14.
 */
public class MainActivity extends Activity {
    private String[] mPlanetTitles;
    private DrawerLayout mDrawerLayout;
    private ListView mDrawerList;

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);
        mPlanetTitles = getResources().getStringArray(R.array.drawer_content);
        mDrawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
        mDrawerList = (ListView) findViewById(R.id.left_drawer);

        // Set the adapter for the list view
        mDrawerList.setAdapter(new ArrayAdapter<String>(this,
                R.layout.drawer_list_item, mPlanetTitles));
        // Set the list's click listener
        // mDrawerList.setOnItemClickListener();
    }
}