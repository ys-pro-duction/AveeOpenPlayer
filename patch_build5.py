import sys

filepath = 'app/build.gradle'
with open(filepath, 'r') as f:
    content = f.read()

target = """android {

    compileSdkVersion 28"""

replacement = """android {
    namespace "com.aveeopen"

    compileSdkVersion 34"""

content = content.replace(target, replacement)
content = content.replace('targetSdkVersion 28', 'targetSdkVersion 34')

with open(filepath, 'w') as f:
    f.write(content)

filepath = 'ColorMixer/build.gradle'
with open(filepath, 'r') as f:
    content = f.read()

target = """android {

    compileSdkVersion 28"""

replacement = """android {
    namespace "com.example.colormixer"

    compileSdkVersion 34"""

content = content.replace(target, replacement)
content = content.replace('targetSdkVersion 28', 'targetSdkVersion 34')

with open(filepath, 'w') as f:
    f.write(content)
