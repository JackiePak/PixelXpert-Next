**6.1.0**  
NOTE: On flashing the module, a new app will be installed and the old app will be removed, you will have to grant root for it and apply it in lsposed/vector. More details on XDA/TG
i would recommend not restoring your profile into the app since this is a newly built app from the groundup and preferences might not carry over cleanly
- Bringup the new PixelXpert-Next app (a full rewrite and bringup in kotlin (including the lsposed backend) + jetpack compose + Material 3 Expressive (respects your system's colours))
- Fix UI glitches when "Close quick settings with one swipe" is enabled
- Fix custom statusbar icon visibility (volte/vowifi)
[As a reminder: Google has still not given the new SystemUI changes to the P11, so I still can't fix the issues introduced in the September/October build]

**6.0.9**  
- Add high brightness flash QS tile and allow for gestures to utilize this high brightness mode
- Fix multiple hooks into carrier text causing a memory leak
- Add bottom brightness slider and persistent brightness slider in collapsed quick settings [thanks to DrDisagree for the patches!]

**6.0.8**  
- Switch PX-N from a system priv-app to a user app
- Add caffeine QS tile

**6.0.7**  
- Optimize Magisk install scripts and remove unnecessary files/functions for KSU/APatch
- Fix shuffle pin for compose keyguard (the one on android betas and the new September Stable)
- Use the inbuilt easy unlock for all pin lengths (system one restricts it for only >=6 digits)

**6.0.6**  
- Fix hiding statusbar icons (NOTE: some icons are now in jetpack compose and can not be hidden)
- Fix Quick QS Panel pulldown gesture
- Fix notification default expansion

**6.0.5**  
- Fix Network Traffic not working on mid-right location for A17 September Stable

**6.0.4**  
- Add back missing leading 0 in 24 hour clock (i seriously don't know why Google removed it)
- Add back support for custom text variables in QPR clock (jetpack compose clock)
- Fix network traffic disappearing occasionally
- Fix carrier label on lockscreen on QPR2 Beta 5
- Fix charging statistics on lockscreen for QPR2 Beta 5
- Fix expand/collapse notifications

**6.0.3**  
- Allow to pin a port for wireless debugging (adb) - still adheres to the secure latest TLS standard
- Fix clock repositioning on Android 17 (center clock works too!)
- Add option to move clock to second row when multi row notifications are enabled
- New icon! (inspired by KSU-Next for obvious reasons)
- Fix some log spam

**6.0.2**  
- Fix Pixel Build Number compatibility filter
- Fix immediate lock on double tap to sleep anywhere

**6.0.1**  
- Add Magisk support
- Ensure LSPosed hooks to SystemUI

**6.0.0**  
- Its PixelXpert-Next time!
- Support now for Android 17QPR1
- Resolve Android 17QPR1 background camera restrictions + power button detection  
- xposed: Rectify scope list for Android system  
- RecordingMessage: Suppress call-{recording,notes} TTS  
- Fix lockscreen double tap to sleep gesture support
