package test.com.github.www.sls1005.htmlrealizer

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import com.google.android.gms.oss.licenses.OssLicensesMenuActivity

class InformationActivity: Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.information_activity)
        findViewById<Button>(R.id.button1).setOnClickListener {
            startActivity(
                Intent(this, OssLicensesMenuActivity::class.java).apply {
                    putExtra("title", getString(R.string.lic_title_1))
                }
            )
        }
    }
}