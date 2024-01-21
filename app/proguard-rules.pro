# Add project specific ProGuard rules here.
# You can control the set of applied configuration files using the
# proguardFiles setting in build.gradle.
#
# For more details, see
#   http://developer.android.com/guide/developing/tools/proguard.html

# If your project uses WebView with JS, uncomment the following
# and specify the fully qualified class name to the JavaScript interface
# class:
#-keepclassmembers class fqcn.of.javascript.interface.for.webview {
#   public *;
#}

# Uncomment this to preserve the line number information for
# debugging stack traces.
#-keepattributes SourceFile,LineNumberTable

# If you keep the line number information, uncomment this to
# hide the original source file name.
#-renamesourcefileattribute SourceFile
# Add project specific ProGuard rules here.
# You can control the set of applied configuration files using the
# proguardFiles setting in build.gradle.
#
# For more details, see
#   http://developer.android.com/guide/developing/tools/proguard.html

# If your project uses WebView with JS, uncomment the following
# and specify the fully qualified class name to the JavaScript interface
# class:
#-keepclassmembers class fqcn.of.javascript.interface.for.webview {
#   public *;
#}

# Uncomment this to preserve the line number information for
# debugging stack traces.
#-keepattributes SourceFile,LineNumberTable

# If you keep the line number information, uncomment this to
# hide the original source file name.
#-renamesourcefileattribute SourceFile
#================== TokTokTok Proguard for Release 적용 코드 시작 ==================
-keepclasseswithmembers class ai.toktoktok.sdk.TokTokTok {
  public static *** init(***);
  public static *** setBottomMenuDialogVisible(***);
  public static *** setCustomFabIconResourceId(***);
  public static *** show(***);
  public static *** setToktoktokListener(***);
}

-keep interface ai.toktoktok.sdk.TokTokTok$TokTokTokListener{*;}

-keepclasseswithmembers class ai.toktoktok.sdk.LogUtils {
    public static *** d(***);
    public static *** i(***);
    public static *** w(***);
    public static *** e(java.lang.String);
    public static *** e(java.lang.String, java.lang.Exception);
    public static *** e(java.lang.String, java.lang.Throwable);
}
#================== TokTokTok Proguard for Release 적용 코드 끝 ==================