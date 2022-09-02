package in.binplus.exclusivevideoapp.Fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.Adapter;

import com.google.android.material.tabs.TabLayout;

import in.binplus.exclusivevideoapp.Adapters.ViewPageAdapter;
import in.binplus.exclusivevideoapp.R;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link HomeFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class HomeFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public HomeFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment HomeFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static HomeFragment newInstance(String param1, String param2) {
        HomeFragment fragment = new HomeFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }
    TabLayout tabs;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_home, container, false);
        ViewPager viewPager = view.findViewById(R.id.viewpager);
        setupViewPager(viewPager);
        tabs = view.findViewById(R.id.tabLayout);
        tabs.setTabGravity(TabLayout.GRAVITY_FILL);
        tabs.setupWithViewPager(viewPager);
        //setupTabIcons();
        return view;
    }

    private void setupTabIcons() {
        tabs.getTabAt(0).setIcon(R.drawable.ic_baseline_home_24);
        tabs.getTabAt(1).setIcon(R.drawable.video_24);
        tabs.getTabAt(2).setIcon(R.drawable.doubt_24);
    }

    private void setupViewPager(ViewPager viewPager) {

        ViewPageAdapter viewPageAdapter = new ViewPageAdapter(getChildFragmentManager());
        viewPageAdapter.addFragment(new HomeeFragment(),"Home");
        viewPageAdapter.addFragment(new ClassFragment(),"Live Class");
        viewPageAdapter.addFragment(new DoubtFragment(),"Doubts");
        viewPager.setAdapter(viewPageAdapter);
    }
}