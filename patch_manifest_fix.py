import sys

filepath = 'app/src/main/AndroidManifest.xml'
with open(filepath, 'r') as f:
    content = f.read()

content = content.replace('package="com.aveeopen"', '')

target1 = """<activity
            android:name="com.aveeopen.MainActivity"
            android:label="@string/app_name"
            android:launchMode="singleTask">"""
replacement1 = """<activity
            android:name=".MainActivity"
            android:label="@string/app_name"
            android:launchMode="singleTask"
            android:exported="true">"""

target2 = """<receiver android:name="com.aveeopen.comp.playback.MediaButtonEventReceiver">"""
replacement2 = """<receiver android:name=".comp.playback.MediaButtonEventReceiver" android:exported="true">"""

target3 = """<receiver android:name="com.aveeopen.comp.playback.view.MediaAppWidgetProvider">"""
replacement3 = """<receiver android:name=".comp.playback.view.MediaAppWidgetProvider" android:exported="true">"""

content = content.replace(target1, replacement1)
content = content.replace(target2, replacement2)
content = content.replace(target3, replacement3)

with open(filepath, 'w') as f:
    f.write(content)
