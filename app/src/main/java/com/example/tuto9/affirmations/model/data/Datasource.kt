package com.example.tuto9.affirmations.model.data
import com.example.tuto9.R
import com.example.tuto9.affirmations.model.Affirmation

class Datasource {
    fun loadAffirmations(): List<Affirmation> {
        return listOf(
            Affirmation(R.string.affirmation1, R.drawable.image1),
            Affirmation(R.string.affirmation2, R.drawable.image2),
        )
    }
}
