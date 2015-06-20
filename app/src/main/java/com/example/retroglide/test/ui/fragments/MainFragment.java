package com.example.retroglide.test.ui.fragments;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.example.retroglide.adapter.DataSetAdapter;
import com.example.retroglide.model.Curator;
import com.example.retroglide.retrofit.CuratorApi;
import com.example.retroglide.test.R;

import retrofit.Callback;
import retrofit.RestAdapter;
import retrofit.RetrofitError;
import retrofit.client.Response;

/**
 * Created by dhiman_da on 6/20/2015.
 */
public class MainFragment extends Fragment {
    private static final String CURATOR_TAG = "curator";
    private Curator mCurator;

    private RecyclerView mRecyclerView;

    public static MainFragment newInstance() {
        final MainFragment mainFragment = new MainFragment();
        return mainFragment;
    }

    public MainFragment() {

    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_main, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        mRecyclerView = (RecyclerView) view.findViewById(R.id.recyler_view);

        if (savedInstanceState != null) {
            mCurator = savedInstanceState.getParcelable(CURATOR_TAG);
        }

        if (mRecyclerView != null && mCurator != null) {
            fillData();
        }
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        if (savedInstanceState != null) {
            mCurator = savedInstanceState.getParcelable(CURATOR_TAG);
        }

        if (mCurator == null) {
            setupCall();
        }
    }

    @Override
    public void onStart() {
        super.onStart();
    }

    @Override
    public void onResume() {
        super.onResume();
    }

    @Override
    public void onPause() {
        super.onPause();
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        outState.putParcelable(CURATOR_TAG, mCurator);
        super.onSaveInstanceState(outState);
    }

    @Override
    public void onStop() {
        super.onStop();
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
    }

    @Override
    public void onDetach() {
        super.onDetach();
    }

    private void fillData() {
        final LinearLayoutManager manager = new LinearLayoutManager(getActivity(), LinearLayoutManager.VERTICAL, false);
        mRecyclerView.setLayoutManager(manager);

        mRecyclerView.setHasFixedSize(true);

        final DataSetAdapter adapter = new DataSetAdapter(mCurator.dataset);
        mRecyclerView.setAdapter(adapter);

        Toast.makeText(getActivity(), "filldata", Toast.LENGTH_SHORT).show();
    }

    private void setupCall() {
        final RestAdapter restAdapter = new RestAdapter.Builder().setEndpoint(CuratorApi.API_URL).build();
        final CuratorApi api = restAdapter.create(CuratorApi.class);
        final Callback<Curator> callback = new Callback<Curator>() {
            @Override
            public void success(Curator curator, Response response) {
                mCurator = curator;
                fillData();
            }

            @Override
            public void failure(final RetrofitError error) {
                onFail(api, this);
            }
        };

        makeCall(api, callback);
    }

    private void makeCall(final CuratorApi api, final Callback<Curator> callback) {
        api.getCurators(CuratorApi.API_KEY, callback);
    }

    private void onFail(final CuratorApi api, final Callback<Curator> callback) {
        Snackbar.make(mRecyclerView, "Failed to load", Snackbar.LENGTH_SHORT).setAction("Retry", new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                makeCall(api, callback);
            }
        }).show();
    }
}
