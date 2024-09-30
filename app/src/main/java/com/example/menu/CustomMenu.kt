package com.example.menu

import android.content.Context
import android.view.View
import android.widget.Toast
import androidx.appcompat.widget.PopupMenu

class CustomMenu {

    fun showMenu(context: Context, view: View) {
        val pop = PopupMenu(context, view)
        pop.inflate(R.menu.menu_items)

        pop.setOnMenuItemClickListener { menuItem ->
            when (menuItem.itemId) {
                R.id.edit -> {
                    Toast.makeText(context, "Edit item", Toast.LENGTH_SHORT).show()
                    true
                }
                R.id.delete -> {
                    Toast.makeText(context, "Delete item", Toast.LENGTH_SHORT).show()
                    true
                }
                R.id.share -> {
                    Toast.makeText(context, "Share", Toast.LENGTH_SHORT).show()
                    true
                }
                else -> false
            }
        }

        // Show the popup menu
        pop.show()
    }
}
