package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var number : String = "0"
    var pre_op : Char = ' '
    var pre_num : Int = 0
    var log : String = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        _1.setOnClickListener{
            if(number == "0"){
                number = "1"
            } else{
                number = number + "1"
            }
            result.text = number
        }
        _2.setOnClickListener{
            if(number == "0"){
                number = "2"
            } else{
                number = number + "2"
            }
            result.text = number
        }
        _3.setOnClickListener{
            if(number == "0"){
                number = "3"
            } else{
                number = number + "3"
            }
            result.text = number
        }
        _4.setOnClickListener{
            if(number == "0"){
                number = "4"
            } else{
                number = number + "4"
            }
            result.text = number
        }
        _5.setOnClickListener{
            if(number == "0"){
                number = "5"
            } else{
                number = number + "5"
            }
            result.text = number
        }
        _6.setOnClickListener{
            if(number == "0"){
                number = "6"
            } else{
                number = number + "6"
            }
            result.text = number
        }
        _7.setOnClickListener{
            if(number == "0"){
                number = "7"
            } else{
                number = number + "7"
            }
            result.text = number
        }
        _8.setOnClickListener{
            if(number == "0"){
                number = "8"
            } else{
                number = number + "8"
            }
            result.text = number
        }
        _9.setOnClickListener{
            if(number == "0"){
                number = "9"
            } else{
                number = number + "9"
            }
            result.text = number
        }
        _0.setOnClickListener{
            if(number == "0"){
                number = "0"
            } else{
                number = number + "0"
            }
            result.text = number
        }


        _CA.setOnClickListener{
            reset()
            result.text = number
            _log.text = log
        }
        _plus.setOnClickListener{
            pre_num = cal(pre_op,pre_num,number.toInt())
            pre_op = '+'
            log = log + number + pre_op
            result.text = pre_num.toString()
            _log.text = log
            number = "0"
        }
        _minus.setOnClickListener{
            pre_num = cal(pre_op,pre_num,number.toInt())
            pre_op = '-'
            log = log + number + pre_op
            result.text = pre_num.toString()
            _log.text = log
            number = "0"
        }
        _mul.setOnClickListener{
            pre_num = cal(pre_op,pre_num,number.toInt())
            pre_op = '*'
            log = log + number + pre_op
            result.text = pre_num.toString()
            _log.text = log
            number = "0"
        }
        _div.setOnClickListener{
            pre_num = cal(pre_op,pre_num,number.toInt())
            pre_op = '/'
            log = log + number + pre_op
            result.text = pre_num.toString()
            _log.text = log
            number = "0"
        }


        _result.setOnClickListener{
            pre_num = cal(pre_op,pre_num,number.toInt())
            result.text = pre_num.toString()
            log = log + number
            _log.text = log
            reset()
        }



    }

    fun cal(op : Char, pre : Int , now : Int) : Int{
        var result = 0
        try{
            when(op){
                '+'-> result = pre + now
                '-'-> result = pre - now
                '*'-> result = pre * now
                '/'-> result = pre / now
                else-> result = now
            }
            return result
        } catch(e:Exception){
            Toast.makeText(this,"0으로 나눌수 없습니다.",Toast.LENGTH_LONG).show()
            reset()
            return result
        }
    }

    fun reset(){
        number = "0"
        pre_op = ' '
        pre_num = 0
        log = ""
    }

}
