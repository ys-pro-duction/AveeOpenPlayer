## Phase 0 — Inventory & Diffing Checklist

### 1. File Mapping Table (Decompiled `com.daaw.avee` -> Base `com.aveeopen`)

**Identical or Modified Files (To be merged):**
- `CustomViewPager.java` -> `CustomViewPager.java`
- `MainActivity.java` -> `MainActivity.java`
- `SettingsActivity.java` -> `SettingsActivity.java`
- `Common/ListPreferenceCompat.java` -> `Common/ListPreferenceCompat.java`
- `Common/VerticalSeekBar.java` -> `Common/VerticalSeekBar.java`
- `comp/Visualizer/VisualizerViewCore.java` -> `comp/Visualizer/VisualizerViewCore.java`
- `comp/playback/MediaButtonEventReceiver.java` -> `comp/playback/MediaButtonEventReceiver.java`
- `comp/playback/MediaPlaybackService.java` -> `comp/playback/MediaPlaybackService.java`
- `comp/playback/view/MediaAppWidgetProvider.java` -> `comp/playback/view/MediaAppWidgetProvider.java`

**New Features (To be added / ported):**
- `Common/ListPreferenceLanguage.java`
- `CustomRelativeLayout.java`
- `MainApp.java` (Application class)
- `MediaControlsView.java`
- `SplashActivity.java`
- `comp/LibraryQueueUI/MyView.java`
- `comp/Common/View/InfiniteSeekBar.java`
- `comp/Common/View/MyAlphaSlider.java`
- `comp/Common/View/MyColorPickerView.java`
- `comp/Common/View/MyLightnessSlider.java`
- `comp/Common/PrControls/PrButton.java`
- `comp/Common/PrControls/PrCheckBox.java`
- `comp/Common/PrControls/PrEditText.java`
- `comp/Common/PrControls/PrGreenCheckBox.java`
- `comp/Common/PrControls/PrImageButton.java`

**Obfuscated Files (Need investigation):**
- `a.java`
- `comp/playback/a.java`
- `comp/playback/b.java`
- `comp/playback/c.java`
- `comp/playback/d.java`
- `comp/playback/e.java`

**Files to Skip (Monetization / Ads):**
- `comp/InAppBilling/StoreItem.java`
- `comp/Common/View/AdIcon.java`
- `composables/ComposableActivity.java` (Most likely used for IAP/Ads, needs check)

### 2. AndroidManifest.xml Diff
- New permissions: `POST_NOTIFICATIONS`, `FOREGROUND_SERVICE`, `FOREGROUND_SERVICE_MEDIA_PLAYBACK`, `READ_MEDIA_IMAGES`, `READ_MEDIA_VIDEO`, `READ_MEDIA_AUDIO` (for newer Android versions)
- Ads/Billing permissions (to be skipped): `com.android.vending.BILLING`, `com.google.android.gms.permission.AD_ID`, `ACCESS_ADSERVICES_AD_ID`, etc.
- New components: `SplashActivity`, `MainApp` (application name)
- Removed/Modified components: `MainActivity` might have changes.

### 3. Resources Diff
- Need to copy new strings, styles, layout files, and drawables related to `SplashActivity`, `MediaControlsView`, etc.

### 4. Build/Dependencies
- Potentially needs `androidx` migration based on decompiled imports. Base uses `android.support`. We should see if we can adapt decompiled logic to `support-v7` or if we are forced to migrate to `androidx` (prompt says "make it build and work", prefer sticking to base's `support-v7` if possible, but if a lot of things changed, maybe we'll adapt. Wait, if decompiled uses `androidx`, and we port *logic* to v1.0.34, we might just use existing `support` equivalents to avoid breaking the whole project. Let's try to stick to existing libs).
