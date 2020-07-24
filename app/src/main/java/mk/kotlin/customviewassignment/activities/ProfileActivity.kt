package mk.kotlin.customviewassignment.activities

import android.content.Context
import android.content.Intent
import android.os.Bundle
import kotlinx.android.synthetic.main.profile_layout.*
import mk.kotlin.customviewassignment.R
import mk.kotlin.customviewassignment.views.viewpods.UserDataViewPod

class ProfileActivity : BaseActivity() {

    private lateinit var muserviewpod: UserDataViewPod

    companion object {
        fun newIntent(context: Context): Intent {
            return Intent(context, ProfileActivity::class.java)
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.profile_layout)
        setUpViewPod()
    }


    private fun setUpViewPod() {
        muserviewpod = userviewpod as UserDataViewPod
        muserviewpod.setUserData("John Mr", "Ui Designer", "230", "233", "")
        //userviewpod.setDelegate(mPresenter)
    }

}