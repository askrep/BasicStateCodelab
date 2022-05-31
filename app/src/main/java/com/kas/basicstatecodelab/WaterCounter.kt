package com.kas.basicstatecodelab

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview
@Composable
fun WaterCounter(modifier: Modifier = Modifier) {

    Column(modifier.padding(16.dp)) {
        val count: MutableState<Int> = remember { mutableStateOf(0) }

        Text(
            text = "You've had ${count.value} glasses",
            modifier = modifier.padding(16.dp)
        )
        Button(
            onClick = { count.value++ },
            modifier = modifier.padding(8.dp)
        ) {
            Text(text = "Add one")
        }
    }
}