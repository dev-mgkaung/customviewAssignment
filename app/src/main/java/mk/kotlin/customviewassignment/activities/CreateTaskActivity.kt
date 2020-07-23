package mk.kotlin.customviewassignment.activities

import android.content.Context
import android.content.Intent
import android.os.Bundle
import kotlinx.android.synthetic.main.create_task_toolbar.*
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
        backtext.setOnClickListener{onBackPressed()}
    }

    override fun onBackPressed() {
        super.onBackPressed()
    }
}