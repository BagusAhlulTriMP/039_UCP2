package com.example.exercise.ui.theme

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.example.exercise.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HalamanSatu(
    onSubmitBUttonClicked: (MutableList<String>) -> Unit,
    onCancelButtonClicked: () -> Unit,
) {
    var nama by rememberSaveable { mutableStateOf("") }
    var nim by remember { mutableStateOf("") }
    var konsen by remember { mutableStateOf("") }
    var judul by remember { mutableStateOf("") }
    var listData: MutableList<String> = mutableListOf(nama, nim, konsen, judul)

    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.fillMaxSize()
    ) {
        Text(text = "Formulir Skripsi")
        Column(
            modifier = Modifier.padding(20.dp)
        ) {
            OutlinedTextField(
                value = nama,
                onValueChange = { nama = it },
                label = {
                    Text(text = stringResource(id = R.string.nama))
                },
            )
            Spacer(modifier = Modifier.padding(15.dp))
            OutlinedTextField(
                value = nim, onValueChange = { nim = it },
                label = {
                    Text(
                        text = stringResource(
                            id = R.string.nim
                        )
                    )
                })
            Spacer(modifier = Modifier.padding(15.dp))
            OutlinedTextField(
                value = konsen, onValueChange = { konsen = it },
                label = {
                    Text(text = stringResource(id = R.string.konsen))
                })
            Spacer(modifier = Modifier.padding(2.dp))
            OutlinedTextField(
                value = judul, onValueChange = { judul = it },
                label = {
                    Text(text = stringResource(id = R.string.judul))
                })
            Spacer(modifier = Modifier.padding(2.dp))
        }
        Row(
            modifier = Modifier.fillMaxWidth()
                .padding(dimensionResource(R.dimen.padding_medium))
                .weight(1f, false),
            horizontalArrangement = Arrangement.spacedBy(dimensionResource(R.dimen.padding_medium)),
            verticalAlignment = Alignment.Bottom
        ) {
            ElevatedButton(
                modifier = Modifier.weight(1f),
                onClick = onCancelButtonClicked
            ) {}
        }
    }
}

