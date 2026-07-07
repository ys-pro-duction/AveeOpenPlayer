import sys

filepath = 'app/build.gradle'
with open(filepath, 'r') as f:
    content = f.read()

target = """    lint {
        abortOnError = false
    }"""
content = content.replace(target, "")

with open(filepath, 'w') as f:
    f.write(content)

filepath = 'ColorMixer/build.gradle'
with open(filepath, 'r') as f:
    content = f.read()

content = content.replace(target, "")

with open(filepath, 'w') as f:
    f.write(content)
