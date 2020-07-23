package mk.kotlin.customviewassignment.mvp.presenters.impls

import android.widget.ImageView
import androidx.lifecycle.LifecycleOwner
import mk.kotlin.customviewassignment.datas.dummys.getDummyPeopleList
import mk.kotlin.customviewassignment.datas.vos.PeopleEntity
import mk.kotlin.customviewassignment.mvp.presenters.MainPresenter
import mk.kotlin.customviewassignment.mvp.views.MainView

class MainPresenterImpl : MainPresenter, BaseAppPresenterImpl<MainView>() {

    override fun onUiReady(lifeCycleOwner: LifecycleOwner) {
        mView?.displayPeopleList(getDummyPeopleList())
    }

    override fun onTap(entity: PeopleEntity, profileImage: ImageView) {
        TODO("Not yet implemented")
    }


}