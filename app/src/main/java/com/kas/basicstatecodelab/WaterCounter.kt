package com.kas.basicstatecodelab

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview
@Composable
fun WaterCounter(modifier: Modifier = Modifier) {
    Column(modifier.padding(16.dp)) {
        var count by remember { mutableStateOf(0) }
        if (count > 0) {
            var showTask by remember { mutableStateOf(true) }

            if (showTask) {
                WellnessTaskItem(
                    taskName = "Wellness Task Item",
                    onClose = { showTask = false }
                )
            }
        }
        Text(
            text = "You've had $count glasses"
        )
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.padding(8.dp)
        ) {
            Button(
                onClick = { count++ },
                modifier = modifier.padding(8.dp),
                enabled = count < 10
            ) {
                Text(text = "Add one")
            }

            Button(onClick = { count = 0 }) {
                Text(text = "Clear water count")
            }
        }
    }
}