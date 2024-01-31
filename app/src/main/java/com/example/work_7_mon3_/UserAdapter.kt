package com.example.work_7_mon3_

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.work_7_mon3_.databinding.ItemUserBinding

class UserAdapter(val userList: List<User>, private val onClick: (position: Int) -> Unit) :
    RecyclerView.Adapter<UserViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UserViewHolder {
        return UserViewHolder(
            ItemUserBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun getItemCount(): Int = userList.size
    override fun onBindViewHolder(holder: UserViewHolder, position: Int) {
        holder.bind(userList.get(position))
        holder.itemView.setOnClickListener {
            onClick(position)
        }
    }
}

@Suppress("DEPRECATION")
class UserViewHolder(val binding: ItemUserBinding) : RecyclerView.ViewHolder(binding.root) {
    fun bind(user: User) {
        binding.apply {
            user.apply {
                imgAvatar.loadImage(avatar)
                tvUserName.text = userName
                quote.text = profession
            }
        }
//        if (user.userName == "You"){
//            itemView.setBackgroundColor(itemView.resources.getColor(R.color.violet))
//        }

    }
}