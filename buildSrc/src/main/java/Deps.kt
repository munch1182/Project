@Suppress("unused")
object Version {
    const val compileSdk = 30

    const val misSdk = 23
    const val targetSdk = 23

    const val defaultVersionCode = 1
    const val defaultVersionName = "1.0"
}

@Suppress("unused")
object Deps {

    /*https://developer.android.google.cn/jetpack/androidx/versions?hl=zh_cn*/
    /*https://developer.android.google.cn/jetpack/androidx/releases/activity?hl=zh_cn*/
    const val appcompat = "androidx.appcompat:appcompat:1.3.0"

    /*https://developer.android.google.cn/jetpack/androidx/releases/core*/
    const val core_ktx = "androidx.core:core-ktx:1.6.0"

    // https://github.com/material-components/material-components-android
    // https://maven.google.com/web/index.html
    const val material = "com.google.android.material:material:1.4.0"

    // https://developer.android.google.cn/jetpack/androidx/releases/constraintlayout
    const val constraintLayout = "androidx.constraintlayout:constraintlayout:2.0.4"

    // https://developer.android.google.cn/jetpack/androidx/releases/cardview
    const val cardView = "androidx.cardview:cardview:1.0.0"

    // https://developer.android.google.cn/jetpack/androidx/releases/viewpager
    const val viewPager = "androidx.viewpager:viewpager:1.0.0"

    // https://developer.android.google.cn/jetpack/androidx/releases/viewpager2
    const val viewPager2 = "androidx.viewpager2:viewpager2:1.0.0"

    /*https://developer.android.google.cn/topic/libraries/app-startup*/
    const val startup = "androidx.startup:startup-runtime:1.0.0"

    /*https://developer.android.google.cn/topic/libraries/architecture/datastore*/
    const val dataStore = "androidx.datastore:datastore-preferences:1.0.0-rc01"

    /*https://developer.android.google.cn/jetpack/androidx/releases/swiperefreshlayout?hl=en*/
    const val swipeRefreshLayout = "androidx.swiperefreshlayout:swiperefreshlayout:1.1.0"

    /*https://developer.android.google.cn/jetpack/androidx/releases/lifecycle*/
    /*https://developer.android.google.cn/kotlin/ktx?hl=zh_cn#lifecycle*/
    private const val LIFECYCLE_VERSION = "2.4.0"
    const val viewModelKtx = "androidx.lifecycle:lifecycle-viewmodel-ktx:$LIFECYCLE_VERSION"
    const val liveDataKtx = "androidx.lifecycle:lifecycle-livedata-ktx:$LIFECYCLE_VERSION"

    /*https://developer.android.google.cn/topic/libraries/architecture/workmanager/basics*/
    /*https://developer.android.google.cn/kotlin/ktx?hl=zh_cn#workmanager*/
    private const val WORK_VERSION = "2.5.0"
    const val work = "androidx.work:work-runtime:$WORK_VERSION"
    const val workKtx = "androidx.work:work-runtime-ktx:$WORK_VERSION"
    const val workTest = "androidx.work:work-testing:$WORK_VERSION"

    /*https://developer.android.google.cn/jetpack/androidx/releases/room*/
    /*https://developer.android.google.cn/kotlin/ktx?hl=zh_cn#room*/
    private const val ROOM_VERSION = "2.3.0"
    const val room = "androidx.room:room-runtime:$ROOM_VERSION"
    const val roomCompiler = "androidx.room:room-compiler:$ROOM_VERSION"
    const val roomKtx = "androidx.room:room-ktx:$ROOM_VERSION"
    const val roomTest = "androidx.room:room-testing:$ROOM_VERSION"

    /*https://developer.android.google.cn/jetpack/androidx/releases/paging*/
    private const val PAGING_VERSION = "3.0.0"
    const val paging = "androidx.paging:paging-runtime:$PAGING_VERSION"
    const val pagingTest = "androidx.paging:paging-common:$PAGING_VERSION"

    /*https://github.com/bumptech/glide*/
    private const val GLIDE_VERSION = "4.12.0"
    const val glide = "com.github.bumptech.glide:glide:$GLIDE_VERSION"
    const val glideCompiler = "com.github.bumptech.glide:compiler:$GLIDE_VERSION"
    const val glideIntegration = "com.github.bumptech.glide:okhttp3-integration:$GLIDE_VERSION"

    /*https://github.com/square/okhttp*/
    /*https://github.com/square/okhttp/tree/master/okhttp-logging-interceptor*/
    private const val OKHTTP_VERSION = "4.9.1"
    const val okhttp = "com.squareup.okhttp3:okhttp:$OKHTTP_VERSION"
    const val okhttpInterceptor = "com.squareup.okhttp3:logging-interceptor:$OKHTTP_VERSION"

    /*https://github.com/square/leakcanary*/
    private const val LEAKCANARY_VERSION = "2.7"
    const val leakcanary = "com.squareup.leakcanary:leakcanary-android:$LEAKCANARY_VERSION"
    const val leakcanaryFragment =
        "com.squareup.leakcanary:leakcanary-support-fragment:$LEAKCANARY_VERSION"
    const val leakcanaryRelease =
        "com.squareup.leakcanary:leakcanary-android-no-op:$LEAKCANARY_VERSION"

    /*https://github.com/square/retrofit*/
    /*https://github.com/square/retrofit/tree/master/retrofit-converters/gson*/
    private const val RETROFIT_VERSION = "2.7"
    const val retrofit = "com.squareup.retrofit2:retrofit:$RETROFIT_VERSION"
    const val retrofitGson = "com.squareup.retrofit2:converter-gson:$RETROFIT_VERSION"

    /*https://github.com/google/gson*/
    const val gson = "com.google.code.gson:gson:2.8.6"

    /*https://dagger.dev/hilt/gradle-setup*/
    /*https://developer.android.google.cn/training/dependency-injection/hilt-android?hl=zh_cn*/
    /*https://developer.android.google.cn/jetpack/androidx/releases/hilt*/
    private const val HILT_CORE_VERSION = "2.38.1"
    private const val HILT_VERSION = "1.0.0"
    const val hilt = "com.google.dagger:hilt-android:$HILT_CORE_VERSION"
    const val hiltCompiler = "com.google.dagger:hilt-android-compiler:$HILT_CORE_VERSION"
    const val hiltGradle = "com.google.dagger:hilt-android-gradle-plugin:$HILT_CORE_VERSION"

    /*const val hiltViewModel = "androidx.hilt:hilt-lifecycle-viewmodel:$HILT_VERSION"
    const val hiltViewModelCompiler = "androidx.hilt:hilt-compiler:$HILT_VERSION"
    const val hiltWork = "androidx.hilt:hilt-work:$HILT_VERSION"*/

    /*https://github.com/guolindev/PermissionX*/
    const val permissionX = "com.permissionx.guolindev:permissionx:1.5.0"

    /*https://mvnrepository.com/artifact/com.google.zxing/core*/
    const val zxingCore = "com.google.zxing:core:3.4.1"

    /*https://github.com/promeG/TinyPinyin*/
    const val tinyPinyin = "com.github.promeg:tinypinyin:2.0.3"
    const val tinyPinyinDic = "com.github.promeg:tinypinyin-lexicons-android-cncity:2.0.3"

    /*https://github.com/alibaba/ARouter/tree/master*/
    const val aRouter = "com.alibaba:arouter-api:1.5.1"
    const val aRouterCompiler = "com.alibaba:arouter-compiler:1.5.1"
    const val aRouterRegister = "com.alibaba:arouter-register:1.0.2"

    /*https://github.com/Tencent/MMKV/blob/master/README_CN.md*/
    const val mmkv = "com.tencent:mmkv-static:1.2.10"
}