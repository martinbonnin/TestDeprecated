package mbonnin.net.testdeprecated

import android.util.Log

class A {
    @Deprecated("use newfunction instead", replaceWith = ReplaceWith("newfunction()"))
    fun deprecated() {
        Log.d("", "A::deprecated")
    }

    fun newfunction() {
        Log.d("", "A::newfunction")
    }
}