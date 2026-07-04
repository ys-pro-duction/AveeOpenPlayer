import sys

filepath = 'ColorMixer/build.gradle'
with open(filepath, 'r') as f:
    content = f.read()

content = content.replace('namespace "com.example.colormixer"', 'namespace "it.moondroid.colormixer"')

with open(filepath, 'w') as f:
    f.write(content)
