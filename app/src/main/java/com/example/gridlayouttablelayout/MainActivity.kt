package com.example.gridlayouttablelayout

import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.core.text.HtmlCompat
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity(), View.OnClickListener {
    private lateinit var toolbarMain: Toolbar
    private lateinit var inputET: EditText
    private lateinit var resultTV: TextView
    private lateinit var oneBTN: Button
    private lateinit var twoBTN: Button
    private lateinit var threeBTN: Button
    private lateinit var fourBTN: Button
    private lateinit var fiveBTN: Button
    private lateinit var sixBTN: Button
    private lateinit var sevenBTN: Button
    private lateinit var eightBTN: Button
    private lateinit var nineBTN: Button
    private lateinit var zeroBTN: Button
    private lateinit var divisionBTN: Button
    private lateinit var multiplicationBTN: Button
    private lateinit var differenceBTN: Button
    private lateinit var sumBTN: Button
    private lateinit var resultBTN: Button
    private lateinit var resetBTN: Button

    private val status = Status("", false, false, 0.0, 0.0, 0.0, false, "", "")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        toolbarMain = findViewById(R.id.toolbarMain)
        setSupportActionBar(toolbarMain)
        toolbarMain.title = resources.getString(R.string.app_name)

        inputET = findViewById(R.id.inputET)
        inputET.isEnabled = false
        resultTV = findViewById(R.id.resultTV)
        oneBTN = findViewById(R.id.oneBTN)
        oneBTN.setOnClickListener(this)
        twoBTN = findViewById(R.id.twoBTN)
        twoBTN.setOnClickListener(this)
        threeBTN = findViewById(R.id.threeBTN)
        threeBTN.setOnClickListener(this)
        fourBTN = findViewById(R.id.fourBTN)
        fourBTN.setOnClickListener(this)
        fiveBTN = findViewById(R.id.fiveBTN)
        fiveBTN.setOnClickListener(this)
        sixBTN = findViewById(R.id.sixBTN)
        sixBTN.setOnClickListener(this)
        sevenBTN = findViewById(R.id.sevenBTN)
        sevenBTN.setOnClickListener(this)
        eightBTN = findViewById(R.id.eightBTN)
        eightBTN.setOnClickListener(this)
        nineBTN = findViewById(R.id.nineBTN)
        nineBTN.setOnClickListener(this)
        zeroBTN = findViewById(R.id.zeroBTN)
        zeroBTN.setOnClickListener(this)
        divisionBTN = findViewById(R.id.divisionBTN)
        divisionBTN.setOnClickListener(this)
        multiplicationBTN = findViewById(R.id.multiplicationBTN)
        multiplicationBTN.setOnClickListener(this)
        differenceBTN = findViewById(R.id.differenceBTN)
        differenceBTN.setOnClickListener(this)
        sumBTN = findViewById(R.id.sumBTN)
        sumBTN.setOnClickListener(this)
        resultBTN = findViewById(R.id.resultBTN)
        resultBTN.setOnClickListener(this)
        resetBTN = findViewById(R.id.resetBTN)
        resetBTN.setOnClickListener(this)

    }

    override fun onClick(per: View?) {
        status.id = per?.tag.toString()
        actionClick(status, this)
        if (status.oper == "0") {
            resultTV.text = ""
            inputET.setText("")
        }
        inputET.setText(status.inputET)
        if (status.completed) resultTV.text = status.res.toString()
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.top_menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        finish()
        return super.onOptionsItemSelected(item)
    }
}

class Status(
    var id: String,
    var fOIS: Boolean,
    var sOIS: Boolean,
    var fo: Double,
    var so: Double,
    var res: Double,
    var completed: Boolean,
    var oper: String,
    var inputET: String
)
