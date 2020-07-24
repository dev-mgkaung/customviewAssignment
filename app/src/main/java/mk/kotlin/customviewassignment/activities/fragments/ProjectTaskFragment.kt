package mk.kotlin.customviewassignment.activities.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import mk.kotlin.customviewassignment.R


class ProjectTaskFragment : Fragment() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_project_task, container, false)
    }

    companion object {

        @JvmStatic
        fun newInstance() =
            ProjectTaskFragment().apply {
                arguments = Bundle().apply {
                }
            }
    }
}