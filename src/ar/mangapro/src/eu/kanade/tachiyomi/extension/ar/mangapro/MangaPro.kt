package eu.kanade.tachiyomi.extension.ar.mangapro

import eu.kanade.tachiyomi.multisource.madara.Madara
import java.text.SimpleDateFormat
import java.util.Locale

class MangaPro : Madara(
    "Manga Pro",
    "https://prochan.net",
    "ar",
    SimpleDateFormat("MMMM d, yyyy", Locale("ar"))
)
