package mk.kotlin.customviewassignment.activities.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import mk.kotlin.customviewassignment.R
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.fragment_project_task.*
import kotlinx.android.synthetic.main.fragment_project_task.view.*
import mk.kotlin.customviewassignment.adapters.PeopleRecyclerAdapter
import mk.kotlin.customviewassignment.datas.vos.PeopleEntity
import mk.kotlin.customviewassignment.mvp.presenters.MainPresenter
import mk.kotlin.customviewassignment.mvp.presenters.impls.MainPresenterImpl
import mk.kotlin.customviewassignment.mvp.views.MainView


class ProjectTaskFragment : Fragment(), MainView {

    private lateinit var mAdapter: PeopleRecyclerAdapter
    private lateinit var mPresenter: MainPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }


    private fun setUpPresenter() {
        mPresenter = MainPresenterImpl()
        mPresenter.initPresenter(this)
    }

    private fun setUpRecyclerView(view: View) {
        mAdapter = PeopleRecyclerAdapter(mPresenter)
        val linearLayoutManager = LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false)
        view.precyclerview.layoutManager = linearLayoutManager
        view.precyclerview.adapter = mAdapter
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        var view = inflater.inflate(R.layout.fragment_project_task, container, false)
        setUpPresenter()
        setUpRecyclerView(view)
        mPresenter.onUiReady(this)

        return view;
    }

    companion object {

        @JvmStatic
        fun newInstance() =
            ProjectTaskFragment().apply {
                arguments = Bundle().apply {
                }
            }
    }

    override fun displayPeopleList(list: List<PeopleEntity>) {
        mAdapter.setNewData(list.toMutableList())
    }

    override fun navigateToProfileScreen() {}

    override fun navigateToCreateTask() {}
}