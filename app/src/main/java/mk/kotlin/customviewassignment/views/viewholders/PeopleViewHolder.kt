package mk.kotlin.customviewassignment.views.viewholders

import android.view.View
import mk.kotlin.customviewassignment.datas.vos.PeopleEntity
import mk.kotlin.customviewassignment.delegates.PeopleListActionDelegate

class PeopleViewHolder(itemView: View, private val mDelegate: PeopleListActionDelegate)
    : BaseViewHolder<PeopleEntity>(itemView) {

    init {
//        itemView.cvBurgerImage.setOnClickListener {
//            mData?.let {
//                mDelegate.onTapBurger(it, itemView.ivBurger)
//            }
        }



    override fun bindData(data: PeopleEntity) {
        mData = data

//        itemView.tvBurgerName.text = data.burgerName
//        itemView.tvDescription.text = data.burgerDescription

//        Glide.with(itemView.ivBurger)
//            .load(data.burgerImageUrl)
//            .into(itemView.ivBurger)
    }
}