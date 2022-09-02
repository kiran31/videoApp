package in.binplus.exclusivevideoapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import com.google.android.material.navigation.NavigationView;

import java.util.ArrayList;

import in.binplus.exclusivevideoapp.Adapters.DrawerAdapter;
import in.binplus.exclusivevideoapp.Fragments.HomeFragment;
import in.binplus.exclusivevideoapp.Fragments.ProfileFragment;
import in.binplus.exclusivevideoapp.Interface.ClickListener;
import in.binplus.exclusivevideoapp.Model.DrawerModel;
import in.binplus.exclusivevideoapp.Utils.RecyclerTouchListener;

public class MainActivity extends AppCompatActivity {

    private DrawerLayout mDrawer;
    private Toolbar toolbar;
    private NavigationView nvDrawer;
    private ActionBarDrawerToggle drawerToggle;
    RecyclerView rec_drawer;
    DrawerAdapter drawerAdapter;
    ArrayList<DrawerModel> drawerModel;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        drawerToggle = new ActionBarDrawerToggle(this,mDrawer,toolbar,R.string.open,R.string.close);
        drawerToggle.setDrawerIndicatorEnabled(false);
        drawerToggle.setToolbarNavigationClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mDrawer.openDrawer(GravityCompat.START);
            }
        });
        drawerToggle.setHomeAsUpIndicator(R.drawable.ic_baseline_dehaze_24);
        setTitle("SIMPLEE APP");
        setDrawer();
        Fragment homeFragment = new HomeFragment();
        getSupportFragmentManager().beginTransaction().replace(R.id.container_layout,homeFragment,"Home").commit();
        drawerModel.get(0).setChecked(true);
        rec_drawer.addOnItemTouchListener(new RecyclerTouchListener(this,
                rec_drawer, new ClickListener() {
            @Override
            public void onClick(View view, final int position) {

                if (position==0)
                {

                    Fragment homeFragment = new HomeFragment();
                    getSupportFragmentManager().beginTransaction().replace(R.id.container_layout,homeFragment,"Home").commit();
                }
                else if (position==1)
                {
                    Fragment homeFragment = new ProfileFragment();
                    getSupportFragmentManager().beginTransaction().replace(R.id.container_layout,homeFragment,"profile").commit();

                }
                for (int i =0;i<drawerModel.size();i++)
                {
                    drawerModel.get(i).setChecked(i==position);
                }
                mDrawer.closeDrawer(GravityCompat.START);
                drawerAdapter.notifyDataSetChanged();
            }

            @Override
            public void onLongClick(View view, int position) {
                return;
            }
        }));


    }

    private void setDrawer() {
        drawerModel = new ArrayList<>();
        drawerModel.add(new DrawerModel("Home",R.drawable.ic_baseline_notifications_24,true));
        drawerModel.add(new DrawerModel("My Profile",R.drawable.ic_baseline_person_outline_24,false));
        drawerModel.add(new DrawerModel("My Order",R.drawable.ic_baseline_notifications_24,false));
        drawerModel.add(new DrawerModel("Quiz / Test Series",R.drawable.ic_baseline_person_outline_24,false));
        drawerModel.add(new DrawerModel("FAQs",R.drawable.ic_baseline_notifications_24,false));
        drawerModel.add(new DrawerModel("Helpline",R.drawable.ic_baseline_person_outline_24,false));
        drawerAdapter = new DrawerAdapter(this,drawerModel);
        rec_drawer.setAdapter(drawerAdapter);
    }

    private void initViews() {
        toolbar =  findViewById(R.id.toolbar);
        mDrawer =  findViewById(R.id.drawer);
        nvDrawer =  findViewById(R.id.nvView);
        rec_drawer = findViewById(R.id.rec_drawer);
        rec_drawer.setLayoutManager(new LinearLayoutManager(this));
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.toolbar_menu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId()==R.id.nitification)
        {
            startActivity(new Intent(this,WishlistActivity.class));
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}