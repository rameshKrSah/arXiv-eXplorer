package com.gbeatty.arxivexplorer.downloaded;


import android.os.Bundle;
import androidx.fragment.app.Fragment;

import com.gbeatty.arxivexplorer.paper.list.PapersFragment;
import com.gbeatty.arxivexplorer.paper.list.PapersPresenter;

/**
 * A simple {@link Fragment} subclass.
 */
public class DownloadedFragment extends PapersFragment {

    private DownloadedPresenter presenter;

    public DownloadedFragment() {
        // Required empty public constructor
    }

    public static DownloadedFragment newInstance() {
        DownloadedFragment fragment = new DownloadedFragment();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        presenter = new DownloadedPresenter(this, this);
        super.onCreate(savedInstanceState);
    }

    @Override
    public void onResume() {
        super.onResume();
        presenter.getPapers();
    }

    @Override
    public PapersPresenter getPresenter() {
        return presenter;
    }

    @Override
    protected boolean isPaginate() {
        return false;
    }
}
