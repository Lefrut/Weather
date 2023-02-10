object Libraries {

    object Android {

        object Versions {
            const val coreKtx = "1.9.0"
            const val appcompat = "1.6.1"
            const val material = "1.8.0"
            const val constraintLayout = "2.1.4"
        }

        const val coreKtx = "androidx.core:core-ktx:${Versions.coreKtx}"
        const val appCompat = "androidx.appcompat:appcompat:${Versions.appcompat}"
        const val material = "com.google.android.material:material:${Versions.material}"
        const val constraintLayout =
            "androidx.constraintlayout:constraintlayout:${Versions.constraintLayout}"


    }

    object Other {

    }


    object Tests {


        object Versions {
            const val junit = "4.13.2"
            const val androidJunit = "1.1.5"
            const val espresso = "3.5.1"

        }

        const val junit = "junit:junit:${Versions.junit}"
        const val androidJunit = "androidx.test.ext:junit:${Versions.junit}"
        const val espresso = "androidx.test.espresso:espresso-core:${Versions.junit}"


    }

}