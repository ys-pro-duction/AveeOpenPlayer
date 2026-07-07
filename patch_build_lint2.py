import sys

filepath = 'app/build.gradle'
with open(filepath, 'r') as f:
    content = f.read()

content = content.replace("abortOnError false", "abortOnError = false")

with open(filepath, 'w') as f:
    f.write(content)

filepath = 'ColorMixer/build.gradle'
with open(filepath, 'r') as f:
    content = f.read()

content = content.replace("abortOnError false", "abortOnError = false")

with open(filepath, 'w') as f:
    f.write(content)
