package apps.makarov.com.whereismycurrency.view.iviews;

import android.support.v7.widget.RecyclerView;

import apps.makarov.com.whereismycurrency.view.base.BaseContextView;

/**
 * Created by makarov on 26/06/15.
 */

public interface RateView extends BaseContextView {

    void showProgressDialog(int idRes);

    void hideProgressDialog();

    void showResultOperation(String resultKey);

    void setAdapterForRecyclerView(RecyclerView.Adapter adapter);

    void setOldRate(double rateValue);

}
