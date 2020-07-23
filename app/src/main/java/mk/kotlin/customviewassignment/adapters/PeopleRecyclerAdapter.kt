package mk.kotlin.customviewassignment.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import mk.kotlin.customviewassignment.R
import mk.kotlin.customviewassignment.datas.vos.PeopleEntity
import mk.kotlin.customviewassignment.delegates.PeopleListActionDelegate
import mk.kotlin.customviewassignment.views.viewholders.PeopleViewHolder

class PeopleRecyclerAdapter(private val mDelegate : PeopleListActionDelegate) :
    BaseRecyclerAdapter<PeopleViewHolder,PeopleEntity>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PeopleViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.list_item,parent,false)
        return PeopleViewHolder(view, mDelegate)
    }
}