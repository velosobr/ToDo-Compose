package com.velosobr.myapplication.data.models


import androidx.compose.ui.graphics.Color
import com.velosobr.myapplication.ui.theme.HighPriorityColor
import com.velosobr.myapplication.ui.theme.LowPriorityColor
import com.velosobr.myapplication.ui.theme.MediumPriorityColor
import com.velosobr.myapplication.ui.theme.NonePriorityColor

enum class Priority(val color: Color) {
    HIGH(HighPriorityColor),
    MEDIUM(MediumPriorityColor),
    LOW(LowPriorityColor),
    NONE(NonePriorityColor),
}