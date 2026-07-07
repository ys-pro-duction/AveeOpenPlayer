import sys

filepath = 'app/build.gradle'
with open(filepath, 'r') as f:
    content = f.read()

target = """    defaultConfig {"""
replacement = """    lintOptions {
        abortOnError false
    }

    defaultConfig {"""
content = content.replace(target, replacement)

with open(filepath, 'w') as f:
    f.write(content)

filepath = 'ColorMixer/build.gradle'
with open(filepath, 'r') as f:
    content = f.read()

content = content.replace(target, replacement)

with open(filepath, 'w') as f:
    f.write(content)
