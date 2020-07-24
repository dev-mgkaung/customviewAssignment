package mk.kotlin.customviewassignment.activities

import android.content.Context
import android.content.Intent
import android.os.Bundle
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import kotlinx.android.synthetic.main.create_task_toolbar.*
import kotlinx.android.synthetic.main.create_task_vard_layout.*
import mk.kotlin.customviewassignment.R

class CreateTaskActivity : BaseActivity() {

    companion object {
        fun newIntent(context: Context): Intent {
            return Intent(context, CreateTaskActivity::class.java)
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.create_task_layout)
        loadImage()
        backtext.setOnClickListener { onBackPressed() }
    }

    private fun loadImage() {
        Glide.with(profile)
            .load("https://images.assetsdelivery.com/compings_v2/gmast3r/gmast3r1511/gmast3r151100776.jpg")
            .apply(RequestOptions().circleCrop()).into(profile)
    }

    override fun onBackPressed() {
        super.onBackPressed()
    }
}