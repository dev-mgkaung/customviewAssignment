package mk.kotlin.customviewassignment.views.viewholders

import android.view.View
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.list_item.view.*
import mk.kotlin.customviewassignment.datas.vos.PeopleEntity
import mk.kotlin.customviewassignment.delegates.PeopleListActionDelegate

class PeopleViewHolder(itemView: View, private val mDelegate: PeopleListActionDelegate)
    : BaseViewHolder<PeopleEntity>(itemView) {

    init {
        itemView.imageitem.setOnClickListener {
            mData?.let {
                mDelegate.onTap(it, itemView.imageitem)
            }
        }
    }

    override fun bindData(data: PeopleEntity) {
        mData = data

        itemView.status.text = data.status
        itemView.name.text = data.name
        itemView.title.text = data.title
        itemView.sharecount.text = data.shareCount.toString()
        itemView.smscount.text = data.messagecount.toString()

//        Glide.with(itemView.imageitem)
//            .load(data.imageurl)
//            .into(itemView.imageitem)
    }
}