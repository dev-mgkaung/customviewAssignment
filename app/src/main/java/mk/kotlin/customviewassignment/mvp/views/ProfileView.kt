package mk.kotlin.customviewassignment.mvp.views

import mk.kotlin.customviewassignment.datas.vos.PeopleEntity

interface ProfileView : BaseView {
    fun displayPeopleList(list: List<PeopleEntity>)
    fun navigateToProfileScreen()
    fun navigateToCreateTask()
}