import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.menuar.GulaiFragment
import com.example.menuar.MinumanFragment
import com.example.menuar.SateFragment
import com.example.menuar.TongsengFragment

class ViewPagerAdapter(activity: FragmentActivity) : FragmentStateAdapter(activity) {

    override fun getItemCount(): Int {
        // Jumlah total tab
        return 4
    }

    override fun createFragment(position: Int): Fragment {
        return when (position) {
            0 -> SateFragment()
            1 -> TongsengFragment()
            2 -> GulaiFragment()
            3 -> MinumanFragment()
            else -> SateFragment()
        }
    }
}