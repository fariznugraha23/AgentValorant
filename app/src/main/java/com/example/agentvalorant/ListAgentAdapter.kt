package com.example.agentvalorant

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class ListAgentAdapter (private val listAgent: ArrayList<Agent>) : RecyclerView.Adapter<ListAgentAdapter.ListViewHolder>(){
    inner class ListViewHolder (itemView: View): RecyclerView.ViewHolder(itemView) {
        var tvName: TextView = itemView.findViewById(R.id.tv_item_name)
        var tvRole: TextView = itemView.findViewById(R.id.tv_item_role)
        var tvPenjelasan: TextView = itemView.findViewById(R.id.tv_item_penjelasan)
        var imgPhoto: ImageView = itemView.findViewById(R.id.img_item_photo)
    }

    override fun onCreateViewHolder(viewGroup: ViewGroup, i: Int): ListViewHolder {
        val view: View = LayoutInflater.from(viewGroup.context).inflate(R.layout.item_row_agent, viewGroup, false)
        return ListViewHolder(view)
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val agent = listAgent[position]
        Glide.with(holder.itemView.context)
            .load(agent.photo)
            .apply(RequestOptions().override(55, 55))
            .into(holder.imgPhoto)
        holder.tvName.text = agent.name
        holder.tvRole.text = agent.role
        holder.tvPenjelasan.text = agent.penjelasan

        holder.itemView.setOnClickListener {
            onItemClickCallback.onItemClicked(listAgent[holder.adapterPosition])
        }
    }

    override fun getItemCount(): Int {
        return listAgent.size
    }
    private lateinit var onItemClickCallback: OnItemClickCallback

    fun setOnItemClickCallback(onItemClickCallback: OnItemClickCallback) {
        this.onItemClickCallback = onItemClickCallback
    }
    interface OnItemClickCallback {
        fun onItemClicked(data: Agent)
    }

}