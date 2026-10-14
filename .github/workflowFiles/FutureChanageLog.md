NOTE: On flashing the module, a new app will be installed and the old app will be removed, you will have to grant root for it and apply it in lsposed/vector. More details on XDA/TG
i would recommend not restoring your profile into the app since this is a newly built app from the groundup and preferences might not carry over cleanly
- Bringup the new PixelXpert-Next app (a full rewrite and bringup in kotlin (including the lsposed backend) + jetpack compose + Material 3 Expressive (respects your system's colours))
- Fix UI glitches when "Close quick settings with one swipe" is enabled
- Fix custom statusbar icon visibility (volte/vowifi)
[As a reminder: Google has still not giving the new SystemUI changes to the P11, so I still can't fix the issues introduced in the September/October build]
