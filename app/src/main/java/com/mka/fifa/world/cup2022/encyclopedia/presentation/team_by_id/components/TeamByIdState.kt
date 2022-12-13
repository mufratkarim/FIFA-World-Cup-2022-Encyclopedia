package com.mka.fifa.world.cup2022.encyclopedia.presentation.team_by_id.components

import com.mka.fifa.world.cup2022.encyclopedia.data.remote.model.Matches
import com.mka.fifa.world.cup2022.encyclopedia.data.remote.model.TeamById

data class TeamByIdState(
    val isLoading: Boolean = false,
    val teamById: TeamById? = null,
    val error: String = ""
)