package pcg.jetpack.horoscapp.ui.horoscope

import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import pcg.jetpack.horoscapp.domain.model.HoroscopeInfo
import pcg.jetpack.horoscapp.domain.model.HoroscopeInfo.*
import javax.inject.Inject

@HiltViewModel
class HoroscopeViewModel @Inject constructor(): ViewModel() {

    private var _horoscope = MutableStateFlow<List<HoroscopeInfo>>(emptyList())
    val horoscope:StateFlow<List<HoroscopeInfo>> = _horoscope


    init {
        _horoscope.value = listOf(
            Aries, Gemini, Pisces, Capricorn, Sagittarius
        )
    }

}