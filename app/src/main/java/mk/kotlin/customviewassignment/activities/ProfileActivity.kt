package mk.kotlin.customviewassignment.activities

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.google.android.material.tabs.TabLayoutMediator
import kotlinx.android.synthetic.main.profile_layout.*
import mk.kotlin.customviewassignment.R
import mk.kotlin.customviewassignment.activities.fragments.AboutYouFragment
import mk.kotlin.customviewassignment.activities.fragments.ContactFragment
import mk.kotlin.customviewassignment.activities.fragments.ProjectTaskFragment
import mk.kotlin.customviewassignment.views.viewpods.UserDataViewPod

class ProfileActivity : BaseActivity() {

    private lateinit var muserviewpod: UserDataViewPod

    companion object {
        fun newIntent(context: Context): Intent {
            return Intent(context, ProfileActivity::class.java)
        }
    }

    override fun onBackPressed() {
        super.onBackPressed()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.profile_layout)
        setUpViewPod()
        setUpListener()
        init()
    }

    private fun init() {
        pager.adapter = object : FragmentStateAdapter(this) {
            override fun createFragment(position: Int): Fragment {
                return when (position) {
                    0 -> {
                        ProjectTaskFragment.newInstance()
                    }
                    1 -> {
                        ContactFragment.newInstance()
                    }
                    else -> {
                        AboutYouFragment.newInstance()
                    }
                }
            }

            override fun getItemCount(): Int {
                return 3
            }
        }

        TabLayoutMediator(tabs, pager) { tab, position ->
            tab.text = when (position) {
                0 -> "Project Tasks"
                1 -> "Contacts"
                else -> "About You"
            }
        }.attach()
    }

    private fun setUpListener() {
        closeimage.setOnClickListener { onBackPressed() }
    }

    private fun setUpViewPod() {
        muserviewpod = userviewpod as UserDataViewPod
        muserviewpod.setUserData("Zathary Butler", "Ui Designer", "230", "33", "")
        //userviewpod.setDelegate(mPresenter)
    }

}