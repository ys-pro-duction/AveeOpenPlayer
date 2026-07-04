import sys

filepath = 'ColorMixer/src/main/AndroidManifest.xml'
with open(filepath, 'r') as f:
    content = f.read()

content = content.replace('package="com.example.colormixer"', '')

with open(filepath, 'w') as f:
    f.write(content)
