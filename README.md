# TripBook
This Android trip application is created for stroing places which user viseted. User can add a new palce or search it by city name or by place type (for example: "restorant","museum") or search it by country name.
In thia application author used Room database. 

Here is dependencies in build.gradle file for installing Room and other dependencies that the apllication needs:
dependencies {
    implementation fileTree(dir: 'libs', include: ['*.jar'])
    implementation "org.jetbrains.kotlin:kotlin-stdlib-jdk7:$kotlin_version"
    implementation 'androidx.appcompat:appcompat:1.1.0'
    implementation 'androidx.core:core-ktx:1.1.0'
    implementation 'com.google.android.material:material:1.0.0'
    implementation 'androidx.constraintlayout:constraintlayout:1.1.3'
    implementation 'androidx.legacy:legacy-support-v4:1.0.0'
    testImplementation 'junit:junit:4.12'
    androidTestImplementation 'androidx.test:runner:1.2.0'
    androidTestImplementation 'androidx.test.espresso:espresso-core:3.2.0'

// Room components
    implementation "androidx.room:room-runtime:$rootProject.roomVersion"
    implementation "androidx.room:room-ktx:$rootProject.roomVersion"
    kapt "androidx.room:room-compiler:$rootProject.roomVersion"
    androidTestImplementation "androidx.room:room-testing:$rootProject.roomVersion"

// Lifecycle components
    implementation "androidx.lifecycle:lifecycle-extensions:$rootProject.archLifecycleVersion"
    kapt "androidx.lifecycle:lifecycle-compiler:$rootProject.archLifecycleVersion"
    androidTestImplementation "androidx.arch.core:core-testing:$rootProject.androidxArchVersion"

// ViewModel Kotlin support
    implementation "androidx.lifecycle:lifecycle-viewmodel-ktx:$rootProject.archLifecycleVersion"

// Coroutines
    api "org.jetbrains.kotlinx:kotlinx-coroutines-android:$rootProject.coroutines"

// UI
    implementation "com.google.android.material:material:$rootProject.materialVersion"
// Testing
    androidTestImplementation "androidx.arch.core:core-testing:$rootProject.coreTestingVersion"
}
