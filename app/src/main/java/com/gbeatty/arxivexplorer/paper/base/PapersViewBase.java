package com.gbeatty.arxivexplorer.paper.base;

import java.io.File;

public interface PapersViewBase {

    void viewDownloadedPaper(File downloadedFile);

    void setTitle(String title);

    void setAuthors(String authors);

    void setPublishedDate(String publishedDate);

    void setLastUpdatedDate(String updatedDate);

    void setSummary(String summary);

    void setLatexSummary(String summary);

    void setLatexTitle(String title);

    void setFavoritedIcon();

    void setNotFavoritedIcon();

    void setPaperCategories(String categories);

    void hideLatexSummary();

    void showLatexSummary();

    void hideLatexTitle();

    void showLatexTitle();

    void hideSummary();

    void showSummary();

    void hideTitle();

    void showTitle();

    void setPaperID(String paperID);

    void setDownloadedIcon();

    void setNotDownloadedIcon();

    File getFilesDir();

    void showLoading();

    void errorLoading();

    void dismissLoading();
}
