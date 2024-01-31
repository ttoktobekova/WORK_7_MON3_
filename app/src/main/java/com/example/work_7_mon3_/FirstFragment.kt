package com.example.work_7_mon3_

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.work_7_mon3_.UserDetaliFragment
import com.example.work_7_mon3_.databinding.FragmentFirstBinding
import java.text.FieldPosition
import com.example.work_7_mon3_.UserDetaliFragment as UserDetaliFragment1


class FirstFragment : Fragment() {
    private lateinit var binding: FragmentFirstBinding
    private val userList = arrayListOf(
        User(
            "https://i.pinimg.com/564x/60/14/0f/60140f8060fa4483937c6b6ca38b583b.jpg",
            "Adilet",
            "QA Tester"
        ),
        User(
            "https://i.pinimg.com/236x/42/0c/00/420c009d9e8bd4242d62b6600eed22e2.jpg",
            "Nurchik",
            "Python developer"
        ),
        User(
            "https://i.pinimg.com/236x/46/f9/ea/46f9eac4f9e9e577ab63452ce9a6ecb8.jpg",
            "Amantur",
            "Frontend Developer"
        ),
        User(
            "https://i.pinimg.com/236x/0a/ec/23/0aec237ae9f8d366a875b178b9a23567.jpg",
            "Janysh",
            "ios developer"
        ),
        User(
            "https://i.pinimg.com/474x/e1/4d/53/e14d5329693934baabdfc4f335242317.jpg",
            "You",
            "android developer"
        ),
        User(
            "https://i.pinimg.com/236x/f5/9e/19/f59e193c3c76888b039d050d626471e2.jpg",
            "Albina",
            "History"
        ),
        User(
            "https://i.pinimg.com/236x/6a/70/f8/6a70f86d192faf9c90c29f38c1b08b5b.jpg",
            "yrsjan",
            "Matematic_it"
        ),
        User(
            "https://i.pinimg.com/236x/1b/14/91/1b1491548e08d0afcb84ac6318d9459e.jpg",
            "Aman",
            "Agronom"
        ),
        User(
            "https://i.pinimg.com/474x/15/c6/d5/15c6d5525e01743e5dc9a1cec1dda2d9.jpg",
            "Nurizat",
            "Veterinar"
        ),
        User(
            "https://i.pinimg.com/236x/24/4b/b7/244bb7204b0c7155a460bb47bc24bea9.jpg",
            "Sezim",
            "Product manager"
        ),
        User(
            "https://i.pinimg.com/236x/21/dd/51/21dd51510448545de88bc85f374c96ee.jpg",
            "Kurman",
            ""
        )

    )

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentFirstBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val adapter = UserAdapter(userList, this::onClick)
        binding.rvUser.adapter = adapter
    }

    private fun onClick(position: Int) {
        val user = userList[position]

        val bundle = Bundle()
        bundle.putSerializable(KEYS.BUNDLE_KEY_USER, user)

        val userDetailFragment = UserDetaliFragment1()
        userDetailFragment.arguments = bundle

        requireActivity().showToast(user.userName)

        requireActivity().supportFragmentManager.beginTransaction()
            .replace(R.id.layout_frameActivity, userDetailFragment)
            .addToBackStack(null)
            .commit()
    }

}