package mk.kotlin.customviewassignment.activities

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.lifecycle.ViewModelProviders
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import kotlinx.android.synthetic.main.assignee_layout.*
import kotlinx.android.synthetic.main.create_task_toolbar.*
import kotlinx.android.synthetic.main.create_task_vard_layout.*
import mk.kotlin.customviewassignment.R
import mk.kotlin.customviewassignment.mvp.presenters.MainPresenter
import mk.kotlin.customviewassignment.mvp.presenters.TaskPresenter
import mk.kotlin.customviewassignment.mvp.presenters.impls.MainPresenterImpl
import mk.kotlin.customviewassignment.mvp.presenters.impls.TaskPresenterImpl
import mk.kotlin.customviewassignment.mvp.views.TaskView

class CreateTaskActivity : BaseActivity(), TaskView {

    private lateinit var mPresenter: TaskPresenter

    companion object {
        fun newIntent(context: Context): Intent {
            return Intent(context, CreateTaskActivity::class.java)
        }
    }

    private fun setUpPresenter() {
        mPresenter = ViewModelProviders.of(this).get(TaskPresenterImpl::class.java)
        mPresenter.initPresenter(this)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.create_task_layout)
        loadImage()
        setUpPresenter()
        setUpListener()

    }

    private fun setUpListener() {
        backtext.setOnClickListener { onBackPressed() }
        imageone.setOnClickListener { mPresenter.onTapAddBtn() }
        imagetwo.setOnClickListener { mPresenter.onTapAddBtn() }
    }

    private fun loadImage() {
        Glide.with(profile)
            .load("https://images.assetsdelivery.com/compings_v2/gmast3r/gmast3r1511/gmast3r151100776.jpg")
            .apply(RequestOptions().circleCrop()).into(profile)
    }

    override fun onBackPressed() {
        super.onBackPressed()
    }

    override fun navigateToProfileScreen() {
        startActivity(ProfileActivity.newIntent(this))
    }
}