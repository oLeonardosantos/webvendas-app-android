package models.adapter

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import br.com.webvendas.CarDetailActivity
import br.com.webvendas.R
import models.Car

class CarAdapter (private val cars: List<Car>) : RecyclerView.Adapter<CarAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_car, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return cars.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val car = cars[position]
        holder.addItem(car)
    }

    class ViewHolder (item : View ) : RecyclerView.ViewHolder(item) {

        val image = item.findViewById<ImageView>(R.id.image)
        val descricao = item.findViewById<TextView>(R.id.description)
        val name = item.findViewById<TextView>(R.id.name)
        val price = item.findViewById<TextView>(R.id.price)
        val botom = item.findViewById<Button>(R.id.btnComprar)

        fun addItem(car : Car) {
            descricao.text = car.shortDescription
            image.setImageResource(car.foto)
            name.text = car.nomeCarro
            price.text = car.price

            botom.setOnClickListener {

                val intent = Intent(itemView.context, CarDetailActivity::class.java)
                intent.putExtra("ITEM_CAR", car)
                itemView.context.startActivity(intent)
            }
        }
    }
}