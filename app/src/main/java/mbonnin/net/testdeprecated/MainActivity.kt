package mbonnin.net.testdeprecated

import android.os.Bundle
import android.support.v7.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val v1 = A()
        v1.deprecated()

        val v2 = B()
        v2.deprecated()

        val v3 = A()
        v3.deprecated()
    }
}
