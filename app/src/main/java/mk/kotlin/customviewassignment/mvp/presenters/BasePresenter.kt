package mk.kotlin.customviewassignment.mvp.presenters
import androidx.lifecycle.LifecycleOwner
import mk.kotlin.customviewassignment.mvp.views.BaseView

interface BasePresenter<T : BaseView> {

    fun initPresenter(view: T)

}