package mk.kotlin.customviewassignment.mvp.presenters.impls


import android.widget.ImageView
import androidx.lifecycle.LifecycleOwner
import mk.kotlin.customviewassignment.datas.dummys.getDummyPeopleList
import mk.kotlin.customviewassignment.datas.vos.PeopleEntity
import mk.kotlin.customviewassignment.mvp.presenters.ProfilePresenter
import mk.kotlin.customviewassignment.mvp.views.ProfileView

class ProfilePresenterImpl : ProfilePresenter, BaseAppPresenterImpl<ProfileView>() {

    override fun onUiReady(lifeCycleOwner: LifecycleOwner) {
        mView?.displayPeopleList(getDummyPeopleList())
    }

    override fun onTap(entity: PeopleEntity, profileImage: ImageView) {
        mView?.navigateToProfileScreen()
    }

    override fun onTapAddBtn() {
        mView?.navigateToCreateTask()
    }


}