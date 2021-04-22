package com.example.agentvalorant

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private lateinit var rvAgents: RecyclerView
    private var list: ArrayList<Agent> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        rvAgents = findViewById(R.id.rv_agent)
        rvAgents.setHasFixedSize(true)
        list.addAll(AgentData.listData)
        showRecyclerList()
    }
    private fun showRecyclerList() {
        rvAgents.layoutManager = LinearLayoutManager(this)
        val listAgentAdapter = ListAgentAdapter(list)
        rvAgents.adapter = listAgentAdapter
        listAgentAdapter.setOnItemClickCallback(object : ListAgentAdapter.OnItemClickCallback {
            override fun onItemClicked(data: Agent) {
                showSelectedHero(data)
            }
        })
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        setMode(item.itemId)
        return super.onOptionsItemSelected(item)
    }
    private fun setMode(selectedMode: Int) {
        when (selectedMode) {
            R.id.action_list -> {
                val moveIntent = Intent(this@MainActivity, about::class.java)
                startActivity(moveIntent)
            }
        }
    }
    private fun showSelectedHero(agent: Agent) {
//        Toast.makeText(this, "Kamu memilih " + agent.name, Toast.LENGTH_SHORT).show()
        var name : String = agent.name
        var role : String = agent.role
        var penjelasan : String = agent.penjelasan
        var image :Int = agent.photo

        val intent = Intent(this@MainActivity, DetailActivity::class.java)
        intent.putExtra("iname", name)
        intent.putExtra("role", role)
        intent.putExtra("penjelasan", penjelasan)
        intent.putExtra("image", image)
        this@MainActivity.startActivity(intent)
    }

}