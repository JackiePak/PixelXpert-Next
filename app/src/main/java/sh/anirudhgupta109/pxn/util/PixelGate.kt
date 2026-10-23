package sh.anirudhgupta109.pxn.util

/**
 * Device-model gate — disabled in this build.
 *
 * The upstream implementation refused to start unless a `TipsPrebuilt*` APK
 * was visible under one of the read-only priv-app partitions, i.e. unless the
 * device ran an original Pixel ROM. That test is what limited the app to Pixel
 * hardware, so it has been removed here: the evaluator now reports "pass"
 * unconditionally and the app starts on any rooted device.
 *
 * The root check and the root-service check in SplashActivity are untouched —
 * they are functional requirements (the app needs a root shell), not a
 * device-model restriction.
 */
object PixelGate {

	/**
	 * Kept so `SplashActivity` needs no change: the splash still runs this off
	 * the main thread and still consumes the nullable reason.
	 *
	 * @return always null, meaning "device accepted".
	 */
	fun evaluate(): String? = null
}
