package com.da.dageer

import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.ViewModel
import javax.inject.Named

class TestViewModel @ViewModelInject constructor(
        @Named("String2")testString: String
) :ViewModel(){
init {


}
}