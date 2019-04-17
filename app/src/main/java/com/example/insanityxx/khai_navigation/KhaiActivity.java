package com.example.insanityxx.khai_navigation;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.List;

import htk.lib.areasimage.ClickableArea;
import htk.lib.areasimage.ClickableAreasImage;
import htk.lib.areasimage.OnClickableAreaClickedListener;

public class KhaiActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener, OnClickableAreaClickedListener {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_khai);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);



        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        // Add image
        ImageView image = (ImageView) findViewById(R.id.image);
        image.setImageResource(R.drawable.planxaivar2);

        // Create your image
        ClickableAreasImage clickableAreasImage = new ClickableAreasImage(image, this);
        clickableAreasImage.setEnableScalePicture(true);

        // Define your clickable area (pixel values: x coordinate, y coordinate, width, height) and assign an object to it
        List<ClickableArea> clickableAreas = getClickableAreas();
        clickableAreasImage.setClickableAreas(clickableAreas);
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.khai, menu);
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

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.gk) {
            Intent intentLoadNewActivity = new Intent(KhaiActivity.this, GKActivity.class);
            startActivity(intentLoadNewActivity);

        } else if (id == R.id.s) {
            Intent intentLoadNewActivity = new Intent(KhaiActivity.this, SActivity.class);
            startActivity(intentLoadNewActivity);

        } else if (id == R.id.m) {
            Intent intentLoadNewActivity = new Intent(KhaiActivity.this, MActivity.class);
            startActivity(intentLoadNewActivity);

        } else if (id == R.id.lk) {
            Intent intentLoadNewActivity = new Intent(KhaiActivity.this, LK1fActivity.class);
            startActivity(intentLoadNewActivity);

        } else if (id == R.id.rk) {
            Intent intentLoadNewActivity = new Intent(KhaiActivity.this, RKActivity.class);
            startActivity(intentLoadNewActivity);

        } else if (id == R.id.im) {
            Intent intentLoadNewActivity = new Intent(KhaiActivity.this, ImActivity.class);
            startActivity(intentLoadNewActivity);

        } else if (id == R.id.k2) {
            Intent intentLoadNewActivity = new Intent(KhaiActivity.this, K2Activity.class);
            startActivity(intentLoadNewActivity);
        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    @Override
    public void onClickableAreaTouched(ClickableArea.State item, float positionXOnDrawable, float positionYOnDrawable, float positionXOnScreen, float positionYOnScreen) {
        if (item instanceof StateObjGK) {
            Intent intentLoadNewActivity = new Intent(KhaiActivity.this, GKActivity.class);
            startActivity(intentLoadNewActivity);
        }
        if (item instanceof StateObjS) {
            Intent intentLoadNewActivity = new Intent(KhaiActivity.this, SActivity.class);
            startActivity(intentLoadNewActivity);
        }
        if (item instanceof StateObjM) {
            Intent intentLoadNewActivity = new Intent(KhaiActivity.this, MActivity.class);
            startActivity(intentLoadNewActivity);
        }
        if (item instanceof StateObjLK) {
            Intent intentLoadNewActivity = new Intent(KhaiActivity.this, LK1fActivity.class);
            startActivity(intentLoadNewActivity);
        }
        if (item instanceof StateObjRK) {
            Intent intentLoadNewActivity = new Intent(KhaiActivity.this, RKActivity.class);
            startActivity(intentLoadNewActivity);
        }
        if (item instanceof StateObjIM) {
            Intent intentLoadNewActivity = new Intent(KhaiActivity.this, ImActivity.class);
            startActivity(intentLoadNewActivity);
        }
        if (item instanceof StateObjK2) {
            Intent intentLoadNewActivity = new Intent(KhaiActivity.this, K2Activity.class);
            startActivity(intentLoadNewActivity);
        }


    }

    @NonNull
    private List<ClickableArea> getClickableAreas() {

        List<ClickableArea> clickableAreas = new ArrayList<>();

        // https://inkplant.com/tools/image-coordinates

        clickableAreas.add(new ClickableArea(580, 1579, 253, 275, new StateObjGK()));
        clickableAreas.add(new ClickableArea(885, 1461, 110, 380, new StateObjS()));
        clickableAreas.add(new ClickableArea(587, 962, 251, 312, new StateObjM()));

        clickableAreas.add(new ClickableArea(572, 766, 216, 134, new StateObjLK()));
        clickableAreas.add(new ClickableArea(836, 479, 166, 379, new StateObjRK()));
        clickableAreas.add(new ClickableArea(582, 200, 189, 215, new StateObjIM()));

        clickableAreas.add(new ClickableArea(254, 1153, 263, 132, new StateObjK2()));


        return clickableAreas;
    }

}
