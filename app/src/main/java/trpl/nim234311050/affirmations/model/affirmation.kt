package trpl.nim234311050.affirmations.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import trpl.nim234311050.affirmations.R
import trpl.nim234311050.affirmations.model.Affirmation

data class Affirmation(
    @StringRes val stringResourceId: Int,
    @DrawableRes val imageResourceId: Int
)

class Datasource {
    fun loadAffirmations(): List<Affirmation> {
        return listOf(
            Affirmation(R.string.affirmation1, R.drawable.gambar1),
            Affirmation(R.string.affirmation2, R.drawable.gambar2),
            Affirmation(R.string.affirmation3, R.drawable.gambar3),
            Affirmation(R.string.affirmation4, R.drawable.gambar4),
            Affirmation(R.string.affirmation5, R.drawable.gambar5),
            Affirmation(R.string.affirmation6, R.drawable.gambar6),
            Affirmation(R.string.affirmation7, R.drawable.gambar7),
            Affirmation(R.string.affirmation8, R.drawable.gambar8),
            Affirmation(R.string.affirmation9, R.drawable.gambar9),
            Affirmation(R.string.affirmation10, R.drawable.gambar10)
        )
    }
}
