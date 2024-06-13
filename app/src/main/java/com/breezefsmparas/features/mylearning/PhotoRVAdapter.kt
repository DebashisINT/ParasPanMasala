package com.breezefsmparas.features.mylearning
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.breezefsmparas.R
import com.squareup.picasso.Picasso

class PhotoRVAdapter(
    private val photoList: ArrayList<GridDashboard>
) : RecyclerView.Adapter<PhotoRVAdapter.PhotoViewHolder>() {
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): PhotoRVAdapter.PhotoViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(
            R.layout.photo_rv_item,
            parent, false
        )
        // at last we are returning our view holder
        // class with our item View File.
        return PhotoRVAdapter.PhotoViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: PhotoViewHolder, position: Int) {
        Picasso.get().load(photoList.get(position).imagepath).into(holder.photoIV)
        holder.tv_photo_item.text = photoList.get(position).name
    }

    override fun getItemCount(): Int {
        return photoList.size
    }

    class PhotoViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val photoIV: ImageView = itemView.findViewById(R.id.idIVImage)
        val tv_photo_item: TextView = itemView.findViewById(R.id.tv_photo_item)
    }

}
