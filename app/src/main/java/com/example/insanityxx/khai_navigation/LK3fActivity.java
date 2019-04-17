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

public class LK3fActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener, OnClickableAreaClickedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lk3f);
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
        ImageView image = (ImageView) findViewById(R.id.image4);
        image.setImageResource(R.drawable.lk3e);

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
        getMenuInflater().inflate(R.menu.lk3f, menu);
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
            Intent intentLoadNewActivity = new Intent(LK3fActivity.this, KhaiActivity.class);
            startActivity(intentLoadNewActivity);
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.e1) {
            Intent intentLoadNewActivity = new Intent(LK3fActivity.this, LK1fActivity.class);
            startActivity(intentLoadNewActivity);
        } else if (id == R.id.e2) {
            Intent intentLoadNewActivity = new Intent(LK3fActivity.this, LK2fActivity.class);
            startActivity(intentLoadNewActivity);
        } else if (id == R.id.e4) {
            Intent intentLoadNewActivity = new Intent(LK3fActivity.this, LK4fActivity.class);
            startActivity(intentLoadNewActivity);
        } else if (id == R.id.a304) {
            Intent intentLoadNewActivity = new Intent(LK3fActivity.this, k304Activity.class);
            startActivity(intentLoadNewActivity);
        } else if (id == R.id.a317) {
            Intent intentLoadNewActivity = new Intent(LK3fActivity.this, k317Activity.class);
            startActivity(intentLoadNewActivity);
        } else if (id == R.id.a319) {
            Intent intentLoadNewActivity = new Intent(LK3fActivity.this, k319Activity.class);
            startActivity(intentLoadNewActivity);
        } else if (id == R.id.a321) {
            Intent intentLoadNewActivity = new Intent(LK3fActivity.this, k321Activity.class);
            startActivity(intentLoadNewActivity);
        } else if (id == R.id.a323) {
            Intent intentLoadNewActivity = new Intent(LK3fActivity.this, k323Activity.class);
            startActivity(intentLoadNewActivity);
        } else if (id == R.id.a325) {
            Intent intentLoadNewActivity = new Intent(LK3fActivity.this, k325Activity.class);
            startActivity(intentLoadNewActivity);
        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
    @Override
    public void onClickableAreaTouched(ClickableArea.State item, float positionXOnDrawable, float positionYOnDrawable, float positionXOnScreen, float positionYOnScreen) {
        if (item instanceof StateObjLK4f) {
            Intent intentLoadNewActivity = new Intent(LK3fActivity.this, LK4fActivity.class);
            startActivity(intentLoadNewActivity);
        }
        if (item instanceof StateObjk304) {
            Intent intentLoadNewActivity = new Intent(LK3fActivity.this, k304Activity.class);
            startActivity(intentLoadNewActivity);
        }
        if (item instanceof StateObjk317) {
            Intent intentLoadNewActivity = new Intent(LK3fActivity.this, k317Activity.class);
            startActivity(intentLoadNewActivity);
        }
        if (item instanceof StateObjk319) {
            Intent intentLoadNewActivity = new Intent(LK3fActivity.this, k319Activity.class);
            startActivity(intentLoadNewActivity);
        }
        if (item instanceof StateObjk321) {
            Intent intentLoadNewActivity = new Intent(LK3fActivity.this, k321Activity.class);
            startActivity(intentLoadNewActivity);
        }
        if (item instanceof StateObjk323) {
            Intent intentLoadNewActivity = new Intent(LK3fActivity.this, k323Activity.class);
            startActivity(intentLoadNewActivity);
        }
        if (item instanceof StateObjk325) {
            Intent intentLoadNewActivity = new Intent(LK3fActivity.this, k325Activity.class);
            startActivity(intentLoadNewActivity);
        }
    }

    @NonNull
    private List<ClickableArea> getClickableAreas() {

        List<ClickableArea> clickableAreas = new ArrayList<>();



        clickableAreas.add(new ClickableArea(318, 1463, 222, 148, new StateObjk304()));
        clickableAreas.add(new ClickableArea(23, 846, 202, 158, new StateObjk317()));
        clickableAreas.add(new ClickableArea(23, 772, 202, 73, new StateObjk319()));

        clickableAreas.add(new ClickableArea(23, 644, 202, 125, new StateObjk321()));
        clickableAreas.add(new ClickableArea(23, 507, 202, 137, new StateObjk323()));
        clickableAreas.add(new ClickableArea(23, 434, 202, 73, new StateObjk325()));

        clickableAreas.add(new ClickableArea(224, 4, 94, 88, new StateObjLK4f()));
        clickableAreas.add(new ClickableArea(36, 1675, 156, 67, new StateObjLK4f()));


        return clickableAreas;
    }
}
