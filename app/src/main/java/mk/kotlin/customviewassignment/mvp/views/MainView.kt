package mk.kotlin.customviewassignment.mvp.views

import android.widget.ImageView
import mk.kotlin.customviewassignment.datas.vos.PeopleEntity

interface MainView : BaseView{
    fun displayPeopleList(list: List<PeopleEntity>)
    fun navigateToProfileScreen()
    fun navigateToCreateTask()
}