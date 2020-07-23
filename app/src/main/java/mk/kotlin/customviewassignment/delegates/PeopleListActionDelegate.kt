package mk.kotlin.customviewassignment.delegates

import android.widget.ImageView
import mk.kotlin.customviewassignment.datas.vos.PeopleEntity

interface PeopleListActionDelegate {
    fun onTap(entity : PeopleEntity, profileImage: ImageView)
}