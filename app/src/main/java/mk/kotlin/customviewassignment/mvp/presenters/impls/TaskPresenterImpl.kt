package mk.kotlin.customviewassignment.mvp.presenters.impls


import android.widget.ImageView
import androidx.lifecycle.LifecycleOwner
import mk.kotlin.customviewassignment.datas.dummys.getDummyPeopleList
import mk.kotlin.customviewassignment.datas.vos.PeopleEntity
import mk.kotlin.customviewassignment.mvp.presenters.ProfilePresenter
import mk.kotlin.customviewassignment.mvp.presenters.TaskPresenter
import mk.kotlin.customviewassignment.mvp.views.ProfileView
import mk.kotlin.customviewassignment.mvp.views.TaskView

class TaskPresenterImpl : TaskPresenter, BaseAppPresenterImpl<TaskView>() {

    override fun onUiReady(lifeCycleOwner: LifecycleOwner) {

    }

    override fun onTap(entity: PeopleEntity, profileImage: ImageView) {

    }

    override fun onTapAddBtn() {
        mView?.navigateToProfileScreen()
    }


}