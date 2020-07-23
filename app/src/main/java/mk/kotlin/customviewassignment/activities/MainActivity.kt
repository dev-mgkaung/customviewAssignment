package mk.kotlin.customviewassignment.activities

import android.os.Bundle
import android.widget.ImageView
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.people_group_layout.*
import mk.kotlin.customviewassignment.R
import mk.kotlin.customviewassignment.adapters.PeopleRecyclerAdapter
import mk.kotlin.customviewassignment.datas.vos.PeopleEntity
import mk.kotlin.customviewassignment.mvp.presenters.MainPresenter
import mk.kotlin.customviewassignment.mvp.presenters.impls.MainPresenterImpl
import mk.kotlin.customviewassignment.mvp.views.MainView

class MainActivity : BaseActivity() , MainView{

    private lateinit var mAdapter: PeopleRecyclerAdapter
    private lateinit var mPresenter: MainPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setUpPresenter()
        setUpProgressBar()
        setUpRecyclerView()
        mPresenter.onUiReady(this)

    }

    private fun setUpPresenter() {
        mPresenter = ViewModelProviders.of(this).get(MainPresenterImpl::class.java)
        mPresenter.initPresenter(this)
    }


    private fun setUpProgressBar()
    {
        circularprogressbar.setProgressColor(getResources().getColor(R.color.colorPrimary));
        circularprogressbar.setProgressWidth(10)
        circularprogressbar.setProgress(80)
    }
    private fun setUpRecyclerView() {
        mAdapter = PeopleRecyclerAdapter(mPresenter)
        val linearLayoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        people_recyclerview.layoutManager = linearLayoutManager
        people_recyclerview.adapter = mAdapter

    }

    override fun displayPeopleList(list: List<PeopleEntity>) {
        mAdapter.setNewData(list.toMutableList())
    }

    override fun navigateToProfileScreen(id: Int, profileimage: ImageView) {

    }

}