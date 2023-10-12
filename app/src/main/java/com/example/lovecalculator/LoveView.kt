package com.example.lovecalculator

import com.example.lovecalculator.model.LoveModel

interface LoveView {
    fun showResult(loveModel: LoveModel)
    var loveModel: LoveModel?
}