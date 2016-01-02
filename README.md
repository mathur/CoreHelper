# Helper

Android micro-library that makes the development process easier by consolidating a couple commonly-written code snippets in library form.

## How To Use
[![Release](https://img.shields.io/badge/jitpack-v0.1.0-blue.svg)](https://jitpack.io/#mathur/helper)

In your app's `build.gradle` file:

```Gradle
dependencies {
    compile 'com.rmathur.helper:corehelper:0.1.0'
}
```
___

## Current Features

#### toastShortAndLog
    Displays a short toast and logs a message to console as an error for easy debugging

#### toastLongAndLog
    Displays a long toast and logs a message to console as an error for easy debugging

#### vibrate
    Vibrates the device for 500ms

#### keepScreenAwake
    Set the screen to stay awake for the current Activity