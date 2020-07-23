package mk.kotlin.customviewassignment.mvp.presenters
import androidx.lifecycle.ViewModel
import mk.kotlin.customviewassignment.mvp.presenter.BasePresenter
import mk.kotlin.customviewassignment.mvp.views.BaseView

abstract class AbstractBasePresenter<T : BaseView> : BasePresenter<T>, ViewModel() {
    var mView: T? = null

    override fun initPresenter(view: T) {
        mView = view
    }
}