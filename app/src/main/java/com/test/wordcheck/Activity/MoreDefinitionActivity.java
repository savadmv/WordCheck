package com.test.wordcheck.Activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.test.wordcheck.Adapter.DefinitionListAdapter;
import com.test.wordcheck.App;
import com.test.wordcheck.Model.Result;
import com.test.wordcheck.R;

import java.util.ArrayList;

public class MoreDefinitionActivity extends AppCompatActivity {

    private RecyclerView Rv360List;
    private LinearLayoutManager layoutManager;
    private ArrayList<Result> resultArrayList = new ArrayList<>();
    private App apContext;
    private DefinitionListAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_more_definition);
        Rv360List = (RecyclerView) findViewById(R.id.rv_360_post);
        apContext = (App) getApplication();

        resultArrayList.addAll(apContext.getWordResponse().getResults());
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        initRecyclerView();
    }

    /**
     * impliment even for back button click in toolbar
     *
     * @return
     */
    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();


        return true;
    }

    // intiate recycler view
    private void initRecyclerView() {

        Rv360List.setHasFixedSize(false);
        layoutManager = new LinearLayoutManager(getApplicationContext());
        layoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        Rv360List.setLayoutManager(layoutManager);
        Rv360List.setItemAnimator(new DefaultItemAnimator());

//        Rv360List.addItemDecoration(new DividerItemDecoration(getContext(),
//                DividerItemDecoration.VERTICAL));


        adapter = new DefinitionListAdapter(resultArrayList, getApplicationContext());
        Rv360List.setAdapter(adapter);

    }
}
