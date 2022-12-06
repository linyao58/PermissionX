package com.permissionx.app.fragment

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import com.permissionx.app.R
import com.permissionx.app.databinding.FragmentMainBinding
import com.permissionx.linyaodev.PermissionX
import java.util.jar.Manifest

class MainFragment : Fragment() {

    private var binding: FragmentMainBinding? = null

    companion object{
        fun newInstance(): MainFragment {
            val args = Bundle()

            val fragment = MainFragment()
            fragment.arguments = args
            return fragment
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_main, container, false)

        PermissionX.fragmentRequest(this,
            android.Manifest.permission.CALL_PHONE,
        android.Manifest.permission.READ_CONTACTS){allGranted, deniedList ->
            if (allGranted){
                call()
            }else{
                Toast.makeText(requireContext(), "You denied $deniedList", Toast.LENGTH_SHORT).show()
            }
        }

        return binding?.root
    }

    private fun call(){
        try {
            val intent = Intent(Intent.ACTION_CALL)
            intent.data = Uri.parse("tel:1008611")
            requireContext().startActivity(intent)

        }catch (e: Exception){
            e.printStackTrace()
        }
    }

}