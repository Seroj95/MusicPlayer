package picasso.ser.picasso

import android.app.Application
import com.simplemobiletools.commons.extensions.checkUseEnglish


class App : Application() {
    override fun onCreate() {
        super.onCreate()
        checkUseEnglish()
    }
}
