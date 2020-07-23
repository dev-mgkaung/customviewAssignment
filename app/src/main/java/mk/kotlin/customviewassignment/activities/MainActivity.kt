package mk.kotlin.customviewassignment.activities

import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.people_group_layout.*
import mk.kotlin.customviewassignment.R

class MainActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setUpProgressBar()
        setUpRecyclerView()
    }

    private fun setUpProgressBar()
    {
        circularprogressbar.setProgressColor(getResources().getColor(R.color.colorPrimary));
        circularprogressbar.setProgressWidth(10)
        circularprogressbar.setProgress(80)
    }
    private fun setUpRecyclerView() {
      //  mAdapter = NewsListAdapter(mPresenter)
        val linearLayoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
      //  rvNews.layoutManager = linearLayoutManager
      //  rvNews.adapter = mAdapter

    }

}