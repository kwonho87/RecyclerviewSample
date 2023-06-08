package kr.co.kwonho87.recyclerviewsample.common

import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import kr.co.kwonho87.recyclerviewsample.R

class MainListAdapter (private var list: MutableList<TestData>): RecyclerView.Adapter<MainListAdapter.ItemViewHolder> () {

    // inner class로 ViewHolder 정의
    inner class ItemViewHolder(itemView: View?): RecyclerView.ViewHolder(itemView!!) {

        var title: TextView = itemView!!.findViewById(R.id.title)

        fun bind(data: TestData, position: Int) {
            data1Text.text = data.getData1()
            data2Text.text = data.getData2()
            data3Text.text = data.getData3()
        }
    }

    // ViewHolder에게 item을 보여줄 View로 쓰일 item_data_list.xml를 넘기면서 ViewHolder 생성
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.list_item_main, parent, false)
        return ItemViewHolder(view)
    }

    override fun getItemCount(): Int {
        return list.count()
    }

    // ViewHolder의 bind 메소드를 호출한다.
    override fun onBindViewHolder(holder: MainListAdapter.ItemViewHolder, position: Int) {
        holder.bind(list[position], position)
    }

}
