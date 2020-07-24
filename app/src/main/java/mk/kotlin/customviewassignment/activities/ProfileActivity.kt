package mk.kotlin.customviewassignment.activities

import android.content.Context
import android.content.Intent
import android.os.Bundle
import mk.kotlin.customviewassignment.R

class ProfileActivity : BaseActivity() {

    companion object {
        fun newIntent(context: Context): Intent {
            return Intent(context, ProfileActivity::class.java)
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.profile_layout)

    }
}