package com.BDND.stegno;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;
import java.util.List;

public class selectdecode extends AppCompatActivity {


    private Toolbar toolbar;
    private ViewPager viewPager;
    private TabLayout tabLayout;

    private Fragment fragment_4;
    private Fragment fragment_5;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_selectdecode);

        toolbar=findViewById (R.id.toolbar );
        setSupportActionBar ( toolbar );

        viewPager=findViewById ( R.id.view_pager);
        tabLayout=findViewById ( R.id.tab_layout );


        fragment_4=new Fragment ();
        fragment_5=new Fragment ();



        tabLayout.setupWithViewPager ( viewPager );

        viewPagerAdpater viewPagerAdpater=new viewPagerAdpater(getSupportFragmentManager(),0);

        viewPagerAdpater.addfragment ( fragment_4,"PHOTO");
        viewPagerAdpater.addfragment (fragment_5,"TEXT" );

        viewPager.setAdapter (viewPagerAdpater);

        tabLayout.getTabAt ( 0 ).setIcon ( R.drawable.ic_insert_photo_black_24dp );
        tabLayout.getTabAt ( 1 ).setIcon ( R.drawable.ic_text );




    }

    class viewPagerAdpater extends FragmentPagerAdapter {


        private List<Fragment> fragments=new ArrayList<> ( );
        private List<String> fragmenttitle=new ArrayList<> (  );

        int behavior;
        public viewPagerAdpater(FragmentManager fm ,int behavior) {

            super (fm);
            this.behavior=behavior;


        }
        public void addfragment(Fragment fragment,String title){
            fragments.add (fragment );
            fragmenttitle.add (  title );



        }






        @Override
        public Fragment getItem(int position) {
            switch (position){
            case 0:
                Tabfour tabfour = new Tabfour ();
                return tabfour;
            case 1:
                Tabfive tabfive = new Tabfive ();
                return tabfive;

            default:

                return fragments.get ( position );
            }

        }

        @Override
        public int getCount() {
            return fragments.size ();
        }

        @Nullable
        @Override
        public CharSequence getPageTitle(int position) {

            return fragmenttitle.get ( position);

        }
    }
}
