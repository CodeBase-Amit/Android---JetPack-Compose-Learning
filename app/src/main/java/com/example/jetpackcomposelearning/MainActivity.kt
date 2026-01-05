package com.example.jetpackcomposelearning

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.jetpackcomposelearning.`11_Menus`.DropDownMenuExample
import com.example.jetpackcomposelearning.`22_DatePicker`.DatePickerExample
import com.example.jetpackcomposelearning.`23_TimePicker`.TimePickerExample
import com.example.jetpackcomposelearning.`24_BottomNavBar`.BottomNavigationBar
import com.example.jetpackcomposelearning.`2_FundamentalConcepts`.AccessStringResource
import com.example.jetpackcomposelearning.`2_FundamentalConcepts`.Greeting
import com.example.jetpackcomposelearning.`3_CoreComponents`.AnnotatedStringwithListenerSample
import com.example.jetpackcomposelearning.`3_CoreComponents`.FilledButtonSample
import com.example.jetpackcomposelearning.`3_CoreComponents`.PartiallySelectableText
import com.example.jetpackcomposelearning.`5_BottomSheet`.PartialBottomSheet
import com.example.jetpackcomposelearning.`7_CheckBox`.CheckBoxExample
import com.example.jetpackcomposelearning.ui.theme.JetpackComposeLearningTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            JetpackComposeLearningTheme {

//                PartiallySelectableText()
//                AnnotatedStringwithListenerSample()
//                FilledButtonSample()
//                PartialBottomSheet()
//                CheckBoxExample()
//                DropDownMenuExample()
//                DatePickerExample()
//                TimePickerExample()
                BottomNavigationBar()
            }
        }
    }
}
