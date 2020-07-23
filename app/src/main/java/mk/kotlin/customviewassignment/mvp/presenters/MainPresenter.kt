package mk.kotlin.customviewassignment.mvp.presenters

import androidx.lifecycle.LifecycleOwner
import mk.kotlin.customviewassignment.delegates.PeopleListActionDelegate
import mk.kotlin.customviewassignment.mvp.presenter.BasePresenter
import mk.kotlin.customviewassignment.mvp.views.MainView

interface MainPresenter : BasePresenter<MainView>, PeopleListActionDelegate {
    fun onUiReady(lifeCycleOwner: LifecycleOwner)
}
