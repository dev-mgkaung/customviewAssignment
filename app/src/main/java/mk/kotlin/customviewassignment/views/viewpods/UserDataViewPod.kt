package mk.kotlin.customviewassignment.views.viewpods


import android.content.Context
import android.util.AttributeSet
import androidx.constraintlayout.widget.ConstraintLayout
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import kotlinx.android.synthetic.main.view_pod_user_data.view.*

class UserDataViewPod @JvmOverloads constructor(
    context: Context, attrs: AttributeSet? = null, defStyleAttr: Int = 0
) : ConstraintLayout(context, attrs, defStyleAttr) {

    private var mDelegate: Delegate? = null

    override fun onFinishInflate() {
        super.onFinishInflate()
        setUpListener()
    }

    fun setUserData(
        name: String,
        job: String,
        opencount: String,
        closecount: String,
        ImageUrl: String
    ) {

        username.text = name
        opentaskcount.text = opencount
        closetaskcount.text = closecount
        jobname.text = job

        Glide.with(profileimage)
            .load("https://images.assetsdelivery.com/compings_v2/gmast3r/gmast3r1511/gmast3r151100776.jpg")
            .apply(RequestOptions().circleCrop()).into(profileimage)
    }

    fun setDelegate(delegate: Delegate) {
        mDelegate = delegate
    }

    private fun setUpListener() {

    }

    interface Delegate {
        fun onTapTryAgain()
    }

}