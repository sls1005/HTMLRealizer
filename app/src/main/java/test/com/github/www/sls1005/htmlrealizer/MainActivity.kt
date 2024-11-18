package test.com.github.www.sls1005.htmlrealizer

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.text.Html
import android.view.Menu
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)
        findViewById<Button>(R.id.button1).setOnClickListener {
            val field1 = findViewById<EditText>(R.id.field1)
            val html = field1.text.toString()
            field1.text.apply {
                clear()
                append(Html.fromHtml(html, Html.FROM_HTML_MODE_COMPACT))
            }
        }
    }
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu1, menu)
        return true
    }
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return if (item.itemId == R.id.action1) {
            startActivity(Intent(this, InformationActivity::class.java))
            true
        } else {
            false
        }
    }
}
