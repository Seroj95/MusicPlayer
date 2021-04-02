package picasso.ser.picasso.extensions

import android.content.Context
import picasso.ser.picasso.helpers.Config


val Context.config: Config get() = Config.newInstance(applicationContext)
