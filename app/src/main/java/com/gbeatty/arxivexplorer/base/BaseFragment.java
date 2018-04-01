package com.gbeatty.arxivexplorer.base;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;

import com.gbeatty.arxivexplorer.settings.SharedPreferencesView;

public abstract class BaseFragment extends Fragment implements SharedPreferencesView {

    private ActivityListener listener;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        try {
            listener = (ActivityListener) context;
        } catch (ClassCastException castException) {
            /** The activity does not implement the listener. */
        }
    }

    protected void showFragment(int fragmentContainerId, BaseFragment fragment, String backStateName) {
        listener.showFragment(fragmentContainerId, fragment, backStateName);
    }

    public interface ActivityListener {
        void showFragment(int fragmentContainerId, BaseFragment fragment, String backStateName);

        String getSortOrder();

        String getSortBy();

        int getMaxResult();

        boolean isShowAbstract();

        SharedPreferences getSharedPreferences();

        boolean isDashboardCategoryChecked(String categoryName);

        boolean isPublishedDate();

        boolean isLastUpdatedDate();

    }

    @Override
    public String getSortOrder() {
        return listener.getSortOrder();
    }

    @Override
    public String getSortBy() {
        return listener.getSortBy();
    }

    @Override
    public int getMaxResult() {
        return listener.getMaxResult();
    }

    @Override
    public boolean isShowAbstract(){return  listener.isShowAbstract();}

    @Override
    public boolean isDashboardCategoryChecked(String categoryName) {
        return listener.isDashboardCategoryChecked(categoryName);
    }

    @Override
    public boolean isLastUpdatedDate() {
        return listener.isLastUpdatedDate();
    }

    @Override
    public boolean isPublishedDate() {
        return listener.isPublishedDate();
    }

}
