package com.example.aiassistant

import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

/**
 * النشاط الرئيسي للتطبيق البسيط "زمولي"
 * يحتوي فقط على زر واحد يعرض رسالة شكر
 */
class MainActivity : AppCompatActivity() {
    private lateinit var thankYouButton: Button
    
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        
        // تعريف الزر
        thankYouButton = findViewById(R.id.thankYouButton)
        
        // إضافة مستمع أحداث للزر
        thankYouButton.setOnClickListener {
            Toast.makeText(this, "شكراً لك!", Toast.LENGTH_SHORT).show()
        }
    }
}