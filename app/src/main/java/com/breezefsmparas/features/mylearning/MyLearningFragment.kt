package com.breezefsmparas.features.mylearning
import android.content.Context
import android.net.Uri
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.breezefsmparas.R
import com.breezefsmparas.base.presentation.BaseFragment
import com.etebarian.meowbottomnavigation.MeowBottomNavigation


class MyLearningFragment : BaseFragment() {
    private lateinit var mContext:Context
    private lateinit var bottomNavigation:MeowBottomNavigation
    lateinit var photoRV: RecyclerView
    lateinit var photoRVAdapter: PhotoRVAdapter
    lateinit var photoList: ArrayList<String>
    lateinit var nameList: ArrayList<String>
    lateinit var gridDashboardList: ArrayList<GridDashboard>

    override fun onAttach(context: Context) {
        super.onAttach(context)
        mContext=context
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        super.onCreateView(inflater, container, savedInstanceState)
        val view = inflater!!.inflate(R.layout.fragment_my_learning, container, false)
        initView(view)
        return view
    }

    private fun initView(view: View) {
        bottomNavigation=view.findViewById(R.id.bottomNavigation)
        bottomNavigation.setOnClickMenuListener { model: MeowBottomNavigation.Model? -> null }

        bottomNavigation.add(MeowBottomNavigation.Model(1, R.drawable.ftr_performance))
        bottomNavigation.add(MeowBottomNavigation.Model(2, R.drawable.ftr_my_learning))
        bottomNavigation.add(MeowBottomNavigation.Model(3, R.drawable.ftr_leaderboard))
        bottomNavigation.add(MeowBottomNavigation.Model(4, R.drawable.ftr_knowledge_hub))
       // bottomNavigation.show(1)

        photoRV = view.findViewById(R.id.idRVPhotos)

        photoList = ArrayList()
        nameList = ArrayList()
        gridDashboardList = ArrayList()

        photoRVAdapter = PhotoRVAdapter(gridDashboardList)

        val staggeredGridLayoutManager = StaggeredGridLayoutManager(2, LinearLayoutManager.VERTICAL)
        photoRV.layoutManager = staggeredGridLayoutManager
        photoRV.adapter = photoRVAdapter

        val imageUrl: String = getURLForResource(R.drawable.learning_space)
        val imageUrl3: String = getURLForResource(R.drawable.my_learning)
        val imageUrl1: String = getURLForResource(R.drawable.knowledge_hub)
        val imageUrl2: String = getURLForResource(R.drawable.my_performance)

        gridDashboardList.add(GridDashboard(imageUrl , "Learner\nSpace"))
        gridDashboardList.add(GridDashboard(imageUrl3 , "My\nLearning"))
        gridDashboardList.add(GridDashboard(imageUrl1 , "Knowledge\nHub"))
        gridDashboardList.add(GridDashboard(imageUrl2 , "My\nPerformance"))

        photoRVAdapter.notifyDataSetChanged()

    }

    fun getURLForResource(resourceId: Int): String {
        return Uri.parse("android.resource://" + com.breezefsmparas.R::class.java.getPackage().name + "/" + resourceId)
            .toString()
    }

    companion object {
        fun getInstance(objects: Any): MyLearningFragment {
            val fragment = MyLearningFragment()
            return fragment
        }
    }

}