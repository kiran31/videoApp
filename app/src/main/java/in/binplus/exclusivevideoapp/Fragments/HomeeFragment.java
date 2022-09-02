package in.binplus.exclusivevideoapp.Fragments;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import java.util.ArrayList;

import in.binplus.exclusivevideoapp.Adapters.HomeAdapter;
import in.binplus.exclusivevideoapp.DetailActivity;
import in.binplus.exclusivevideoapp.Model.HomeModel;
import in.binplus.exclusivevideoapp.R;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link HomeeFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class HomeeFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public HomeeFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment HomeeFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static HomeeFragment newInstance(String param1, String param2) {
        HomeeFragment fragment = new HomeeFragment();
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

    RecyclerView rec_home;
    HomeAdapter homeAdapter;
    ArrayList<HomeModel> homeModelsList;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_homee, container, false);
        rec_home = v.findViewById(R.id.rec_home);
        rec_home.setLayoutManager(new LinearLayoutManager(getActivity()));
        homeModelsList = new ArrayList<>();
        homeModelsList.add(new HomeModel());
        homeModelsList.add(new HomeModel());
        homeModelsList.add(new HomeModel());
        homeModelsList.add(new HomeModel());
        homeAdapter = new HomeAdapter(getActivity(),homeModelsList);
        rec_home.setAdapter(homeAdapter);
        return v;
    }
}