object Deps {
    val appCompat by lazy { "androidx.appcompat:appcompat:${Versions.APP_COMPAT}" }
    val kotlinCoreKTX by lazy { "androidx.core:core-ktx:${Versions.CORE}" }
    val lifeCycleRuntimeKTX by lazy { "androidx.lifecycle:lifecycle-runtime-ktx:${Versions.LIFE_CYCLE}" }
    val fragmentKTX by lazy { "androidx.fragment:fragment-ktx:${Versions.FRAGMENT_VERSION}" }
    val activityKTX by lazy { "androidx.activity:activity-ktx:${Versions.ACTIVITY_VERSION}" }
    val androidMaterial by lazy { "com.google.android.material:material:${Versions.ANDROID_MATERIAL}" }
    val navigationFragment by lazy { "androidx.navigation:navigation-fragment-ktx:${Versions.NAVIGATION_VERSION}" }
    val navigationUI by lazy { "androidx.navigation:navigation-ui-ktx:${Versions.NAVIGATION_VERSION}" }
    val constraintLayout by lazy { "androidx.constraintlayout:constraintlayout:${Versions.CONSTRAINT_LAYOUT}" }
    val lifeCycleViewModelKTX by lazy { "androidx.lifecycle:lifecycle-viewmodel-ktx:${Versions.ANDROID_LIFECYCLE}" }
    val hiltAndroid by lazy { "com.google.dagger:hilt-android:${Versions.HILT_VERSION}" }
    val hiltKotlinCompiler by lazy { "com.google.dagger:hilt-compiler:${Versions.HILT_VERSION}" }
    val hiltWork by lazy { "androidx.hilt:hilt-work:${Versions.HILT_WORK}" }
    val hiltCompiler by lazy { "androidx.hilt:hilt-compiler:${Versions.HILT_WORK}" }
    val coroutinesAndroid by lazy { "org.jetbrains.kotlinx:kotlinx-coroutines-android:${Versions.COROUTINES}" }
    val coroutinesCore by lazy { "org.jetbrains.kotlinx:kotlinx-coroutines-core:${Versions.COROUTINES}" }

    val roomRuntime by lazy { "androidx.room:room-runtime:${Versions.ROOM_DB}" }
    val roomPaging by lazy { "androidx.room:room-paging:${Versions.ROOM_DB}" }
    val roomCompiler by lazy { "androidx.room:room-compiler:${Versions.ROOM_DB}" }
    val timber by lazy { "com.jakewharton.timber:timber:${Versions.TIMBER}" }
    val gson by lazy { "com.google.code.gson:gson:${Versions.GSON}" }
    val msalAzure by lazy { "com.microsoft.identity.client:msal:${Versions.MSAL}" }
    val ssp by lazy { "com.intuit.ssp:ssp-android:${Versions.INTUIT_SDP_SSP}" }
    val sdp by lazy { "com.intuit.sdp:sdp-android:${Versions.INTUIT_SDP_SSP}" }

    val retrofit by lazy {"com.squareup.retrofit2:retrofit:${Versions.RETROFIT}"}
    val retrofitConverterGSON by lazy {"com.squareup.retrofit2:converter-gson:${Versions.RETROFIT}"}
    val okhttpLoggingInterceptor by lazy {"com.squareup.okhttp3:logging-interceptor:4.9.1"}
    val span by lazy {"me.gujun.android:span:${Versions.SPAN}"}
    val dexter by lazy {"com.karumi:dexter:${Versions.DEXTER}"}
    val workRuntimeKTX by lazy {"androidx.work:work-runtime-ktx:${Versions.WORK}"}
    val startupRuntime by lazy {"androidx.startup:startup-runtime:1.1.1"}
    val phoenix by lazy {"com.jakewharton:process-phoenix:2.1.2"}
    val lottie by lazy {"com.airbnb.android:lottie:3.4.0"}
    val coilCore by lazy {"io.coil-kt:coil:${Versions.COIL}"}
    val coilSVG by lazy {"io.coil-kt:coil-svg:${Versions.COIL}"}



    val mapBox by lazy {"com.mapbox.maps:android:${Versions.MAP_BOX}"}
    val googlePlayServices by lazy {"com.google.android.gms:play-services-location:${Versions.GOOGLE_PLAY_SERVICE}"}
    val mpAndroidChart by lazy {"com.github.PhilJay:MPAndroidChart:v3.1.0"}
    val utiCode by lazy {"com.blankj:utilcodex:1.31.0"}
    val glide by lazy {"com.github.bumptech.glide:glide:${Versions.GLIDE}"}
    val glideCompiler by lazy {"com.github.bumptech.glide:compiler:${Versions.GLIDE}"}
    val shimmer by lazy { "com.facebook.shimmer:shimmer:${Versions.SHIMMER}" }
    val swiperefreshlayout by lazy { "androidx.swiperefreshlayout:swiperefreshlayout:${Versions.SWIPE}" }


}