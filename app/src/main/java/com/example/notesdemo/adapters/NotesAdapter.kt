package com.example.notesdemo.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import com.example.notesdemo.R
import com.example.notesdemo.model.NotesModel
import com.google.android.material.card.MaterialCardView

class NotesAdapter(val notesList: ArrayList<NotesModel>, val context: Context) :
    RecyclerView.Adapter<NotesAdapter.NotesViewHolder>() {
    inner class NotesViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var notesTitle: TextView? = itemView.findViewById(R.id.tv_notes_title)
        var notesDesc: TextView? = itemView.findViewById(R.id.tv_notes_desc)
        var notesTimer: TextView? = itemView.findViewById(R.id.tv_remind_time)
        var card: MaterialCardView = itemView.findViewById(R.id.layout_main)


    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NotesViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.notes_tiles, parent, false)
        return NotesViewHolder(v)
    }

    override fun getItemCount(): Int {
        return notesList.size
    }

    override fun onBindViewHolder(holder: NotesViewHolder, position: Int) {
        if (notesList[position].title==null){
            holder.notesTitle?.visibility = View.GONE
        }
        if (notesList[position].desc==null){
            holder.notesDesc?.visibility = View.GONE
        }
        holder.notesTitle?.text = notesList[position].title
        holder.notesDesc?.text = notesList[position].desc
        holder.notesTimer?.text = notesList[position].time
        holder.card.setCardBackgroundColor(notesList[position].bgColor)
       }

}