- Install on PC 'platform-tools'
- Install on Smarthpone 'App Inspector'
- Enable developer mode
  - Ajustes
  - Acerca del teléfono
  - Número de compilación
  - Press n times until 'Developer model' is enabled
  - Ajustes / Acerca del teléfono / Opciones del desarrollador / Enable
  - Depuración del USB / Enable

Open 'App Inspector'
- Click 'Google Play Películas'
- Package name
com.google.android.videos
com.android.email
com.google.android.apps.tachyon

Run 'platform-tools'
cd C:\Users\~\platform-tools
adb devices
adb shell
- Clic ok on confirm dialog in the Smarthpone
pm list packages | grep u

package:com.google.android.youtube
package:com.google.android.googlequicksearchbox
package:com.mediatek.fwk.plugin
package:com.android.documentsui
package:com.gcuv.eula
package:com.android.partnerbrowsercustomizations.example
package:com.google.android.configupdater
package:arima.com.hiddenmenu
package:com.android.soundrecorder
package:com.android.providers.downloads.ui
package:com.android.launcher3
package:com.android.backupconfirm
package:com.mediatek.bluetooth.dtt
package:com.google.android.instantapps.supervisor
package:com.google.android.setupwizard
package:com.android.sharedstoragebackup
package:com.google.android.music
package:com.android.inputdevices
package:com.lge.gcuv
package:com.android.calllogbackup
package:com.google.android.partnersetup
package:com.bbva.nxt_peru
package:com.google.android.inputmethod.korean
package:com.google.android.backuptransport
package:com.cleanmaster.mguard
package:com.android.calculator2
package:com.mediatek.lbs.em2.ui
package:com.itsoninc.android.uid
package:com.android.providers.userdictionary
package:com.android.location.fused
package:com.android.systemui
package:com.android.bluetoothmidiservice
package:com.android.bluetooth
package:com.google.android.inputmethod.latin
shell@mlv3:/ $

pm uninstall -k --user 0 'com.google.android.music'
pm uninstall -k --user 0 'com.google.android.youtube'
pm uninstall -k --user 0 'com.google.android.videos'
pm uninstall -k --user 0 'com.android.email'
pm uninstall -k --user 0 'com.google.android.apps.tachyon'
pm uninstall -k --user 0 'com.gameloft.android.gdc'

exit
