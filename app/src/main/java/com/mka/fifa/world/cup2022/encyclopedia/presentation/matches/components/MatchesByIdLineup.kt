package com.mka.fifa.world.cup2022.encyclopedia.presentation.matches.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Divider
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import coil.compose.rememberAsyncImagePainter
import com.mka.fifa.world.cup2022.encyclopedia.R
import com.mka.fifa.world.cup2022.encyclopedia.data.remote.dto.matches_dto.StartingEleven
import com.mka.fifa.world.cup2022.encyclopedia.presentation.matches.viewmodel.MatchesByIdViewModel

@Composable
fun MatchesByIdLineup(
    viewModel: MatchesByIdViewModel = hiltViewModel()
) {
    Image(
        painter = painterResource(id = R.drawable.matches),
        contentDescription = "Matches Image",
        modifier = Modifier
            .fillMaxHeight()
            .fillMaxWidth(),
        contentScale = ContentScale.Crop
    )

    val state = viewModel.state.value
    state.matches?.let { match ->
        Column(
            modifier = Modifier
                .fillMaxHeight()
                .fillMaxWidth(),
        ) {
            Row(
                modifier = Modifier
                    .fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(
                    text = "Team",
                    color = Color.White,
                    modifier = Modifier
                        .fillMaxWidth(0.33f)
                        .background(Color.DarkGray.copy(alpha = 0.6f))
                        .padding(bottom = 6.dp),
                    textAlign = TextAlign.Center,
                    fontFamily = FontFamily.Serif,
                    fontWeight = FontWeight.Bold,
                    style = MaterialTheme.typography.h6,
                    textDecoration = TextDecoration.Underline
                )

                Text(
                    text = "Goals",
                    color = Color.White,
                    modifier = Modifier
                        .fillMaxWidth(0.50f)
                        .background(Color.DarkGray.copy(alpha = 0.6f))
                        .padding(bottom = 6.dp),
                    textAlign = TextAlign.Center,
                    fontFamily = FontFamily.Serif,
                    fontWeight = FontWeight.Bold,
                    style = MaterialTheme.typography.h6,
                    textDecoration = TextDecoration.Underline
                )

                Text(
                    text = "Formation",
                    color = Color.White,
                    modifier = Modifier
                        .fillMaxWidth()
                        .background(Color.DarkGray.copy(alpha = 0.6f))
                        .padding(bottom = 6.dp),
                    textAlign = TextAlign.Center,
                    fontFamily = FontFamily.Serif,
                    fontWeight = FontWeight.Bold,
                    style = MaterialTheme.typography.h6,
                    textDecoration = TextDecoration.Underline
                )
            }
            Row(
                modifier = Modifier
                    .fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(
                    text = "H: ${match.home_team.name}",
                    color = Color.White,
                    modifier = Modifier
                        .fillMaxWidth(0.33f)
                        .background(Color.DarkGray.copy(alpha = 0.6f))
                        .padding(bottom = 6.dp),
                    textAlign = TextAlign.Center,
                    fontFamily = FontFamily.Serif
                )

                Text(
                    text = " ${match.home_team.goals} ",
                    color = Color.White,
                    modifier = Modifier
                        .fillMaxWidth(0.50f)
                        .background(Color.DarkGray.copy(alpha = 0.6f))
                        .padding(bottom = 6.dp),
                    textAlign = TextAlign.Center,
                    fontFamily = FontFamily.Serif,
                    fontWeight = FontWeight.Normal,
                    style = MaterialTheme.typography.h6
                )

                Text(
                    text = " ${match.home_team_lineup.tactics} ",
                    color = Color.White,
                    modifier = Modifier
                        .fillMaxWidth()
                        .background(Color.DarkGray.copy(alpha = 0.6f))
                        .padding(bottom = 6.dp),
                    textAlign = TextAlign.Center,
                    fontFamily = FontFamily.Serif,
                    fontWeight = FontWeight.Bold,
                    style = MaterialTheme.typography.h6
                )
            }

            Row(
                modifier = Modifier
                    .fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(
                    text = "A: ${match.away_team.name}",
                    color = Color.White,
                    modifier = Modifier
                        .fillMaxWidth(0.33f)
                        .background(Color.DarkGray.copy(alpha = 0.6f))
                        .padding(bottom = 6.dp),
                    textAlign = TextAlign.Center,
                    fontFamily = FontFamily.Serif
                )

                Text(
                    text = " ${match.away_team.goals} ",
                    color = Color.White,
                    modifier = Modifier
                        .fillMaxWidth(0.50f)
                        .background(Color.DarkGray.copy(alpha = 0.6f))
                        .padding(bottom = 6.dp),
                    textAlign = TextAlign.Center,
                    fontFamily = FontFamily.Serif,
                    fontWeight = FontWeight.Normal,
                    style = MaterialTheme.typography.h6
                )

                Text(
                    text = " ${match.away_team_lineup.tactics} ",
                    color = Color.White,
                    modifier = Modifier
                        .fillMaxWidth()
                        .background(Color.DarkGray.copy(alpha = 0.6f))
                        .padding(bottom = 6.dp),
                    textAlign = TextAlign.Center,
                    fontFamily = FontFamily.Serif,
                    fontWeight = FontWeight.Bold,
                    style = MaterialTheme.typography.h6
                )
            }

            Divider(color = Color.LightGray)
            LazyColumn(
                modifier = Modifier
                    .fillMaxWidth()
                    .fillMaxHeight(),
                contentPadding = PaddingValues(6.dp)
            ) {
                item {
                    Column {
                        Text(
                            text = "${match.home_team.name} Squad", modifier = Modifier
                                .fillMaxWidth()
                                .background(Color.DarkGray.copy(alpha = 0.6f))
                                .padding(bottom = 12.dp),
                            textAlign = TextAlign.Center,
                            fontFamily = FontFamily.Serif,
                            style = MaterialTheme.typography.h5,
                            textDecoration = TextDecoration.Underline,
                            fontWeight = FontWeight.Bold,
                            color = Color.White
                        )
                    }
                }
                item {
                    Row(
                        modifier = Modifier
                            .fillMaxWidth(),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Text(
                            text = "Shirt",
                            color = Color.White,
                            modifier = Modifier
                                .fillMaxWidth(0.33f)
                                .background(Color.DarkGray.copy(alpha = 0.6f))
                                .padding(bottom = 12.dp, start = 6.dp),
                            textAlign = TextAlign.Start,
                            fontFamily = FontFamily.Serif,
                            fontWeight = FontWeight.Bold,
                            style = MaterialTheme.typography.h6,
                            textDecoration = TextDecoration.Underline
                        )
                        Text(
                            text = "Player",
                            color = Color.White,
                            modifier = Modifier
                                .fillMaxWidth(0.55f)
                                .background(Color.DarkGray.copy(alpha = 0.6f))
                                .padding(bottom = 12.dp, start = 6.dp),
                            textAlign = TextAlign.Start,
                            fontFamily = FontFamily.Serif,
                            fontWeight = FontWeight.Bold,
                            style = MaterialTheme.typography.h6,
                            textDecoration = TextDecoration.Underline
                        )

                        Text(
                            text = "Position",
                            color = Color.White,
                            modifier = Modifier
                                .fillMaxWidth(1f)
                                .background(Color.DarkGray.copy(alpha = 0.6f))
                                .padding(bottom = 12.dp),
                            textAlign = TextAlign.Center,
                            fontFamily = FontFamily.Serif,
                            fontWeight = FontWeight.Bold,
                            style = MaterialTheme.typography.h6,
                            textDecoration = TextDecoration.Underline
                        )
                    }
                }

                items(match.home_team_lineup.starting_eleven) { player ->
                    Row {
                        Text(
                            text = "${player.shirt_number}.",
                            modifier = Modifier
                                .fillMaxWidth(0.15f)
                                .background(Color.DarkGray.copy(alpha = 0.6f))
                                .padding(bottom = 6.dp),
                            textAlign = TextAlign.Center,
                            fontFamily = FontFamily.Serif,
                            color = Color.White
                        )
                        Text(
                            text = player.name, modifier = Modifier
                                .fillMaxWidth(0.60f)
                                .background(Color.DarkGray.copy(alpha = 0.6f))
                                .padding(bottom = 6.dp),
                            textAlign = TextAlign.Center,
                            fontFamily = FontFamily.Serif,
                            color = Color.White
                        )
                        Text(
                            text = player.position, modifier = Modifier
                                .fillMaxWidth()
                                .background(Color.DarkGray.copy(alpha = 0.6f))
                                .padding(bottom = 6.dp),
                            textAlign = TextAlign.Center,
                            fontFamily = FontFamily.Serif,
                            color = Color.White
                        )
                    }
                }

                item {
                    Divider(color = Color.LightGray)
                    Column {
                        Text(
                            text = "${match.home_team.name}'s In-game Events", modifier = Modifier
                                .fillMaxWidth()
                                .background(Color.DarkGray.copy(alpha = 0.6f))
                                .padding(bottom = 12.dp, top = 12.dp),
                            textAlign = TextAlign.Center,
                            fontFamily = FontFamily.Serif,
                            style = MaterialTheme.typography.h5,
                            textDecoration = TextDecoration.Underline,
                            fontWeight = FontWeight.Bold,
                            color = Color.White
                        )
                    }
                }

                item {
                    Row {
                        Text(
                            text = "Action",
                            color = Color.White,
                            modifier = Modifier
                                .fillMaxWidth(0.33f)
                                .background(Color.DarkGray.copy(alpha = 0.6f))
                                .padding(bottom = 12.dp, start = 6.dp),
                            textAlign = TextAlign.Start,
                            fontFamily = FontFamily.Serif,
                            fontWeight = FontWeight.Bold,
                            style = MaterialTheme.typography.h6,
                            textDecoration = TextDecoration.Underline
                        )
                        Text(
                            text = "Player",
                            color = Color.White,
                            modifier = Modifier
                                .fillMaxWidth(0.55f)
                                .background(Color.DarkGray.copy(alpha = 0.6f))
                                .padding(bottom = 12.dp, start = 6.dp),
                            textAlign = TextAlign.Start,
                            fontFamily = FontFamily.Serif,
                            fontWeight = FontWeight.Bold,
                            style = MaterialTheme.typography.h6,
                            textDecoration = TextDecoration.Underline
                        )
                        Text(
                            text = "Time",
                            color = Color.White,
                            modifier = Modifier
                                .fillMaxWidth(1f)
                                .background(Color.DarkGray.copy(alpha = 0.6f))
                                .padding(bottom = 12.dp),
                            textAlign = TextAlign.Center,
                            fontFamily = FontFamily.Serif,
                            fontWeight = FontWeight.Bold,
                            style = MaterialTheme.typography.h6,
                            textDecoration = TextDecoration.Underline
                        )
                    }
                }

                items(match.home_team_events) { player ->
                    Row {
                        Text(
                            text = player.type_of_event,
                            modifier = Modifier
                                .fillMaxWidth(0.35f)
                                .background(Color.DarkGray.copy(alpha = 0.6f))
                                .padding(bottom = 6.dp),
                            textAlign = TextAlign.Start,
                            fontFamily = FontFamily.Serif,
                            color = Color.White
                        )
                        Text(
                            text = player.player, modifier = Modifier
                                .fillMaxWidth(0.60f)
                                .background(Color.DarkGray.copy(alpha = 0.6f))
                                .padding(bottom = 6.dp),
                            textAlign = TextAlign.Start,
                            fontFamily = FontFamily.Serif,
                            color = Color.White
                        )
                        Text(
                            text = player.time, modifier = Modifier
                                .fillMaxWidth()
                                .background(Color.DarkGray.copy(alpha = 0.6f))
                                .padding(bottom = 6.dp),
                            textAlign = TextAlign.Center,
                            fontFamily = FontFamily.Serif,
                            color = Color.White
                        )
                    }
                }


                item {
                    Column {
                        Text(
                            text = "${match.away_team.name} Squad", modifier = Modifier
                                .fillMaxWidth()
                                .background(Color.DarkGray.copy(alpha = 0.6f))
                                .padding(bottom = 12.dp, top = 12.dp),
                            textAlign = TextAlign.Center,
                            fontFamily = FontFamily.Serif,
                            style = MaterialTheme.typography.h5,
                            textDecoration = TextDecoration.Underline,
                            fontWeight = FontWeight.Bold,
                            color = Color.White
                        )
                    }
                }

                item {
                    Row(
                        modifier = Modifier
                            .fillMaxWidth(),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Text(
                            text = "Shirt",
                            color = Color.White,
                            modifier = Modifier
                                .fillMaxWidth(0.33f)
                                .background(Color.DarkGray.copy(alpha = 0.6f))
                                .padding(bottom = 12.dp, start = 6.dp),
                            textAlign = TextAlign.Start,
                            fontFamily = FontFamily.Serif,
                            fontWeight = FontWeight.Bold,
                            style = MaterialTheme.typography.h6,
                            textDecoration = TextDecoration.Underline
                        )
                        Text(
                            text = "Player",
                            color = Color.White,
                            modifier = Modifier
                                .fillMaxWidth(0.55f)
                                .background(Color.DarkGray.copy(alpha = 0.6f))
                                .padding(bottom = 12.dp, start = 6.dp),
                            textAlign = TextAlign.Start,
                            fontFamily = FontFamily.Serif,
                            fontWeight = FontWeight.Bold,
                            style = MaterialTheme.typography.h6,
                            textDecoration = TextDecoration.Underline
                        )

                        Text(
                            text = "Position",
                            color = Color.White,
                            modifier = Modifier
                                .fillMaxWidth(1f)
                                .background(Color.DarkGray.copy(alpha = 0.6f))
                                .padding(bottom = 12.dp),
                            textAlign = TextAlign.Center,
                            fontFamily = FontFamily.Serif,
                            fontWeight = FontWeight.Bold,
                            style = MaterialTheme.typography.h6,
                            textDecoration = TextDecoration.Underline
                        )
                    }
                }
                items(match.away_team_lineup.starting_eleven) { player ->
                    Row {
                        Text(
                            text = "${player.shirt_number}.",
                            modifier = Modifier
                                .fillMaxWidth(0.15f)
                                .background(Color.DarkGray.copy(alpha = 0.6f))
                                .padding(bottom = 6.dp),
                            textAlign = TextAlign.Center,
                            fontFamily = FontFamily.Serif,
                            color = Color.White
                        )
                        Text(
                            text = player.name, modifier = Modifier
                                .fillMaxWidth(0.60f)
                                .background(Color.DarkGray.copy(alpha = 0.6f))
                                .padding(bottom = 6.dp),
                            textAlign = TextAlign.Center,
                            fontFamily = FontFamily.Serif,
                            color = Color.White
                        )
                        Text(
                            text = player.position, modifier = Modifier
                                .fillMaxWidth()
                                .background(Color.DarkGray.copy(alpha = 0.6f))
                                .padding(bottom = 6.dp),
                            textAlign = TextAlign.Center,
                            fontFamily = FontFamily.Serif,
                            color = Color.White
                        )
                    }
                }

                item {
                    Divider(color = Color.LightGray)
                    Column {
                        Text(
                            text = "${match.away_team.name}'s In-game Events", modifier = Modifier
                                .fillMaxWidth()
                                .background(Color.DarkGray.copy(alpha = 0.6f))
                                .padding(bottom = 12.dp, top = 12.dp),
                            textAlign = TextAlign.Center,
                            fontFamily = FontFamily.Serif,
                            style = MaterialTheme.typography.h5,
                            textDecoration = TextDecoration.Underline,
                            fontWeight = FontWeight.Bold,
                            color = Color.White
                        )
                    }
                }

                item {
                    Row {
                        Text(
                            text = "Action",
                            color = Color.White,
                            modifier = Modifier
                                .fillMaxWidth(0.33f)
                                .background(Color.DarkGray.copy(alpha = 0.6f))
                                .padding(bottom = 12.dp, start = 6.dp),
                            textAlign = TextAlign.Start,
                            fontFamily = FontFamily.Serif,
                            fontWeight = FontWeight.Bold,
                            style = MaterialTheme.typography.h6,
                            textDecoration = TextDecoration.Underline
                        )
                        Text(
                            text = "Player",
                            color = Color.White,
                            modifier = Modifier
                                .fillMaxWidth(0.55f)
                                .background(Color.DarkGray.copy(alpha = 0.6f))
                                .padding(bottom = 12.dp, start = 6.dp),
                            textAlign = TextAlign.Start,
                            fontFamily = FontFamily.Serif,
                            fontWeight = FontWeight.Bold,
                            style = MaterialTheme.typography.h6,
                            textDecoration = TextDecoration.Underline
                        )
                        Text(
                            text = "Time",
                            color = Color.White,
                            modifier = Modifier
                                .fillMaxWidth(1f)
                                .background(Color.DarkGray.copy(alpha = 0.6f))
                                .padding(bottom = 12.dp),
                            textAlign = TextAlign.Center,
                            fontFamily = FontFamily.Serif,
                            fontWeight = FontWeight.Bold,
                            style = MaterialTheme.typography.h6,
                            textDecoration = TextDecoration.Underline
                        )
                    }
                }

                items(match.away_team_events) { player ->
                    Row {
                        Text(
                            text = player.type_of_event,
                            modifier = Modifier
                                .fillMaxWidth(0.35f)
                                .background(Color.DarkGray.copy(alpha = 0.6f))
                                .padding(bottom = 6.dp),
                            textAlign = TextAlign.Start,
                            fontFamily = FontFamily.Serif,
                            color = Color.White
                        )
                        Text(
                            text = player.player, modifier = Modifier
                                .fillMaxWidth(0.60f)
                                .background(Color.DarkGray.copy(alpha = 0.6f))
                                .padding(bottom = 6.dp),
                            textAlign = TextAlign.Start,
                            fontFamily = FontFamily.Serif,
                            color = Color.White
                        )
                        Text(
                            text = player.time, modifier = Modifier
                                .fillMaxWidth()
                                .background(Color.DarkGray.copy(alpha = 0.6f))
                                .padding(bottom = 6.dp),
                            textAlign = TextAlign.Center,
                            fontFamily = FontFamily.Serif,
                            color = Color.White
                        )
                    }
                }
            }

        }
    }

}