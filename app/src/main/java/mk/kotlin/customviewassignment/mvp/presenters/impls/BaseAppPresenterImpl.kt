package mk.kotlin.customviewassignment.mvp.presenters.impls

import mk.kotlin.customviewassignment.mvp.presenter.BasePresenter
import mk.kotlin.customviewassignment.mvp.presenters.AbstractBasePresenter
import mk.kotlin.customviewassignment.mvp.views.BaseView

abstract class BaseAppPresenterImpl<V : BaseView> : AbstractBasePresenter<V>(), BasePresenter<V>
